#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Static Mobile UI/UX Auditor for Compose Multiplatform (.kt files).
Scans shared/src/commonMain/kotlin for common small-screen (320dp-375dp) UI bugs:
1. Row with Arrangement.SpaceBetween where the first Text/Column/Row child lacks Modifier.weight(1f).
2. BottomNavigationItem labels without maxLines = 1 / softWrap = false.
3. LazyColumn without fillMaxSize() or weight(1f).
4. Side-by-side JapaneseBadge + long category Text in a single Row without weight/wrapping protection.
"""
import os
import re
import sys

UI_ROOT = "shared/src/commonMain/kotlin"

def scan_file(filepath):
    issues = []
    with open(filepath, "r", encoding="utf-8") as f:
        lines = f.readlines()
    content = "".join(lines)

    # Check 1: BottomNavigationItem label without maxLines = 1
    if "BottomNavigationItem(" in content:
        for idx, line in enumerate(lines, start=1):
            if "label = { Text(" in line and "maxLines = 1" not in line:
                issues.append((idx, "WARN_BOTTOM_NAV_WRAP",
                               "BottomNavigationItem label missing `maxLines = 1, softWrap = false` (wraps on 375dp iPhone screens)."))

    # Check 2: LazyColumn missing fillMaxSize() or weight(1f)
    for match in re.finditer(r"LazyColumn\s*\((.*?)\)\s*\{", content, re.DOTALL):
        args_block = match.group(1)
        line_num = content[:match.start()].count("\n") + 1
        if "fillMaxSize" not in args_block and "weight(" not in args_block:
            issues.append((line_num, "WARN_LAZYCOLUMN_HEIGHT",
                           "LazyColumn missing `Modifier.fillMaxSize()` or `Modifier.weight(1f)`."))

    # Check 3: Row with Arrangement.SpaceBetween where first child Column/Row/Text has no weight(1f)
    row_pattern = re.compile(
        r"Row\s*\(\s*modifier\s*=\s*[^)]*?fillMaxWidth\(\)[^)]*?Arrangement\.SpaceBetween[^)]*?\)\s*\{\s*"
        r"(Column|Row|Text)\s*(\([^\)]*\)|\{)",
        re.DOTALL
    )
    for match in row_pattern.finditer(content):
        child_type = match.group(1)
        child_args = match.group(2)
        line_num = content[:match.start()].count("\n") + 1
        # inspect the next 25 lines of the Row block to see if weight(1f) is present on the left child
        snippet = "\n".join(lines[line_num - 1 : min(len(lines), line_num + 22)])
        if child_type in ("Column", "Row") and child_args.startswith("{"):
            issues.append((line_num, "ERR_ROW_NO_WEIGHT",
                           f"`Row(SpaceBetween)` has `{child_type}` on the left without `Modifier.weight(1f)` — will push/crush right-side elements on 320dp–375dp mobile screens."))
        elif child_type == "Text" and "weight(" not in snippet.split("Text(")[1] if "Text(" in snippet else True:
            # Check if this Row has long dynamic or Vietnamese title text
            if "Lộ trình Minna" in child_args or "res.testTitle" in child_args or "lesson." in child_args:
                issues.append((line_num, "ERR_TEXT_NO_WEIGHT",
                               f"`Row(SpaceBetween)` has long `Text` on the left without `Modifier.weight(1f)` — will squeeze right-side action on mobile."))
        elif child_type in ("Column", "Row") and "weight(" not in child_args:
            # If it's a Row(verticalAlignment = Alignment.CenterVertically) without weight(1f), check if the Row also has a right-side badge/button
            if "JapaneseBadge" in snippet or "Button(" in snippet:
                issues.append((line_num, "ERR_LEFT_CHILD_NO_WEIGHT",
                               f"`Row(SpaceBetween)` has `{child_type}` without `Modifier.weight(1f)` next to a Badge/Button — causes overflow on mobile."))

    # Check 4: Section + Category side-by-side in MockTestExamScreen
    if "MockTestExamScreen.kt" in filepath:
        for idx, line in enumerate(lines, start=1):
            if "text = currentQ.section" in line:
                window = "".join(lines[max(0, idx - 8):min(len(lines), idx + 12)])
                if "Arrangement.SpaceBetween" in window and "currentQ.category" in window:
                    issues.append((idx, "ERR_SECTION_CATEGORY_CRAMPED",
                                   "`currentQ.section` badge and `currentQ.category` text on a single `Row(SpaceBetween)` exceed 343dp width on mobile."))

    return issues

def main():
    total_issues = 0
    for root, _, files in os.walk(UI_ROOT):
        for fname in sorted(files):
            if not fname.endswith(".kt"):
                continue
            fpath = os.path.join(root, fname)
            file_issues = scan_file(fpath)
            for line_num, code, msg in file_issues:
                print(f"[{code}] {fpath}:{line_num} -> {msg}")
                total_issues += 1

    if total_issues == 0:
        print("✅ Mobile UI/UX Audit passed: 0 issues found across all Compose files!")
        sys.exit(0)
    else:
        print(f"\n⚠️ Found {total_issues} mobile UI/UX issue(s) to fix.")
        sys.exit(1)

if __name__ == "__main__":
    main()
