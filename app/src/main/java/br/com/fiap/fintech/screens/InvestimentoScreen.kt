package br.com.fiap.fintech.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.fintech.components.CaixaDeEntrada
import br.com.fiap.fintech.components.CardLogo
import br.com.fiap.fintech.components.Transacoes


@Composable
fun InvestimentoScreen() {
    var valorInvestimento by remember {
        mutableStateOf("")
    }
    var tipoInvestimento by remember {
        mutableStateOf("")
    }

    fun cadastrarInvestimento() {
        // Lógica para cadastrar o investimento
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
            .padding(top = 60.dp)
    ) {
        CardLogo()
        Card (
            modifier = Modifier
                .fillMaxWidth()
                .padding(32.dp),
            shape = RoundedCornerShape(32.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xD0E9E1E1))
        ){
            Text(
                text = "INVESTIMENTO",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(16.dp)
                    .align(Alignment.CenterHorizontally)
            )
            CaixaDeEntrada(
                value = valorInvestimento,
                placeholder = "Quanto deseja investir?",
                label = "Digite o valor do investimento:",
                modifier = Modifier,
                keyboardType = KeyboardType.Number,
                atualizarValor = {valorInvestimento = it}
            ) {


            }
            CaixaDeEntrada(
                value = tipoInvestimento,
                placeholder = "Qual Investimento você vai escolher?",
                label = "Digite o tipo de investimento",
                modifier = Modifier,
                keyboardType = KeyboardType.Text,
                atualizarValor = {tipoInvestimento = it}
            ) {

            }
            Button(
                onClick = {},
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(32.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xD0E9E1E1))
            ){
                Text(text = "Cadastrar",
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 14.sp
                )
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(horizontal = 32.dp, vertical = 24.dp),
                colors = CardDefaults.cardColors(containerColor = Color.DarkGray),
                elevation = CardDefaults.cardElevation(4.dp),
                border = BorderStroke(width = 1.dp, Color(0xD0E9E1E1))
            ) {
                Row(
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .padding(12.dp)
                        .fillMaxSize()
                ) {
                    Column() {
                        Text(
                            text = "Investimentos:",
                            color = Color.White,
                            fontSize = 14.sp
                        )

                    }

                }
            }

        }

    }
}


