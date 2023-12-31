package com.forecast.weather.android.mobile.ui.component.card

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.forecast.weather.android.mobile.ui.component.SimpleSpacer
import com.forecast.weather.android.mobile.ui.theme.Purple40
import com.forecast.weather.android.mobile.ui.theme.PurpleBlue
import com.forecast.weather.android.mobile.ui.theme.Spacing

@Composable
internal fun SupplementaryInformationCard(
    modifier: Modifier = Modifier,
) {
    // TODO: APIつなぎこみ
    Card(
        modifier = modifier.border(
            border = BorderStroke(width = 1.dp, color = Purple40),
            shape = RoundedCornerShape(Spacing.S)
        )
    ) {
        Row(
            modifier = modifier
                .background(color = PurpleBlue)
                .fillMaxWidth()
                .padding(vertical = Spacing.S),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "画像", color = Color.White, fontSize = 12.sp)
                SimpleSpacer(height = Spacing.XXS)

                Text(
                    text = "数値",
                    color = Color.White,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )
                SimpleSpacer(height = Spacing.XXS)

                Text(text = "内容", color = Color.White, fontSize = 12.sp)
                SimpleSpacer(height = Spacing.XXS)
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "画像", color = Color.White, fontSize = 12.sp)
                SimpleSpacer(height = Spacing.XXS)

                Text(
                    text = "数値",
                    color = Color.White,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )
                SimpleSpacer(height = Spacing.XXS)

                Text(text = "内容", color = Color.White, fontSize = 12.sp)
                SimpleSpacer(height = Spacing.XXS)
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "画像", color = Color.White, fontSize = 12.sp)
                SimpleSpacer(height = Spacing.XXS)

                Text(
                    text = "数値",
                    color = Color.White,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )
                SimpleSpacer(height = Spacing.XXS)

                Text(text = "内容", color = Color.White, fontSize = 12.sp)
                SimpleSpacer(height = Spacing.XXS)
            }
        }
    }
}

@Preview
@Composable
private fun SupplementaryInformationCardPreview() {
    SupplementaryInformationCard()
}