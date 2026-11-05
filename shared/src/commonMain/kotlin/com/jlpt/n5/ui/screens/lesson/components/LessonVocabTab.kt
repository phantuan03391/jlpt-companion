package com.jlpt.n5.ui.screens.lesson.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.data.JLPTRepository
import com.jlpt.n5.model.Vocabulary
import com.jlpt.n5.tts.LocalTTS
import com.jlpt.n5.ui.components.HanVietBadge
import com.jlpt.n5.ui.theme.*

@Composable
fun LessonVocabTab(
    vocabularies: List<Vocabulary>,
    onOpenFlashcard: () -> Unit,
    onOpenListening: () -> Unit
) {
    val focusManager = LocalFocusManager.current
    var query by remember { mutableStateOf("") }
    val filtered = remember(query, vocabularies) {
        if (query.isEmpty()) vocabularies
        else vocabularies.filter {
            it.word.contains(query, ignoreCase = true) ||
                    it.reading.contains(query, ignoreCase = true) ||
                    it.meaning.contains(query, ignoreCase = true) ||
                    it.hanViet.contains(query, ignoreCase = true)
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) {
                focusManager.clearFocus()
            }
    ) {
        Spacer(modifier = Modifier.height(12.dp))

        // Search Input for vocab
        OutlinedTextField(
            value = query,
            onValueChange = { query = it },
            modifier = Modifier.fillMaxWidth(),
            placeholder = {
                Text(
                    "Tìm từ vựng trong bài...",
                    color = MaterialTheme.colors.textMuted,
                    fontSize = 13.sp
                )
            },
            shape = RoundedCornerShape(12.dp),
            singleLine = true,
            trailingIcon = {
                if (query.isNotEmpty()) {
                    IconButton(onClick = {
                        query = ""
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

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(bottom = 24.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            // Action shortcut banners: Flashcard & Luyện nghe
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Card(
                        modifier = Modifier
                            .weight(1f)
                            .clickable {
                                focusManager.clearFocus()
                                onOpenFlashcard()
                            },
                        shape = RoundedCornerShape(14.dp),
                        backgroundColor = MaterialTheme.colors.toriiBg,
                        elevation = 0.dp
                    ) {
                        Column(modifier = Modifier.padding(12.dp)) {
                            Text(
                                text = "🗂️ Flashcard",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colors.toriiAccent
                            )
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(
                                text = "Lật thẻ ${vocabularies.size} từ ➜",
                                fontSize = 11.sp,
                                color = MaterialTheme.colors.textSecondary
                            )
                        }
                    }

                    Card(
                        modifier = Modifier
                            .weight(1f)
                            .clickable {
                                focusManager.clearFocus()
                                onOpenListening()
                            },
                        shape = RoundedCornerShape(14.dp),
                        backgroundColor = MaterialTheme.colors.matchaBg,
                        elevation = 0.dp
                    ) {
                        Column(modifier = Modifier.padding(12.dp)) {
                            Text(
                                text = "🎧 Luyện Nghe",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colors.matchaAccent
                            )
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(
                                text = "Nghe & phản xạ ➜",
                                fontSize = 11.sp,
                                color = MaterialTheme.colors.textSecondary
                            )
                        }
                    }
                }
            }

            items(filtered) { vocab ->
                VocabItemCard(vocab)
            }
        }
    }
}

@Composable
fun VocabItemCard(vocab: Vocabulary) {
    val tts = LocalTTS.current
    var isMastered by remember(vocab.id) { mutableStateOf(JLPTRepository.masteredVocabIds.contains(vocab.id)) }
    var isStarred by remember(vocab.id) { mutableStateOf(JLPTRepository.starredVocabIds.contains(vocab.id)) }

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(14.dp),
        backgroundColor = MaterialTheme.colors.cardBackground,
        elevation = 1.dp
    ) {
        Column(modifier = Modifier.padding(14.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = vocab.word,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colors.toriiAccent
                        )

                        Spacer(modifier = Modifier.width(8.dp))

                        if (vocab.hanViet.isNotEmpty()) {
                            HanVietBadge(hanViet = vocab.hanViet)
                        }
                    }

                    Text(
                        text = "${vocab.reading} • ${vocab.romaji}",
                        fontSize = 13.sp,
                        color = MaterialTheme.colors.textMuted
                    )
                }

                Row(verticalAlignment = Alignment.CenterVertically) {
                    // Audio pronunciation button
                    IconButton(
                        onClick = {
                            val speechText = if (vocab.word.isNotEmpty()) vocab.word else vocab.reading
                            tts.speak(speechText)
                        },
                        modifier = Modifier.size(32.dp)
                    ) {
                        Text(text = "🔊", fontSize = 16.sp)
                    }

                    // Star button
                    IconButton(
                        onClick = {
                            isStarred = JLPTRepository.toggleStarredVocab(vocab.id)
                        },
                        modifier = Modifier.size(32.dp)
                    ) {
                        Text(text = if (isStarred) "⭐" else "☆", fontSize = 16.sp)
                    }

                    // Mastered check button
                    IconButton(
                        onClick = {
                            isMastered = JLPTRepository.toggleMasteredVocab(vocab.id)
                        },
                        modifier = Modifier.size(32.dp)
                    ) {
                        Text(text = if (isMastered) "✅" else "⚪", fontSize = 16.sp)
                    }
                }
            }

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = vocab.meaning,
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colors.textPrimary
            )

            if (vocab.exampleSentence.isNotEmpty()) {
                Spacer(modifier = Modifier.height(8.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(MaterialTheme.colors.surfaceContainer, RoundedCornerShape(8.dp))
                        .padding(10.dp)
                ) {
                    Column {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Ví dụ: ${vocab.exampleSentence}",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Medium,
                                color = MaterialTheme.colors.textPrimary,
                                modifier = Modifier.weight(1f)
                            )
                            IconButton(
                                onClick = { tts.speak(vocab.exampleSentence) },
                                modifier = Modifier.size(26.dp)
                            ) {
                                Text(text = "🔊", fontSize = 13.sp)
                            }
                        }
                        Text(
                            text = vocab.exampleSentenceMeaning,
                            fontSize = 11.sp,
                            color = MaterialTheme.colors.textSecondary
                        )
                    }
                }
            }
        }
    }
}
