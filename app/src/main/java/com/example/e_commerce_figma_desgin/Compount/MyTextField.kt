

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReusableOutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    onlabel: String
  //  placeholder: (String)->Unit
   // isPassword: Boolean = false
) {
   Column(modifier = Modifier.fillMaxWidth(),
       verticalArrangement = Arrangement.Center,
       horizontalAlignment = Alignment.CenterHorizontally)
   {
       OutlinedTextField(value =value ,
           onValueChange ={onValueChange(it) }
           , label = {onlabel}

           )

   }
}







@Composable
@Preview(showBackground = true)
fun compundPre(){


}