package br.com.fiap.fintech

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import br.com.fiap.fintech.screens.InvestimentoScreen
import br.com.fiap.fintech.screens.MainScreen
import br.com.fiap.fintech.ui.theme.FintechTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FintechTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Fintech()
                }
            }
        }
    }
}

@Composable
fun Fintech() {
    
    InvestimentoScreen()
}



