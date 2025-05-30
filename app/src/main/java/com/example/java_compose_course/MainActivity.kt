package com.example.java_compose_course

import android.icu.text.CaseMap.Title
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.BrushPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.java_compose_course.instragram_ui.ProfileScreen
import com.example.java_compose_course.ui.theme.Java_compose_courseTheme
import kotlinx.coroutines.internal.OpDescriptor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            ProfileScreen()
//            Java_compose_courseTheme {
//              Column (modifier = Modifier
////                  .fillMaxSize(0.7f)
////                  .width(200.dp)
//                  .fillMaxWidth()
////                  .height(100.dp)
//                  .padding(20.dp)
//                  .border(1.dp, Color.Gray)
//                  .background(Color.LightGray),
//                  horizontalAlignment = Alignment.CenterHorizontally,
//                  verticalArrangement = Arrangement.SpaceAround
//              ){
//                  Text(text = "Hello Kon Papa", modifier = Modifier.clickable {
//
//                  })
//                  Spacer(modifier = Modifier.height(14.dp))
//                  Text(text = "Hello Kon Kon Bek Tnam")
//              }
//
//            }


//            var painter = painterResource(id = R.drawable.image)
//            var descriptor = "Hello Kon Papa"
//            var title = "wo ehehe"
//            val context = LocalContext.current
//
//            Box(modifier = Modifier
//                .fillMaxWidth()
//                .background(Color.LightGray)
//            ){
//                Box(
//                    modifier = Modifier
//                        .fillMaxWidth(0.5f)
//                        .padding(16.dp)
//                        .background(Color.LightGray)
//                        .clickable {
//                            Toast.makeText(context, "Card Clicked!", Toast.LENGTH_SHORT).show()
//                        }
//                ){
//                    ImageCard(painter = painter, contentDescriptor = descriptor, title = title)
//                }
//            }


        }
    }
}

@Composable
fun  ImageCard(
    painter: Painter,
    contentDescriptor: String,
    title: String,
    modifier: Modifier= Modifier
){
    Card (
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),

    ){
        Box(modifier = Modifier.height(200.dp)){
            Image(
                painter = painter,
                contentDescription = contentDescriptor,
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ){
                Column {
                    Text(title, style = TextStyle(color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold))
                    Text(contentDescriptor, style = TextStyle(color = Color.White, fontSize = 12.sp))
                }

            }
        }

    }

}