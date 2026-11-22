# Multi-Agent Workflow: Parallel JLPT Mock Exam Content Generator
# Usage: run_workflow(ScriptPath="/Users/kyo/Desktop/JLPT/.agents/workflows/batch_exam_generator.py", Description="Generate new JLPT mock exam sections in parallel")

SECTIONS = [
    ("Vocab & Kanji (Mondai 1-4)", "Generate 20 JLPT N5 文字・語彙 questions (Mondai 1: 7, Mondai 2: 5, Mondai 3: 5, Mondai 4: 3) with Vietnamese explanations."),
    ("Grammar & Reading (Mondai 5-10)", "Generate 20 JLPT N5 文法・読解 questions (Mondai 5: 9, Mondai 6 star: 4, Mondai 7: 3, Mondai 8: 2, Mondai 9: 1, Mondai 10: 1) with Vietnamese explanations."),
    ("Listening Choukai (Mondai 1-4)", "Generate 15 JLPT N5 聴解 questions (Mondai 1: 4, Mondai 2: 4, Mondai 3: 3, Mondai 4: 4) with full Japanese audioScript dialogues and Vietnamese explanations."),
]

QUESTION_SCHEMA = {
    "type": "array",
    "items": {
        "type": "object",
        "properties": {
            "section": {"type": "string"},
            "category": {"type": "string"},
            "question": {"type": "string"},
            "options": {"type": "array", "items": {"type": "string"}},
            "correctIndex": {"type": "integer"},
            "explanation": {"type": "string"},
            "audioScript": {"type": "string"}
        },
        "required": ["section", "category", "question", "options", "correctIndex", "explanation", "audioScript"]
    }
}

phase("Parallel Section Authoring")
generated_sections = await parallel(
    SECTIONS,
    lambda item: agent(
        prompt=f"Follow .agents/skills/jlpt-content-generator/SKILL.md. {item[1]} Distribute correctIndex evenly across 0, 1, 2, 3.",
        schema=QUESTION_SCHEMA,
        role=f"Author: {item[0]}",
        model="flash",
    )
)

total_generated = sum(len(sec) for sec in generated_sections)
log(f"Generated {total_generated} questions across {len(SECTIONS)} sections in parallel.")
