package com.example.pageindexview.view.details.components.photo_view

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pageindexview.R

@Preview
@Composable
fun SystemPhotoView(
    modifier: Modifier = Modifier,
    imagePath: String? = null
) {

    PhotoView(
        modifier = modifier
            .size(80.dp),
        imagePath = imagePath,
        defaultPainter = painterResource(id = R.drawable.stranger_card)
    )

}