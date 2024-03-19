package br.com.fiap.fintech

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.fintech.screens.DespesaScreen
import br.com.fiap.fintech.screens.InvestimentoScreen
import br.com.fiap.fintech.screens.LoginScreen
import br.com.fiap.fintech.screens.MainScreen
import br.com.fiap.fintech.screens.ReceitaScreen
import br.com.fiap.fintech.ui.theme.FintechTheme
import br.com.fiap.fintech.viewmodel.TransacoesViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val transacoesViewModel = TransacoesViewModel()
        setContent {
            FintechTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "login",
                    ) {
                        composable(route = "login") {
                            LoginScreen(navController)
                        }
                        composable(route = "main") {
                            MainScreen(navController, valorTotalInvestido = 0.0, valorTotalReceitas = 0.0)
                        }
                        composable(route = "investimento") {
                            InvestimentoScreen(navController, transacoesViewModel)
                        }
                        composable(route = "receita") {
                            ReceitaScreen(navController, transacoesViewModel)
                        }
                        composable(route = "despesa"){
                            DespesaScreen(transacoesViewModel)
                        }
                    }
                }
            }
        }
    }
}



