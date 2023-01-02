package com.example.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.helloworld.ui.theme.HelloWorldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorldTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
//                    Greeting("Android")
                    BoxView()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!", fontSize = 20.sp)
}

@Composable
fun BoxView() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.primary)
            .horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "First Item", color = MaterialTheme.colorScheme.onPrimary, fontSize = 30.sp)
        for (i in 0..50) {
            Text(text = "Item $i", color = MaterialTheme.colorScheme.onPrimary, fontSize = 30.sp)
        }
        Text(text = "First Item", color = MaterialTheme.colorScheme.onPrimary, fontSize = 30.sp)
    }
}

//@Composable
//fun ColView() {
//    Column {
//
//    }
//}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HelloWorldTheme {
//        Greeting("Android")
        BoxView()
    }
}