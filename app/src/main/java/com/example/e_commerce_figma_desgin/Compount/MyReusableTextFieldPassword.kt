package com.example.e_commerce_figma_desgin.Compount

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyReusableTextFieldPassword(
    value:String,
    onValueChange:(String)->Unit,
){

    var rename by remember{ mutableStateOf(value) }

    var iconVisible  by remember { mutableStateOf(false) }


    OutlinedTextField(modifier = Modifier
        .fillMaxWidth()
        .padding(
            start = 20.dp, end = 20.dp
        ),value = value,
        onValueChange ={onValueChange(it)} ,
        label = { MyReusableTextSubHeading(value = "password")},
        leadingIcon = { Icon(
            Icons.Outlined.Lock,
            contentDescription = null) },
        trailingIcon = { Icon(
            Icons.Outlined.VisibilityOff,
            contentDescription = null) },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),)
}
