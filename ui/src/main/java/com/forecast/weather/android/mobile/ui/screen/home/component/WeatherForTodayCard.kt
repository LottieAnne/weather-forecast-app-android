package com.forecast.weather.android.mobile.ui.screen.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
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
            Text(text = "天気内容", color = Color.White, fontSize = 12.sp)
            SimpleSpacer(height = Spacing.XXS)

            Text(text = "画像", color = Color.White, fontSize = 8.sp)
            SimpleSpacer(height = Spacing.XXS)

            Text(text = "日付と時間", color = Color.White, fontSize = 12.sp)
            SimpleSpacer(height = Spacing.XXS)

            Text(
                text = "今日の気温",
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            SimpleSpacer(height = Spacing.XXS)

            Text(text = "最高気温と最低気温", color = Color.White, fontSize = 8.sp)
            SimpleSpacer(height = Spacing.XXS)
        }
    }
}

@Preview
@Composable
private fun WeatherForTodayCardPreview() {
    WeatherForTodayCard()
}