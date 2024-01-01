package com.example.e_commerce_figma_desgin.screen
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ClearAll
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.e_commerce_figma_desgin.Compount.MyReusableTextHeading
import com.example.e_commerce_figma_desgin.Compount.MyReusableTextSubHeading
import com.example.e_commerce_figma_desgin.Navigation.Screens




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(navController: NavController){

  var name by remember{ mutableStateOf("") }

  var email by remember{ mutableStateOf("") }

  var password by remember{ mutableStateOf("") }

  var forpassword by remember{ mutableStateOf("") }

  Column(modifier = Modifier
    .fillMaxSize()
    .padding(top = 100.dp, end = 20.dp, start = 20.dp, bottom = 20.dp),
    verticalArrangement = Arrangement.Top,
    horizontalAlignment = Alignment.CenterHorizontally)
    {

      MyReusableTextHeading(value = "SignUp")
    Spacer(modifier = Modifier.heightIn(20.dp))

    OutlinedTextField(modifier = Modifier.fillMaxWidth()
      .padding(start = 20.dp, end = 20.dp),
      value = name,
      onValueChange ={name=it} ,
      label = { MyReusableTextSubHeading(value = "Firstname")},
      trailingIcon = { Icon(Icons.Default.ClearAll,
        contentDescription = null) })

    Spacer(modifier = Modifier.heightIn(20.dp))

    OutlinedTextField(modifier = Modifier.fillMaxWidth()
      .padding(start = 20.dp, end = 20.dp),value = name,
      onValueChange ={name=it} ,
      label = { MyReusableTextSubHeading(value = "Lastname")},
      trailingIcon = { Icon(Icons.Default.ClearAll,
        contentDescription = null) })

    Spacer(modifier = Modifier.heightIn(20.dp))

    OutlinedTextField(modifier = Modifier
      .fillMaxWidth().padding(start = 20.dp, end = 20.dp),value = email,
      onValueChange ={email=it},
      label = { MyReusableTextSubHeading(value = "email")})

    Spacer(modifier = Modifier.heightIn(20.dp))

    OutlinedTextField(modifier = Modifier
      .fillMaxWidth().padding(start = 20.dp, end = 20.dp),value = password,
      onValueChange ={password=it} ,
      label = { MyReusableTextSubHeading(value = "password")},
      leadingIcon = { Icon(Icons.Outlined.Lock,
        contentDescription = null) },
      trailingIcon = { Icon(Icons.Outlined.VisibilityOff,
        contentDescription = null) }
    )

    Spacer(modifier = Modifier.heightIn(20.dp))


    TextButton(onClick = { navController.navigate(Screens.LoginScreen.route)}) {
      MyReusableTextSubHeading(value = "Already have an account?")
    }



    Spacer(modifier = Modifier.heightIn(20.dp))

    OutlinedButton(onClick =
    { navController.navigate(Screens.LoginScreen.route)},
      modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
      shape = RoundedCornerShape(10.dp),
      colors = ButtonDefaults.buttonColors()
    ) { MyReusableTextSubHeading(value = "SignUp") }

  }

    








}






@Preview(showBackground = true)
@Composable
fun SignUpPreview() {

  val navController = rememberNavController()
   SignUpScreen(navController = navController)
}