package mx.utng.smarthealthmonitorv2.ui.screens


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import mx.utng.smarthealthmonitorv2.data.models.MockData
import mx.utng.smarthealthmonitorv2.ui.components.FilaHistorial
import mx.utng.smarthealthmonitorv2.ui.theme.SmartHealthMonitorV2Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HistorialScreen(onBack: () -> Unit = {}) {
    SmartHealthMonitorV2Theme {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("Historial completo") },
                    navigationIcon = {
                        IconButton(onClick = onBack) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "Regresar"
                            )
                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        titleContentColor = MaterialTheme.colorScheme.onPrimary,
                        navigationIconContentColor = MaterialTheme.colorScheme.onPrimary
                    )
                )
            }
        ) { paddingValues ->
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
            ) {
                items(MockData.historialFC, key = { it.id }) { lectura ->
                    FilaHistorial(lectura = lectura)
                }
            }
        }
    }
}

@Preview(showBackground = true, name = "Historial - Light")
@Preview(showBackground = true, name = "Historial - Dark",
    uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun HistorialScreenPreview() {
    SmartHealthMonitorV2Theme { HistorialScreen() }
}