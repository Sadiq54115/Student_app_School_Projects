package com.example.e_commerce_figma_desgin.Compount

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.e_commerce_figma_desgin.Navigation.Screens

@Composable
fun MyReusableCardButton(
    navController:NavController,
    labelname:String,
    imageVector: ImageVector,
    mycolor: Color) {
    Card(
        modifier = Modifier
            .heightIn(90.dp)
            .widthIn(50.dp)
            .padding(2.dp)
    )
    {
        Column(
            modifier = Modifier
                .size(100.dp)
                .background(mycolor)
                .clickable { navController.navigate(Screens.AttendanceScreen.route) },
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Spacer(
                modifier = Modifier.heightIn(10.dp)
            )
            Image(
                imageVector = imageVector,
                contentDescription = "", modifier = Modifier
                    .size(55.dp)
                    .clip(RoundedCornerShape(10.dp)),
                contentScale = ContentScale.FillBounds
            )

            Spacer(
                modifier = Modifier.heightIn(10.dp)
            )
            MyReusableTextSubHeading(value = labelname)
            Spacer(
                modifier = Modifier.heightIn(10.dp)
            )
        }
    }
}





@Composable
@Preview(showBackground = true)
fun MyCardPrev(){

    MyReusableCardWithIcon(
        backgroudColor = Color(142, 110, 236, 255),
        imageVector = Icons.Default.Notifications,
        IconName = "School"
    )


}


