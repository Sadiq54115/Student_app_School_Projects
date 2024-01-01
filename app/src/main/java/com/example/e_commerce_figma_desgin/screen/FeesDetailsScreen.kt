package com.example.e_commerce_figma_desgin.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.e_commerce_figma_desgin.Compount.MyReusableTextSubHeading


@Composable
fun FessDetailsScreen(){

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 20.dp, bottom = 20.dp),
     verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
        SingleFessScreen()

        Card(modifier = Modifier.padding(10.dp)) {

            Column(modifier = Modifier.padding(10.dp)) {
                Row (modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly){

                    MyReusableTextSubHeading(value = "School fess")
                    Spacer(modifier = Modifier.widthIn(100.dp))
                    MyReusableTextSubHeading(value = "1000")
                }

                Row (modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly){

                    MyReusableTextSubHeading(value = "Tuition fess")
                    Spacer(modifier = Modifier.widthIn(100.dp))
                    MyReusableTextSubHeading(value = "1000")
                }

                Row (modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly){

                    MyReusableTextSubHeading(value = "Library fess")
                    Spacer(modifier = Modifier.widthIn(100.dp))
                    MyReusableTextSubHeading(value = "1000")


                }

                Row (modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly){

                    MyReusableTextSubHeading(value = "Activity fess")
                    Spacer(modifier = Modifier.widthIn(100.dp))
                    MyReusableTextSubHeading(value = "1000")


                }

                Row (modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly){

                    MyReusableTextSubHeading(value = "Extra fess")
                    Spacer(modifier = Modifier.widthIn(100.dp))
                    MyReusableTextSubHeading(value = "1000")

                }
                MyReusableTextSubHeading(value ="---------------------------------" +
                        "-----------------" )


                Row (modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly){

                 //   MyTextViewSubHeading(value = "Total  fess")
                    MyReusableTextSubHeading(value = "Total  fess")
                    Spacer(modifier = Modifier.widthIn(100.dp))
                //    MyTextViewSubHeading(value = "1000")
                    MyReusableTextSubHeading(value = "1000")

                }
            }


        }

        Spacer(modifier = Modifier.heightIn(50.dp))


        OutlinedButton(onClick = { /*TODO*/ },

            modifier = Modifier
                .fillMaxWidth(0.6f)
                .padding(10.dp))
        {

            MyReusableTextSubHeading(value = "pay Now")
            
        }


    }
}



@Composable
@Preview(showBackground = true)
fun FessDetailsPreview(){

    FessDetailsScreen()
}