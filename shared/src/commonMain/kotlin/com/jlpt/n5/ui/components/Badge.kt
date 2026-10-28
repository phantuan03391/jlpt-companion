package com.jlpt.n5.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
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
    backgroundColor: Color? = null,
    textColor: Color? = null
) {
    val bg = backgroundColor ?: MaterialTheme.colors.surfaceContainer
    val tc = textColor ?: MaterialTheme.colors.toriiAccent

    Box(
        modifier = modifier
            .background(bg, RoundedCornerShape(8.dp))
            .padding(horizontal = 10.dp, vertical = 4.dp)
    ) {
        Text(
            text = text,
            color = tc,
            fontSize = 11.sp,
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
            .background(MaterialTheme.colors.toriiBg, RoundedCornerShape(6.dp))
            .padding(horizontal = 8.dp, vertical = 2.dp)
    ) {
        Text(
            text = "Hán Việt: $hanViet",
            color = MaterialTheme.colors.toriiAccent,
            fontSize = 11.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun LevelBadge(
    level: String = "N5",
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .background(
                if (MaterialTheme.colors.isLight) Color(0xFFD1DCFE) else Color(0xFF263353),
                RoundedCornerShape(6.dp)
            )
            .padding(horizontal = 8.dp, vertical = 2.dp)
    ) {
        Text(
            text = level,
            color = if (MaterialTheme.colors.isLight) Color(0xFF1F2A44) else Color(0xFFBBC6E7),
            fontSize = 11.sp,
            fontWeight = FontWeight.Bold
        )
    }
}
