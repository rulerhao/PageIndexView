package com.example.pageindexview.view.details.components.photo_view

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.example.pageindexview.R

@Composable
fun DefaultPhotoView(
    modifier: Modifier = Modifier,
    painterRes: Painter = painterResource(id = R.drawable.ic_face_n)
) {
    Image(
        modifier = modifier,
        painter = painterRes,
        contentDescription = null,
    )
}