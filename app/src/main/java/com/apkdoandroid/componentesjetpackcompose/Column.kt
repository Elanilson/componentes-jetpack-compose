package com.apkdoandroid.componentesjetpackcompose

import android.text.Layout
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun column(){
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
            .verticalScroll(rememberScrollState()), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center

    ) {

        Text(text = "Elanilson Dev", modifier = Modifier
            .background(Color.Cyan)
            .size(200.dp),Color.DarkGray,  )

        Text(text = "Elanilson Dev", modifier = Modifier
            .background(Color.Yellow)
            .size(200.dp))
        Text(text = "Elanilson Dev", modifier = Modifier
            .background(Color.Green)
            .height(200.dp)
            .fillMaxWidth())
        Text(text = "Elanilson Dev", modifier = Modifier
            .background(Color.LightGray)
            .size(200.dp))
        Text(text = "Elanilson Dev", modifier = Modifier
            .background(Color.DarkGray)
            .size(200.dp))
        Text(text = "Elanilson Dev", modifier = Modifier
            .background(Color.DarkGray)
            .size(200.dp))

    }
}