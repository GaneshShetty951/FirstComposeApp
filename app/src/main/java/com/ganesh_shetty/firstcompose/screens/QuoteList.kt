package com.ganesh_shetty.firstcompose.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ganesh_shetty.firstcompose.models.Quote

@Composable
fun QuoteList(data: Array<Quote>, onClick:(Quote) -> Unit) {
    LazyColumn(content = {
        items(data) {
            QuoteListItem(quote = it, onClick)
        }
    })
}