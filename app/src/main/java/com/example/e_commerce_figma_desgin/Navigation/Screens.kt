package com.example.e_commerce_figma_desgin.Navigation

sealed class Screens(val title:String,val route:String,){

    object SignUpScreen: Screens("SignUpScreen","signUp_route")
    object LoginScreen: Screens("LoginScreen","login_route")
    object ForgetPasswordScreens: Screens("ForgetPasswordScreen","forgetPassword_route")
    object HomeScreen: Screens("home","home_route")
    object AttendanceScreen: Screens("AttendanceScreen","Attendance_route")
    object ExamScreens: Screens("ExamScreen","exam_route")
    object LeaveScreens: Screens("leaveScreen","leave_route")
    object FessScreens: Screens("FessScreen","fess_route")
    object HomeWorkScreens: Screens("HomeWorkScreen","HomeWork_route")
    object CommninityScreens: Screens("commninityScreen","commninity_route")
    object MessageScreens: Screens("MessageScreen","message_route")
    object ProfileScreen: Screens("profileScreen","profile_route")

}
