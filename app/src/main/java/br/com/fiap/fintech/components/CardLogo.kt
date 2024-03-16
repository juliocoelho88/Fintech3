package br.com.fiap.fintech.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
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
import br.com.fiap.fintech.R

@Composable
fun CardLogo() {
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(32.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xD0E9E1E1))
    ) {
        Row(
            modifier = Modifier
                .height(120.dp)
        ) {
            Text(
                text = "FINTECH",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(18.dp)
                    .align(Alignment.CenterVertically)
            )
            Spacer(modifier = Modifier.padding(28.dp))
            Image(
                painter = painterResource(id = R.drawable.logo_fintech),
                contentDescription = "logo",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .size(60.dp))
        }
    }
}

