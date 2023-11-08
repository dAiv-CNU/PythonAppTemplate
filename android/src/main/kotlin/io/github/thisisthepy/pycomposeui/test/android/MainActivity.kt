package io.github.thisisthepy.pycomposeui.test.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.github.thisisthepy.pycomposeui.*
import io.github.thisisthepy.pycomposeui.test.common.App
import io.github.thisisthepy.pycomposeui.test.common.Greeting


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PythonLauncher {
                Box(
                    Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    PythonWidget("pycomposeui.test", "mybox") {
                        Text(Greeting().greet())
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    App()
}