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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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


data class MaterialColor(
    var surfaceName: String,
    var surfaceColor: Color,
    var textName: String,
    var textColor: Color
)

@Composable
fun MaterialColorButton(materialColor: MaterialColor) {
    var color: Color? by remember { mutableStateOf(null) }
    var name: String by remember { mutableStateOf("") }
    Button(
        onClick = {
//            color = materialColor.textColor
//            materialColor.textColor = materialColor.surfaceColor
//            materialColor.surfaceColor = color!!
//            name = materialColor.textName
//            materialColor.textName = materialColor.surfaceName
//            materialColor.surfaceName = name!!
        },
        modifier = Modifier.padding(16.dp),
        enabled = true,
        shape = RoundedCornerShape(
            topStart = 0.dp,        // Square top-left
            topEnd = 0.dp,         // Highly rounded top-right
            bottomStart = 0.dp,    // Moderately rounded bottom-left
            bottomEnd = 0.dp        // Square bottom-right
        ),
        colors = ButtonDefaults.buttonColors(
            contentColor = materialColor.textColor,
            containerColor = materialColor.surfaceColor
        ),
        contentPadding = PaddingValues(
            start = 6.dp,
            top = 2.dp,
            end = 6.dp,
            bottom = 2.dp
        ),
    ) {
        Column {
            Text(materialColor.surfaceName, style = MaterialTheme.typography.labelSmall)
            Text(materialColor.textName, style = MaterialTheme.typography.labelSmall)
        }
    }
}

private const val CONTENT_PADDING_HORIZONTAL_DP = 8
private const val CONTENT_PADDING_VERTICAL_DP = 2
private const val GRID_SPACING_DP = 0
private val buttonWidthDp = 140.dp

