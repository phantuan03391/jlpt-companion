package com.jlpt.n5.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.ui.theme.*

@Composable
fun JapaneseBadge(
    text: String,
    modifier: Modifier = Modifier,
    backgroundColor: Color = IndigoSubtle,
    textColor: Color = IndigoPrimary
) {
    Box(
        modifier = modifier
            .background(backgroundColor, RoundedCornerShape(8.dp))
            .padding(horizontal = 10.dp, vertical = 4.dp)
    ) {
        Text(
            text = text,
            color = textColor,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun HanVietBadge(
    hanViet: String,
    modifier: Modifier = Modifier
) {
    if (hanViet.isEmpty()) return
    Box(
        modifier = modifier
            .background(SakuraPinkLight, RoundedCornerShape(6.dp))
            .padding(horizontal = 8.dp, vertical = 2.dp)
    ) {
        Text(
            text = "Hán Việt: $hanViet",
            color = SakuraPink,
            fontSize = 11.sp,
            fontWeight = FontWeight.Medium
        )
    }
}
