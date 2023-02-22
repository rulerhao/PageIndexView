package com.example.pageindexview.view.dialog

import androidx.compose.runtime.Composable

@Composable
fun ChipDialogs(
    dateState: Boolean,
    timeState: Boolean,
    conditionState: Boolean,
    typeState: Boolean,
    methodState: Boolean,
) {

    ChipDialog(
        state = dateState,
        onDismissRequest = {},
        listOf(DialogOptionObject("開始"), DialogOptionObject("結束"))
    )

    ChipDialog(
        state = timeState,
        onDismissRequest = {},
        listOf(DialogOptionObject("開始"), DialogOptionObject("結束"))
    )

    ChipDialog(
        state = conditionState,
        onDismissRequest = {},
        listOf(DialogOptionObject("通過"), DialogOptionObject("未通過"))
    )

    ChipDialog(
        state = typeState,
        onDismissRequest = {},
        listOf(DialogOptionObject("員工"), DialogOptionObject("陌生人"))
    )

    ChipDialog(
        state = methodState,
        onDismissRequest = {},
        listOf(DialogOptionObject("上班"), DialogOptionObject("下班"), DialogOptionObject("加班"))
    )

}