package com.example.e_commerce_figma_desgin.Compount

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyReusableTextHeading(
    value:String
){
    Text(text = value,
        fontSize = 22.sp,
        fontWeight = FontWeight.ExtraBold,
        fontStyle = FontStyle.Normal,
        modifier = Modifier.padding(bottom = 10.dp)
    )
}