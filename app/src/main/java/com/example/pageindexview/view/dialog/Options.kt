package com.example.pageindexview.view.dialog

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable

@Composable
fun Options(
    options: List<DialogOption>
) {

    LazyColumn() {
        items(options) {
            Option(it.text)
        }
    }

}