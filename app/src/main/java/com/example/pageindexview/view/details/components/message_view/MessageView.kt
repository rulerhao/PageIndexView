package com.example.pageindexview.view.details.components.message_view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.pageindexview.R

@Preview
@Composable
fun MessageView(
    modifier: Modifier = Modifier,
    isPass: Boolean = true,
) {

    Box(
        modifier = modifier
    ) {
        Background(isPass)
        Column(

        ) {
            MessageText(stringResource(id = R.string.title_time))
            MessageText(stringResource(id = R.string.title_method))
            MessageText(stringResource(id = R.string.title_result))
            MessageText(stringResource(id = R.string.title_reason))
        }
    }


}

@Composable
private fun MessageText(
    text: String = ""
) {

    val fontColor = colorResource(id = R.color.white)

    Text(
        text = text,
        color = fontColor
    )
}

@Composable
private fun Background(
    isPass: Boolean
) {

    val painter = if (isPass) painterResource(id = R.drawable.message_blue)
    else painterResource(id = R.drawable.message_red)

    Image(
        painter = painter,
        contentDescription = null
    )

}