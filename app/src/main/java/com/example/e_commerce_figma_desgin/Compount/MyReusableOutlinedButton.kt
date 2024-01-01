package com.example.e_commerce_figma_desgin.Compount

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun MyReusableOutlinedButton(
    buttonName:String,
    onClickButton: () -> Unit,
    )
{
    OutlinedButton(
        onClick = onClickButton,
        modifier = Modifier.fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp),
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors()
        )
    {
     MyReusableTextSubHeading(value = buttonName)
    }

    }