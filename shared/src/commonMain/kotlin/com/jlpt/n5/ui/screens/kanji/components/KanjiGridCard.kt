package com.jlpt.n5.ui.screens.kanji.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.model.KanjiItem
import com.jlpt.n5.ui.theme.*

@Composable
fun KanjiGridCard(
    item: KanjiItem,
    isMastered: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .height(96.dp)
            .clip(RoundedCornerShape(12.dp))
            .clickable(onClick = onClick),
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
                text = item.kanji,
                fontSize = 28.sp,
                fontWeight = FontWeight.Black,
                color = if (isMastered) MaterialTheme.colors.matchaAccent else MaterialTheme.colors.toriiAccent
            )

            Spacer(modifier = Modifier.height(2.dp))

            Text(
                text = item.hanViet,
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colors.textPrimary,
                maxLines = 1
            )

            Text(
                text = "${item.strokes} nét",
                fontSize = 10.sp,
                color = MaterialTheme.colors.textSecondary
            )
        }
    }
}
