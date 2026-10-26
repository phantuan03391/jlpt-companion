package com.jlpt.n5.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

val AppShapes = Shapes(
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(16.dp),
    large = RoundedCornerShape(24.dp)
)

private val LightColors = lightColors(
    primary = IndigoPrimary,
    primaryVariant = IndigoDark,
    secondary = SakuraPink,
    background = BackgroundLight,
    surface = SurfaceWhite,
    onPrimary = SurfaceWhite,
    onSecondary = SurfaceWhite,
    onBackground = Slate900,
    onSurface = Slate900
)

private val DarkColors = darkColors(
    primary = IndigoLight,
    primaryVariant = IndigoPrimary,
    secondary = SakuraPink,
    background = BackgroundDark,
    surface = SurfaceDark,
    onPrimary = Slate900,
    onSecondary = SurfaceWhite,
    onBackground = Slate50,
    onSurface = Slate50
)

@Composable
fun JLPTAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colors = colors,
        shapes = AppShapes,
        content = content
    )
}
