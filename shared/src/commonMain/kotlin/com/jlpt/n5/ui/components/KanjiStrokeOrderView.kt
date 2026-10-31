package com.jlpt.n5.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.graphics.vector.PathParser
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jlpt.n5.data.JLPTRepository
import com.jlpt.n5.model.KanjiItem
import com.jlpt.n5.ui.theme.*
import kotlinx.coroutines.delay
import kotlin.math.min

private data class DrawnStroke(
    val path: Path,
    val color: Color,
    val strokeWidth: Float = 12f
)

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

    // View mode vs Practice (Drawing) mode
    var isPracticeMode by remember(kanjiItem.id) { mutableStateOf(false) }

    // Viewing state
    var currentStep by remember(kanjiItem.id, totalStrokes) { mutableStateOf(totalStrokes) }
    var isPlayingAnimation by remember(kanjiItem.id) { mutableStateOf(false) }

    // Practice drawing state
    var showGhostGuide by remember(kanjiItem.id) { mutableStateOf(true) }
    val isDarkTheme = !MaterialTheme.colors.isLight
    val defaultInk = if (isDarkTheme) Color(0xFFF5EFEA) else Color(0xFF1F1C19)
    val toriiInk = if (isDarkTheme) ToriiCrimsonVibrant else ToriiCrimson
    var selectedInkColor by remember(kanjiItem.id, isDarkTheme) { mutableStateOf(toriiInk) }
    val userStrokes = remember(kanjiItem.id) { mutableStateListOf<DrawnStroke>() }

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

    val boxBgColor = if (isDarkTheme) Color(0xFF1E1A17) else Color(0xFFFBF8F5)
    val boxBorderColor = if (isPlayingAnimation) MaterialTheme.colors.toriiAccent else MaterialTheme.colors.outlineBorder
    val gridColor = if (isDarkTheme) Color(0xFF38322C) else Color(0xFFE5DDD5)
    val completedStrokeColor = if (isDarkTheme) Color(0xFFF5EFEA) else Color(0xFF1F1C19)
    val activeStrokeColor = if (isDarkTheme) ToriiCrimsonVibrant else ToriiCrimson
    val ghostGuideColor = if (isDarkTheme) Color(0xFF3A342E) else Color(0xFFE2DAD2)

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
            // Segmented Mode Selector: [👁️ Xem thứ tự nét] | [✍️ Luyện viết tay]
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colors.surfaceContainer)
                    .padding(3.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .clip(RoundedCornerShape(9.dp))
                        .background(if (!isPracticeMode) MaterialTheme.colors.cardBackground else Color.Transparent)
                        .clickable { isPracticeMode = false }
                        .padding(vertical = 7.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "👁️ Xem thứ tự nét",
                        fontSize = 12.sp,
                        fontWeight = if (!isPracticeMode) FontWeight.Bold else FontWeight.Medium,
                        color = if (!isPracticeMode) MaterialTheme.colors.toriiAccent else MaterialTheme.colors.textSecondary
                    )
                }

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .clip(RoundedCornerShape(9.dp))
                        .background(if (isPracticeMode) MaterialTheme.colors.cardBackground else Color.Transparent)
                        .clickable {
                            isPlayingAnimation = false
                            isPracticeMode = true
                        }
                        .padding(vertical = 7.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "✍️ Luyện viết tay",
                        fontSize = 12.sp,
                        fontWeight = if (isPracticeMode) FontWeight.Bold else FontWeight.Medium,
                        color = if (isPracticeMode) MaterialTheme.colors.toriiAccent else MaterialTheme.colors.textSecondary
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            if (!isPracticeMode) {
                // ==========================================
                // MODE 1: VIEW STROKE ORDER & ANIMATION
                // ==========================================
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

                Spacer(modifier = Modifier.height(12.dp))

                // Traditional Grid Canvas Box
                Box(
                    modifier = Modifier
                        .size(185.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(boxBgColor)
                        .border(2.dp, boxBorderColor, RoundedCornerShape(16.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Canvas(modifier = Modifier.fillMaxSize().padding(12.dp)) {
                        val w = size.width
                        val h = size.height
                        val dashEffect = PathEffect.dashPathEffect(floatArrayOf(6f, 6f), 0f)

                        drawLine(gridColor, Offset(w / 2, 0f), Offset(w / 2, h), 1.2f, pathEffect = dashEffect)
                        drawLine(gridColor, Offset(0f, h / 2), Offset(w, h / 2), 1.2f, pathEffect = dashEffect)
                        drawLine(gridColor.copy(alpha = 0.5f), Offset(0f, 0f), Offset(w, h), 0.8f, pathEffect = dashEffect)
                        drawLine(gridColor.copy(alpha = 0.5f), Offset(w, 0f), Offset(0f, h), 0.8f, pathEffect = dashEffect)

                        if (parsedPaths.isNotEmpty()) {
                            val scaleFactor = min(w, h) / 109f

                            withTransform({
                                scale(scaleFactor, scaleFactor, Offset.Zero)
                            }) {
                                // 1. Ghost guides for future strokes
                                for (i in currentStep until parsedPaths.size) {
                                    drawPath(
                                        path = parsedPaths[i],
                                        color = ghostGuideColor,
                                        style = Stroke(width = 3.2f, cap = StrokeCap.Round, join = StrokeJoin.Round)
                                    )
                                }

                                // 2. Previously completed strokes
                                val completedEnd = (currentStep - 1).coerceAtMost(parsedPaths.size)
                                for (i in 0 until completedEnd) {
                                    drawPath(
                                        path = parsedPaths[i],
                                        color = completedStrokeColor,
                                        style = Stroke(width = 4.2f, cap = StrokeCap.Round, join = StrokeJoin.Round)
                                    )
                                }

                                // 3. Current active stroke
                                val activeIdx = currentStep - 1
                                if (activeIdx in parsedPaths.indices) {
                                    drawPath(
                                        path = parsedPaths[activeIdx],
                                        color = activeStrokeColor,
                                        style = Stroke(width = 5.2f, cap = StrokeCap.Round, join = StrokeJoin.Round)
                                    )
                                }
                            }
                        }
                    }

                    if (parsedPaths.isEmpty()) {
                        Text(
                            text = kanjiItem.kanji,
                            fontSize = 82.sp,
                            fontWeight = FontWeight.Black,
                            color = if (isPlayingAnimation) activeStrokeColor else completedStrokeColor
                        )
                    }

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

                // Scrollable list of ALL stroke chips
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

            } else {
                // ==========================================
                // MODE 2: HIGH PERFORMANCE DRAWING CANVAS
                // ==========================================
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Đã vẽ: ${userStrokes.size} / $totalStrokes nét",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.textPrimary
                    )

                    if (userStrokes.size == totalStrokes) {
                        Surface(
                            shape = RoundedCornerShape(10.dp),
                            color = MaterialTheme.colors.matchaBg
                        ) {
                            Text(
                                text = "🎉 Đủ $totalStrokes nét!",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colors.matchaAccent,
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                            )
                        }
                    } else if (userStrokes.size > totalStrokes) {
                        Surface(
                            shape = RoundedCornerShape(10.dp),
                            color = MaterialTheme.colors.toriiBg
                        ) {
                            Text(
                                text = "Vượt số nét quy định",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Medium,
                                color = MaterialTheme.colors.toriiAccent,
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                            )
                        }
                    } else {
                        Text(
                            text = "Đồ theo nét mờ bên dưới",
                            fontSize = 11.sp,
                            color = MaterialTheme.colors.textMuted
                        )
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))

                // High Performance Isolated Drawing Canvas
                KanjiPracticeDrawingCanvas(
                    modifier = Modifier
                        .size(220.dp)
                        .clip(RoundedCornerShape(18.dp))
                        .background(boxBgColor)
                        .border(2.dp, boxBorderColor, RoundedCornerShape(18.dp)),
                    parsedPaths = parsedPaths,
                    showGhostGuide = showGhostGuide,
                    selectedInkColor = selectedInkColor,
                    userStrokes = userStrokes,
                    gridColor = gridColor,
                    ghostGuideColor = ghostGuideColor
                )

                Spacer(modifier = Modifier.height(12.dp))

                // Toolbar underneath canvas
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    OutlinedButton(
                        onClick = {
                            if (userStrokes.isNotEmpty()) {
                                userStrokes.removeAt(userStrokes.size - 1)
                            }
                        },
                        enabled = userStrokes.isNotEmpty(),
                        shape = RoundedCornerShape(8.dp),
                        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 4.dp),
                        colors = ButtonDefaults.outlinedButtonColors(
                            backgroundColor = MaterialTheme.colors.surfaceContainer
                        ),
                        modifier = Modifier.height(34.dp)
                    ) {
                        Text(
                            text = "↶ Hoàn tác",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = if (userStrokes.isNotEmpty()) MaterialTheme.colors.textPrimary else MaterialTheme.colors.textMuted
                        )
                    }

                    OutlinedButton(
                        onClick = { userStrokes.clear() },
                        enabled = userStrokes.isNotEmpty(),
                        shape = RoundedCornerShape(8.dp),
                        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 4.dp),
                        colors = ButtonDefaults.outlinedButtonColors(
                            backgroundColor = MaterialTheme.colors.surfaceContainer
                        ),
                        modifier = Modifier.height(34.dp)
                    ) {
                        Text(
                            text = "🗑️ Xóa hết",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = if (userStrokes.isNotEmpty()) MaterialTheme.colors.toriiAccent else MaterialTheme.colors.textMuted
                        )
                    }

                    Button(
                        onClick = { showGhostGuide = !showGhostGuide },
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = if (showGhostGuide) MaterialTheme.colors.toriiBg else MaterialTheme.colors.surfaceContainer
                        ),
                        shape = RoundedCornerShape(8.dp),
                        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 4.dp),
                        elevation = ButtonDefaults.elevation(0.dp),
                        modifier = Modifier.height(34.dp)
                    ) {
                        Text(
                            text = if (showGhostGuide) "👁️ Nét mẫu: Bật" else "🕶️ Nét mẫu: Tắt",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = if (showGhostGuide) MaterialTheme.colors.toriiAccent else MaterialTheme.colors.textSecondary
                        )
                    }

                    Box(
                        modifier = Modifier
                            .size(32.dp)
                            .clip(CircleShape)
                            .background(selectedInkColor)
                            .clickable {
                                selectedInkColor = if (selectedInkColor == toriiInk) defaultInk else toriiInk
                            }
                            .border(2.dp, MaterialTheme.colors.outlineBorder, CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "🎨", fontSize = 14.sp)
                    }
                }
            }
        }
    }
}

