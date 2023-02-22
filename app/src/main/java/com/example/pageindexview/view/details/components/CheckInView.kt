package com.example.pageindexview.view.details.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.pageindexview.R
import com.example.pageindexview.view.details.components.card_view.CardView

@Preview
@Composable
fun CheckInView(
    modifier: Modifier = Modifier,
    text: String = "上班"
) {

    CardView(
        modifier = modifier,
        title = stringResource(id = R.string.check_in),
        content = text
    )

}