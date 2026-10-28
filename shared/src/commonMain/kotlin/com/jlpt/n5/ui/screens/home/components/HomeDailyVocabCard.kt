package com.jlpt.n5.ui.screens.home.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.model.Vocabulary
import com.jlpt.n5.ui.components.JapaneseBadge
import com.jlpt.n5.ui.theme.*

@Composable
fun HomeDailyVocabCard(
    vocab: Vocabulary,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(
            text = "Từ vựng tâm điểm hôm nay",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colors.textPrimary
        )

        Spacer(modifier = Modifier.height(8.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { onClick() },
            shape = RoundedCornerShape(16.dp),
            backgroundColor = MaterialTheme.colors.cardBackground,
            elevation = 1.dp
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = vocab.word,
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.toriiAccent
                    )
                    JapaneseBadge(text = vocab.type)
                }

                Text(
                    text = "${vocab.reading} (${vocab.romaji})",
                    fontSize = 14.sp,
                    color = MaterialTheme.colors.textMuted
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = vocab.meaning,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colors.textPrimary
                )

                if (vocab.exampleSentence.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(8.dp))
                    Divider(color = MaterialTheme.colors.outlineBorder)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Ví dụ: ${vocab.exampleSentence}",
                        fontSize = 13.sp,
                        color = MaterialTheme.colors.textSecondary
                    )
                    Text(
                        text = vocab.exampleSentenceMeaning,
                        fontSize = 12.sp,
                        color = MaterialTheme.colors.textMuted
                    )
                }
            }
        }
    }
}
