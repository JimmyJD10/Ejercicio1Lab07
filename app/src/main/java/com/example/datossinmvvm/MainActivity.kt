package com.example.datossinmvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.datossinmvvm.ui.theme.DatosSinMVVMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DatosSinMVVMTheme {
                Scaffold { innerPadding ->
                    ScreenUser(modifier = Modifier.padding(innerPadding)) // Asegúrate de usar el modifier
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewScreenUser() {
    DatosSinMVVMTheme {
        ScreenUser() // Llama a ScreenUser sin parámetros
    }
}
