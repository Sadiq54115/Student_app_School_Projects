package com.example.e_commerce_figma_desgin.screen

import android.app.DatePickerDialog
import android.content.Context
import android.graphics.Paint.Align
import android.os.Build
import android.widget.CalendarView
import android.widget.DatePicker
import androidx.annotation.RequiresApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.e_commerce_figma_desgin.Compount.MyReusableTextHeading
import com.example.e_commerce_figma_desgin.Compount.MyReusableTextSubHeading
import java.util.Calendar



@Composable
fun MydatePicker(context: Context,){

    // get context for this line code
    val context = context.applicationContext
    // get calender intance this line code
    val calendar = Calendar.getInstance()

    var selectedDateText by remember { mutableStateOf("") }
    // Fetching current year, month and day
    val year = calendar[Calendar.YEAR]
    val month = calendar[Calendar.MONTH]
    val dayOfMonth = calendar[Calendar.DAY_OF_MONTH]


    val datePicker = DatePickerDialog(
        context,
        { _: DatePicker, selectedYear: Int, selectedMonth: Int, selectedDayOfMonth: Int ->
            selectedDateText = "$selectedDayOfMonth/${selectedMonth + 1}/$selectedYear"
        }, year, month, dayOfMonth
    )
    datePicker.show()
}


@RequiresApi(Build.VERSION_CODES.N)
@Composable
fun AttendanceScreen () {



    // get context for this line code
    val context = LocalContext.current
    // get calender intance this line code
    val calendar = Calendar.getInstance()

    var selectedDateText by remember { mutableStateOf("") }
    // Fetching current year, month and day
    val year = calendar[Calendar.YEAR]
    val month = calendar[Calendar.MONTH]
    val dayOfMonth = calendar[Calendar.DAY_OF_MONTH]


    val datePicker = DatePickerDialog(
        context,
        { _: DatePicker, selectedYear: Int, selectedMonth: Int, selectedDayOfMonth: Int ->
            selectedDateText = "$selectedDayOfMonth/${selectedMonth + 1}/$selectedYear"
        }, year, month, dayOfMonth
    )


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
            Column (modifier = Modifier
                .padding(top = 2.dp, end = 2.dp)
                .clickable {
                           datePicker.show()

                },
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Icon(imageVector = Icons.Default.CalendarMonth,
                    tint = Color(59, 136, 224, 255),
                    contentDescription = "")

                Text(text = "Attendence ",
                    fontWeight = FontWeight.Normal)
            }

            Column (modifier = Modifier
                .padding(top = 2.dp, end = 2.dp)
                .clickable { },
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Icon(imageVector = Icons.Default.CalendarMonth,
                    tint = Color(59, 136, 224, 255),
                    contentDescription = "")

                Text(text = "Time Table",
                    fontWeight = FontWeight.Normal)
            }


            //





        }

        Column(modifier = Modifier
            .fillMaxWidth()
            .heightIn(200.dp))
        {


            MyReusableTextHeading(value = "AttendenceScren")
        }




    }



}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun   MyReusableAssistChipExample(
    onChipClicked: () -> Unit,
    ChipName: String,
){
        AssistChip(
          ///  onClick = { Log.d("Assist chip", "hello world") },
            onClick = { onChipClicked},

            label = { Text(ChipName) },
            leadingIcon = {
                Icon(
                    Icons.Filled.CalendarMonth,
                    contentDescription = "Localized description",
                    Modifier.size(AssistChipDefaults.IconSize)
                )
            }
        )
    }






@RequiresApi(Build.VERSION_CODES.N)
@Composable
@Preview(showBackground = true)
fun AttendanceScreenScreenPreview() {

    AttendanceScreen ()



}