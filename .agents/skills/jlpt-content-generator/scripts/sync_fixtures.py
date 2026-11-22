#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Synchronizes kanji_n5.json, minna_lessons.json, and mock_tests.json
into shared/src/commonMain/kotlin/com/jlpt/n5/data/DataFixtures.kt.
"""
import json
import os
import sys

DATA_DIR = "shared/src/commonMain/resources/data"
FIXTURES_PATH = "shared/src/commonMain/kotlin/com/jlpt/n5/data/DataFixtures.kt"

def load_and_format_json(filename):
    path = os.path.join(DATA_DIR, filename)
    with open(path, "r", encoding="utf-8") as f:
        data = json.load(f)
    return json.dumps(data, ensure_ascii=False, indent=2), data

def main():
    kanji_str, kanji_data = load_and_format_json("kanji_n5.json")
    lessons_str, lessons_data = load_and_format_json("minna_lessons.json")
    tests_str, tests_data = load_and_format_json("mock_tests.json")

    kotlin_content = (
        "package com.jlpt.n5.data\n\n"
        "object DataFixtures {\n"
        f"    val KANJI_RAW_JSON = \"\"\"{kanji_str}\"\"\"\n"
        f"    val LESSONS_RAW_JSON = \"\"\"{lessons_str}\"\"\"\n"
        f"    val TESTS_RAW_JSON = \"\"\"{tests_str}\"\"\"\n"
        "}\n"
    )

    with open(FIXTURES_PATH, "w", encoding="utf-8") as f:
        f.write(kotlin_content)

    total_q = sum(len(t.get("questions", [])) for t in tests_data)
    print(f"✅ Synced DataFixtures.kt: {len(kanji_data)} Kanji, {len(lessons_data)} Lessons, {len(tests_data)} Mock Tests ({total_q} questions).")

if __name__ == "__main__":
    main()
