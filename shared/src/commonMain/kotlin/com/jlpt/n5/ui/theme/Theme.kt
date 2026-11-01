package com.jlpt.n5.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.text.font.FontFamily
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

// Custom font family (can be provided for Web to render CJK Kanji and Hiragana/Katakana)
val LocalAppFont = compositionLocalOf<FontFamily?> { null }

@Composable
fun JLPTAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    fontFamily: FontFamily? = null,
    content: @Composable () -> Unit
) {
    val darkModeState = remember(darkTheme) { mutableStateOf(darkTheme) }
    val colors = if (darkModeState.value) DarkColors else LightColors
    val appFont = fontFamily ?: LocalAppFont.current

    val defaultTypography = MaterialTheme.typography
    val typography = if (appFont != null) {
        Typography(
            defaultFontFamily = appFont,
            h1 = defaultTypography.h1.copy(fontFamily = appFont),
            h2 = defaultTypography.h2.copy(fontFamily = appFont),
            h3 = defaultTypography.h3.copy(fontFamily = appFont),
            h4 = defaultTypography.h4.copy(fontFamily = appFont),
            h5 = defaultTypography.h5.copy(fontFamily = appFont),
            h6 = defaultTypography.h6.copy(fontFamily = appFont),
            subtitle1 = defaultTypography.subtitle1.copy(fontFamily = appFont),
            subtitle2 = defaultTypography.subtitle2.copy(fontFamily = appFont),
            body1 = defaultTypography.body1.copy(fontFamily = appFont),
            body2 = defaultTypography.body2.copy(fontFamily = appFont),
            button = defaultTypography.button.copy(fontFamily = appFont),
            caption = defaultTypography.caption.copy(fontFamily = appFont),
            overline = defaultTypography.overline.copy(fontFamily = appFont)
        )
    } else {
        defaultTypography
    }

    CompositionLocalProvider(
        LocalDarkMode provides darkModeState,
        LocalAppFont provides appFont
    ) {
        MaterialTheme(
            colors = colors,
            typography = typography,
            shapes = AppShapes,
            content = content
        )
    }
}
