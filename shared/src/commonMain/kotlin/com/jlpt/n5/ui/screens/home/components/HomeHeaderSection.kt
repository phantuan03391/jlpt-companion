package com.jlpt.n5.ui.screens.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Brightness4
import androidx.compose.material.icons.filled.Whatshot
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.ui.theme.*

@Composable
fun HomeHeaderSection(
    streakDays: Int,
    modifier: Modifier = Modifier
) {
    val darkMode = LocalDarkMode.current

    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(
                text = "JLPT N5 ZEN MASTER",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colors.toriiAccent,
                letterSpacing = 1.sp
            )
            Text(
                text = "こんにちは！ Chào bạn",
                fontSize = 22.sp,
                fontWeight = FontWeight.ExtraBold,
                color = MaterialTheme.colors.textPrimary
            )
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            // Dark / Light Theme Toggle Button
            IconButton(
                onClick = { darkMode.value = !darkMode.value },
                modifier = Modifier
                    .clip(CircleShape)
                    .background(MaterialTheme.colors.surfaceContainer)
                    .size(38.dp)
            ) {
                Icon(
                    imageVector = Icons.Filled.Brightness4,
                    contentDescription = "Chuyển giao diện sáng tối",
                    tint = MaterialTheme.colors.textPrimary,
                    modifier = Modifier.size(20.dp)
                )
            }

            Spacer(modifier = Modifier.width(8.dp))

            // Streak Badge
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(MaterialTheme.colors.amberBg)
                    .padding(horizontal = 10.dp, vertical = 6.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Filled.Whatshot,
                        contentDescription = "Chuỗi ngày",
                        tint = OchreAmber,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "$streakDays ngày",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = OchreAmber
                    )
                }
            }
        }
    }
}
