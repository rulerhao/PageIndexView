package com.example.pageindexview.view.item

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.pageindexview.R

@Preview
@Composable
fun NumberChip(
    isOn: Boolean = true,
    num: Int = 148,
    onClick: (Int) -> Unit = {}
) {

    val colors = if (isOn) {
        ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.blue))
    } else {
        ButtonDefaults.buttonColors(containerColor = Color.Transparent)
    }

    Button(
        colors = colors,
        onClick = { onClick(num - 1) },
    ) {
        NumberText(text = num.toString())
    }

}

@Composable
private fun NumberText(
    text: String,
) {
    Text(
        text = text,
        color = colorResource(id = R.color.white)
    )
}