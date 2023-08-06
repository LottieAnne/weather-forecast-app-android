package com.forecast.weather.android.mobile.ui.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.forecast.weather.android.mobile.ui.common.SimpleSpacer
import com.forecast.weather.android.mobile.ui.screen.home.component.SupplementaryInformationCard
import com.forecast.weather.android.mobile.ui.screen.home.component.WeatherForTodayCard
import com.forecast.weather.android.mobile.ui.screen.home.section.HourlyWeatherSection
import com.forecast.weather.android.mobile.ui.theme.OrangeYellow
import com.forecast.weather.android.mobile.ui.theme.PurpleEndBackground
import com.forecast.weather.android.mobile.ui.theme.PurpleStartBackground
import com.forecast.weather.android.mobile.ui.theme.Spacing

@Composable
private fun HomeScreen(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        PurpleStartBackground,
                        PurpleEndBackground
                    )
                )
            )
            .padding(start = Spacing.M, top = Spacing.XL, bottom = Spacing.XL)
    ) {
        Column {
            Column(modifier = Modifier.padding(end = Spacing.M)) {
                WeatherForTodayCard(
                    weather = "Mostly Cloudy",
                    date = "",
                    time = "10:00 AM",
                    temperature = 25,
                    highestTemperature = 27,
                    lowestTemperature = 18,
                )

                SimpleSpacer(height = Spacing.M)

                SupplementaryInformationCard()

                SimpleSpacer(height = Spacing.M)

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Today",
                        color = OrangeYellow,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )

                    Text(text = "Next 7 Days  >",
                         color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        modifier = Modifier.clickable {  }
                    )
                }
            }
            SimpleSpacer(height = Spacing.M)
            HourlyWeatherSection()
        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}