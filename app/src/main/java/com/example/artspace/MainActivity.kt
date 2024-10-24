package com.example.artspace

import android.os.Bundle
import android.provider.MediaStore.Images.Media
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceTheme {
               Surface {  }
            }
        }
    }
}

@Composable
fun ArtSpaceArea(modifier: Modifier) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
//            .background(Color(139, 92, 246))
    ) {
        Column (
            modifier = Modifier.padding(start = 24.dp, end = 24.dp, top = 96.dp),
            horizontalAlignment =Alignment.CenterHorizontally
        ) {
            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp
                )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.art),
                    contentDescription = "Art picture",
                    modifier = Modifier.fillMaxWidth()
                        .padding(24.dp),
                    contentScale = ContentScale.Crop
                )
            }
            Column (
                modifier = Modifier
                    .padding(top = 50.dp)
                    .fillMaxWidth()
                    .background(Color(229, 231, 235))
            ) {
                Text(
                    text = "Noice of Void",
                    modifier = Modifier.padding(start = 12.dp, top = 12.dp),
                    fontSize = 32.sp
                )
                Row(
                    modifier = Modifier.padding(start = 12.dp, top = 4.dp, bottom = 12.dp)
                ) {
                    Text(
                        text = "Davinci Leonard",
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "(2024)",
                        modifier = Modifier.padding(start = 8.dp),
                        fontWeight = FontWeight.Light
                    )
                }
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
                    .padding(top = 50.dp)
            ) {
                Button(
                    onClick = {},
                    modifier = Modifier.width(120.dp)
                ) {
                    Text("Previous")
                }
                Button(
                    onClick = {},
                    modifier = Modifier.width(120.dp)
                ) {
                    Text("Next")
                }
            }
            Box(
                modifier = Modifier.padding(top = 32.dp)
            ) {
                Text(
                    text = "Dibuat oleh Ramadhan Yoga (225411083)",
                    color = Color(55, 48, 163)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ArtSpacePreview() {
    ArtSpaceTheme {
        ArtSpaceArea(Modifier)
    }
}