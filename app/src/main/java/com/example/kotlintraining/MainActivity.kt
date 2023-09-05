package com.example.kotlintraining

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlintraining.ui.theme.KotlinTrainingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinTrainingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }

       // testFunction(1, ::testFuncLambda)
    }

   /* fun testFunction(int : Int, myFunction : () -> Unit) {
        myFunction.invoke()
    }

    fun testFuncLambda() {
        println("hello test")
    }*/
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Column(modifier = modifier.fillMaxSize()
        .background(color = Color.Red),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally) {
        Text(
            text = "Hello $name!",
            modifier = modifier.background(color = Color.Cyan).padding(2.dp).clickable {
                println("Hello")
            }.width(100.dp)
                .height(100.dp) ,
            color = Color.Green ,
            textAlign = TextAlign.Center
        )

        Text(text = "Again",
            modifier = modifier ,
            color = Color.Green)
    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinTrainingTheme {
        Greeting("Android")
    }
}