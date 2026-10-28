package com.jlpt.n5.ui.components

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.model.KanjiItem
import com.jlpt.n5.ui.theme.*
import kotlinx.coroutines.delay

@Composable
fun KanjiStrokeOrderView(
    kanjiItem: KanjiItem,
    modifier: Modifier = Modifier
) {
    val totalStrokes = kanjiItem.strokes.coerceAtLeast(1)
    var currentStep by remember(kanjiItem.id) { mutableStateOf(totalStrokes) }
    var isPlayingAnimation by remember(kanjiItem.id) { mutableStateOf(false) }

    // Auto stroke animation player loop
    LaunchedEffect(isPlayingAnimation, kanjiItem.id) {
        if (isPlayingAnimation) {
            while (isPlayingAnimation) {
                for (step in 1..totalStrokes) {
                    currentStep = step
                    delay(700L)
                }
                delay(1200L) // pause at finished state before restart
            }
        }
    }

    val strokeRule = remember(kanjiItem.kanji) {
        when {
            kanjiItem.kanji in listOf("一", "二", "三", "十", "土", "生") -> "Quy tắc: Ngang trước sổ sau, trên trước dưới sau"
            kanjiItem.kanji in listOf("川", "月", "日", "目", "口", "四", "国") -> "Quy tắc: Ngoài trước trong sau, vào trước đóng sau"
            kanjiItem.kanji in listOf("八", "人", "父", "入", "火") -> "Quy tắc: Phẩy (trái) trước, Mác (phải) sau"
            kanjiItem.kanji in listOf("小", "水", "山", "木", "本") -> "Quy tắc: Giữa trước, hai bên sau"
            else -> "Quy tắc: Từ trên xuống dưới, từ trái qua phải"
        }
    }

    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        backgroundColor = MaterialTheme.colors.surface,
        elevation = 2.dp
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "✍️ Thứ tự nét vẽ (Bút thuận)",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.onSurface
                    )
                }

                // Play Animation Toggle Button
                Button(
                    onClick = { isPlayingAnimation = !isPlayingAnimation },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = if (isPlayingAnimation) SakuraPink else IndigoPrimary
                    ),
                    shape = RoundedCornerShape(20.dp),
                    contentPadding = PaddingValues(horizontal = 10.dp, vertical = 4.dp),
                    elevation = ButtonDefaults.elevation(0.dp)
                ) {
                    Text(
                        text = if (isPlayingAnimation) "⏹ Dừng" else "▶ Chạy ảnh động",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Traditional Grid Canvas Box for Writing Practice
            Box(
                modifier = Modifier
                    .size(160.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(if (MaterialTheme.colors.isLight) SurfaceContainerLowest else SurfaceContainer)
                    .border(2.dp, if (isPlayingAnimation) SakuraPink else OutlineColor, RoundedCornerShape(16.dp)),
                contentAlignment = Alignment.Center
            ) {
                // Guidelines Canvas (Crossed dash lines)
                val gridColor = if (MaterialTheme.colors.isLight) Color(0xFFE2DDD4) else Color(0xFF38332E)
                Canvas(modifier = Modifier.fillMaxSize()) {
                    val w = size.width
                    val h = size.height
                    val dashEffect = PathEffect.dashPathEffect(floatArrayOf(6f, 6f), 0f)

                    // Vertical center dashed line
                    drawLine(
                        color = gridColor,
                        start = Offset(w / 2, 0f),
                        end = Offset(w / 2, h),
                        strokeWidth = 1.5f,
                        pathEffect = dashEffect
                    )
                    // Horizontal center dashed line
                    drawLine(
                        color = gridColor,
                        start = Offset(0f, h / 2),
                        end = Offset(w, h / 2),
                        strokeWidth = 1.5f,
                        pathEffect = dashEffect
                    )
                    // Diagonal lines
                    drawLine(
                        color = gridColor.copy(alpha = 0.5f),
                        start = Offset(0f, 0f),
                        end = Offset(w, h),
                        strokeWidth = 1f,
                        pathEffect = dashEffect
                    )
                    drawLine(
                        color = gridColor.copy(alpha = 0.5f),
                        start = Offset(w, 0f),
                        end = Offset(0f, h),
                        strokeWidth = 1f,
                        pathEffect = dashEffect
                    )
                }

                // Render the Kanji with stroke visualization
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = kanjiItem.kanji,
                        fontSize = 82.sp,
                        fontWeight = FontWeight.Black,
                        color = if (isPlayingAnimation) ToriiCrimson else MaterialTheme.colors.onSurface
                    )
                }

                // Step overlay badge
                Box(
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .padding(6.dp)
                        .background(ToriiCrimson.copy(alpha = 0.15f), RoundedCornerShape(6.dp))
                        .padding(horizontal = 6.dp, vertical = 2.dp)
                ) {
                    Text(
                        text = "Nét $currentStep / $totalStrokes",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = ToriiCrimson
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Stroke rule explanation
            Text(
                text = strokeRule,
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.colors.onSurfaceVariant
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Step Navigation Bar
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedButton(
                    onClick = {
                        isPlayingAnimation = false
                        if (currentStep > 1) currentStep--
                    },
                    enabled = currentStep > 1,
                    shape = RoundedCornerShape(8.dp),
                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 4.dp),
                    modifier = Modifier.height(32.dp)
                ) {
                    Text("← Nét trước", fontSize = 11.sp)
                }

                Spacer(modifier = Modifier.width(12.dp))

                // Dots for each stroke
                Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                    for (i in 1..totalStrokes.coerceAtMost(10)) {
                        Box(
                            modifier = Modifier
                                .size(if (i == currentStep) 10.dp else 6.dp)
                                .clip(CircleShape)
                                .background(
                                    if (i <= currentStep) ToriiCrimson else OutlineVariant
                                )
                                .clickable {
                                    isPlayingAnimation = false
                                    currentStep = i
                                }
                        )
                    }
                    if (totalStrokes > 10) {
                        Text(
                            text = "+${totalStrokes - 10}",
                            fontSize = 10.sp,
                            color = MaterialTheme.colors.onSurfaceVariant
                        )
                    }
                }

                Spacer(modifier = Modifier.width(12.dp))

                OutlinedButton(
                    onClick = {
                        isPlayingAnimation = false
                        if (currentStep < totalStrokes) currentStep++
                    },
                    enabled = currentStep < totalStrokes,
                    shape = RoundedCornerShape(8.dp),
                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 4.dp),
                    modifier = Modifier.height(32.dp)
                ) {
                    Text("Nét sau →", fontSize = 11.sp)
                }
            }
        }
    }
}
