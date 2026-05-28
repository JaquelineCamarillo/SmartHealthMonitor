//MainActivity.kt
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
import android.util.Log
import mx.utng.smarthealthmonitorv2.navigation.SmartHealthNavGraph
import mx.utng.smarthealthmonitorv2.ui.screens.LoginScreen
import mx.utng.smarthealthmonitorv2.ui.theme.SmartHealthMonitorV2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SmartHealthNavGraph()
        }
    }
}


@Preview(name = "Login - Light", showBackground = true,
    showSystemUi = true, device = "id:pixel_6")
@Preview(name = "Login - Dark", showBackground = true,
    uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES)
@Preview(name = "Login - Big Font", showBackground = true,
    fontScale = 1.5f)
@Composable
private fun LoginScreenPreview() {
    SmartHealthMonitorV2Theme  {
        LoginScreen()
    }
}
