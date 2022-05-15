package com.example.navdemopic_1

sealed class NavRoutes(val route: String) {
    object Home : NavRoutes("home")
    object UpperBody : NavRoutes("upperbody")
    object LowerBody : NavRoutes("lowerbody")
    object Cardio : NavRoutes("cardio")
    object Balance : NavRoutes("balance")
    object Abs : NavRoutes("abs")
    object Other : NavRoutes("other")
}
