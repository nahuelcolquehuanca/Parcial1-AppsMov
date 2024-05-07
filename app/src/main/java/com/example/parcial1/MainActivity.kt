package com.example.parcial1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.parcial1.ui.theme.Parcial1Theme

class MainActivity : ComponentActivity() {

}

@Composable
fun LoginPage(modifier: Modifier = Modifier) {
    var loginSuccessful by remember {
        mutableStateOf(false)
    }

   Column(modifier = modifier) {
       Text(text = "Ingrese Usuario y Contraseña")
       TextF

   }
    Column() {
        
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPagePreview() {
    Parcial1Theme {
        LoginPage()
    }
}