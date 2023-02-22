package com.example.pageindexview.view.dialog

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.pageindexview.R

@Preview
@Composable
fun ChipDialog(
    state: Boolean = true,
    onDismissRequest: () -> Unit = {},
    content: @Composable () -> Unit = {}
) {

    val backgroundColor = colorResource(id = R.color.white)
    val shape = RoundedCornerShape(16.dp)

    if (state) {
        Dialog(
            onDismissRequest = { onDismissRequest() }
        ) {
            Surface(
                modifier = Modifier
                    .clip(shape),
                color = backgroundColor
            ) {
                content()
            }
        }
    }

}

@Preview
@Composable
fun ChipDialog(
    state: Boolean = true,
    onDismissRequest: () -> Unit = {},
    list: List<DialogOption> = listOf(DialogOptionObject("通過"), DialogOptionObject("未通過"))
) {
    ChipDialog(
        state, onDismissRequest
    ) {
        Options(list)
    }
}