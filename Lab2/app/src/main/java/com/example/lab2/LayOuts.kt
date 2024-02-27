package com.example.lab2

import android.graphics.drawable.ColorDrawable
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.lab2.ui.theme.Black1D1D32
import com.example.lab2.ui.theme.Black202A40
import com.example.lab2.ui.theme.Blue7EA1C4
import com.example.lab2.ui.theme.Blue87ACC9
import com.example.lab2.ui.theme.Blue90AFCB
import com.example.lab2.ui.theme.Blue9EB6C2
import com.example.lab2.ui.theme.Orange805350
import com.example.lab2.ui.theme.PinkCEAEB1
import com.example.lab2.ui.theme.YellowB9B4B0
import com.example.lab2.ui.theme.YellowBAC3C3

@Composable
fun Layouts() {
    val Blue1 = Blue7EA1C4
    val Blue2 = Blue9EB6C2
    val Blue3 = Blue87ACC9
    val Yellow1 = YellowB9B4B0
    val Yellow2 = YellowBAC3C3
    val Black1 = Black1D1D32
    val Black2 = Black202A40
    val Blue4 = Blue90AFCB
    val Orange1 = Orange805350
    val Pink = PinkCEAEB1

    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Box {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(110.dp)
                    .background(color = Blue1),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Wed 30 Sep | 09:30")
                Text(text = "30 `C Cloudy")
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(130.dp)
                .background(color = Blue4),
        ) {

        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(110.dp)
                .background(color = Blue3),
        ) {

        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .background(color =Orange1)
        ) {

        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .background(color = Black1)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.Bottom
            ) {
                Image(
                    painter = painterResource(id = R.drawable.house),
                    modifier = Modifier.size(width = 230.dp, height = 100.dp).padding(end=30.dp),
                    contentScale = ContentScale.FillBounds,
                    contentDescription = ""
                )
            }
        }
        Row(
            modifier = Modifier
                .background(color = Pink)
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {


            Canvas(
                modifier = Modifier,
                onDraw = {
                    drawCircle(
                        color = Black1,
                        center = Offset(100.dp.toPx(), 100.dp.toPx()),
                        radius = 10.dp.toPx()
                    )
                })

            Canvas(
                modifier = Modifier,
                onDraw = {
                    drawCircle(
                        color = Blue1,
                        center = Offset(100.dp.toPx(), 100.dp.toPx()),
                        radius = 10.dp.toPx()
                    )
                })
            Canvas(
                modifier = Modifier,
                onDraw = {
                    drawCircle(
                        color = Orange1,
                        center = Offset(-90.dp.toPx(), 100.dp.toPx()),
                        radius = 10.dp.toPx()
                    )
                })
            Canvas(
                modifier = Modifier,
                onDraw = {
                    drawCircle(
                        color = Blue3,
                        center = Offset(-90.dp.toPx(), 100.dp.toPx()),
                        radius = 10.dp.toPx()
                    )
                })


        }

    }
}