package com.example.pageindexview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pageindexview.ui.theme.PageIndexViewTheme
import com.example.pageindexview.view.PageIndexView
import com.example.pageindexview.view.page_changer.ChangePageButtonEvent
import com.example.pageindexview.view.page_changer.Direction

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {

            val index = remember { mutableStateOf(120) }
            val num = remember { mutableStateOf(148) }

            PageIndexViewTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PageIndexView(
                        index = index.value,
                        num = num.value,
                        space = 1,
                        onClick = { index.value = it },
                        onEvent = {
                            when (it) {
                                is ChangePageButtonEvent.OnDirectionClicked -> {
                                    when (it.direction) {
                                        Direction.Left -> {
                                            index.value = index.value - 1
                                        }
                                        Direction.Right -> {
                                            index.value = index.value + 1
                                        }
                                    }
                                }
                            }
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PageIndexViewTheme {
        Greeting("Android")
    }
}