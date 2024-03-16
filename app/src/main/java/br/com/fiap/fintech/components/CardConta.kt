package br.com.fiap.fintech.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardConta() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xD0E9E1E1))
    ) {
        Column(
            modifier = Modifier
                .padding(12.dp)
        ) {
            Text(
                text = "Conta Digital",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    text = "R$ 0",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                ) {
                    Image(
                        painter = painterResource(id = br.com.fiap.fintech.R.drawable.pix),
                        contentDescription = "Logo Pix",
                        modifier = Modifier
                            .size(20.dp)
                    )
                    Text(
                        text = "Pix",
                        color = Color.Black
                    )
                }
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                ) {
                    Image(
                        painter = painterResource(id = br.com.fiap.fintech.R.drawable.codigobarras),
                        contentDescription = "Logo Codigo de Barras",
                        modifier = Modifier
                            .size(20.dp)
                    )
                    Text(
                        text = "Pagar",
                        color = Color.Black
                    )
                }
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                ) {
                    Image(
                        painter = painterResource(id = br.com.fiap.fintech.R.drawable.cartaocredito),
                        contentDescription = "Logo Cartao de Credito",
                        modifier = Modifier
                            .size(20.dp)
                    )
                    Text(
                        text = "Cartões",
                        color = Color.Black
                    )
                }
            }
        }
    }
}
