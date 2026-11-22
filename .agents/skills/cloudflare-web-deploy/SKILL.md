---
name: cloudflare-web-deploy
description: >-
  Use this skill when building the Kotlin/JS web distribution and deploying
  the JLPT Companion web app to Cloudflare Pages (https://jlpt-companion.pages.dev).
---

# Cloudflare Pages Web Build & Deploy Skill

Quy trình chuẩn để kiểm tra, đóng gói bản Web (`:webApp:jsBrowserDistribution`) và phát hành lên Cloudflare Pages.

## Các bước thực hiện (Steps)

1. **Kiểm định trước khi Build (Pre-flight Checks)** *(chạy trong Sandbox)*:
   - Chạy kiểm định UI Mobile:
     `python3 .agents/skills/mobile-ui-ux-auditor/scripts/audit_mobile_ui.py`
   - Chạy kiểm định dữ liệu JLPT:
     `python3 .agents/skills/jlpt-qa-auditor/scripts/audit_jlpt_data.py`

2. **Build & Deploy lên Cloudflare Pages**:
   - Chạy script `./deploy.sh` tại thư mục gốc của dự án.
   - Lưu ý: `./deploy.sh` cần kết nối tới Gradle Daemon và Cloudflare Wrangler API nên nếu bị chặn trong sandbox thì chạy với `BypassSandbox: true`.

3. **Đồng bộ Git**:
   - Sau khi deploy thành công lên `https://jlpt-companion.pages.dev`, commit và push các thay đổi lên nhánh `main` để đồng bộ kho lưu trữ GitHub.
