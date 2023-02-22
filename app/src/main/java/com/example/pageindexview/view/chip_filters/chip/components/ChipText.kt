package com.example.pageindexview.view.chip_filters.chip.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import com.example.pageindexview.R

@Composable
fun ChipText(
    isOn: Boolean,
    text: String
) {

    val color = if (isOn) { colorResource(id = R.color.white) } else { colorResource(id = R.color.font_color) }

    Text(
        text = text,
        color = color
    )

}