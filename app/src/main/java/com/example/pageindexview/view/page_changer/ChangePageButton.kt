package com.example.pageindexview.view.page_changer

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.pageindexview.R

@Preview(showBackground = true)
@Composable
fun ChangePageButton(
    index: Int = 5,
    num: Int = 243,
    direction: Direction = Direction.Left,
    onEvent: (ChangePageButtonEvent) -> Unit = { ChangePageButtonEvent.OnDirectionClicked(Direction.Left) }
) {

    val enabled = when (direction) {
        Direction.Left -> { index > 0 }
        Direction.Right -> { index < num - 1 }
    }

    val icon = when (direction) {
        Direction.Left -> { Icons.Default.KeyboardArrowLeft }
        Direction.Right -> { Icons.Default.KeyboardArrowRight }
    }

    if (enabled) {
        IconButton(
            onClick = {
                onEvent(ChangePageButtonEvent.OnDirectionClicked(direction))
            }
        ) {
            Icon(
                tint = colorResource(id = R.color.white),
                imageVector = icon,
                contentDescription = null
            )
        }
    }

}