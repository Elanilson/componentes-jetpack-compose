package com.apkdoandroid.componentesjetpackcompose

import android.app.Activity
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun myBox(){
    var context = LocalContext.current as Activity
    Box(
        modifier = Modifier
            .background(Color.Yellow)
            .clickable { }
            .padding(10.dp)
    ) {
        Box(
            modifier = Modifier
                .width(80.dp)
                .height(80.dp)
                .background(Color.White)
                .clickable { toast(texto = "Click", context) }

        )
        Box(modifier = Modifier
            .background(Color.Cyan)
            .width(80.dp)
            .height(80.dp)
            .align(Alignment.TopCenter)
            .border(
                width = 10.dp,
                color = Color.White,
                shape = CircleShape
            )

        )
        Box(modifier = Modifier
            .background(Color.Cyan)
            .width(80.dp)
            .height(80.dp)
            .align(Alignment.BottomCenter)
            .border(10.dp, Color.Red, shape = RectangleShape),
            contentAlignment = Alignment.Center


        ){
            Text(text = "oi")
        }


    }
}

fun toast(texto : String, context : Context){
    Toast.makeText(context,texto,Toast.LENGTH_SHORT).show()
    
}