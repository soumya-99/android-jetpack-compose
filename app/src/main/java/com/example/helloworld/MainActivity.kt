package com.example.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
//                    BoxView()
//                    ColView()
//                    LazyScrollableRow()
//                    LazyScrollableCol()
//                    DisplayNames()
                    PlayWithFonts()
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
            .horizontalScroll(rememberScrollState())
            .padding(10.dp),
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

@Composable
fun ColView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.secondary)
            .verticalScroll(rememberScrollState())
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "First Item", color = MaterialTheme.colorScheme.onSecondary, fontSize = 30.sp)
        for (i in 0..50) {
            Text(text = "Item $i", color = MaterialTheme.colorScheme.onSecondary, fontSize = 30.sp)
        }
        Text(text = "First Item", color = MaterialTheme.colorScheme.onSecondary, fontSize = 30.sp)
    }
}

@Composable
fun LazyScrollableRow() {
    LazyRow(
        modifier = Modifier
            .padding(10.dp)
    ) {
        // add single item
        item { Text(text = "This is a string. ", fontSize = 30.sp) }
        // add multiple items
        items(50) { i -> Text(text = "Item no. $i ", fontSize = 30.sp) }
    }
}

@Composable
fun LazyScrollableCol() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // add single item
        item { Text(text = "This is a string. ", fontSize = 30.sp) }
        // add multiple items
        items(50) { i -> Text(text = "Item no. $i ", fontSize = 30.sp) }
    }
}

@Composable
fun DisplayNames() {
    val names = listOf<String>("Soumya", "Sumit", "Soham", "Golu")
    Column {
        for (name in names) {
            Text(text = "Hello $name", fontSize = 30.sp)
        }
    }
}

@Composable
fun PlayWithFonts() {
    Text(
        text = "Hey There!",
        fontSize = 50.sp,
        color = Color.Magenta,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HelloWorldTheme {
//        Greeting("Android")
//        BoxView()
//        ColView()
//        LazyScrollableRow()
//        LazyScrollableCol()
//        DisplayNames()
        PlayWithFonts()
    }
}