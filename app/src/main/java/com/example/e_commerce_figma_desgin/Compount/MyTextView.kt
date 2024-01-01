package com.example.e_commerce_figma_desgin.Compount

import androidx.compose.foundation.Image
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e_commerce_figma_desgin.R
import com.example.e_commerce_figma_desgin.screen.LoginScreen





@Composable
fun MyCartView(){

    Card(modifier = Modifier
        .fillMaxWidth()
        .heightIn(200.dp)) {
        Column {
            Row (modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
                horizontalArrangement =Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            )
            {

                Image(painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription ="", modifier = Modifier
                        .heightIn(150.dp)
                        .fillMaxWidth(0.5f),
                    Alignment.TopCenter, contentScale = ContentScale.FillBounds)
                Spacer(modifier = Modifier.widthIn(10.dp))
             //   MyTextViewSubHeading(value = "CategoryName")
                Spacer(modifier = Modifier.widthIn(10.dp))
            }

        }



    }
}




@Composable
@Preview(showBackground = true)
fun LoginPreview(){

   MyCartView()

}


