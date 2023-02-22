package com.example.pageindexview.view.details.components.card_view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.pageindexview.R

@Composable
fun CardView(
    modifier: Modifier,
    title: String,
    content: String
) {

    val fontColor = colorResource(id = R.color.white)

    CardView(
        modifier = modifier,
        title = {
            Text(
                modifier = Modifier
                    .padding(8.dp)
                    .align(Alignment.TopStart),
                text = title,
                color = fontColor
            )
        },
        content = {
            Text(
                modifier = Modifier
                    .align(Alignment.Center),
                text = content,
                color = fontColor
            )
        }
    )

}

@Composable
fun CardView(
    modifier: Modifier = Modifier,
    title: @Composable BoxScope.() -> Unit,
    content: @Composable BoxScope.() -> Unit
) {

    val shape = RoundedCornerShape(16.dp)
    val backgroundColor = colorResource(id = R.color.headline_background_color)

    Box(
        modifier = modifier
            .clip(shape)
            .background(backgroundColor)
    ) {
        title()
        content()
    }

}