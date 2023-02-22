package com.example.pageindexview.view.list.item.component

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.pageindexview.R

@Composable
fun CheckInMethodView(
    modifier: Modifier = Modifier
) {

    val painter = painterResource(id = R.drawable.stop_card)

    Image(
        modifier = modifier,
        painter = painter,
        contentDescription = null
    )

}