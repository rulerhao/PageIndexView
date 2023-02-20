package com.example.pageindexview.view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.pageindexview.R
import com.example.pageindexview.view.page_changer.ChangePageButton
import com.example.pageindexview.view.page_changer.ChangePageButtonEvent
import com.example.pageindexview.view.page_changer.Direction

@Composable
fun PageIndexWrapper(
    index: Int,
    num: Int,
    onEvent: (ChangePageButtonEvent) -> Unit,
    content: @Composable () -> Unit
) {

    Wrapper() {
        ChangePageButton(
            index = index,
            num = num,
            direction = Direction.Left,
            onEvent = { onEvent(ChangePageButtonEvent.OnDirectionClicked(Direction.Left)) }
        )
        content()
        ChangePageButton(
            index = index,
            num = num,
            direction = Direction.Right,
            onEvent = { onEvent(ChangePageButtonEvent.OnDirectionClicked(Direction.Right)) }
        )
    }

}

@Composable
private fun Wrapper(
    content: @Composable () -> Unit
) {

    val borderWidth = 2.dp
    val borderShape = RoundedCornerShape(8.dp)

    Row(
        modifier = Modifier
            .wrapContentSize()
            .border(
                width = borderWidth,
                color = colorResource(id = R.color.white),
                shape = borderShape
            )
            .padding(borderWidth)
            .background(
                colorResource(id = R.color.background_color),
            )
            .clip(borderShape),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        content()
    }
}