---
name: jlpt-qa-auditor
description: >-
  Use this skill to audit and validate the integrity, quality, answer distribution,
  and schema compliance of JLPT mock exams, listening scripts, lessons, and Kanji data.
---

# JLPT Data QA Auditor Skill

Quy trình kiểm định tự động chất lượng dữ liệu học tập và đề thi thử JLPT.

## Các bước thực hiện (Steps)

1. Chạy script kiểm định dữ liệu tự động:
   ```bash
   python3 .agents/skills/jlpt-qa-auditor/scripts/audit_jlpt_data.py
   ```
   Script [audit_jlpt_data.py](./scripts/audit_jlpt_data.py) sẽ kiểm tra:
   - Tính hợp lệ của JSON trong `kanji_n5.json`, `minna_lessons.json`, `mock_tests.json`.
   - Đồng bộ 100% giữa 3 file `.json` và `DataFixtures.kt`.
   - Mỗi câu hỏi thi thử có đúng 4 đáp án (`options`) không trùng lặp nhau, `correctIndex` hợp lệ (`0..3`), có đầy đủ `explanation`.
   - Các câu thuộc phần Nghe hiểu (`聴解`) bắt buộc phải có `audioScript` không rỗng.
   - Phân bổ vị trí đáp án đúng (`correctIndex` `0, 1, 2, 3`) đồng đều, không bị lệch quá 45% vào một vị trí.

2. Nếu script báo lỗi, sửa trong file `.json` tương ứng rồi chạy `python3 .agents/skills/jlpt-content-generator/scripts/sync_fixtures.py` và kiểm tra lại.