@Composable
fun ColorList(name: String, modifier: Modifier = Modifier) {
    val materialColors = listOf(
        MaterialColor(
            "primary",
            MaterialTheme.colorScheme.primary,
            "onPrimary",
            MaterialTheme.colorScheme.onPrimary
        ),
        MaterialColor(
            "primaryContainer",
            MaterialTheme.colorScheme.primaryContainer,
            "onPrimaryContainer",
            MaterialTheme.colorScheme.onPrimaryContainer
        ),
        MaterialColor(
            "primaryFixed",
            MaterialTheme.colorScheme.primaryFixed,
            "onPrimaryFixed",
            MaterialTheme.colorScheme.onPrimaryFixed
        ),
        MaterialColor(
            "primaryFixedDim",
            MaterialTheme.colorScheme.primaryFixedDim,
            "onPrimaryFixed",
            MaterialTheme.colorScheme.onPrimaryFixed
        ),
        MaterialColor(
            "primaryFixed",
            MaterialTheme.colorScheme.primaryFixed,
            "onPrimaryFixedVariant",
            MaterialTheme.colorScheme.onPrimaryFixedVariant
        ),
        MaterialColor(
            "inversePrimary",
            MaterialTheme.colorScheme.inversePrimary,
            "onPrimary",
            MaterialTheme.colorScheme.onPrimary
        ),
        MaterialColor(
            "secondary",
            MaterialTheme.colorScheme.secondary,
            "onSecondary",
            MaterialTheme.colorScheme.onSecondary
        ),
        MaterialColor(
            "secondaryContainer",
            MaterialTheme.colorScheme.secondaryContainer,
            "onSecondaryContainer",
            MaterialTheme.colorScheme.onSecondaryContainer
        ),
        MaterialColor(
            "secondaryFixed",
            MaterialTheme.colorScheme.secondaryFixed,
            "onSecondaryFixed",
            MaterialTheme.colorScheme.onSecondaryFixed
        ),
        MaterialColor(
            "secondaryFixedDim",
            MaterialTheme.colorScheme.secondaryFixedDim,
            "onSecondaryFixed",
            MaterialTheme.colorScheme.onSecondaryFixed
        ),
        MaterialColor(
            "secondaryFixed",
            MaterialTheme.colorScheme.secondaryFixed,
            "onSecondaryFixedVariant",
            MaterialTheme.colorScheme.onSecondaryFixedVariant
        ),
        MaterialColor(
            "tertiary",
            MaterialTheme.colorScheme.tertiary,
            "onTertiary",
            MaterialTheme.colorScheme.onTertiary
        ),
        MaterialColor(
            "tertiaryContainer",
            MaterialTheme.colorScheme.tertiaryContainer,
            "onTertiaryContainer",
            MaterialTheme.colorScheme.onTertiaryContainer
        ),
        MaterialColor(
            "tertiaryFixed",
            MaterialTheme.colorScheme.tertiaryFixed,
            "onTertiaryFixed",
            MaterialTheme.colorScheme.onTertiaryFixed
        ),
        MaterialColor(
            "tertiaryFixedDim",
            MaterialTheme.colorScheme.tertiaryFixedDim,
            "onTertiaryFixed",
            MaterialTheme.colorScheme.onTertiaryFixed
        ),
        MaterialColor(
            "tertiaryFixed",
            MaterialTheme.colorScheme.tertiaryFixed,
            "onTertiaryFixedVariant",
            MaterialTheme.colorScheme.onTertiaryFixedVariant
        ),
        MaterialColor(
            "error",
            MaterialTheme.colorScheme.error,
            "onError",
            MaterialTheme.colorScheme.onError
        ),
        MaterialColor(
            "errorContainer",
            MaterialTheme.colorScheme.errorContainer,
            "onErrorContainer",
            MaterialTheme.colorScheme.onErrorContainer
        ),
        MaterialColor(
            "background",
            MaterialTheme.colorScheme.background,
            "onBackground",
            MaterialTheme.colorScheme.onBackground
        ),
        MaterialColor(
            "surface",
            MaterialTheme.colorScheme.surface,
            "onSurface",
            MaterialTheme.colorScheme.onSurface
        ),
        MaterialColor(
            "surface",
            MaterialTheme.colorScheme.surface,
            "onSurfaceVariant",
            MaterialTheme.colorScheme.onSurfaceVariant
        ),
        MaterialColor(
            "inverseSurface",
            MaterialTheme.colorScheme.inverseSurface,
            "inverseOnSurface",
            MaterialTheme.colorScheme.inverseOnSurface
        ),
        MaterialColor(
            "surfaceBright",
            MaterialTheme.colorScheme.surfaceBright,
            "onSurface",
            MaterialTheme.colorScheme.onSurface
        ),
        MaterialColor(
            "surfaceDim",
            MaterialTheme.colorScheme.surfaceDim,
            "onSurface",
            MaterialTheme.colorScheme.onSurface
        ),
        MaterialColor(
            "surfaceContainerHigh",
            MaterialTheme.colorScheme.surfaceContainerHigh,
            "onSurface",
            MaterialTheme.colorScheme.onSurface
        ),
        MaterialColor(
            "surfaceContainerHighest",
            MaterialTheme.colorScheme.surfaceContainerHighest,
            "onSurface",
            MaterialTheme.colorScheme.onSurface
        ),
        MaterialColor(
            "surfaceContainer",
            MaterialTheme.colorScheme.surfaceContainer,
            "onSurface",
            MaterialTheme.colorScheme.onSurface
        ),
        MaterialColor(
            "surfaceContainerLow",
            MaterialTheme.colorScheme.surfaceContainerLow,
            "onSurface",
            MaterialTheme.colorScheme.onSurface
        ),
        MaterialColor(
            "surfaceContainerLowest",
            MaterialTheme.colorScheme.surfaceContainerLowest,
            "onSurface",
            MaterialTheme.colorScheme.onSurface
        ),
        MaterialColor(
            "surfaceVariant",
            MaterialTheme.colorScheme.surfaceVariant,
            "onSurfaceVariant",
            MaterialTheme.colorScheme.onSurfaceVariant
        ),
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
                MaterialColorButton(materialColor)
            }
        }
    }
}
