package com.example.pageindexview.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.pageindexview.view.item.EllipsisView
import com.example.pageindexview.view.item.NumberChip
import com.example.pageindexview.view.page_changer.ChangePageButtonEvent

@Composable
fun FarFromRight(
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
    for (i in 0..index + space) {
        val isOn = i == index
        NumberChip(isOn = isOn, num = i + 1, onClick = { onClick(it) })
    }
    EllipsisView()
    NumberChip(isOn = false, num = num, onClick = { onClick(it) })
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromRightPreview1(
) {
    FarFromRight(0, 148, 0)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromRightPreview1Space1(
) {
    FarFromRight(0, 148, 1)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromRightPreviewSpace2(
) {
    FarFromRight(0, 148, 2)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromRightPreview2(
) {
    FarFromRight(1, 148, 0)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromRightPreview2Space1(
) {
    FarFromRight(1, 148, 1)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromRightPreview2Space2(
) {
    FarFromRight(1, 148, 2)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromRightPreview3(
) {
    FarFromRight(2, 148, 0)
}