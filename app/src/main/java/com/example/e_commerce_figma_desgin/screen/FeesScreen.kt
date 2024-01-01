package com.example.e_commerce_figma_desgin.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CalendarToday
import androidx.compose.material.icons.outlined.CalendarViewMonth
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.e_commerce_figma_desgin.Compount.MyReusableTextSubHeading


@Composable
fun FeesScreen(){

    Column (modifier = Modifier.fillMaxSize()){
        SingleFessScreen()
        SingleFessScreen()
        SingleFessScreen()
        SingleFessScreen()
        SingleFessScreen()
        SingleFessScreen()
    }
    


}



@Composable
fun SingleFessScreen(){

        Card(modifier = Modifier
            .padding(10.dp)
            .clickable {
            },
            elevation = CardDefaults.elevatedCardElevation(),
            colors = CardDefaults.cardColors(Color(200, 186, 243, 86))
        ) {

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly)

            {

                Column() {
                    Row {
                        Icon(Icons.Outlined.CalendarToday,"")
                        MyReusableTextSubHeading(value = "07.11.2023")
                    }

                    // MyTextViewSubHeading(value = Cal"$")
                    MyReusableTextSubHeading(value = "School fees For September")
                    MyReusableTextSubHeading(value = "1000")
                }

                OutlinedButton(onClick = { /*TODO*/ }) {
                    MyReusableTextSubHeading(value = "Unpaid")

                }
            }

        }
    }




@Composable
@Preview(showBackground = true)
fun FessPreview(){

    FeesScreen()
}