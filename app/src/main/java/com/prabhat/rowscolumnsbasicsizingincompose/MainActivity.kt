package com.prabhat.rowscolumnsbasicsizingincompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.prabhat.rowscolumnsbasicsizingincompose.ui.theme.RowsColumnsBasicSizinginComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

           /* Column(
                modifier = Modifier.fillMaxSize()
                    .background(Color.Green)
            , horizontalAlignment = Alignment.CenterHorizontally
            , verticalArrangement = Arrangement.SpaceAround
            ) */
            Row(
                modifier = /*Modifier.fillMaxSize()*/
                Modifier.width(200.dp)
                    .height(300.dp)
                    .background(Color.Green)
                , horizontalArrangement = Arrangement.SpaceAround
                , verticalAlignment = Alignment.CenterVertically
            )
            {
                Text(text = "Hello")
                Text(text = "world")
            }

        }
    }
}

/*
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RowsColumnsBasicSizinginComposeTheme {
        Greeting("Android")
    }
}*/
