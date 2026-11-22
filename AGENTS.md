# JLPT Companion — Workspace Rules (`AGENTS.md`)

Các quy tắc kiến trúc và kỹ thuật bắt buộc cho mọi Agent làm việc trong dự án **JLPT Companion** (Kotlin Multiplatform: Android, iOS, Web, Desktop).

## 1. Quy tắc Đồng bộ Dữ liệu Kép (Dual Data Synchronization)
- `JLPTRepository` đọc dữ liệu trực tiếp từ các hằng số chuỗi JSON trong `shared/src/commonMain/kotlin/com/jlpt/n5/data/DataFixtures.kt` (`KANJI_RAW_JSON`, `LESSONS_RAW_JSON`, `TESTS_RAW_JSON`), tương ứng với 3 file nguồn trong `shared/src/commonMain/resources/data/`:
  - `kanji_n5.json` ↔ `DataFixtures.KANJI_RAW_JSON`
  - `minna_lessons.json` ↔ `DataFixtures.LESSONS_RAW_JSON`
  - `mock_tests.json` ↔ `DataFixtures.TESTS_RAW_JSON`
- **Bắt buộc**: Sau khi chỉnh sửa bất kỳ file `.json` nào trong `shared/src/commonMain/resources/data/`, phải chạy script `python3 .agents/skills/jlpt-content-generator/scripts/sync_fixtures.py` để đồng bộ sang `DataFixtures.kt` và chạy `python3 .agents/skills/jlpt-qa-auditor/scripts/audit_jlpt_data.py` để kiểm định dữ liệu.

## 2. Quy chuẩn Responsive Mobile UI/UX (320dp–375dp) & iOS WebKit
- **Chống tràn `Row` & ép chữ dọc trên màn hình hẹp**:
  - Trong mọi `Row` có `Arrangement.SpaceBetween` hoặc chứa tiêu đề bên trái và nút/badge bên phải, khối `Column` hoặc `Text` bên trái **phải có `Modifier.weight(1f)`** kèm `Spacer(Modifier.width(8.dp))` để không đẩy hoặc bóp nghẹt nút/badge bên phải.
  - Mọi `JapaneseBadge`, `HanVietBadge`, `BottomNavigationItem` label, `Tab` label và `Button` ngắn phải có `maxLines = 1, softWrap = false` (hoặc `overflow = TextOverflow.Ellipsis`).
  - Không đặt 2 nhãn dài (như `section` và `category` của câu hỏi thi thử) cạnh nhau trên cùng 1 `Row` hẹp nếu tổng độ dài vượt quá `340dp`; hãy xếp tầng hoặc dùng `Column`.
- **Chống xung đột cuộn cảm ứng trên iOS (Touch-to-Wheel Scroll)**:
  - Các màn hình danh sách chính phải dùng một `LazyColumn(modifier = Modifier.fillMaxSize())` bao trọn nội dung; không đặt các khối `Column` tĩnh chiếm diện tích lớn phía trên `LazyColumn`.
  - Không đặt `.horizontalScroll(...)` bên trong từng thẻ item của `LazyColumn`.
  - Không xóa hoặc làm hỏng bộ chuyển đổi `Touch-to-Wheel` với `gestureAxis` lock và `window.devicePixelRatio` trong `webApp/src/jsMain/resources/index.html`.
- **Quản lý âm thanh TTS (`LocalTTS`)**:
  - Luôn gọi `tts.stop()` trong `DisposableEffect(Unit) { onDispose { tts.stop() } }` và khi chuyển câu hỏi / thoát màn hình.

## 3. Quy trình Kiểm thử & Phát hành
- Trước khi build sau khi sửa UI, luôn chạy `python3 .agents/skills/mobile-ui-ux-auditor/scripts/audit_mobile_ui.py` để đảm bảo không còn lỗi bố cục Mobile.
- Sử dụng `./deploy.sh` để build `:webApp:jsBrowserDistribution` và deploy lên `https://jlpt-companion.pages.dev`.
