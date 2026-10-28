package com.jlpt.n5.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp

val AppShapes = Shapes(
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(14.dp),
    large = RoundedCornerShape(20.dp)
)

private val LightColors = lightColors(
    primary = ToriiCrimson,
    primaryVariant = ToriiCrimsonDark,
    secondary = AizomeIndigo,
    background = WashiBackground,
    surface = WashiCard,
    onPrimary = WashiCard,
    onSecondary = WashiCard,
    onBackground = SumiTextPrimary,
    onSurface = SumiTextPrimary
)

private val DarkColors = darkColors(
    primary = ToriiCrimsonVibrant,
    primaryVariant = ToriiCrimson,
    secondary = AizomePale,
    background = SumiBackground,
    surface = SumiCard,
    onPrimary = SumiBackground,
    onSecondary = SumiBackground,
    onBackground = WashiTextPrimary,
    onSurface = WashiTextPrimary
)

// App-wide dark mode state controller (allows manual toggle or system default)
val LocalDarkMode = compositionLocalOf { mutableStateOf(false) }

@Composable
fun JLPTAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val darkModeState = remember(darkTheme) { mutableStateOf(darkTheme) }
    val colors = if (darkModeState.value) DarkColors else LightColors

    CompositionLocalProvider(LocalDarkMode provides darkModeState) {
        MaterialTheme(
            colors = colors,
            shapes = AppShapes,
            content = content
        )
    }
}
