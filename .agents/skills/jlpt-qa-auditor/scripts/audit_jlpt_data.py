#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Audits JLPT N5 data files (mock_tests.json, minna_lessons.json, kanji_n5.json)
for schema completeness, duplicate options/IDs, missing explanations,
missing listening audioScript, Kanji leaking into hiragana readings,
skewed correctIndex distribution, and DataFixtures.kt synchronization.
"""
import json
import re
import sys
from collections import Counter

TESTS_PATH = "shared/src/commonMain/resources/data/mock_tests.json"
LESSONS_PATH = "shared/src/commonMain/resources/data/minna_lessons.json"
KANJI_PATH = "shared/src/commonMain/resources/data/kanji_n5.json"
FIXTURES_PATH = "shared/src/commonMain/kotlin/com/jlpt/n5/data/DataFixtures.kt"

KANJI_RE = re.compile(r"[\u4e00-\u9faf\u3400-\u4dbf]")


def extract_fixture_json(fixtures_text, const_name):
    pattern = rf'val {const_name} = """(.*?)"""'
    m = re.search(pattern, fixtures_text, re.DOTALL)
    if not m:
        return None
    return json.loads(m.group(1))


def audit_mock_tests(tests, fixtures_text, errors):
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

    for idx_val, count in idx_counter.items():
        ratio = count / max(1, total_q)
        if ratio > 0.45:
            errors.append(f"Answer index {idx_val} is over-represented ({count}/{total_q} = {ratio:.1%})")

    fix_tests = extract_fixture_json(fixtures_text, "TESTS_RAW_JSON")
    if fix_tests != tests:
        errors.append("DataFixtures.TESTS_RAW_JSON is out of sync with mock_tests.json")

    return total_q, listen_q, idx_counter


def audit_lessons(lessons, fixtures_text, errors):
    vocab_ids = Counter()
    total_vocab = 0
    total_grammar = 0

    for l in lessons:
        lnum = l.get("lessonNumber")
        for k in ("title", "japaneseTitle", "description"):
            if not str(l.get(k, "")).strip():
                errors.append(f"[Lesson {lnum}] Missing {k}")

        vocabs = l.get("vocabularies", [])
        if not vocabs:
            errors.append(f"[Lesson {lnum}] Empty vocabularies")

        seen_words = set()
        for v in vocabs:
            total_vocab += 1
            vid = v.get("id")
            vocab_ids[vid] += 1
            w = v.get("word", "")
            r = v.get("reading", "")
            ex_r = v.get("exampleSentenceReading", "")
            vtype = v.get("type", "")
            df = v.get("dictionaryForm", "")

            if w in seen_words:
                errors.append(f"[Lesson {lnum} V{vid}] Duplicate word in lesson: {w}")
            seen_words.add(w)

            for k in ("word", "reading", "romaji", "meaning", "type", "exampleSentence", "exampleSentenceReading", "exampleSentenceMeaning"):
                if not str(v.get(k, "")).strip():
                    errors.append(f"[Lesson {lnum} V{vid} ({w})] Missing {k}")

            if KANJI_RE.search(r):
                errors.append(f"[Lesson {lnum} V{vid} ({w})] reading contains Kanji: {r}")
            if KANJI_RE.search(ex_r):
                errors.append(f"[Lesson {lnum} V{vid} ({w})] exampleSentenceReading contains Kanji: {ex_r}")
            if "Động từ" in vtype and not str(df).strip():
                errors.append(f"[Lesson {lnum} V{vid} ({w})] {vtype} missing dictionaryForm")

        gps = l.get("grammarPoints", [])
        if not gps:
            errors.append(f"[Lesson {lnum}] Empty grammarPoints")
        for gidx, gp in enumerate(gps):
            total_grammar += 1
            for k in ("title", "pattern", "explanation"):
                if not str(gp.get(k, "")).strip():
                    errors.append(f"[Lesson {lnum} GP{gidx}] Missing {k}")
            exs = gp.get("examples", [])
            if not exs:
                errors.append(f"[Lesson {lnum} GP{gidx}] Empty examples")
            for eidx, ex in enumerate(exs):
                for k in ("japanese", "reading", "vietnamese"):
                    if not str(ex.get(k, "")).strip():
                        errors.append(f"[Lesson {lnum} GP{gidx} Ex{eidx}] Missing {k}")
                if KANJI_RE.search(ex.get("reading", "")):
                    errors.append(f"[Lesson {lnum} GP{gidx} Ex{eidx}] example reading contains Kanji: {ex.get('reading')}")

    dups = [vid for vid, cnt in vocab_ids.items() if cnt > 1]
    if dups:
        errors.append(f"Duplicate vocab IDs across lessons: {dups}")

    fix_lessons = extract_fixture_json(fixtures_text, "LESSONS_RAW_JSON")
    if fix_lessons != lessons:
        errors.append("DataFixtures.LESSONS_RAW_JSON is out of sync with minna_lessons.json")

    return total_vocab, total_grammar


def audit_kanji(kanji, fixtures_text, errors):
    kanji_ids = Counter()
    for k in kanji:
        kid = k.get("id")
        kanji_ids[kid] += 1
        kk = k.get("kanji", "")
        for field in ("kanji", "hanViet", "meaning"):
            if not str(k.get(field, "")).strip():
                errors.append(f"[Kanji {kid} ({kk})] Missing {field}")
        for ex in k.get("examples", []):
            if KANJI_RE.search(ex.get("reading", "")):
                errors.append(f"[Kanji {kid} ({kk})] Example reading contains Kanji: {ex.get('reading')}")

    dups = [kid for kid, cnt in kanji_ids.items() if cnt > 1]
    if dups:
        errors.append(f"Duplicate Kanji IDs: {dups}")

    fix_kanji = extract_fixture_json(fixtures_text, "KANJI_RAW_JSON")
    if fix_kanji != kanji:
        errors.append("DataFixtures.KANJI_RAW_JSON is out of sync with kanji_n5.json")


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

    total_q, listen_q, idx_counter = audit_mock_tests(tests, fixtures_text, errors)
    total_vocab, total_grammar = audit_lessons(lessons, fixtures_text, errors)
    audit_kanji(kanji, fixtures_text, errors)

    print(f"📊 JLPT Data Summary: {len(kanji)} Kanji | {len(lessons)} Lessons ({total_vocab} Vocab, {total_grammar} Grammar) | {len(tests)} Mock Tests | {total_q} Questions ({listen_q} Listening)")
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
