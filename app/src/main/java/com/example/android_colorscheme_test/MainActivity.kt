package com.example.android_colorscheme_test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.android_colorscheme_test.ui.theme.AndroidcolorschemetestTheme

private const val HEADER_SPACER_HEIGHT_DP = 50

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidcolorschemetestTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        Spacer(modifier = Modifier.height(HEADER_SPACER_HEIGHT_DP.dp))
                        ColorList(
                            name = "Android",
                            //modifier = Modifier.padding(innerPadding)
                        )
                    }
                }
            }
        }
    }
}

data class MaterialColor(val name: String, val color: Color)

private const val CONTENT_PADDING_HORIZONTAL_DP = 12
private const val CONTENT_PADDING_VERTICAL_DP = 16
private const val GRID_SPACING_DP = 10
private val buttonWidthDp = 140.dp

@Composable
fun ColorList(name: String, modifier: Modifier = Modifier) {
    val materialColors = listOf(
        MaterialColor("primary", MaterialTheme.colorScheme.primary),
        MaterialColor("onPrimary", MaterialTheme.colorScheme.onPrimary),
        MaterialColor("primaryContainer", MaterialTheme.colorScheme.primaryContainer),
        MaterialColor("onPrimaryContainer", MaterialTheme.colorScheme.onPrimaryContainer),
        MaterialColor("inversePrimary", MaterialTheme.colorScheme.inversePrimary),
        MaterialColor("secondary", MaterialTheme.colorScheme.secondary),
        MaterialColor("onSecondary", MaterialTheme.colorScheme.onSecondary),
        MaterialColor("secondaryContainer", MaterialTheme.colorScheme.secondaryContainer),
        MaterialColor("onSecondaryContainer", MaterialTheme.colorScheme.onSecondaryContainer),
        MaterialColor("tertiary", MaterialTheme.colorScheme.tertiary),
        MaterialColor("onTertiary", MaterialTheme.colorScheme.onTertiary),
        MaterialColor("tertiaryContainer", MaterialTheme.colorScheme.tertiaryContainer),
        MaterialColor("onTertiaryContainer", MaterialTheme.colorScheme.onTertiaryContainer),
        MaterialColor("background", MaterialTheme.colorScheme.background),
        MaterialColor("onBackground", MaterialTheme.colorScheme.onBackground),
        MaterialColor("surface", MaterialTheme.colorScheme.surface),
        MaterialColor("onSurface", MaterialTheme.colorScheme.onSurface),
        MaterialColor("surfaceVariant", MaterialTheme.colorScheme.surfaceVariant),
        MaterialColor("onSurfaceVariant", MaterialTheme.colorScheme.onSurfaceVariant),
        MaterialColor("surfaceTint", MaterialTheme.colorScheme.surfaceTint),
        MaterialColor("inverseSurface", MaterialTheme.colorScheme.inverseSurface),
        MaterialColor("inverseOnSurface", MaterialTheme.colorScheme.inverseOnSurface),
        MaterialColor("error", MaterialTheme.colorScheme.error),
        MaterialColor("onError", MaterialTheme.colorScheme.onError),
        MaterialColor("errorContainer", MaterialTheme.colorScheme.errorContainer),
        MaterialColor("onErrorContainer", MaterialTheme.colorScheme.onErrorContainer),
        MaterialColor("outline", MaterialTheme.colorScheme.outline),
        MaterialColor("outlineVariant", MaterialTheme.colorScheme.outlineVariant),
        MaterialColor("scrim", MaterialTheme.colorScheme.scrim),
        MaterialColor("surfaceBright", MaterialTheme.colorScheme.surfaceBright),
        MaterialColor("surfaceDim", MaterialTheme.colorScheme.surfaceDim),
        MaterialColor("surfaceContainer", MaterialTheme.colorScheme.surfaceContainer),
        MaterialColor("surfaceContainerHigh", MaterialTheme.colorScheme.surfaceContainerHigh),
        MaterialColor("surfaceContainerHighest", MaterialTheme.colorScheme.surfaceContainerHighest),
        MaterialColor("surfaceContainerLow", MaterialTheme.colorScheme.surfaceContainerLow),
        MaterialColor("surfaceContainerLowest", MaterialTheme.colorScheme.surfaceContainerLowest),
        MaterialColor("primaryFixed", MaterialTheme.colorScheme.primaryFixed),
        MaterialColor("primaryFixedDim", MaterialTheme.colorScheme.primaryFixedDim),
        MaterialColor("onPrimaryFixed", MaterialTheme.colorScheme.onPrimaryFixed),
        MaterialColor("onPrimaryFixedVariant", MaterialTheme.colorScheme.onPrimaryFixedVariant),
        MaterialColor("secondaryFixed", MaterialTheme.colorScheme.secondaryFixed),
        MaterialColor("secondaryFixedDim", MaterialTheme.colorScheme.secondaryFixedDim),
        MaterialColor("onSecondaryFixed", MaterialTheme.colorScheme.onSecondaryFixed),
        MaterialColor("onSecondaryFixedVariant", MaterialTheme.colorScheme.onSecondaryFixedVariant),
        MaterialColor("tertiaryFixed", MaterialTheme.colorScheme.tertiaryFixed),
        MaterialColor("tertiaryFixedDim", MaterialTheme.colorScheme.tertiaryFixedDim),
        MaterialColor("onTertiaryFixed", MaterialTheme.colorScheme.onTertiaryFixed),
        MaterialColor("onTertiaryFixedVariant", MaterialTheme.colorScheme.onTertiaryFixedVariant),
    )
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = buttonWidthDp),
        contentPadding = PaddingValues(
            start = CONTENT_PADDING_HORIZONTAL_DP.dp,
            top = CONTENT_PADDING_VERTICAL_DP.dp,
            end = CONTENT_PADDING_HORIZONTAL_DP.dp,
            bottom = CONTENT_PADDING_VERTICAL_DP.dp
        ),
        verticalArrangement = Arrangement.spacedBy(GRID_SPACING_DP.dp),
        horizontalArrangement = Arrangement.spacedBy(GRID_SPACING_DP.dp)
    ) {
        items(
            count = materialColors.size,
            key = { index -> index }
        ) { index ->
            val materialColor = materialColors.getOrNull(index)
            if (materialColor != null) {
                Text(
                    text = materialColor.name,
                    style = MaterialTheme.typography.bodyMedium,
                    color = materialColor.color
                )

            }
        }
    }
}
