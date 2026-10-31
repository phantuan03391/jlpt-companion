package com.jlpt.n5.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Card
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp

@Composable
fun FlipCard(
    isFlipped: Boolean,
    onFlip: () -> Unit,
    modifier: Modifier = Modifier,
    onSwipeLeft: (() -> Unit)? = null,
    onSwipeRight: (() -> Unit)? = null,
    front: @Composable () -> Unit,
    back: @Composable () -> Unit
) {
    val rotation by animateFloatAsState(
        targetValue = if (isFlipped) 180f else 0f,
        animationSpec = tween(durationMillis = 400)
    )

    var accumulatedDragX by remember { mutableStateOf(0f) }
    val animatedDragX by animateFloatAsState(
        targetValue = accumulatedDragX,
        animationSpec = tween(durationMillis = 150)
    )

    Card(
        modifier = modifier
            .graphicsLayer {
                translationX = animatedDragX
                rotationZ = (animatedDragX / 35f).coerceIn(-12f, 12f)
                rotationY = rotation
                cameraDistance = 12f * density
            }
            .pointerInput(onSwipeLeft, onSwipeRight) {
                detectHorizontalDragGestures(
                    onDragStart = {
                        accumulatedDragX = 0f
                    },
                    onDragEnd = {
                        if (accumulatedDragX < -70f) {
                            onSwipeLeft?.invoke()
                        } else if (accumulatedDragX > 70f) {
                            onSwipeRight?.invoke()
                        }
                        accumulatedDragX = 0f
                    },
                    onDragCancel = {
                        accumulatedDragX = 0f
                    },
                    onHorizontalDrag = { change, dragAmount ->
                        change.consume()
                        accumulatedDragX += dragAmount
                    }
                )
            }
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) { onFlip() },
        elevation = 6.dp
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            if (rotation <= 90f) {
                front()
            } else {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .graphicsLayer {
                            rotationY = 180f
                        }
                ) {
                    back()
                }
            }
        }
    }
}
