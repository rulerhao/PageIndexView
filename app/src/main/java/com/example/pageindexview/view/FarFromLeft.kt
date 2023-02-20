package com.example.pageindexview.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.pageindexview.view.item.EllipsisView
import com.example.pageindexview.view.item.NumberChip
import com.example.pageindexview.view.page_changer.ChangePageButtonEvent

@Composable
fun FarFromLeft(
    index: Int,
    num: Int,
    space: Int,
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
                space = space,
                onClick = { onClick(it) }
            )
        }
    )

}

@Composable
private fun Content(
    index: Int,
    num: Int,
    space: Int,
    onClick: (Int) -> Unit
) {
    NumberChip(isOn = false, num = 1, onClick = { onClick(it) })
    EllipsisView()
    for (i in index - space + 1 ..num) {
        val isOn = i == index + 1
        NumberChip(isOn = isOn, num = i, onClick = { onClick(it) })
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromLeftPreview0(
) {
    FarFromLeft(144, 148, 0)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromLeftPreview0Space0(
) {
    FarFromLeft(144, 148, 0)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromLeftPreview0Space1(
) {
    FarFromLeft(144, 148, 1)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromLeftPreview0Space2(
) {
    FarFromLeft(144, 148, 2)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromLeftPreview1(
) {
    FarFromLeft(145, 148, 0)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromLeftPreview2(
) {
    FarFromLeft(146, 148, 0)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromLeftPreview3(
) {
    FarFromLeft(147, 148, 0)
}