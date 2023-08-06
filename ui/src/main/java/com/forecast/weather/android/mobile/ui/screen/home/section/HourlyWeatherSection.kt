package com.forecast.weather.android.mobile.ui.screen.home.section

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.forecast.weather.android.mobile.ui.common.SimpleSpacer
import com.forecast.weather.android.mobile.ui.screen.home.component.HourlyWeatherCard
import com.forecast.weather.android.mobile.ui.theme.Spacing

@Composable
internal fun HourlyWeatherSection(
    modifier: Modifier = Modifier,
) {
    Row(modifier = modifier.horizontalScroll(rememberScrollState())) {
        repeat(times = 15) {
            HourlyWeatherCard()
            SimpleSpacer(width = Spacing.S)
        }
    }
}

@Preview
@Composable
private fun HourlyWeatherSectionPreview() {
    HourlyWeatherSection()
}