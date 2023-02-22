package com.example.pageindexview.view.list.item.component

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
    text: String? = "",
) {

    val color = colorResource(id = R.color.white)

    if (text != null) {
        NameView(
            modifier = modifier,
            text = text,
            style = MaterialTheme.typography.titleLarge,
            color = color
        )
    }

}

@Composable
fun NameView(
    modifier: Modifier = Modifier,
    text: String,
    style: TextStyle = MaterialTheme.typography.bodyMedium,
    color: Color = MaterialTheme.colorScheme.onPrimaryContainer
) {

    Text(
        modifier = modifier,
        text = text,
        style = style,
        color = color
    )

}