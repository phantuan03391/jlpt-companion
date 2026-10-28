package com.jlpt.n5.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.data.JLPTRepository
import com.jlpt.n5.model.KanjiItem
import com.jlpt.n5.ui.components.HanVietBadge
import com.jlpt.n5.ui.components.JapaneseBadge
import com.jlpt.n5.ui.components.KanjiStrokeOrderView
import com.jlpt.n5.ui.theme.*

@Composable
fun KanjiExplorerScreen(
    onOpenFlashcardKanji: () -> Unit
) {
    val focusManager = LocalFocusManager.current
    var searchQuery by remember { mutableStateOf("") }
    var selectedKanji by remember { mutableStateOf<KanjiItem?>(null) }

    val allKanji = JLPTRepository.kanjiList

    val filtered = remember(searchQuery) {
        if (searchQuery.isEmpty()) allKanji
        else allKanji.filter {
            it.kanji.contains(searchQuery) ||
                    it.hanViet.contains(searchQuery, ignoreCase = true) ||
                    it.meaning.contains(searchQuery, ignoreCase = true) ||
                    it.onyomi.any { on -> on.contains(searchQuery, ignoreCase = true) } ||
                    it.kunyomi.any { kun -> kun.contains(searchQuery, ignoreCase = true) }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) {
                focusManager.clearFocus()
            }
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
                    color = MaterialTheme.colors.textPrimary
                )
                Text(
                    text = "Toàn bộ chữ Hán cơ bản nhất kèm thứ tự nét vẽ",
                    fontSize = 13.sp,
                    color = MaterialTheme.colors.textSecondary
                )
            }

            Button(
                onClick = {
                    focusManager.clearFocus()
                    onOpenFlashcardKanji()
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.toriiAccent),
                shape = RoundedCornerShape(10.dp),
                contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp)
            ) {
                Text(
                    "🗂️ Ôn thẻ",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = androidx.compose.ui.graphics.Color.White
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            placeholder = {
                Text(
                    "Tìm theo Kanji, Hán Việt, âm On/Kun, ý nghĩa...",
                    color = MaterialTheme.colors.textMuted,
                    fontSize = 13.sp
                )
            },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            singleLine = true,
            trailingIcon = {
                if (searchQuery.isNotEmpty()) {
                    IconButton(onClick = {
                        searchQuery = ""
                        focusManager.clearFocus()
                    }) {
                        Text(
                            text = "✕",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colors.textMuted
                        )
                    }
                }
            },
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
            keyboardActions = KeyboardActions(onSearch = { focusManager.clearFocus() }),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                backgroundColor = MaterialTheme.colors.surface,
                textColor = MaterialTheme.colors.textPrimary,
                cursorColor = MaterialTheme.colors.primary,
                focusedBorderColor = MaterialTheme.colors.primary,
                unfocusedBorderColor = MaterialTheme.colors.outlineBorder
            )
        )

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Tìm thấy ${filtered.size} chữ Hán",
                fontSize = 12.sp,
                color = MaterialTheme.colors.textSecondary
            )

            Text(
                text = "Đã thuộc: ${JLPTRepository.masteredKanjiIds.size}/104",
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colors.matchaAccent
            )
        }

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
                        .clickable {
                            focusManager.clearFocus()
                            selectedKanji = kanjiItem
                        },
                    shape = RoundedCornerShape(12.dp),
                    elevation = 1.dp,
                    backgroundColor = if (isMastered) MaterialTheme.colors.matchaBg else MaterialTheme.colors.cardBackground
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
                            color = if (isMastered) MaterialTheme.colors.matchaAccent else MaterialTheme.colors.toriiAccent
                        )

                        Spacer(modifier = Modifier.height(2.dp))

                        Text(
                            text = kanjiItem.hanViet,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colors.textPrimary,
                            maxLines = 1
                        )

                        Text(
                            text = "${kanjiItem.strokes} nét",
                            fontSize = 10.sp,
                            color = MaterialTheme.colors.textSecondary
                        )
                    }
                }
            }
        }
    }

    // Kanji Detail Modal Dialog with Stroke Order Animation
    if (selectedKanji != null) {
        val item = selectedKanji!!
        var isMastered by remember(item.id) { mutableStateOf(JLPTRepository.masteredKanjiIds.contains(item.id)) }

        AlertDialog(
            onDismissRequest = { selectedKanji = null },
            backgroundColor = MaterialTheme.colors.cardBackground,
            shape = RoundedCornerShape(20.dp),
            buttons = {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(max = 620.dp)
                        .verticalScroll(rememberScrollState())
                        .padding(18.dp)
                ) {
                    // Header Row
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.Top
                    ) {
                        Column {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = item.kanji,
                                    fontSize = 44.sp,
                                    fontWeight = FontWeight.Black,
                                    color = MaterialTheme.colors.toriiAccent
                                )
                                Spacer(modifier = Modifier.width(10.dp))
                                Column {
                                    HanVietBadge(hanViet = item.hanViet)
                                    Spacer(modifier = Modifier.height(4.dp))
                                    JapaneseBadge(text = "${item.strokes} nét vẽ")
                                }
                            }
                        }

                        Button(
                            onClick = {
                                isMastered = JLPTRepository.toggleMasteredKanji(item.id)
                            },
                            colors = ButtonDefaults.buttonColors(
                                backgroundColor = if (isMastered) MaterialTheme.colors.matchaBg else MaterialTheme.colors.surfaceContainer
                            ),
                            shape = RoundedCornerShape(10.dp),
                            elevation = ButtonDefaults.elevation(0.dp)
                        ) {
                            Text(
                                text = if (isMastered) "✅ Đã thuộc" else "Chưa thuộc",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = if (isMastered) MaterialTheme.colors.matchaAccent else MaterialTheme.colors.textSecondary
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Ý nghĩa: ${item.meaning}",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.textPrimary
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    // Kanji Stroke Order Component with Animation and Genko Yoshi Canvas
                    KanjiStrokeOrderView(
                        kanjiItem = item,
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    // Readings
                    if (item.onyomi.isNotEmpty()) {
                        Text(
                            text = "Âm On (Onyomi): ${item.onyomi.joinToString(" • ")}",
                            fontSize = 13.sp,
                            color = MaterialTheme.colors.toriiAccent,
                            fontWeight = FontWeight.SemiBold
                        )
                    }

                    if (item.kunyomi.isNotEmpty()) {
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Âm Kun (Kunyomi): ${item.kunyomi.joinToString(" • ")}",
                            fontSize = 13.sp,
                            color = MaterialTheme.colors.textSecondary,
                            fontWeight = FontWeight.Medium
                        )
                    }

                    // Vocabulary Examples
                    if (item.examples.isNotEmpty()) {
                        Spacer(modifier = Modifier.height(14.dp))
                        Text(
                            text = "Từ ghép ví dụ thường gặp:",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colors.textPrimary
                        )
                        Spacer(modifier = Modifier.height(6.dp))

                        item.examples.forEach { ex ->
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 3.dp)
                                    .background(MaterialTheme.colors.surfaceContainer, RoundedCornerShape(8.dp))
                                    .padding(horizontal = 10.dp, vertical = 8.dp)
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Column {
                                        Text(
                                            text = "${ex.word} (${ex.reading})",
                                            fontSize = 13.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = MaterialTheme.colors.textPrimary
                                        )
                                        Text(
                                            text = ex.meaning,
                                            fontSize = 12.sp,
                                            color = MaterialTheme.colors.textSecondary
                                        )
                                    }
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = { selectedKanji = null },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.toriiAccent)
                    ) {
                        Text("Đóng", color = androidx.compose.ui.graphics.Color.White, fontWeight = FontWeight.Bold)
                    }
                }
            }
        )
    }
}
