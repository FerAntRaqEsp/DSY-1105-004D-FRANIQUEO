package com.example.proyectomovil.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.proyectomovil.R
import com.example.proyectomovil.viewmodel.HomeViewModel

// Pantalla base reutilizable construida con Jetpack Compose (Guía 8)
// Utiliza Scaffold + TopAppBar, Column, Text, Button e Image, siguiendo MVVM:
// el estado y la lógica viven en HomeViewModel, la UI solo lo observa y lo muestra.
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    viewModel: HomeViewModel = viewModel()
) {
    Scaffold(
        topBar = {
            // Barra superior con el título de la app
            TopAppBar(title = { Text("Mi App Kotlin") })
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            // Espaciado uniforme entre elementos (buena práctica de Parte 2)
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            // Texto de bienvenida, controlado por el estado del ViewModel
            Text(
                text = viewModel.mensajeBienvenida,
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.primary
            )

            // Botón que dispara una acción en el ViewModel
            Button(onClick = { viewModel.onBotonPresionado() }) {
                Text("Presióname")
            }

            // Imagen del logo de la app (res/drawable/logo)
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo App",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Fit
            )

            // Fila de ejemplo con dos elementos, para practicar Row + alineación
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text("Elemento A")
                Text("Elemento B")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
