package com.example.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.helloworld.ui.theme.HelloWorldTheme
import com.example.helloworld.ui.theme.MyFontFamily

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorldTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
//                    BoxView()
//                    ColView()
//                    LazyScrollableRow()
//                    LazyScrollableCol()
//                    DisplayNames()
//                    PlayWithFonts()
//                    ReallyLongText()
//                    SelectableText()
                    BoxModel()
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
        modifier = Modifier.padding(10.dp)
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
        color = MaterialTheme.colorScheme.onPrimary,
//        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold,
//        fontFamily = MyFontFamily,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.primary),
    )
}

@Composable
fun ReallyLongText() {
    Text("Soumyadeep".repeat(20), maxLines = 2)
}

@Composable
fun SelectableText() {
    Column {
        SelectionContainer {
            Column {
                Text(text = "Hey! I'm a selectable text... Hold me to select.", fontSize = 20.sp)
                DisableSelection {
                    Text(
                        text = "Hey! I'm inside disable-selection, which is inside of selection-container text... You can't select me.",
                        fontSize = 20.sp
                    )
                }
            }
        }
        Text(text = "I'm a normal text.", fontSize = 20.sp)
    }
}

@Composable
fun BoxModel() {
    Box(
        modifier = Modifier
            .fillMaxHeight(0.5f)
            .fillMaxWidth(0.5f)
            .background(color = Color.Green)
    ) {
        Text(text = "This is an outer box.")
        Box(
            modifier = Modifier
                .fillMaxHeight(0.5f)
                .fillMaxWidth(0.5f)
                .background(color = Color.Red)
        ) {
            Text(
                text = "This is inner box.",
                color = Color.White,
                modifier = Modifier.align(Alignment.Center),
            )
        }
        Text(
            text = "I'm outside of the inner box.",
            modifier = Modifier.align(Alignment.Center),
        )
    }
}

// silk oreo
// soci haven
// e1 v1
// e2 v2
// 1 -1
// -1 1

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
//        PlayWithFonts()
//        ReallyLongText()
//        SelectableText()
        BoxModel()
    }
}