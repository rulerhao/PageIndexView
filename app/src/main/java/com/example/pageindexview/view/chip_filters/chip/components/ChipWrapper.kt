package com.example.pageindexview.view.chip_filters.chip.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
fun ChipWrapper(
    isOn: Boolean,
    onClick: () -> Unit,
    content: @Composable () -> Unit,
) {

    val backgroundColor = if (isOn) { colorResource(id = R.color.blue) } else { colorResource(id = R.color.chip_background) }
    val shape = RoundedCornerShape(12.dp)

    Box(
        modifier = Modifier
            .padding(4.dp)
            .clip(shape)
            .background(backgroundColor)
            .clickable(
                onClick = { onClick() }
            ),
    ) {
        content()
    }

}