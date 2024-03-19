package br.com.fiap.fintech.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.com.fiap.fintech.TipoTransacao
import br.com.fiap.fintech.Transacao
import br.com.fiap.fintech.components.CaixaDeEntrada
import br.com.fiap.fintech.components.CardLogo
import br.com.fiap.fintech.components.CardReceita
import br.com.fiap.fintech.viewmodel.TransacoesViewModel

@Composable
fun ReceitaScreen(navController: NavHostController, transacoesViewModel: TransacoesViewModel) {
    var valorReceita by remember { mutableDoubleStateOf(0.0) }
    var tipoReceita by remember { mutableStateOf("") }
    var valorTotalReceitas by remember { mutableDoubleStateOf(0.0) }
    var ultimasReceitas by remember { mutableStateOf(listOf<Transacao>()) }

    CardReceita(navController, valorTotalReceitas = valorTotalReceitas)
    MainScreen(navController, valorTotalReceitas, 0.0)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
            .padding(top = 60.dp)
    ) {
        CardLogo()
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            shape = RoundedCornerShape(32.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xD0E9E1E1))
        ) {
            Text(
                text = "RECEITAS",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(12.dp)
                    .align(Alignment.CenterHorizontally)
            )
            CaixaDeEntrada(
                value = tipoReceita,
                placeholder = "Qual Receita você vai lançar?",
                label = "Digite o tipo de receita",
                modifier = Modifier,
                keyboardType = KeyboardType.Text
            ) { tipoReceita = it }
            CaixaDeEntrada(
                value = valorReceita.toString(),
                placeholder = "Quanto deseja lançar?",
                label = "Digite o valor da receita:",
                modifier = Modifier,
                keyboardType = KeyboardType.Number
            ) {
                valorReceita = it.toDoubleOrNull() ?: 0.0
            }
            Button(
                onClick = {
                    val receita = Transacao(TipoTransacao.RECEITA, tipoReceita, valorReceita)
                    ultimasReceitas = listOf(receita) + ultimasReceitas.take(2)
                    valorTotalReceitas += valorReceita
                    valorReceita = 0.0
                    tipoReceita = ""
                },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(16.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xD0E9E1E1))
            ) {
                Text(
                    text = "Lançar Receita",
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 14.sp
                )
            }
            Text(
                text = "Total de Receitas: R$$valorTotalReceitas",
                color = Color.Black,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(8.dp)
            )

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(horizontal = 32.dp, vertical = 24.dp),
                colors = CardDefaults.cardColors(containerColor = Color.DarkGray),
                elevation = CardDefaults.cardElevation(4.dp),
                border = BorderStroke(width = 1.dp, Color(0xD0E9E1E1))
            ) {
                Column(
                    modifier = Modifier
                        .padding(12.dp)
                        .fillMaxSize()
                ) {
                    Text(
                        text = "Últimas Receitas:",
                        color = Color.White,
                        fontSize = 14.sp
                    )
                    ultimasReceitas.forEach { receita ->
                        Text(
                            text = "${receita.descricao}: R$${receita.valor}",
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }
                }
            }
        }
    }
}
