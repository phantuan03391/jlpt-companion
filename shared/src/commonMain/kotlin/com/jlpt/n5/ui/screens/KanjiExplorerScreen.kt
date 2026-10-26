package com.jlpt.n5.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.data.JLPTRepository
import com.jlpt.n5.model.KanjiItem
import com.jlpt.n5.ui.components.HanVietBadge
import com.jlpt.n5.ui.components.JapaneseBadge
import com.jlpt.n5.ui.theme.*

@Composable
fun KanjiExplorerScreen(
    onOpenFlashcardKanji: () -> Unit
) {
    var searchQuery by remember { mutableStateOf("") }
    var selectedKanji by remember { mutableStateOf<KanjiItem?>(null) }

    val allKanji = JLPTRepository.kanjiList

    val filtered = remember(searchQuery) {
        if (searchQuery.isEmpty()) allKanji
        else allKanji.filter {
            it.kanji.contains(searchQuery) ||
                    it.hanViet.contains(searchQuery, ignoreCase = true) ||
                    it.meaning.contains(searchQuery, ignoreCase = true)
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "104 Hán Tự Kanji N5",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colors.onBackground
                )
                Text(
                    text = "Toàn bộ chữ Hán cơ bản nhất cho kì thi N5",
                    fontSize = 13.sp,
                    color = Slate500
                )
            }

            Button(
                onClick = onOpenFlashcardKanji,
                colors = ButtonDefaults.buttonColors(backgroundColor = SakuraPink),
                shape = RoundedCornerShape(10.dp),
                contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp)
            ) {
                Text("🗂️ Ôn thẻ", fontSize = 12.sp, fontWeight = FontWeight.Bold, color = SurfaceWhite)
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            placeholder = { Text("Tìm kiếm theo Kanji, Hán Việt, ý nghĩa...") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            singleLine = true,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                backgroundColor = MaterialTheme.colors.surface,
                focusedBorderColor = IndigoPrimary,
                unfocusedBorderColor = Slate300
            )
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Tìm thấy ${filtered.size} chữ Hán",
            fontSize = 12.sp,
            color = Slate600
        )

        Spacer(modifier = Modifier.height(8.dp))

        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 78.dp),
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(bottom = 24.dp)
        ) {
            items(filtered) { kanjiItem ->
                val isMastered = JLPTRepository.masteredKanjiIds.contains(kanjiItem.id)

                Card(
                    modifier = Modifier
                        .height(96.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .clickable { selectedKanji = kanjiItem },
                    shape = RoundedCornerShape(12.dp),
                    elevation = 1.dp,
                    backgroundColor = if (isMastered) MatchaGreenLight else SurfaceWhite
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(6.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = kanjiItem.kanji,
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Black,
                            color = if (isMastered) MatchaGreen else IndigoPrimary
                        )

                        Spacer(modifier = Modifier.height(2.dp))

                        Text(
                            text = kanjiItem.hanViet,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = Slate800,
                            maxLines = 1
                        )

                        Text(
                            text = "${kanjiItem.strokes} nét",
                            fontSize = 10.sp,
                            color = Slate500
                        )
                    }
                }
            }
        }
    }

    // Kanji Detail Modal Dialog
    if (selectedKanji != null) {
        val item = selectedKanji!!
        var isMastered by remember(item.id) { mutableStateOf(JLPTRepository.masteredKanjiIds.contains(item.id)) }

        AlertDialog(
            onDismissRequest = { selectedKanji = null },
            buttons = {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.Top
                    ) {
                        Column {
                            Text(
                                text = item.kanji,
                                fontSize = 56.sp,
                                fontWeight = FontWeight.Black,
                                color = IndigoPrimary
                            )
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                HanVietBadge(hanViet = item.hanViet)
                                Spacer(modifier = Modifier.width(6.dp))
                                JapaneseBadge(text = "${item.strokes} nét")
                            }
                        }

                        Button(
                            onClick = {
                                isMastered = JLPTRepository.toggleMasteredKanji(item.id)
                            },
                            colors = ButtonDefaults.buttonColors(
                                backgroundColor = if (isMastered) MatchaGreenLight else Slate100
                            ),
                            shape = RoundedCornerShape(10.dp),
                            elevation = ButtonDefaults.elevation(0.dp)
                        ) {
                            Text(
                                text = if (isMastered) "✅ Đã thuộc" else "Chưa thuộc",
                                fontSize = 12.sp,
                                color = if (isMastered) MatchaGreen else Slate700
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    Text(
                        text = "Ý nghĩa: ${item.meaning}",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.onSurface
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    if (item.onyomi.isNotEmpty()) {
                        Text(
                            text = "Âm On (Onyomi): ${item.onyomi.joinToString(" • ")}",
                            fontSize = 13.sp,
                            color = IndigoDark,
                            fontWeight = FontWeight.Medium
                        )
                    }

                    if (item.kunyomi.isNotEmpty()) {
                        Text(
                            text = "Âm Kun (Kunyomi): ${item.kunyomi.joinToString(" • ")}",
                            fontSize = 13.sp,
                            color = Slate700,
                            fontWeight = FontWeight.Medium
                        )
                    }

                    if (item.examples.isNotEmpty()) {
                        Spacer(modifier = Modifier.height(12.dp))
                        Text(
                            text = "Từ ghép ví dụ:",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = Slate900
                        )
                        Spacer(modifier = Modifier.height(4.dp))

                        item.examples.forEach { ex ->
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 2.dp)
                                    .background(Slate50, RoundedCornerShape(6.dp))
                                    .padding(6.dp)
                            ) {
                                Text(
                                    text = "${ex.word} (${ex.reading}): ${ex.meaning}",
                                    fontSize = 12.sp,
                                    color = Slate800
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = { selectedKanji = null },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = IndigoPrimary)
                    ) {
                        Text("Đóng", color = SurfaceWhite)
                    }
                }
            }
        )
    }
}
