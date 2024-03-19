package br.com.fiap.fintech.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.fiap.fintech.components.CardConta
import br.com.fiap.fintech.components.CardInvestimentos
import br.com.fiap.fintech.components.CardLogo
import br.com.fiap.fintech.components.CardReceita
import br.com.fiap.fintech.components.CardTransacoes


@Composable
fun MainScreen(navController: NavController, valorTotalInvestido: Double, valorTotalReceitas: Double) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
            .padding(top = 40.dp)
    ) {
        CardLogo()
        CardConta()
        CardInvestimentos(navController, valorTotalInvestido)
        CardReceita(navController, valorTotalReceitas)
        CardTransacoes()
    }
}


