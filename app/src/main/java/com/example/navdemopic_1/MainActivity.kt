package com.example.navdemopic_1

//import com.example.navdemopic_1.screens.Profile
//import com.example.navdemopic_1.screens.Welcome

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key.Companion.Home
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navdemopic_1.screens.Home
import com.example.navdemopic_1.screens.UpperBody
import com.example.navdemopic_1.screens.LowerBody
import com.example.navdemopic_1.screens.Cardio
import com.example.navdemopic_1.screens.Abs
import com.example.navdemopic_1.screens.Balance
import com.example.navdemopic_1.screens.Other

import com.example.navdemopic_1.ui.theme.NavDemoPic_1Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavDemoPic_1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {

    val navController = rememberNavController()

    NavHost(
       navController = navController,
       startDestination = NavRoutes.Home.route,
    ) {
     composable(NavRoutes.Home.route) {
         Home(navController = navController)
         }
     composable(NavRoutes.UpperBody.route) {
         UpperBody(navController = navController)
         }
     composable(NavRoutes.LowerBody.route) {
         LowerBody(navController = navController)
        }
     composable(NavRoutes.Cardio.route) {
         Cardio(navController = navController)
        }
     composable(NavRoutes.Abs.route) {
         Abs(navController = navController)
        }
     composable(NavRoutes.Balance.route) {
         Balance(navController = navController)
        }
     composable(NavRoutes.Other.route) {
         Other(navController = navController)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NavDemoPic_1Theme {
        MainScreen()
    }
}
