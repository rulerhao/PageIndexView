package com.example.pageindexview.view.chip_filters.chip.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable

@Composable
fun DropDownChip(
    isOn: Boolean,
    text: String,
    onClick: () -> Unit
) {

    ChipWrapper(
        isOn = isOn,
        onClick = { onClick() }
    ) {
        if (isOn) {
            ChipText(isOn, text)
        } else {
            Row() {
                ChipText(isOn, text)
                Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = null)
            }
        }
    }

}