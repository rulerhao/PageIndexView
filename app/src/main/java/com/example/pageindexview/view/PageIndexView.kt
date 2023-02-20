package com.example.pageindexview.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.pageindexview.view.page_changer.ChangePageButtonEvent

@Composable
fun PageIndexView(
    index: Int = 120,
    num: Int = 148,
    space: Int = 1,
    onClick: (Int) -> Unit = {},
    onEvent: (ChangePageButtonEvent) -> Unit = {}
) {

    when (format(index = index, num = num, space = space)) {
        FarFrom.Both -> { FarFromBoth(index = index, num = num, space = space, onClick = { onClick(it) }, onEvent = { onEvent(it) }) }
        FarFrom.Left -> { FarFromLeft(index = index, num = num, space = space, onClick = { onClick(it) }, onEvent = { onEvent(it) }) }
        FarFrom.Right -> { FarFromRight(index = index, num = num, space = space, onClick = { onClick(it) }, onEvent = { onEvent(it) }) }
        FarFrom.None -> { FarFromNone(index = index, num = num, onClick = { onClick(it) }, onEvent = { onEvent(it) }) }
    }

}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun PageIndexViewFarFromBothPreview1(
    index: Int = 3,
    num: Int = 6,
    space: Int = 0
) {
    PageIndexView(index = index, num = num, space = space)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun PageIndexViewFarFromBothPreview1Space1(
    index: Int = 3,
    num: Int = 6,
    space: Int = 1
) {
    PageIndexView(index = index, num = num, space = space)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun PageIndexViewFarFromRightPreview1(
    index: Int = 1,
    num: Int = 6,
    space: Int = 0
) {
    PageIndexView(index = index, num = num, space = space)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun PageIndexViewFarFromRightPreview1Space1(
    index: Int = 1,
    num: Int = 6,
    space: Int = 1
) {
    PageIndexView(index = index, num = num, space = space)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun PageIndexViewFarFromLeftPreview1(
    index: Int = 4,
    num: Int = 6,
    space: Int = 0
) {
    PageIndexView(index = index, num = num, space = space)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun PageIndexViewFarFromLeftPreview1Space1(
    index: Int = 4,
    num: Int = 6,
    space: Int = 0
) {
    PageIndexView(index = index, num = num, space = space)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun PageIndexViewFarFromNonePreview1(
    index: Int = 1,
    num: Int = 3,
    space: Int = 0
) {
    PageIndexView(index = index, num = num, space = space)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun PageIndexViewFarFromNonePreview1Space1(
    index: Int = 1,
    num: Int = 3,
    space: Int = 1
) {
    PageIndexView(index = index, num = num, space = space)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun PageIndexViewFarFromBothPreview2(
    index: Int = 2,
    num: Int = 5,
    space: Int = 0
) {
    PageIndexView(index = index, num = num, space = space)
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
private fun PageIndexViewFarFromBothPreview2Space1(
    index: Int = 2,
    num: Int = 5,
    space: Int = 1
) {
    PageIndexView(index = index, num = num, space = space)
}

private fun format(index: Int, num: Int, space: Int): FarFrom {
    if (index - space >= 2 && index + space <= num - 1 - 2) {
        return FarFrom.Both
    }
    if (index - space >= 2) {
        return FarFrom.Left
    }
    if (index + space <= num - 1 - 2) {
         return FarFrom.Right
    }
    return FarFrom.None
}

private enum class FarFrom {
    Left,
    Right,
    Both,
    None
}