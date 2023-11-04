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
import com.honya.domain.usecase.CountOne
import com.honya.domain.usecase.CountOneHundred
import com.honya.domain.usecase.CountTen

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
            Button(onClick = {counter+=CountOne().invoke()}){
                Text(text = "+1")
            }
            Button(onClick = {counter+=CountTen().invoke()}){
                Text(text = "+10")
            }
            Button(onClick = {counter+=CountOneHundred().invoke()}){
                Text(text = "+100")
            }
        }
    }
}