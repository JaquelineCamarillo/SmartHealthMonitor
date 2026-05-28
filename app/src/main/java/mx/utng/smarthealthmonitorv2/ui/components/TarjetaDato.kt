//TARJETADATO.KT
package mx.utng.smarthealthmonitorv2.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.DirectionsWalk
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import mx.utng.smarthealthmonitorv2.ui.theme.SmartHealthMonitorV2Theme

@Composable
fun TarjetaDato(
    valor: String,
    unidad: String,
    label: String,
    colorValor: Color,
    modifier: Modifier = Modifier,
    icono: ImageVector? = null          //  parámetro opcional
) {
    ElevatedCard(modifier = modifier.fillMaxWidth()) {
        Column(
            modifier = Modifier.padding(horizontal = 20.dp, vertical = 16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = label,
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Spacer(Modifier.height(4.dp))
            Row(
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                //  Si hay ícono, lo muestra a la izquierda del valor
                if (icono != null) {
                    Icon(
                        imageVector = icono,
                        contentDescription = null,
                        tint = colorValor,
                        modifier = Modifier
                            .size(28.dp)
                            .padding(bottom = 4.dp)
                    )
                }
                Text(
                    text = valor,
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Bold,
                    color = colorValor
                )
                Text(
                    text = unidad,
                    style = MaterialTheme.typography.titleSmall,
                    color = colorValor,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true, name = "TarjetaDato - con íconos")
@Composable
private fun TarjetaDatoPreview() {
    SmartHealthMonitorV2Theme {
        Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            TarjetaDato(
                valor = "78",
                unidad = "bpm",
                label = "Frecuencia cardíaca",
                colorValor = MaterialTheme.colorScheme.error,
                icono = Icons.Default.Favorite
            )
            TarjetaDato(
                valor = "4,250",
                unidad = "pasos",
                label = "Pasos del día",
                colorValor = MaterialTheme.colorScheme.primary,
                icono = Icons.Default.DirectionsWalk
            )
        }
    }
}