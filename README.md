# 🌸 JLPT N5 Master - Minna no Nihongo (Kotlin Compose Multiplatform)

Ứng dụng ôn thi năng lực Nhật ngữ **JLPT N5** toàn diện, xây dựng trên nền tảng **Kotlin & Compose Multiplatform (CMP)** hỗ trợ **Android, iOS và Desktop (macOS/Windows)**. 

Dự án hoạt động hoàn toàn **Offline (Local-First)**, không phụ thuộc vào server bên ngoài, phục vụ nhu cầu tự học cá nhân với đầy đủ giáo trình, thẻ ghi nhớ flashcards, tra cứu Kanji và thi thử có bấm giờ.

---

## 🌟 Tính Năng Nổi Bật

### 1. 📖 Giáo Trình 25 Bài Minna no Nihongo
- **Đầy đủ 25 bài học** tương ứng trình độ JLPT N5 (Minna no Nihongo I).
- **Từ vựng chi tiết**: Kanji, cách đọc Hiragana, phiên âm Romaji, âm Hán Việt, phân loại từ (Danh từ, Động từ, Tính từ...).
- **Câu ví dụ thực tế**: Kèm theo cách đọc và bản dịch tiếng Việt chuẩn xác.
- **Ngữ pháp trọng tâm**: Giải thích chi tiết cấu trúc, cách sử dụng trong giao tiếp và câu ví dụ minh họa song ngữ.
- **Luyện tập nhanh**: Mỗi bài đều có bài tập trắc nghiệm củng cố kiến thức tức thì.

### 2. 🗂️ Flashcard 3D Interactive (Thẻ Ghi Nhớ)
- **Hiệu ứng lật thẻ 3D chân thực**: Chạm để xoay lật mặt trước (Chữ Hán/Hiragana) sang mặt sau (Nghĩa, Hán Việt, câu ví dụ).
- **Đa dạng chế độ ôn tập**:
  - Ôn từ vựng theo từng bài Minna cụ thể (Bài 1 → 25).
  - Ôn trọn bộ 104 Kanji N5.
  - Bộ lọc các từ yêu thích (⭐ Starred) hoặc các từ chưa thuộc (Cần ôn lại).
- **Hệ thống đánh dấu tiến độ**: Nút "✅ Đã nhớ" (Mastered) và "❌ Cần ôn lại" (Need Review), tính tỷ lệ % hoàn thành và hỗ trợ xáo trộn thẻ (🔀 Shuffle).

### 3. 🈲 Kho Hán Tự (104 Kanji N5)
- Tra cứu toàn diện **104 chữ Hán cơ bản nhất** của kì thi JLPT N5.
- Cung cấp:
  - Chữ viết Kanji cỡ lớn, số nét vẽ.
  - Âm **Hán - Việt** chuẩn.
  - Âm **On (Onyomi)** và âm **Kun (Kunyomi)**.
  - Ý nghĩa chi tiết và các **từ ghép thông dụng** trong đề thi JLPT.
- Nút chuyển nhanh toàn bộ Kanji sang chế độ Flashcard để học thuộc.

### 4. 📝 Phòng Thi Thử JLPT N5 (Mock Tests)
- **Chuẩn format đề thi JLPT N5 chính thức**:
  - Phần 1: 文字・語彙 (Chữ Hán - Từ vựng) - Mondai 1 (Cách đọc Kanji), Mondai 2 (Tìm Kanji thích hợp), Mondai 3 (Điền từ vào câu).
  - Phần 2: 文法・読解 (Ngữ pháp - Đọc hiểu) - Chọn ngữ pháp, sắp xếp dấu sao (★), đọc hiểu đoạn văn ngắn.
- **Đồng hồ đếm ngược (Timer 45 phút)** chạy theo thời gian thực với cảnh báo khi sắp hết giờ.
- **Chấm điểm tự động**: Thang điểm chuẩn 180 điểm (Điểm đỗ: $\ge$ 80/180).
- **Giải thích chi tiết (Detailed Explanations)**: Hiển thị ngay lời giải thích cặn kẽ bằng tiếng Việt cho từng câu hỏi sau khi nộp bài.
- **Lưu lịch sử thi thử**: Tự động ghi lại điểm số, tỷ lệ đúng/sai của các lần thi.

