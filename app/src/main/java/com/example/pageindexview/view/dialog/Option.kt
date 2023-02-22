package com.example.pageindexview.view.dialog

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import com.example.pageindexview.R

@Composable
fun Option(
    text: String
) {

    val color = colorResource(id = R.color.font_color)

    Text(
        modifier = Modifier
            .fillMaxWidth(),
        text = text,
        color = color
    )

}