package com.example.pageindexview.view.chip_filters.chip.components

import androidx.compose.runtime.Composable

@Composable
fun Chip(
    isOn: Boolean,
    onClick: () -> Unit,
    text: String
) {

    ChipWrapper(
        isOn = isOn,
        onClick = { onClick() }
    ) {
        ChipText(isOn, text)
    }

}