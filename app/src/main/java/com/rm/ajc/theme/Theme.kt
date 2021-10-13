package com.rm.ajc.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
  primary = Purple200,
  primaryVariant = Purple700,
  secondary = Teal200,
  secondaryVariant = Teal200,
  background = CodGrey,
  surface = CodGrey,
  error = CinnamonSatin,
  onPrimary = Black,
  onSecondary = Black,
  onBackground = White,
  onSurface = White,
  onError = Black
)

private val LightColorPalette = lightColors(
  primary = Purple500,
  primaryVariant = Purple700,
  secondary = Teal200,
  secondaryVariant = Teal700,
  background = White,
  surface = White,
  error = Monza,
  onPrimary = White,
  onSecondary = Black,
  onBackground = Black,
  onSurface = Black,
  onError = White
)

@Composable
fun AppTheme(
  darkTheme: Boolean = isSystemInDarkTheme(),
  content: @Composable() () -> Unit
) {
  val colors = if (darkTheme) {
    DarkColorPalette
  } else {
    LightColorPalette
  }

  MaterialTheme(
    colors = colors,
    typography = Typography,
    shapes = Shapes,
    content = content
  )
}