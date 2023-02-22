package com.example.pageindexview.view.list.item

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pageindexview.view.list.item.component.CheckInMethodView
import com.example.pageindexview.view.list.item.component.NameView
import com.example.pageindexview.view.list.item.component.PhotoView
import com.example.pageindexview.view.list.item.component.TimeView
import java.util.*

@Preview(showBackground = true, backgroundColor = 0xFF0B1326)
@Composable
fun HistoryItem(

) {

    Box(
        modifier = Modifier
            .height(100.dp)
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.align(Alignment.CenterStart)
        ) {
            PhotoView(
                modifier = Modifier
                    .padding(4.dp)
            )
            Column(
                modifier = Modifier.padding(4.dp)
            ) {
                NameView(modifier = Modifier.padding(4.dp))
                TimeView(modifier = Modifier.padding(4.dp), Date())
            }
        }
        CheckInMethodView(modifier = Modifier.align(Alignment.CenterEnd).padding(4.dp))
    }

}