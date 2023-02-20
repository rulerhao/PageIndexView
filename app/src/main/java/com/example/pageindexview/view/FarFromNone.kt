package com.example.pageindexview.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.pageindexview.view.item.NumberChip
import com.example.pageindexview.view.page_changer.ChangePageButtonEvent

@Composable
fun FarFromNone(
    index: Int,
    num: Int,
    onClick: (Int) -> Unit = {},
    onEvent: (ChangePageButtonEvent) -> Unit = {}
) {

    PageIndexWrapper(
        index = index,
        num = num,
        onEvent = { onEvent(it) },
        content = {
            Content(
                index = index,
                num = num,
                onClick = { onClick(it) }
            )
        }
    )

}

@Composable
private fun Content(
    index: Int,
    num: Int,
    onClick: (Int) -> Unit
) {

    for (i in 0 until num) {
        val isOn = i == index
        NumberChip(isOn = isOn, num = i + 1, onClick = { onClick(it) })
    }

}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromNonePreview1(
) {
    FarFromNone(0, 1)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromNonePreview2(
) {
    FarFromNone(0, 2)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromNonePreview3(
) {
    FarFromNone(0, 3)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromNonePreview4(
) {
    FarFromNone(1, 2)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromNonePreview5(
) {
    FarFromNone(1, 3)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromNonePreview6(
) {
    FarFromNone(2, 3)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromNonePreview7(
) {
    FarFromNone(2, 4)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromNonePreview8(
) {
    FarFromNone(2, 8)
}