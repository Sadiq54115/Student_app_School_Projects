package com.example.e_commerce_figma_desgin.Navigation


import HomeScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.e_commerce_figma_desgin.screen.AttendanceScreen
import com.example.e_commerce_figma_desgin.screen.ForgetPasswordScreen
import com.example.e_commerce_figma_desgin.screen.LoginScreen
import com.example.e_commerce_figma_desgin.screen.ProfileScreen
import com.example.e_commerce_figma_desgin.screen.SignUpScreen



@Composable
fun appNav(){
    val navController = rememberNavController()
    
    NavHost(navController =navController ,
        startDestination = Screens.SignUpScreen.route)
    {
        composable(Screens.SignUpScreen.route){
            SignUpScreen(navController = navController)
        }
        composable(Screens.LoginScreen.route){
            LoginScreen(navController = navController)
        }
        composable(Screens.ForgetPasswordScreens.route){
            ForgetPasswordScreen(navController = navController)
        }
        composable(Screens.HomeScreen.route){
            HomeScreen(navController = navController)
        }
        composable(Screens.AttendanceScreen.route){
            AttendanceScreen()
        }
        composable(Screens.ProfileScreen.route){
            ProfileScreen()
        }
    }
}