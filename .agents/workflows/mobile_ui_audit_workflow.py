# Multi-Agent Workflow: Parallel Mobile UI/UX Audit across all screen groups
# Usage: run_workflow(ScriptPath="/Users/kyo/Desktop/JLPT/.agents/workflows/mobile_ui_audit_workflow.py", Description="Audit Mobile UI/UX across all screens")

SCREEN_GROUPS = [
    ("Home & Dashboard", [
        "shared/src/commonMain/kotlin/com/jlpt/n5/ui/screens/HomeScreen.kt",
        "shared/src/commonMain/kotlin/com/jlpt/n5/ui/screens/home/components/HomeHeaderSection.kt",
        "shared/src/commonMain/kotlin/com/jlpt/n5/ui/screens/home/components/HomeQuickActionsGrid.kt",
        "shared/src/commonMain/kotlin/com/jlpt/n5/ui/screens/home/components/HomeRoadmapSection.kt",
        "shared/src/commonMain/kotlin/com/jlpt/n5/ui/screens/home/components/HomeReadinessCard.kt",
    ]),
    ("Lessons & Practice", [
        "shared/src/commonMain/kotlin/com/jlpt/n5/ui/screens/LessonListScreen.kt",
        "shared/src/commonMain/kotlin/com/jlpt/n5/ui/screens/LessonDetailScreen.kt",
        "shared/src/commonMain/kotlin/com/jlpt/n5/ui/screens/lesson/components/LessonFullCard.kt",
        "shared/src/commonMain/kotlin/com/jlpt/n5/ui/screens/lesson/components/LessonVocabTab.kt",
        "shared/src/commonMain/kotlin/com/jlpt/n5/ui/screens/lesson/components/LessonGrammarTab.kt",
    ]),
    ("Kanji & Flashcards", [
        "shared/src/commonMain/kotlin/com/jlpt/n5/ui/screens/KanjiExplorerScreen.kt",
        "shared/src/commonMain/kotlin/com/jlpt/n5/ui/screens/kanji/components/KanjiDetailDialog.kt",
        "shared/src/commonMain/kotlin/com/jlpt/n5/ui/screens/FlashcardScreen.kt",
        "shared/src/commonMain/kotlin/com/jlpt/n5/ui/screens/flashcard/components/FlashcardControls.kt",
    ]),
    ("Mock Tests & Listening", [
        "shared/src/commonMain/kotlin/com/jlpt/n5/ui/screens/mocktest/MockTestListScreen.kt",
        "shared/src/commonMain/kotlin/com/jlpt/n5/ui/screens/mocktest/MockTestExamScreen.kt",
        "shared/src/commonMain/kotlin/com/jlpt/n5/ui/screens/mocktest/MockTestResultScreen.kt",
        "shared/src/commonMain/kotlin/com/jlpt/n5/ui/screens/ListeningPracticeScreen.kt",
    ]),
]

phase("Parallel Screen Group UI Audit")
reports = await parallel(
    SCREEN_GROUPS,
    lambda group: agent(
        prompt=(
            f"Read .agents/skills/mobile-ui-ux-auditor/SKILL.md and audit these Compose files for 320dp-375dp mobile screen bugs "
            f"(missing Modifier.weight(1f) in SpaceBetween Rows, vertical text wrapping, badge overflow, iOS scroll conflicts): "
            f"{', '.join(group[1])}. Return a concise list of issues or 'OK'."
        ),
        schema={"type": "string"},
        role=f"UI Auditor: {group[0]}",
        type_name="research",
        model="flash",
    )
)

for (group_name, _), report in zip(SCREEN_GROUPS, reports):
    log(f"=== {group_name} ===\n{report}\n")
