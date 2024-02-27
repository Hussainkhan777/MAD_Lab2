package com.example.lab2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Composable
fun Task2_3()
    {
        Column {
            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 6.dp), modifier = Modifier
//            .size(300.dp)
                    .fillMaxWidth()
                    .padding(10.dp),
                colors = CardDefaults.cardColors(Color.White)


            ) {

                Row(
                    modifier = Modifier

                        //.background(color = Color.Red)
                        .fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Image(
                            painter = painterResource(id = R.drawable.ironman),
                            contentScale = ContentScale.FillBounds,
                            contentDescription = "",
                            modifier = Modifier
                                .size(100.dp, 100.dp)
                                .padding(10.dp, 10.dp, 0.dp, 10.dp)
                                .clip(
                                    RoundedCornerShape(12.dp)
                                )
                        )
                    }
                    Column(modifier = Modifier.weight(2f)) {
                        Row {
                            Text(
                                text = "Iron Man",
                                modifier = Modifier,
                                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 32.sp)
                            )
                        }
                        Row {
                            Text(text = "Age: 43", color = Color.Gray, fontSize = 18.sp)
                        }
                    }
                }
            }

            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 6.dp), modifier = Modifier
//            .size(300.dp)
                    .fillMaxWidth()
                    .padding(10.dp),
                colors = CardDefaults.cardColors(Color.White)


            ) {

                Row(
                    modifier = Modifier

                        //.background(color = Color.Red)
                        .fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Image(
                            painter = painterResource(id = R.drawable.hulk),
                            contentScale = ContentScale.FillBounds,
                            contentDescription = "",
                            modifier = Modifier
                                .size(100.dp, 100.dp)
                                .padding(10.dp, 10.dp, 0.dp, 10.dp)
                                .clip(
                                    RoundedCornerShape(12.dp)
                                )
                        )
                    }
                    Column(modifier = Modifier.weight(2f)) {
                        Row {
                            Text(
                                text = "Hulk",
                                modifier = Modifier,
                                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 32.sp)
                            )
                        }
                        Row {
                            Text(text = "Age: 38", color = Color.Gray, fontSize = 18.sp)
                        }
                    }
                }
            }

            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 6.dp), modifier = Modifier
//            .size(300.dp)
                    .fillMaxWidth()
                    .padding(10.dp),
                colors = CardDefaults.cardColors(Color.White)


            ) {

                Row(
                    modifier = Modifier

                        //.background(color = Color.Red)
                        .fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Image(
                            painter = painterResource(id = R.drawable.deadpool),
                            contentScale = ContentScale.FillBounds,
                            contentDescription = "",
                            modifier = Modifier
                                .size(100.dp, 100.dp)
                                .padding(10.dp, 10.dp, 0.dp, 10.dp)
                                .clip(
                                    RoundedCornerShape(12.dp)
                                )
                        )
                    }
                    Column(modifier = Modifier.weight(2f)) {
                        Row {
                            Text(
                                text = "Dead Pool",
                                modifier = Modifier,
                                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 32.sp)
                            )
                        }
                        Row {
                            Text(text = "Age: 25", color = Color.Gray, fontSize = 18.sp)
                        }
                    }
                }
            }
            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 6.dp), modifier = Modifier
//            .size(300.dp)
                    .fillMaxWidth()
                    .padding(10.dp),
                colors = CardDefaults.cardColors(Color.White)


            ) {

                Row(
                    modifier = Modifier

                        //.background(color = Color.Red)
                        .fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Image(
                            painter = painterResource(id = R.drawable.wolveride),
                            contentScale = ContentScale.FillBounds,
                            contentDescription = "",
                            modifier = Modifier
                                .size(100.dp, 100.dp)
                                .padding(10.dp, 10.dp, 0.dp, 10.dp)
                                .clip(
                                    RoundedCornerShape(12.dp)
                                )
                        )
                    }
                    Column(modifier = Modifier.weight(2f)) {
                        Row {
                            Text(
                                text = "Wolverine",
                                modifier = Modifier,
                                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 32.sp)
                            )
                        }
                        Row {
                            Text(text = "Age: 48", color = Color.Gray, fontSize = 18.sp)
                        }
                    }
                }
            }
            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 6.dp), modifier = Modifier
//            .size(300.dp)
                    .fillMaxWidth()
                    .padding(10.dp),
                colors = CardDefaults.cardColors(Color.White)


            ) {

                Row(
                    modifier = Modifier

                        //.background(color = Color.Red)
                        .fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Image(
                            painter = painterResource(id = R.drawable.blackwidow),
                            contentScale = ContentScale.FillBounds,
                            contentDescription = "",
                            modifier = Modifier
                                .size(100.dp, 100.dp)
                                .padding(10.dp, 10.dp, 0.dp, 10.dp)
                                .clip(
                                    RoundedCornerShape(12.dp)
                                )
                        )
                    }
                    Column(modifier = Modifier.weight(2f)) {
                        Row {
                            Text(
                                text = "Black Widow",
                                modifier = Modifier,
                                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 32.sp)
                            )
                        }
                        Row {
                            Text(text = "Age: 30", color = Color.Gray, fontSize = 18.sp)
                        }
                    }
                }
            }
            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 6.dp), modifier = Modifier

                    .fillMaxWidth()
                    .padding(10.dp),
                colors = CardDefaults.cardColors(Color.White)


            ) {

                Row(
                    modifier = Modifier

                        //.background(color = Color.Red)
                        .fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.thor),
                        contentScale = ContentScale.FillBounds,
                        contentDescription = "",
                        modifier = Modifier
                            .size(100.dp, 100.dp)
                            .padding(10.dp, 10.dp, 0.dp, 10.dp)
                            .clip(
                                RoundedCornerShape(12.dp)
                            )
                    )
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Row {
                            Text(
                                text = "Thor",
                                modifier = Modifier,
                                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 32.sp)
                            )
                        }
                        Row {
                            Text(text = "Age: 35", color = Color.Gray, fontSize = 18.sp)
                        }
                    }
                }
            }
        }
    }
