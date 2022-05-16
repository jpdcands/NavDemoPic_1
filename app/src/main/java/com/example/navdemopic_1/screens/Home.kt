package com.example.navdemopic_1.screens

import android.inputmethodservice.Keyboard
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.navdemopic_1.R


@Composable
fun Home(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            "  Choose Your Exercise",
            fontSize = 35.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = Color.Red,
            modifier = Modifier.padding(top = 55.dp, bottom = 65.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.barbells),
            contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .width(400.dp)
                .height(250.dp)
         )
        Row(
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.size(width = 800.dp, height = 600.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ButtonUI("Upper Body")
                ButtonUI("Lower Body")
                ButtonUI("Abs")

            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ButtonUI("Cardio")
                ButtonUI("Balance")
                ButtonUI("Other")
            }
        }
    }
}

@Composable
fun ButtonUI(name: String) {
    Button(
        onClick = { navController.navigate("$name") },
        Modifier.padding(20.dp),
        shape = RoundedCornerShape(20.dp),
        border = BorderStroke(3.dp, Color.Black),
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.Black,
            backgroundColor = Color.Red)
        ) {
        Text(text = "$name")
    }
  }



