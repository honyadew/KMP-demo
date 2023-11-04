package com.honya.kmp_demo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StartPoint(){
    var counter by remember { mutableStateOf(0) }
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        CircularProgressIndicator(modifier = Modifier.size(64.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(text = "counter = $counter")
        }
        Row {
            Button(onClick = {counter+=1}){
                Text(text = "+1")
            }
            Button(onClick = {counter+=10}){
                Text(text = "+10")
            }
            Button(onClick = {counter+=100}){
                Text(text = "+100")
            }
        }
    }
}