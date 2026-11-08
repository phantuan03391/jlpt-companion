package com.jlpt.n5.ui.screens.kanji.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.model.KanjiItem
import com.jlpt.n5.tts.LocalTTS
import com.jlpt.n5.ui.components.HanVietBadge
import com.jlpt.n5.ui.components.JapaneseBadge
import com.jlpt.n5.ui.components.KanjiStrokeOrderView
import com.jlpt.n5.ui.theme.*

@Composable
fun KanjiDetailDialog(
    item: KanjiItem,
    isMastered: Boolean,
    onToggleMastered: () -> Unit,
    onDismiss: () -> Unit
) {
    val tts = LocalTTS.current

    AlertDialog(
        onDismissRequest = onDismiss,
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
                // Header Row with Kanji, Mastered button, and Close button
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        modifier = Modifier.weight(1f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = item.kanji,
                            fontSize = 44.sp,
                            fontWeight = FontWeight.Black,
                            color = MaterialTheme.colors.toriiAccent
                        )
                        IconButton(
                            onClick = {
                                val readingToSpeak = item.kunyomi.firstOrNull() ?: item.onyomi.firstOrNull() ?: item.kanji
                                tts.speak(readingToSpeak)
                            },
                            modifier = Modifier.size(34.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Filled.VolumeUp,
                                contentDescription = "Phát âm",
                                tint = MaterialTheme.colors.toriiAccent,
                                modifier = Modifier.size(20.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(4.dp))
                        Column {
                            HanVietBadge(hanViet = item.hanViet)
                            Spacer(modifier = Modifier.height(3.dp))
                            JapaneseBadge(text = "${item.strokes} nét")
                        }
                    }

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Button(
                            onClick = onToggleMastered,
                            colors = ButtonDefaults.buttonColors(
                                backgroundColor = if (isMastered) MaterialTheme.colors.matchaBg else MaterialTheme.colors.surfaceContainer
                            ),
                            shape = RoundedCornerShape(10.dp),
                            elevation = ButtonDefaults.elevation(0.dp),
                            contentPadding = PaddingValues(horizontal = 10.dp, vertical = 6.dp)
                        ) {
                            if (isMastered) {
                                Icon(
                                    imageVector = Icons.Filled.Check,
                                    contentDescription = null,
                                    tint = MaterialTheme.colors.matchaAccent,
                                    modifier = Modifier.size(14.dp)
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                            }
                            Text(
                                text = if (isMastered) "Thuộc" else "Chưa thuộc",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = if (isMastered) MaterialTheme.colors.matchaAccent else MaterialTheme.colors.textSecondary
                            )
                        }

                        Spacer(modifier = Modifier.width(8.dp))

                        // Close button at top-right
                        Box(
                            modifier = Modifier
                                .size(32.dp)
                                .clip(CircleShape)
                                .background(MaterialTheme.colors.surfaceContainer)
                                .clickable { onDismiss() },
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Close,
                                contentDescription = "Đóng",
                                tint = MaterialTheme.colors.textSecondary,
                                modifier = Modifier.size(16.dp)
                            )
                        }
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

                // Kanji Stroke Order Component with Animation and Canvas
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
                                Column(modifier = Modifier.weight(1f)) {
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
                                IconButton(
                                    onClick = { tts.speak(if (ex.word.isNotEmpty()) ex.word else ex.reading) },
                                    modifier = Modifier.size(28.dp)
                                ) {
                                    Icon(
                                        imageVector = Icons.Filled.VolumeUp,
                                        contentDescription = "Phát âm ví dụ",
                                        tint = MaterialTheme.colors.toriiAccent,
                                        modifier = Modifier.size(16.dp)
                                    )
                                }
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = onDismiss,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.toriiAccent)
                ) {
                    Text("Đóng", color = Color.White, fontWeight = FontWeight.Bold)
                }
            }
        }
    )
}
