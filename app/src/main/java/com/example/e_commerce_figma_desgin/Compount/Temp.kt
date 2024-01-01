package com.example.e_commerce_figma_desgin.Compount

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.e_commerce_figma_desgin.R

@Composable
fun TempSportView(
 //   backgroudColor:Color,
   // imageVector: ImageVector,
    value:String,
    date: String
) {


        Column(
            modifier = Modifier
                .heightIn(160.dp)
                .padding(10.dp),
        )
        {
            Image(
                painter = painterResource(id = R.drawable.download),
                contentDescription = "",
                modifier = Modifier.widthIn(150.dp).heightIn(80.dp)
                    .size(12.dp).clip(RoundedCornerShape(10.dp))
                    .border(2.dp, Color.Gray, RoundedCornerShape(10.dp)),
                contentScale = ContentScale.FillBounds,
            )
            Spacer(modifier = Modifier.height(10.dp))
            MyReusableTextSubHeading(value = value)
            Spacer(modifier = Modifier.height(5.dp))
            Row (modifier = Modifier.padding(start = 5.dp, end = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Image(imageVector = Icons.Default.DateRange, contentDescription ="" )
                Spacer(modifier = Modifier.widthIn(10.dp))
                MyReusableTextSubHeading(value = date)
            }
            Spacer(modifier = Modifier.height(5.dp))

        }





    }




@Composable
@Preview(showBackground = true)
fun TempP() {
    Column {
        Row {


          //  TempSportView()
            //TempSportView()
        }

    }

}