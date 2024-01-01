package com.example.e_commerce_figma_desgin.Compount

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp



@Composable
fun MyReusableCardWithIcon(
    backgroudColor:Color,
    imageVector: ImageVector,
    IconName:String
){
    Card(modifier = Modifier
        .width(50.dp)
        .height(70.dp)
        .background(Color(243, 239, 239, 255))
        .padding(0.dp)
    )
    {
        Column(modifier =
        Modifier
            .width(50.dp)
            .height(70.dp)
            .padding( bottom = 2.dp, start = 2.dp, end = 2.dp)
            .background(color = backgroudColor),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(imageVector = imageVector,
                modifier = Modifier
                    .width(50.dp)
                    .height(40.dp)
                    .padding(top = 0.dp),
                contentDescription = "",
                contentScale = ContentScale.Inside)
            MyReusableTextSubHeading(value = IconName)
        }
    }
}
