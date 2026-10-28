package com.jlpt.n5.ui.theme

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color

// ==========================================
// Modern Nihongo Zen Palette (from Stitch)
// ==========================================

// Primary - Torii Crimson (赤根 / 茜色)
val ToriiCrimson = Color(0xFFD6343F)
val ToriiCrimsonDark = Color(0xFFB3172A)
val ToriiCrimsonLight = Color(0xFFFFDAD8)
val ToriiCrimsonVibrant = Color(0xFFFF7E86)

// Secondary - Aizome Indigo (藍染)
val AizomeIndigo = Color(0xFF1F2A44)
val AizomeIndigoLight = Color(0xFF535E7B)
val AizomeContainer = Color(0xFFD1DCFE)
val AizomePale = Color(0xFFBBC6E7)

// Tertiary - Uji Matcha (宇治抹茶 / 竹)
val UjiMatcha = Color(0xFF006753)
val UjiMatchaContainer = Color(0xFF1B826A)
val UjiMatchaLight = Color(0xFF98F4D7)
val UjiMatchaBright = Color(0xFF5ED6B5)

// Amber / Ochre Warning (黄土)
val OchreAmber = Color(0xFFD97706)
val OchreLight = Color(0xFFFFFBEB)
val OchreDark = Color(0xFFFBBF24)

// Neutral Light - Washi Paper (和紙)
val WashiBackground = Color(0xFFFFF8F4)
val WashiCard = Color(0xFFFFFFFF)
val WashiContainer = Color(0xFFF4ECE7)
val WashiContainerLow = Color(0xFFFAF2ED)
val WashiContainerHigh = Color(0xFFEEE7E2)
val WashiOutline = Color(0xFFEADFD0)
val WashiOutlineVariant = Color(0xFFE3BEBC)
val SumiTextPrimary = Color(0xFF1E1B18)
val SumiTextSecondary = Color(0xFF5B403F)
val SumiTextMuted = Color(0xFF786D65)

// Neutral Dark - Sumi Ink Charcoal (墨色 / 漆黒)
val SumiBackground = Color(0xFF13110F)
val SumiCard = Color(0xFF1E1A17)
val SumiContainer = Color(0xFF27221E)
val SumiContainerLow = Color(0xFF181513)
val SumiContainerHigh = Color(0xFF332D28)
val SumiOutline = Color(0xFF3D3630)
val SumiOutlineVariant = Color(0xFF4A413A)
val WashiTextPrimary = Color(0xFFF7EFEA)
val WashiTextSecondary = Color(0xFFA89F91)
val WashiTextMuted = Color(0xFF8C8276)

// Compatibility aliases for existing references
val IndigoPrimary = ToriiCrimson
val IndigoDark = ToriiCrimsonDark
val IndigoLight = ToriiCrimsonVibrant
val IndigoSubtle = Color(0xFFFFF1F2)

val SakuraPink = ToriiCrimson
val SakuraPinkLight = Color(0xFFFFF0F1)

val MatchaGreen = UjiMatcha
val MatchaGreenLight = Color(0xFFE6F8F3)

val AmberWarning = OchreAmber
val AmberLight = OchreLight

val Slate900 = SumiTextPrimary
val Slate800 = Color(0xFF33302D)
val Slate700 = Color(0xFF5B403F)
val Slate600 = Color(0xFF786D65)
val Slate500 = Color(0xFF8F857B)
val Slate400 = Color(0xFFA89F91)
val Slate300 = Color(0xFFCBD5E1)
val Slate200 = WashiOutline
val Slate100 = WashiContainer
val Slate50 = WashiContainerLow

val BackgroundLight = WashiBackground
val SurfaceWhite = WashiCard
val BackgroundDark = SumiBackground
val SurfaceDark = SumiCard
val SurfaceDarkElevated = SumiContainer

// Semantic getters that dynamically adapt to Light vs Dark theme
val Colors.cardBackground: Color
    @Composable
    @ReadOnlyComposable
    get() = if (isLight) WashiCard else SumiCard

val Colors.surfaceContainer: Color
    @Composable
    @ReadOnlyComposable
    get() = if (isLight) WashiContainer else SumiContainer

val Colors.surfaceContainerLow: Color
    @Composable
    @ReadOnlyComposable
    get() = if (isLight) WashiContainerLow else SumiContainerLow

val Colors.outlineBorder: Color
    @Composable
    @ReadOnlyComposable
    get() = if (isLight) WashiOutline else SumiOutline

val Colors.outlineVariantBorder: Color
    @Composable
    @ReadOnlyComposable
    get() = if (isLight) WashiOutlineVariant else SumiOutlineVariant

val Colors.textPrimary: Color
    @Composable
    @ReadOnlyComposable
    get() = if (isLight) SumiTextPrimary else WashiTextPrimary

val Colors.textSecondary: Color
    @Composable
    @ReadOnlyComposable
    get() = if (isLight) SumiTextSecondary else WashiTextSecondary

val Colors.textMuted: Color
    @Composable
    @ReadOnlyComposable
    get() = if (isLight) SumiTextMuted else WashiTextMuted

val Colors.toriiAccent: Color
    @Composable
    @ReadOnlyComposable
    get() = if (isLight) ToriiCrimson else ToriiCrimsonVibrant

val Colors.matchaAccent: Color
    @Composable
    @ReadOnlyComposable
    get() = if (isLight) UjiMatcha else UjiMatchaBright

val Colors.matchaBg: Color
    @Composable
    @ReadOnlyComposable
    get() = if (isLight) MatchaGreenLight else Color(0xFF0F3D32)

val Colors.toriiBg: Color
    @Composable
    @ReadOnlyComposable
    get() = if (isLight) SakuraPinkLight else Color(0xFF3D1619)

val Colors.amberBg: Color
    @Composable
    @ReadOnlyComposable
    get() = if (isLight) OchreLight else Color(0xFF3D2C0F)

val Colors.isDark: Boolean
    @Composable
    @ReadOnlyComposable
    get() = !isLight

// Extra values for Canvas/Component usage
val OutlineColor = WashiOutline
val OutlineVariant = WashiOutlineVariant
val SurfaceContainer = WashiContainer
val SurfaceContainerLowest = WashiCard

val Colors.onSurfaceVariant: Color
    @Composable
    @ReadOnlyComposable
    get() = textSecondary
