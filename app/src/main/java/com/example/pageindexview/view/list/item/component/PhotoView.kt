package com.example.pageindexview.view.list.item.component

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.pageindexview.R
import com.example.pageindexview.view.details.components.photo_view.PhotoView

@Composable
fun PhotoView(
    modifier: Modifier = Modifier,
) {

    val defaultPainter = painterResource(id = R.drawable.ic_face_n)
        
    PhotoView(
        modifier = modifier
            .size(90.dp),
        imagePath = null,
        defaultPainter = defaultPainter
    )

}