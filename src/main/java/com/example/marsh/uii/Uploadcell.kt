package com.example.marsh.uii

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.*
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.style.TextAlign
import coil.compose.rememberAsyncImagePainter

class Uploadcell {
    @Preview
    @Composable
    private fun UploadCellPreview() {
        Uploadcell()
    }

    @Composable
    fun Uploadcell() {
        Column(
            modifier = Modifier
                .padding(20.dp)
        ) {
            Row() {
                Text(
                    text = "Upload Image",
                    Modifier.weight(1f, fill = true),
                    style = MaterialTheme.typography.body2,
                    textAlign = TextAlign.Center
                )
            }
        }
    }

    private fun mToast(context: Context) {
        Toast.makeText(context, "This is a Sample Toast", Toast.LENGTH_LONG).show()
    }

    @Composable
    fun SomeContent() {
        val mContext = LocalContext.current
    }

    @Composable
    fun UploadButton(
        modifier: Modifier = Modifier
    ) {
        val mContext = LocalContext.current
        Button(
            modifier = modifier
                .fillMaxWidth(),
            onClick = {
                mToast(mContext)
            }
        ) {
            Text(
                text = "upload?"
            )
        }
    }

    @Composable
    fun MarshScreen(
        modifier: Modifier = Modifier
    ) {
        Column(
            modifier = modifier
        ) {
            Uploadcell()
            UploadButton()
            imageFromURL()

        }
    }

    @Composable
    fun imageFromURL() {
        // on below line we are creating a column,
        Column(
            // in this column we are adding modifier
            // to fill max size, mz height and max width
            modifier = Modifier
                .fillMaxSize()
                .fillMaxHeight()
                .fillMaxWidth()
                // on below line we are adding
                // padding from all sides.
                .padding(10.dp),
            // on below line we are adding vertical
            // and horizontal arrangement.
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // on below line we are adding image for our image view.
            Image(
                // on below line we are adding the image url
                // from which we will  be loading our image.
                painter = rememberAsyncImagePainter("https://media.geeksforgeeks.org/wp-content/uploads/20210101144014/gfglogo.png"),

                // on below line we are adding content
                // description for our image.
                contentDescription = "gfg image",

                // on below line we are adding modifier for our
                // image as wrap content for height and width.
                modifier = Modifier
                    .wrapContentSize()
                    .wrapContentHeight()
                    .wrapContentWidth()
            )
        }


    }
}