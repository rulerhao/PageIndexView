package com.example.pageindexview.view.details.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.pageindexview.R
import com.example.pageindexview.view.details.components.card_view.CardView

@Preview
@Composable
fun TemperatureView(
    modifier: Modifier = Modifier,
    text: String = "36.5"
) {

    CardView(
        modifier = modifier,
        title = stringResource(id = R.string.temperature),
        content = text
    )

}