/**
 * High-performance, isolated drawing canvas.
 * Handles drag gestures using direct GPU segment drawing without recomposing outer UI.
 */
@Composable
private fun KanjiPracticeDrawingCanvas(
    modifier: Modifier = Modifier,
    parsedPaths: List<Path>,
    showGhostGuide: Boolean,
    selectedInkColor: Color,
    userStrokes: SnapshotStateList<DrawnStroke>,
    gridColor: Color,
    ghostGuideColor: Color
) {
    val livePoints = remember { mutableStateListOf<Offset>() }

    Canvas(
        modifier = modifier
            .padding(14.dp)
            .pointerInput(selectedInkColor) {
                detectDragGestures(
                    onDragStart = { offset ->
                        livePoints.clear()
                        livePoints.add(offset)
                    },
                    onDrag = { change, _ ->
                        change.consume()
                        livePoints.add(change.position)
                    },
                    onDragEnd = {
                        if (livePoints.size > 1) {
                            val p = Path()
                            p.moveTo(livePoints[0].x, livePoints[0].y)
                            for (i in 1 until livePoints.size) {
                                val p0 = livePoints[i - 1]
                                val p1 = livePoints[i]
                                p.quadraticBezierTo(p0.x, p0.y, (p0.x + p1.x) / 2f, (p0.y + p1.y) / 2f)
                            }
                            p.lineTo(livePoints.last().x, livePoints.last().y)
                            userStrokes.add(DrawnStroke(p, selectedInkColor, 12f))
                        } else if (livePoints.size == 1) {
                            val p = Path()
                            p.addOval(Rect(livePoints[0].x - 6f, livePoints[0].y - 6f, livePoints[0].x + 6f, livePoints[0].y + 6f))
                            userStrokes.add(DrawnStroke(p, selectedInkColor, 12f))
                        }
                        livePoints.clear()
                    },
                    onDragCancel = {
                        livePoints.clear()
                    }
                )
            }
    ) {
        val w = size.width
        val h = size.height
        val dashEffect = PathEffect.dashPathEffect(floatArrayOf(6f, 6f), 0f)

        // Traditional Genko Yoshi grid
        drawLine(gridColor, Offset(w / 2, 0f), Offset(w / 2, h), 1.2f, pathEffect = dashEffect)
        drawLine(gridColor, Offset(0f, h / 2), Offset(w, h / 2), 1.2f, pathEffect = dashEffect)
        drawLine(gridColor.copy(alpha = 0.5f), Offset(0f, 0f), Offset(w, h), 0.8f, pathEffect = dashEffect)
        drawLine(gridColor.copy(alpha = 0.5f), Offset(w, 0f), Offset(0f, h), 0.8f, pathEffect = dashEffect)

        // Draw ghost guide if enabled (scaled in one transformation)
        if (showGhostGuide && parsedPaths.isNotEmpty()) {
            val scaleFactor = min(w, h) / 109f
            withTransform({
                scale(scaleFactor, scaleFactor, Offset.Zero)
            }) {
                for (path in parsedPaths) {
                    drawPath(
                        path = path,
                        color = ghostGuideColor.copy(alpha = 0.35f),
                        style = Stroke(
                            width = 11f,
                            cap = StrokeCap.Round,
                            join = StrokeJoin.Round
                        )
                    )
                }
            }
        }

        // Draw finished user strokes
        for (stroke in userStrokes) {
            drawPath(
                path = stroke.path,
                color = stroke.color,
                style = Stroke(
                    width = stroke.strokeWidth,
                    cap = StrokeCap.Round,
                    join = StrokeJoin.Round
                )
            )
        }

        // Draw live active stroke (immediate GPU lines, zero latency)
        if (livePoints.size > 1) {
            for (i in 1 until livePoints.size) {
                drawLine(
                    color = selectedInkColor,
                    start = livePoints[i - 1],
                    end = livePoints[i],
                    strokeWidth = 12f,
                    cap = StrokeCap.Round
                )
            }
        } else if (livePoints.size == 1) {
            drawCircle(
                color = selectedInkColor,
                radius = 6f,
                center = livePoints[0]
            )
        }
    }
}
