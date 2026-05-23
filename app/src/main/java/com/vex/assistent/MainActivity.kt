package com.vex.assistent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            VexScreen()
        }
    }
}

@Composable
fun VexScreen() {

    var respuesta by remember {
        mutableStateOf("Esperando comando...")
    }

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),

            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Vex",
                style = MaterialTheme.typography.headlineLarge
            )

            Spacer(
                modifier = Modifier.height(40.dp)
            )

            Text(
                text = respuesta
            )

            Spacer(
                modifier = Modifier.height(30.dp)
            )

            Button(
                onClick = {
                    respuesta =
                        "Sistema activo. Esperando instrucciones."
                }
            ) {

                Text("Escuchar")

            }

        }

    }

}