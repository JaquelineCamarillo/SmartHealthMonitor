package mx.utng.smarthealthmonitorv2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import android.content.res.Configuration
import android.util.Log
import mx.utng.smarthealthmonitorv2.ui.theme.SmartHealthMonitorV2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SmartHealthMonitorV2Theme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    LoginScreen(
                        onLoginSuccess = {
                            Log.d("SmartHealth", "Login exitoso")
                        }
                    )
                }
            }
        }
    }
}

// Renombrar el Preview para evitar conflicto
@Preview(
    name = "Login - Light",
    showBackground = true,
    showSystemUi = true,
    device = "id:pixel_6"
)
@Preview(
    name = "Login - Dark",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Preview(
    name = "Login - Big Font",
    showBackground = true,
    fontScale = 1.5f
)
@Composable
private fun LoginVariantsPreview() {  // ← Nombre cambiado
    SmartHealthMonitorV2Theme {
        LoginScreen()
    }
}