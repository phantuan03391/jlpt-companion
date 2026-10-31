package com.jlpt.n5.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.graphics.vector.PathParser
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.data.JLPTRepository
import com.jlpt.n5.model.KanjiItem
import com.jlpt.n5.ui.theme.*
import kotlinx.coroutines.delay
import kotlin.math.min

@Composable
fun KanjiStrokeOrderView(
    kanjiItem: KanjiItem,
    modifier: Modifier = Modifier
) {
    val strokeStrings = remember(kanjiItem.kanji) {
        JLPTRepository.getKanjiStrokes(kanjiItem.kanji)
    }

    val parsedPaths = remember(strokeStrings) {
        strokeStrings.mapNotNull { d ->
            try {
                val path = Path()
                PathParser().parsePathString(d).toPath(path)
                path
            } catch (e: Exception) {
                null
            }
        }
    }

    val totalStrokes = remember(parsedPaths, kanjiItem.strokes) {
        if (parsedPaths.isNotEmpty()) parsedPaths.size else kanjiItem.strokes.coerceAtLeast(1)
    }

    var currentStep by remember(kanjiItem.id, totalStrokes) { mutableStateOf(totalStrokes) }
    var isPlayingAnimation by remember(kanjiItem.id) { mutableStateOf(false) }

    // Auto stroke animation player loop
    LaunchedEffect(isPlayingAnimation, kanjiItem.id, totalStrokes) {
        if (isPlayingAnimation) {
            while (isPlayingAnimation) {
                for (step in 1..totalStrokes) {
                    currentStep = step
                    delay(650L)
                }
                delay(1200L) // pause at finished state before restart
            }
        }
    }

    val strokeRule = remember(kanjiItem.kanji) {
        when {
            kanjiItem.kanji in listOf("一", "二", "三", "十", "土", "生", "王") -> "Quy tắc: Ngang trước sổ sau, trên trước dưới sau"
            kanjiItem.kanji in listOf("川", "月", "日", "目", "口", "四", "国", "田") -> "Quy tắc: Ngoài trước trong sau, vào trước đóng sau"
            kanjiItem.kanji in listOf("八", "人", "父", "入", "火", "文") -> "Quy tắc: Phẩy (trái) trước, Mác (phải) sau"
            kanjiItem.kanji in listOf("小", "水", "山", "木", "本", "林") -> "Quy tắc: Giữa trước, hai bên sau"
            else -> "Quy tắc: Từ trên xuống dưới, từ trái qua phải"
        }
    }

    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        backgroundColor = MaterialTheme.colors.cardBackground,
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
                Text(
                    text = "✍️ Thứ tự nét vẽ (Bút thuận)",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colors.textPrimary
                )

                // Play Animation Toggle Button
                Button(
                    onClick = { isPlayingAnimation = !isPlayingAnimation },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = if (isPlayingAnimation) MaterialTheme.colors.toriiAccent else MaterialTheme.colors.surfaceContainer
                    ),
                    shape = RoundedCornerShape(20.dp),
                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 4.dp),
                    elevation = ButtonDefaults.elevation(0.dp)
                ) {
                    Text(
                        text = if (isPlayingAnimation) "⏹ Dừng" else "▶ Chạy ảnh động",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (isPlayingAnimation) Color.White else MaterialTheme.colors.toriiAccent
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Traditional Grid Canvas Box (Genko Yoshi style) with high contrast for Light & Dark mode
            val isDarkTheme = !MaterialTheme.colors.isLight
            val boxBgColor = if (isDarkTheme) Color(0xFF1E1A17) else Color(0xFFFBF8F5)
            val boxBorderColor = if (isPlayingAnimation) MaterialTheme.colors.toriiAccent else MaterialTheme.colors.outlineBorder
            val gridColor = if (isDarkTheme) Color(0xFF38322C) else Color(0xFFE5DDD5)
            val completedStrokeColor = if (isDarkTheme) Color(0xFFF5EFEA) else Color(0xFF1F1C19)
            val activeStrokeColor = if (isDarkTheme) ToriiCrimsonVibrant else ToriiCrimson
            val ghostGuideColor = if (isDarkTheme) Color(0xFF3A342E) else Color(0xFFE2DAD2)

            Box(
                modifier = Modifier
                    .size(175.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(boxBgColor)
                    .border(2.dp, boxBorderColor, RoundedCornerShape(16.dp)),
                contentAlignment = Alignment.Center
            ) {
                Canvas(modifier = Modifier.fillMaxSize().padding(12.dp)) {
                    val w = size.width
                    val h = size.height
                    val dashEffect = PathEffect.dashPathEffect(floatArrayOf(6f, 6f), 0f)

                    // Vertical center dashed line
                    drawLine(
                        color = gridColor,
                        start = Offset(w / 2, 0f),
                        end = Offset(w / 2, h),
                        strokeWidth = 1.2f,
                        pathEffect = dashEffect
                    )
                    // Horizontal center dashed line
                    drawLine(
                        color = gridColor,
                        start = Offset(0f, h / 2),
                        end = Offset(w, h / 2),
                        strokeWidth = 1.2f,
                        pathEffect = dashEffect
                    )
                    // Diagonal lines
                    drawLine(
                        color = gridColor.copy(alpha = 0.5f),
                        start = Offset(0f, 0f),
                        end = Offset(w, h),
                        strokeWidth = 0.8f,
                        pathEffect = dashEffect
                    )
                    drawLine(
                        color = gridColor.copy(alpha = 0.5f),
                        start = Offset(w, 0f),
                        end = Offset(0f, h),
                        strokeWidth = 0.8f,
                        pathEffect = dashEffect
                    )

                    if (parsedPaths.isNotEmpty()) {
                        val scaleFactor = min(w, h) / 109f

                        // 1. Ghost guides for future strokes
                        for (i in currentStep until parsedPaths.size) {
                            withTransform({
                                scale(scaleFactor, scaleFactor, Offset.Zero)
                            }) {
                                drawPath(
                                    path = parsedPaths[i],
                                    color = ghostGuideColor,
                                    style = Stroke(
                                        width = 3.2f,
                                        cap = StrokeCap.Round,
                                        join = StrokeJoin.Round
                                    )
                                )
                            }
                        }

                        // 2. Previously completed strokes
                        val completedEnd = (currentStep - 1).coerceAtMost(parsedPaths.size)
                        for (i in 0 until completedEnd) {
                            withTransform({
                                scale(scaleFactor, scaleFactor, Offset.Zero)
                            }) {
                                drawPath(
                                    path = parsedPaths[i],
                                    color = completedStrokeColor,
                                    style = Stroke(
                                        width = 4.2f,
                                        cap = StrokeCap.Round,
                                        join = StrokeJoin.Round
                                    )
                                )
                            }
                        }

                        // 3. Current active stroke (highlighted in vivid Torii Crimson)
                        val activeIdx = currentStep - 1
                        if (activeIdx in parsedPaths.indices) {
                            withTransform({
                                scale(scaleFactor, scaleFactor, Offset.Zero)
                            }) {
                                drawPath(
                                    path = parsedPaths[activeIdx],
                                    color = activeStrokeColor,
                                    style = Stroke(
                                        width = 5.2f,
                                        cap = StrokeCap.Round,
                                        join = StrokeJoin.Round
                                    )
                                )
                            }
                        }
                    }
                }

                // Fallback if no vector paths available
                if (parsedPaths.isEmpty()) {
                    Text(
                        text = kanjiItem.kanji,
                        fontSize = 82.sp,
                        fontWeight = FontWeight.Black,
                        color = if (isPlayingAnimation) activeStrokeColor else completedStrokeColor
                    )
                }

                // Step overlay badge
                Box(
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .padding(8.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(MaterialTheme.colors.toriiBg)
                        .padding(horizontal = 8.dp, vertical = 3.dp)
                ) {
                    Text(
                        text = "Nét $currentStep / $totalStrokes",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.toriiAccent
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Stroke rule explanation
            Text(
                text = strokeRule,
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.colors.textSecondary
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Step Navigation Controls
            val strokeListState = rememberLazyListState()

            LaunchedEffect(currentStep) {
                strokeListState.animateScrollToItem((currentStep - 1).coerceAtLeast(0))
            }

            // Top control row: Prev button, Badge, Next button
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
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
                    colors = ButtonDefaults.outlinedButtonColors(
                        backgroundColor = MaterialTheme.colors.surfaceContainer
                    ),
                    modifier = Modifier.height(34.dp)
                ) {
                    Text(
                        text = "← Nét trước",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = if (currentStep > 1) MaterialTheme.colors.textPrimary else MaterialTheme.colors.textMuted
                    )
                }

                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = MaterialTheme.colors.toriiBg,
                    modifier = Modifier.clickable {
                        isPlayingAnimation = false
                        currentStep = totalStrokes
                    }
                ) {
                    Text(
                        text = "Nét $currentStep / $totalStrokes",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.toriiAccent,
                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                    )
                }

                OutlinedButton(
                    onClick = {
                        isPlayingAnimation = false
                        if (currentStep < totalStrokes) currentStep++
                    },
                    enabled = currentStep < totalStrokes,
                    shape = RoundedCornerShape(8.dp),
                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 4.dp),
                    colors = ButtonDefaults.outlinedButtonColors(
                        backgroundColor = MaterialTheme.colors.surfaceContainer
                    ),
                    modifier = Modifier.height(34.dp)
                ) {
                    Text(
                        text = "Nét sau →",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = if (currentStep < totalStrokes) MaterialTheme.colors.textPrimary else MaterialTheme.colors.textMuted
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Scrollable list of ALL stroke chips: shows every stroke (e.g. 1..18 for 曜) without cutting off!
            LazyRow(
                state = strokeListState,
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalAlignment = Alignment.CenterVertically,
                contentPadding = PaddingValues(horizontal = 2.dp)
            ) {
                items(totalStrokes) { index ->
                    val stepNum = index + 1
                    val isCurrent = stepNum == currentStep
                    val isDrawn = stepNum <= currentStep

                    Box(
                        modifier = Modifier
                            .size(28.dp)
                            .clip(CircleShape)
                            .background(
                                when {
                                    isCurrent -> activeStrokeColor
                                    isDrawn -> MaterialTheme.colors.matchaBg
                                    else -> MaterialTheme.colors.surfaceContainer
                                }
                            )
                            .clickable {
                                isPlayingAnimation = false
                                currentStep = stepNum
                            },
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "$stepNum",
                            fontSize = 11.sp,
                            fontWeight = if (isCurrent) FontWeight.Bold else FontWeight.Medium,
                            color = when {
                                isCurrent -> Color.White
                                isDrawn -> MaterialTheme.colors.matchaAccent
                                else -> MaterialTheme.colors.textMuted
                            }
                        )
                    }
                }
            }
        }
    }
}
