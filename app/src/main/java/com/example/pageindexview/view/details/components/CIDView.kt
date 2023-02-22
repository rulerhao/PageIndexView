package com.example.pageindexview.view.details.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import com.example.pageindexview.R

@Composable
fun CIDView(
    text: String = "00036"
) {

    val color = colorResource(id = R.color.white)

    Text(
        text = text,
        color = color
    )

}