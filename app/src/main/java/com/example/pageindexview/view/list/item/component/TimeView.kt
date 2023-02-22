package com.example.pageindexview.view.list.item.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.example.pageindexview.R
import java.text.SimpleDateFormat
import java.util.Date

@Composable
fun TimeView(
    modifier: Modifier = Modifier,
    date: Date
) {

    val color = colorResource(id = R.color.white)

    TimeView(
        modifier = modifier
            .padding(4.dp),
        text = SimpleDateFormat("yyyy/MM/dd HH-mm-ss").format(date),
        style = MaterialTheme.typography.titleMedium,
        color = color
    )

}

@Composable
fun TimeView(
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