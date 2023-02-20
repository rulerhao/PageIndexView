package com.example.pageindexview.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.pageindexview.view.item.EllipsisView
import com.example.pageindexview.view.item.NumberChip
import com.example.pageindexview.view.page_changer.ChangePageButtonEvent

@Composable
fun FarFromBoth(
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
    for (i in index - space..index + space) {
        val isOn = i == index
        NumberChip(isOn = isOn, num = i + 1, onClick = { onClick(it) })
    }
    EllipsisView()
    NumberChip(isOn = false, num = num, onClick = { onClick(it) })

}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromBothPreview1(
) {
    FarFromBoth(6, 148, 0)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromBothPreview1Space1(
) {
    FarFromBoth(6, 148, 1)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromBothPreview1Space2(
) {
    FarFromBoth(6, 148, 2)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromBothPreview2(
) {
    FarFromBoth(7, 148, 1)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun FarFromBothPreview3(
) {
    FarFromBoth(8, 148, 1)
}