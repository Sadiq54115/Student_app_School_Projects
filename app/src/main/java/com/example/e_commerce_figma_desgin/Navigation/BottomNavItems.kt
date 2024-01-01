package com.example.e_commerce_figma_desgin.Navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Message
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItems(
    val title:String,
    val icon:ImageVector,
    val route:String
)




val listofNavItems = listOf(

    BottomNavItems(
        title = Screens.HomeScreen.title,
        icon = Icons.Default.Home,
        route = Screens.HomeScreen.route

    ),

    BottomNavItems(
        title = Screens.AttendanceScreen.title,
        icon = Icons.Default.CalendarMonth,
        route = Screens.AttendanceScreen.route

    ),

    BottomNavItems(
        title = Screens.ProfileScreen.title,
        icon = Icons.Default.Message,
        route = Screens.ProfileScreen.route
    ),
    BottomNavItems(
        title = Screens.ProfileScreen.title,
        icon = Icons.Default.Person,
        route = Screens.ProfileScreen.route
    ),


)
