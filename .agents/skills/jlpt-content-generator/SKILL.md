---
name: jlpt-content-generator
description: >-
  Use this skill when generating, expanding, or updating JLPT N5/N4 vocabulary,
  Kanji, Minna no Nihongo lessons, mock exams, or Choukai listening scripts
  in shared/src/commonMain/resources/data/ and synchronizing them with DataFixtures.kt.
---

# JLPT Content Generator & Fixture Synchronizer

Quy trình chuẩn để biên soạn và cập nhật ngân hàng câu hỏi, từ vựng, chữ Hán, bài học Minna no Nihongo và đề thi thử JLPT (bao gồm phần thi Nghe hiểu `聴解 - Choukai`).

## Cấu trúc Chuẩn Đề thi JLPT N5
1. **Đề thi tổng hợp 3 kỹ năng (55–65 câu, 90 phút, 180 điểm, điểm đỗ 80)**:
   - `文字・語彙 (Chữ Hán - Từ vựng)` (~20 câu): Mondai 1 (Cách đọc Kanji), Mondai 2 (Cách viết Kanji/Katakana), Mondai 3 (Điền từ vào câu), Mondai 4 (Câu đồng nghĩa).
   - `文法・読解 (Ngữ pháp - Đọc hiểu)` (~20 câu): Mondai 5 (Ngữ pháp & Trợ từ), Mondai 6 (Sắp xếp câu dấu sao `★`), Mondai 7 (Ngữ pháp đoạn văn), Mondai 8–9 (Đọc hiểu đoạn ngắn & vừa), Mondai 10 (Tìm kiếm thông tin bảng biểu).
   - `聴解 (Nghe hiểu - Choukai)` (~15 câu): Mondai 1 (Nghe hiểu chủ đề `課題理解`), Mondai 2 (Nghe hiểu điểm chính `ポイント理解`), Mondai 3 (Diễn đạt theo tình huống `発話表現`), Mondai 4 (Phản xạ nhanh `即時応答`). Mỗi câu nghe bắt buộc phải có `audioScript` bằng tiếng Nhật tự nhiên.
2. **Phân bổ đáp án đúng (`correctIndex`)**:
   - Không bao giờ để toàn bộ `correctIndex = 0`. Phải trộn ngẫu nhiên có kiểm soát (deterministic shuffle) để `correctIndex` phân bổ đều giữa `0, 1, 2, 3`.
   - Với Mondai 3 & 4 phần Nghe hiểu có đọc `1. ... 2. ... 3. ... 4. ...` trong `audioScript`, thứ tự đọc trong `audioScript` phải khớp chính xác với thứ tự 4 đáp án sau khi trộn.

## Các bước thực hiện (Steps)

1. Cập nhật dữ liệu JSON tại `shared/src/commonMain/resources/data/` (`kanji_n5.json`, `minna_lessons.json`, hoặc `mock_tests.json`).
2. Chạy script đồng bộ tự động sang `DataFixtures.kt`:
   ```bash
   python3 .agents/skills/jlpt-content-generator/scripts/sync_fixtures.py
   ```
   Xem chi tiết script tại [sync_fixtures.py](./scripts/sync_fixtures.py).
3. Chạy script kiểm định dữ liệu của skill `jlpt-qa-auditor`:
   ```bash
   python3 .agents/skills/jlpt-qa-auditor/scripts/audit_jlpt_data.py
   ```
