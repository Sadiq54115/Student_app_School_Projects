package com.example.e_commerce_figma_desgin.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.e_commerce_figma_desgin.Compount.MyReusableOutlinedButton
import com.example.e_commerce_figma_desgin.Compount.MyReusableTextHeading
import com.example.e_commerce_figma_desgin.Compount.MyReusableTextSubHeading
import com.example.e_commerce_figma_desgin.R

@Composable
fun ProfileScreen(){
    
    
    Column(modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center
    , horizontalAlignment = Alignment.CenterHorizontally)
    {
        MyReusableTextHeading(value = "ProfileScreen")
        Image(painter = painterResource(id = R.drawable.download),
            contentDescription = "",
            modifier = Modifier.size(64.dp).clip(CircleShape)                       // clip to the circle shape
                .border(2.dp, Color.Gray, CircleShape),
            contentScale = ContentScale.FillBounds,
        )
        MyReusableTextHeading(value = "sadiq hudli")
        MyReusableTextSubHeading(value = "10TH grade A(sid:878777")
        Spacer(modifier = Modifier.heightIn(20.dp))
        ProfileDetailsScreen()
        Spacer(modifier = Modifier.heightIn(20.dp))
        MyReusableOutlinedButton(buttonName = "LogOut") {
            
        }
        Spacer(modifier = Modifier.heightIn(20.dp))




    }
}



@Composable
fun ProfileDetailsScreen(){
    Card(
        modifier = Modifier.fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp)
            .background(Color.White),
        elevation = CardDefaults.cardElevation(10.dp)

    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
                .padding(0.dp)
                .widthIn(220.dp)
                .heightIn(100.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        )

        {
            Row (modifier = Modifier
                .fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                 verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween){
                MyReusableTextHeading(value = "Date Of Birth")
                Spacer(modifier = Modifier.width(40.dp))
                MyReusableTextHeading(value = "12/01/2002")


            }

            Row (modifier = Modifier.fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceBetween){
                MyReusableTextHeading(value = "FatherName")
                Spacer(modifier = Modifier.width(40.dp))
                MyReusableTextHeading(value = "sadiq ")


            }
            Row (modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween)
            {
              //  Spacer(modifier = Modifier.width(20.dp))
                MyReusableTextHeading(value = "Gender")
                Spacer(modifier = Modifier.width(40.dp))
                MyReusableTextHeading(value = "Male")
               // Spacer(modifier = Modifier.width(20.dp))

            }

            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween){
                MyReusableTextHeading(value = "Roll Number")
                Spacer(modifier = Modifier.width(40.dp))
                MyReusableTextHeading(value = "sadiq hudli")

            }
            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween){
                MyReusableTextHeading(value = "Phone Number")
                Spacer(modifier = Modifier.width(40.dp))
                MyReusableTextHeading(value = "sadiq hudli")

            }



        }
    }

}



@Composable
@Preview(showBackground = true)
fun ProfilePreview(){

    ProfileScreen()
}