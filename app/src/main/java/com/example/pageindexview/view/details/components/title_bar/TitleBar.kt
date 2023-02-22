package com.example.pageindexview.view.details.components.title_bar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.pageindexview.R

@Composable
fun TitleBar(
    modifier: Modifier = Modifier,
    title: String
) {

    val fontColor = colorResource(id = R.color.white)
    val backgroundColor = colorResource(id = R.color.headline_background_color)

    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(backgroundColor)
            .padding(4.dp),
    ) {
        Text(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(horizontal = 8.dp, vertical = 4.dp),
            style = MaterialTheme.typography.titleLarge,
            text = title,
            color = fontColor
        )
    }

}