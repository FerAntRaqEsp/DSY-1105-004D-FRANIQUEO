# ProyectoMovil_Grupo1

Proyecto Android (Kotlin + Jetpack Compose) que implementa lo pedido en:
- **Guía 7**: Configuración inicial del proyecto móvil con MVVM y herramientas colaborativas.
- **Guía 8**: Construcción visual de pantalla base con Jetpack Compose.

## Estructura (MVVM)

```
app/src/main/java/com/example/proyectomovil/
├── MainActivity.kt          # Punto de entrada, monta el tema y HomeScreen
├── ui/
│   ├── HomeScreen.kt        # Pantalla base: Scaffold, Column, Row, Text, Button, Image
│   └── theme/                # Color.kt, Type.kt, Theme.kt (MaterialTheme)
├── viewmodel/
│   └── HomeViewModel.kt      # Estado y lógica de presentación de HomeScreen
├── model/
│   └── Item.kt                # Clase de datos de ejemplo (DTO)
└── repository/
    └── HomeRepository.kt      # Simula el origen de datos
```

## Cómo abrir el proyecto

1. Descomprime el .zip.
2. Abre Android Studio → **File > Open** → selecciona la carpeta `ProyectoMovil_Grupo1`.
3. Android Studio detectará que falta el `gradle-wrapper.jar` (se excluyó por ser binario)
   y te ofrecerá **descargarlo automáticamente** al sincronizar (o usa
   `File > Sync Project with Gradle Files`). También puedes generarlo tú mismo con:
   ```
   gradle wrapper --gradle-version 8.7
   ```
   si tienes Gradle instalado localmente.
4. Crea o selecciona un **Device Manager** (emulador) y ejecuta la app (▶).

## Pendiente de hacer tú (partes no técnicas de las guías)

Estas partes dependen de tus cuentas y de tu compañero/a, así que no vienen resueltas en el código:

- **Guía 7 – Parte 1**: formar pareja de trabajo y definir el tema del proyecto semestral con tu docente.
- **Guía 7 – Parte 3**: crear el repositorio privado en GitHub, agregar colaborador y docente,
  hacer el commit inicial ("Inicio de proyecto + estructura base MVVM") y el tablero en Trello.
- **Guía 8 – Parte 3**: hacer el commit "Pantalla HomeScreen con estructura Scaffold", actualizar
  Trello, crear la rama `feature/home-screen` si trabajas por feature, y adjuntar una captura
  del resultado visual.

## Notas

- El logo se implementó como **vector drawable** (`res/drawable/logo.xml`) en vez de un `.png`,
  para no depender de un archivo binario externo — funciona igual con
  `painterResource(id = R.drawable.logo)`. Puedes reemplazarlo por tu propio `logo.png` si prefieres.
- Los colores y tipografía se toman de `MaterialTheme` (Guía 8, Parte 2, punto 5).
- El espaciado entre elementos usa `verticalArrangement = Arrangement.spacedBy(20.dp)` (Guía 8, Parte 2, punto 4).
