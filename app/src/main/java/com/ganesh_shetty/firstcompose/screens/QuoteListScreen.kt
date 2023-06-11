package com.ganesh_shetty.firstcompose.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.ganesh_shetty.firstcompose.models.Quote

@Composable
fun QuoteListScreen(data: Array<Quote>, onClick: (Quote)-> Unit) {
    Column() {
        Text(
            text = "Quotes App",
            modifier = Modifier
                .align(CenterHorizontally)
                .padding(30.dp),
            style = MaterialTheme.typography.headlineLarge,
            fontFamily = FontFamily.Cursive
        )
        QuoteList(data = data, onClick)
    }
}