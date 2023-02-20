package com.example.pageindexview.view.item

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import com.example.pageindexview.R

@Composable
fun EllipsisView() {

    Text(text = "...", color = colorResource(id = R.color.white))

}