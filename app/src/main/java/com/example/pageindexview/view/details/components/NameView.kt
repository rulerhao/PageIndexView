package com.example.pageindexview.view.details.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import com.example.pageindexview.R

@Composable
fun NameView(
    modifier: Modifier = Modifier,
    text: String?,
) {

    NameView(
        modifier = modifier,
        text = text
    )

}

@Composable
fun NameView(
    modifier: Modifier = Modifier,
    text: String,
    style: TextStyle = MaterialTheme.typography.bodyMedium,
    color: Color = colorResource(id = R.color.white)
) {

    Text(
        modifier = modifier,
        text = text,
        style = style,
        color = color
    )

}