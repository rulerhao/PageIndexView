package com.example.pageindexview.view.item

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pageindexview.R

// TODO: Dynamic size for large page situation.
@Preview
@Composable
fun NumberChip(
    isOn: Boolean = true,
    num: Int = 148,
    onClick: (Int) -> Unit = {}
) {

    val color = if (isOn) {
        colorResource(id = R.color.blue)
    } else {
        Color.Transparent
    }

    val borderShape = RoundedCornerShape(36.dp)

    Box(
        modifier = Modifier
            .size(50.dp)
            .padding(4.dp)
            .clip(borderShape)
            .background(color)
            .clickable(
                onClick = { onClick(num - 1) }
            ),
    ) {
        NumberText(
            modifier = Modifier
                .align(Alignment.Center),
            text = num.toString()
        )
    }

}

@Composable
private fun NumberText(
    modifier: Modifier,
    text: String,
) {
    Text(
        modifier = modifier,
        text = text,
        color = colorResource(id = R.color.white)
    )
}