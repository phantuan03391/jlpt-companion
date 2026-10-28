package com.jlpt.n5.ui.screens.flashcard.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.model.FlashcardItem
import com.jlpt.n5.model.FlashcardType
import com.jlpt.n5.ui.components.JapaneseBadge
import com.jlpt.n5.ui.theme.*

@Composable
fun FlashcardFront(
    card: FlashcardItem,
    showReadingHint: Boolean,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxSize(),
        shape = RoundedCornerShape(24.dp),
        backgroundColor = MaterialTheme.colors.cardBackground,
        elevation = 3.dp
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                JapaneseBadge(
                    text = if (card.type == FlashcardType.KANJI) "KANJI N5" else "TỪ VỰNG MINNA",
                    backgroundColor = MaterialTheme.colors.surfaceContainer,
                    textColor = MaterialTheme.colors.toriiAccent
                )

                Spacer(modifier = Modifier.height(28.dp))

                Text(
                    text = card.frontMain,
                    fontSize = if (card.frontMain.length <= 3) 54.sp else if (card.frontMain.length <= 6) 38.sp else 28.sp,
                    fontWeight = FontWeight.Black,
                    color = MaterialTheme.colors.textPrimary,
                    textAlign = TextAlign.Center
                )

                if (showReadingHint && card.frontSub.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        text = card.frontSub,
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Medium,
                        color = MaterialTheme.colors.toriiAccent,
                        textAlign = TextAlign.Center
                    )
                }

                Spacer(modifier = Modifier.height(36.dp))

                Text(
                    text = "🔄 Chạm vào thẻ để lật xem nghĩa",
                    fontSize = 12.sp,
                    color = MaterialTheme.colors.textMuted,
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
}

@Composable
fun FlashcardBack(
    card: FlashcardItem,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxSize(),
        shape = RoundedCornerShape(24.dp),
        backgroundColor = MaterialTheme.colors.cardBackground,
        elevation = 3.dp
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.surfaceContainerLow)
                .padding(24.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                JapaneseBadge(
                    text = "Ý NGHĨA & VÍ DỤ",
                    backgroundColor = MaterialTheme.colors.toriiBg,
                    textColor = MaterialTheme.colors.toriiAccent
                )

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = card.backMeaning,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = MaterialTheme.colors.toriiAccent,
                    textAlign = TextAlign.Center
                )

                if (card.backDetails.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = card.backDetails,
                        fontSize = 14.sp,
                        color = MaterialTheme.colors.textSecondary,
                        textAlign = TextAlign.Center
                    )
                }

                if (card.example.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(16.dp))
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp),
                        backgroundColor = MaterialTheme.colors.cardBackground,
                        elevation = 1.dp
                    ) {
                        Column(modifier = Modifier.padding(14.dp)) {
                            Text(
                                text = "Ví dụ mẫu:",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colors.textMuted
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = card.example,
                                fontSize = 13.sp,
                                color = MaterialTheme.colors.textPrimary,
                                lineHeight = 18.sp
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(22.dp))

                Text(
                    text = "🔄 Chạm để lật lại mặt trước",
                    fontSize = 12.sp,
                    color = MaterialTheme.colors.textMuted
                )
            }
        }
    }
}
