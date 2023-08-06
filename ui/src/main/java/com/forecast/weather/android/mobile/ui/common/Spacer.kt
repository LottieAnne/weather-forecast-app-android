package com.forecast.weather.android.mobile.ui.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp

fun LazyListScope.simpleVerticalSpacer(
    height: Dp,
) {
    item {
        Spacer(
            modifier = Modifier.height(height),
        )
    }
}

@Composable
fun RowScope.SimpleSpacer(
    width: Dp,
) {
    Spacer(
        modifier = Modifier.width(width),
    )
}

@Composable
fun ColumnScope.SimpleSpacer(
    height: Dp,
) {
    Spacer(
        modifier = Modifier.height(height),
    )
}

@Composable
fun RowScope.FillSpacer(
    modifier: Modifier = Modifier,
    weight: Float = 1f,
) {
    Spacer(
        modifier = modifier.weight(weight),
    )
}

@Composable
fun ColumnScope.FillSpacer(
    modifier: Modifier = Modifier,
    weight: Float = 1f,
) {
    Spacer(
        modifier = modifier.weight(weight),
    )
}

@Preview(showBackground = true)
@Composable
private fun FillSpacerPreview() {
    Row {
        FillSpacer()
    }

    Column {
        FillSpacer()
    }
}