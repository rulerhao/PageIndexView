package com.example.pageindexview.view.chip_filters

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.pageindexview.view.chip_filters.chip.components.Chip
import com.example.pageindexview.view.chip_filters.chip.components.DropDownChip

@Preview
@Composable
fun Chips(

) {

    Row(

    ) {
        DropDownChip(isOn = false, text = "日期", onClick = {})
        DropDownChip(isOn = false, text = "時間", onClick = {})
        DropDownChip(isOn = false, text = "驗證結果", onClick = {})
        DropDownChip(isOn = false, text = "類別", onClick = {})
        Chip(isOn = false, text = "溫度異常", onClick = {})
        DropDownChip(isOn = false, text = "刷卡", onClick = {})
    }

}