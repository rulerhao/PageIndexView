package com.example.pageindexview.view.details

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pageindexview.R
import com.example.pageindexview.view.details.components.CIDView
import com.example.pageindexview.view.details.components.CheckInView
import com.example.pageindexview.view.details.components.NameView
import com.example.pageindexview.view.details.components.TemperatureView
import com.example.pageindexview.view.details.components.message_view.MessageView
import com.example.pageindexview.view.details.components.photo_view.PhotoView
import com.example.pageindexview.view.details.components.photo_view.SystemPhotoView
import com.example.pageindexview.view.details.components.title_bar.TitleBar

@Preview
@Composable
fun DetailsView(

) {

    val backgroundColor = colorResource(id = R.color.background_color)
    Column(
        modifier = Modifier
            .background(backgroundColor)
    ) {
        TitleBar(
            modifier = Modifier,
            title = stringResource(id = R.string.title_bar_search)
        )
        Content()
    }

}

@Composable
private fun Content() {
    Column(
        modifier = Modifier
            .padding(4.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(4.dp)
                .fillMaxWidth()
                .height(intrinsicSize = IntrinsicSize.Max)
        ) {
            PhotoView(
                modifier = Modifier
                    .weight(1f),
            )
            Spacer(modifier = Modifier.size(8.dp))
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
            ) {
                Column() {
                    NameView(text = "")
                    CIDView()
                }
                SystemPhotoView(
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                )

            }
        }
        MessageView(
            modifier = Modifier
                .padding(4.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            TemperatureView(
                modifier = Modifier
                    .weight(2f)
                    .height(150.dp)
                    .padding(4.dp)
            )
            CheckInView(
                modifier = Modifier
                    .weight(3f)
                    .height(150.dp)
                    .padding(4.dp)
            )
        }
    }
}