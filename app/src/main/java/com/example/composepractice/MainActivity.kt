package com.example.composepractice

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composepractice.ui.theme.ComposePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                        ComposedImage(text1 = getString(R.string.text1) , text2 = getString(R.string.text2), text3 = getString(R.string.text3), modifier = Modifier)
                        ComposedText(
                            text1 = getString(R.string.text1),
                            text2 = getString(R.string.text2),
                            text3 = getString(R.string.text3),
                            modifier = Modifier
                        )



                }
            }
        }
    }
}
@SuppressLint("SuspiciousIndentation")
@Composable
fun ComposedImage(text1: String,text2: String, text3: String, modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.bg_compose_background)

    Box (
        modifier = modifier.fillMaxSize(1f)
    ){
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop


        )
    }
}

@Composable
fun ComposedText(text1: String,text2: String,text3: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Bottom,
        modifier = modifier.padding(8.dp)


    ){
        Text(
            text = text1,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)

        )
        Text(
            text = text2,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)

        )
        Text(
            text = text3,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)

        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposePracticeTheme {
        ComposedImage(stringResource(id = R.string.text1) , stringResource(id = R.string.text2), stringResource(id = R.string.text3), modifier = Modifier)
    }
}