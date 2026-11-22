#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Audits JLPT N5 data files (mock_tests.json, minna_lessons.json, kanji_n5.json)
for duplicate options, missing explanations, missing listening audioScript,
skewed correctIndex distribution, and DataFixtures.kt synchronization.
"""
import json
import sys
from collections import Counter

TESTS_PATH = "shared/src/commonMain/resources/data/mock_tests.json"
LESSONS_PATH = "shared/src/commonMain/resources/data/minna_lessons.json"
KANJI_PATH = "shared/src/commonMain/resources/data/kanji_n5.json"
FIXTURES_PATH = "shared/src/commonMain/kotlin/com/jlpt/n5/data/DataFixtures.kt"

def main():
    errors = []
    with open(TESTS_PATH, "r", encoding="utf-8") as f:
        tests = json.load(f)
    with open(LESSONS_PATH, "r", encoding="utf-8") as f:
        lessons = json.load(f)
    with open(KANJI_PATH, "r", encoding="utf-8") as f:
        kanji = json.load(f)
    with open(FIXTURES_PATH, "r", encoding="utf-8") as f:
        fixtures_text = f.read()

    idx_counter = Counter()
    total_q = 0
    listen_q = 0

    for t in tests:
        tid = t.get("id", "unknown")
        qs = t.get("questions", [])
        if len(qs) < 20:
            errors.append(f"[{tid}] Too few questions ({len(qs)} < 20)")
        for q in qs:
            total_q += 1
            qid = q.get("id")
            opts = q.get("options", [])
            cidx = q.get("correctIndex", -1)
            sec = q.get("section", "")
            audio = q.get("audioScript", "")

            if len(opts) != 4:
                errors.append(f"[{tid}#Q{qid}] Expected 4 options, got {len(opts)}")
            if len(set(opts)) != len(opts):
                errors.append(f"[{tid}#Q{qid}] Duplicate options found: {opts}")
            if cidx not in (0, 1, 2, 3):
                errors.append(f"[{tid}#Q{qid}] Invalid correctIndex: {cidx}")
            else:
                idx_counter[cidx] += 1
            if not q.get("explanation", "").strip():
                errors.append(f"[{tid}#Q{qid}] Missing explanation")
            if ("聴解" in sec or tid.startswith("test_listening")) and not audio.strip():
                errors.append(f"[{tid}#Q{qid}] Listening question missing audioScript")
            if audio.strip():
                listen_q += 1

    # Check distribution skew
    for idx_val, count in idx_counter.items():
        ratio = count / max(1, total_q)
        if ratio > 0.45:
            errors.append(f"Answer index {idx_val} is over-represented ({count}/{total_q} = {ratio:.1%})")

    # Check DataFixtures sync
    for t in tests:
        if f'"id": "{t["id"]}"' not in fixtures_text:
            errors.append(f"Test {t['id']} not synced in DataFixtures.kt")

    print(f"📊 JLPT Data Summary: {len(kanji)} Kanji | {len(lessons)} Lessons | {len(tests)} Mock Tests | {total_q} Questions ({listen_q} Listening)")
    print(f"📊 Answer Index Distribution (0..3): {dict(sorted(idx_counter.items()))}")

    if errors:
        print("\n❌ QA Audit failed with errors:")
        for e in errors:
            print("  -", e)
        sys.exit(1)
    else:
        print("✅ All JLPT Data QA checks passed with 0 errors!")
        sys.exit(0)

if __name__ == "__main__":
    main()
