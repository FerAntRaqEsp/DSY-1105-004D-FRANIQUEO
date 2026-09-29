package com.example.proyectomovil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.proyectomovil.ui.HomeScreen
import com.example.proyectomovil.ui.theme.ProyectoMovilTheme

// Actividad principal: solo monta el tema y muestra HomeScreen como si fuese propio,
// tal como pide la Guía 8 (Parte 1, punto 3).
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProyectoMovilTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    HomeScreen()
                }
            }
        }
    }
}
