package br.com.fiap.fintech.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import br.com.fiap.fintech.components.CardLogo

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
            .padding(top = 60.dp)
    ) {
        CardLogo()
        Card (
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xD0E9E1E1))
        ) {
            Row(
                modifier = Modifier
                    .padding(8.dp),
            ) {
                Text(
                    text = "Conta Digital",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(12.dp)
                )
                Spacer(modifier = Modifier
                    .padding(16.dp)
                )
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                    modifier = Modifier
                        .padding(4.dp)
                ) {
                    Image(painter = painterResource(id = br.com.fiap.fintech.R.drawable.bussola),
                        contentDescription = "Logo Bússola"
                    )
                    Text(
                        text = "Bússola",
                        color = Color.Black
                    )
                }
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp,2.dp,0.dp,2.dp)
            ) {
                Text(
                    text = "R$ 0",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                )
            }
            Row (
                modifier = Modifier
                    .padding(12.dp)
                    .fillMaxWidth()
            ){
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                ) {
                    Image(painter = painterResource(id = br.com.fiap.fintech.R.drawable.pix),
                        contentDescription = "Logo Pix"
                    )
                    Text(
                        text = "Pix",
                        color = Color.Black
                    )
                }
                Spacer(modifier = Modifier.padding(3.dp))
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                    ) {
                    Image(
                        painter = painterResource(id = br.com.fiap.fintech.R.drawable.codigobarras),
                        contentDescription = "Logo Codigo de Barras"
                    )
                    Text(
                        text = "Pagar",
                        color = Color.Black
                    )
                }
                Spacer(modifier = Modifier.padding(3.dp))
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                ) {
                    Image(
                        painter = painterResource(id = br.com.fiap.fintech.R.drawable.cartaocredito),
                        contentDescription = "Logo Cartao de Credito"
                    )

                    Text(
                        text = "Cartões",
                        color = Color.Black
                    )
                }
            }
            Card (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFFFFFFF))
            ) {

            }
        }
    }
}

