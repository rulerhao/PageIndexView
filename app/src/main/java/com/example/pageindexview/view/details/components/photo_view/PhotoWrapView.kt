package com.example.pageindexview.view.details.components.photo_view

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.pageindexview.R

@Composable
fun PhotoWrapView(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {

    val shape = RoundedCornerShape(16.dp)
    val borderColor = colorResource(id = R.color.white)
    val borderWidth = 2.dp
    val borderShape = RoundedCornerShape(8.dp)

    Box(
        modifier = modifier
            .border(
                width = borderWidth,
                color = borderColor,
                shape = borderShape
            )
            .padding(borderWidth)
            .clip(shape)
    ) {
        content()
    }

}