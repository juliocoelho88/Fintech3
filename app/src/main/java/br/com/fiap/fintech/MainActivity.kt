package br.com.fiap.fintech

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import br.com.fiap.fintech.screens.MainScreen
import br.com.fiap.fintech.ui.theme.FintechTheme
import br.com.fiap.fintech.viewmodel.TransacoesViewModel

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
    var valorTotalInvestido by remember { mutableStateOf(0.0) }
    
    MainScreen(valorTotalInvestido)
}



