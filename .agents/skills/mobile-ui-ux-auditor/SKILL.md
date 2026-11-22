---
name: mobile-ui-ux-auditor
description: >-
  Use this skill whenever creating, editing, or reviewing Compose Multiplatform UI screens
  in shared/src/commonMain/kotlin/com/jlpt/n5/ui/ to detect and fix mobile layout bugs
  on small screens (320dp-375dp iOS/Android), text wrapping, Row overflow, and iOS touch scrolling issues.
---

# Mobile UI/UX Auditor Skill

Quy trình chuẩn để kiểm tra, phát hiện và sửa lỗi giao diện Mobile (đặc biệt trên màn hình nhỏ 320dp–375dp như iPhone) cho dự án JLPT Companion.

## Các bước thực hiện (Steps)

1. **Chạy Script Quét Tĩnh UI Mobile**:
   Chạy lệnh sau trong terminal để phát hiện tự động các lỗi bố cục Compose:
   ```bash
   python3 .agents/skills/mobile-ui-ux-auditor/scripts/audit_mobile_ui.py
   ```
   Script[audit_mobile_ui.py](./scripts/audit_mobile_ui.py) sẽ kiểm tra:
   - `Row` có `Arrangement.SpaceBetween` nhưng phần tử `Column`/`Row`/`Text` bên trái thiếu `Modifier.weight(1f)` (gây ép chữ dọc hoặc đẩy nút bên phải tràn màn hình).
   - `BottomNavigationItem` hoặc `Tab` thiếu `maxLines = 1` / `softWrap = false`.
   - `.horizontalScroll(...)` nằm lồng bên trong `LazyColumn` item (gây khóa cuộn dọc trên iOS).
   - Các màn hình dùng `LazyColumn` nhưng thiếu `fillMaxSize()` hoặc `weight(1f)`.

2. **Áp dụng Quy chuẩn Sửa lỗi Mobile UI**:
   - **Rule 1 (Row SpaceBetween)**: Luôn gắn `modifier = Modifier.weight(1f)` cho phần tử văn bản/tiêu đề bên trái và thêm `Spacer(modifier = Modifier.width(8.dp))` trước nút hoặc badge bên phải.
   - **Rule 2 (Badges & Buttons)**: Luôn đảm bảo text trong badge/button có `maxLines = 1, softWrap = false` để không bao giờ bị ngắt thành cột chữ dọc trên iOS.
   - **Rule 3 (Long Metadata Pairs)**: Khi có 2 thông tin dài (ví dụ: Tên phần thi `文字・語彙 (Chữ Hán - Từ vựng)` và `Mondai 6: Sắp xếp câu dấu sao (★)`), hiển thị trong `Column` hoặc 2 dòng riêng biệt thay vì ép chung 1 `Row`.
   - **Rule 4 (Full-page Scroll)**: Mọi màn hình danh sách phải đưa header/filter/history vào thành `item { ... }` bên trong `LazyColumn(modifier = Modifier.fillMaxSize())`.

3. **Xác nhận (Validation)**:
   Chạy lại `python3 .agents/skills/mobile-ui-ux-auditor/scripts/audit_mobile_ui.py` cho đến khi đạt `0 issues found`. Nếu cần kiểm tra trực quan, ủy quyền cho `browser` subagent mở trang web kiểm tra hiển thị.