### 5. 🏠 Trang Chủ & Bảng Tiến Độ Cá Nhân (Dashboard)
- Tính toán **Độ sẵn sàng cho kì thi N5 (%)** dựa trên số từ vựng, kanji và bài học đã làm chủ.
- **Chuỗi ngày học liên tục (Streak Counter 🔥)** tạo động lực học mỗi ngày.
- **Từ vựng tâm điểm hôm nay (Daily Vocab Pick)**.
- Phím tắt truy cập nhanh vào từng chuyên mục.

---

## 🛠️ Công Nghệ & Kiến Trúc (Tech Stack)

| Thành phần | Công nghệ sử dụng |
| :--- | :--- |
| **Ngôn ngữ** | Kotlin 1.9.21 (Kotlin Multiplatform) |
| **Giao diện UI** | Compose Multiplatform 1.5.11 (Material Design 3 Aesthetic) |
| **Nền tảng mục tiêu** | Android, iOS, Desktop (macOS/JVM) |
| **Dữ liệu & Persistence** | Local-First, JSON Serialization (`kotlinx.serialization`), In-Memory & Local State Repository |
| **Xử lý bất đồng bộ** | Kotlin Coroutines & Flow |

### Cấu Trúc Dự Án (Directory Structure)
```
JLPT/
├── shared/                                 # Code dùng chung (UI, Business Logic, Data)
│   └── src/
│       ├── commonMain/
│       │   ├── kotlin/
│       │   │   ├── App.kt                  # Router & Bottom Navigation chính
│       │   │   └── com/jlpt/n5/
│       │   │       ├── model/              # Models: Lesson, Vocab, Kanji, MockTest
│       │   │       ├── data/               # DataFixtures, JLPTRepository
│       │   │       └── ui/
│       │   │           ├── theme/          # Color, Shape, JLPTAppTheme
│       │   │           ├── components/     # FlipCard, Badge, JapaneseBadge
│       │   │           └── screens/        # HomeScreen, LessonList, Flashcard, Kanji, MockTest
│       │   └── resources/data/             # minna_lessons.json, kanji_n5.json, mock_tests.json
│       ├── androidMain/                    # Android entrypoint
│       ├── iosMain/                        # iOS ComposeUIViewController entrypoint
│       └── desktopMain/                    # Desktop (macOS) entrypoint
├── androidApp/                             # Android Application module (Gradle/Manifest)
├── iosApp/                                 # iOS Xcode Project (SwiftUI App)
├── desktopApp/                             # Desktop JVM Launcher
├── build.gradle.kts                        # Root build configuration
└── settings.gradle.kts                     # Gradle settings & plugin management
```

---

## 🚀 Hướng Dẫn Chạy Ứng Dụng

### 1. Mở Dự Án Bằng Android Studio hoặc IntelliJ IDEA
1. Khởi động **Android Studio** hoặc **IntelliJ IDEA**.
2. Chọn **Open** và dẫn tới thư mục `/Users/kyo/Desktop/JLPT`.
3. Đợi IDE thực hiện Gradle Sync.

### 2. Chạy Trên Android
- **Cách 1: Từ Terminal**
  ```bash
  ./gradlew :androidApp:installDebug
  ```
  *(File APK debug đã được đóng gói sẵn tại `androidApp/build/outputs/apk/debug/androidApp-debug.apk`)*
- **Cách 2: Từ Android Studio**
  - Chọn cấu hình chạy `androidApp` ở thanh công cụ và nhấn **Run** (Ctrl+R / Shift+F10) trên máy ảo hoặc điện thoại Android cắm cáp.

### 3. Chạy Trên iOS (macOS + Xcode)
1. Mở thư mục `iosApp` bằng Xcode:
   ```bash
   open iosApp/iosApp.xcodeproj
   ```
2. Chọn Simulator (ví dụ: iPhone 15 / iPhone 16) và nhấn nút **Run** (Cmd + R).

### 4. Chạy Trên Desktop (macOS/JVM)
Chạy ngay giao diện trên máy tính Mac chỉ với 1 lệnh:
```bash
./gradlew :desktopApp:run
```

---

## 🇯🇵 Bản Quyền & Tài Nguyên Học Tập
- Giáo trình tham khảo: **Minna no Nihongo I (Bài 1 - 25)**.
- Hệ thống Kanji: **104 chữ Hán JLPT N5 chuẩn**.
- Toàn bộ nội dung dữ liệu đã được tổng hợp, chuẩn hóa và đóng gói offline phục vụ mục đích học tập cá nhân.