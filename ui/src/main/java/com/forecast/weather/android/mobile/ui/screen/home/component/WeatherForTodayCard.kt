package com.forecast.weather.android.mobile.ui.screen.home.component

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.forecast.weather.android.mobile.ui.common.SimpleSpacer
import com.forecast.weather.android.mobile.ui.theme.PurpleEndBackground
import com.forecast.weather.android.mobile.ui.theme.PurpleStartBackground
import com.forecast.weather.android.mobile.ui.theme.Spacing

// TODO: あとからAPIつなぎこむ
@Composable
internal fun WeatherForTodayCard(
    weather: String,
    date: String,
    time: String,
    temperature: Int,
    highestTemperature: Int,
    lowestTemperature: Int,
    modifier: Modifier = Modifier,
) {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color.Transparent)
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(text = weather, color = Color.White, fontSize = 20.sp)
            SimpleSpacer(height = Spacing.M)

            Text(text = "天気画像", color = Color.White, fontSize = 12.sp)
            SimpleSpacer(height = Spacing.XS)

            Text(text = "$date | $time", color = Color.White, fontSize = 20.sp)

            Text(
                text = "${temperature}°",
                color = Color.White,
                fontSize = 64.sp,
                fontWeight = FontWeight.Bold
            )

            Row {
                Text(text = "H:${highestTemperature}", color = Color.White, fontSize = 16.sp)
                SimpleSpacer(width = Spacing.XS)
                Text(text = "L:${lowestTemperature}", color = Color.White, fontSize = 16.sp)
            }
        }
    }
}

@Preview
@Composable
private fun WeatherForTodayCardPreview() {
    WeatherForTodayCard(
        weather = "Mostly Cloudy",
        date = "Mon June 17",
        time = "10:00 AM",
        temperature = 25,
        highestTemperature = 27,
        lowestTemperature = 18
    )
}