package com.example.pageindexview.view.details.components.photo_view

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.pageindexview.R

@Composable
fun PhotoView(
    modifier: Modifier = Modifier,
    imagePath: String? = null,
    defaultPainter: Painter = painterResource(id = R.drawable.ic_face_n)
) {

    PhotoWrapView(
        modifier = modifier
    ) {
        if (imagePath == null || imagePath.isBlank()) {
            DefaultPhotoView(
                modifier = Modifier
                    .fillMaxSize(),
                painterRes = defaultPainter
            )
        } else {
            GlidePhotoView(
                modifier = Modifier,
                imagePath = imagePath
            )
        }
    }

}

@Preview
@Composable
fun PhotoView(
    modifier: Modifier = Modifier,
    imagePath: String? = null
) {
    PhotoView(
        modifier = modifier
            .size(160.dp),
        imagePath = imagePath,
        defaultPainter = painterResource(id = R.drawable.ic_face_n)
    )
}

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
private fun GlidePhotoView(
    modifier: Modifier = Modifier,
    imagePath: String
) {
    GlideImage(
        modifier = modifier
            .fillMaxSize(),
        model = imagePath,
        contentDescription = null
    )
}