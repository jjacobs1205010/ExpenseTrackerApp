package com.example.myapplication

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun ExpenseApp(modifier: Modifier = Modifier) {
    Text(
        text = "Do you wish to add an expense.",
        modifier = modifier .padding(16 .dp)
    )
}

@Composable
fun ExpenseCounter(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        var count = 0
        Text("Do you wish to add an expense.")
        Button(onClick = { count++ }, Modifier .padding(top = 8.dp)) {
        Text("Add expense")
    }
}
}

@SuppressLint("UnrememberedMutableState")
@Composable
fun ExpenseCount(modifier: Modifier = Modifier) {
    Column (modifier = modifier.padding(16.dp)) {
        val count: MutableState<Int> = mutableStateOf(0)
        Text("You have ${count.value} expense.")
        Button(onClick = { count.value++}, Modifier.padding(top = 8.dp)){
            Text("Add expense")
        }
    }
    }

@SuppressLint("UnrememberedMutableState")
@Composable
fun ExpenseButton(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        val count: MutableState<Int> = mutableStateOf(0)
        Text("You have added your expense.")

        Button(onClick = { count.value++ }, Modifier.padding(top = 8.dp)) {
            Text("Add expense")
        }
    }
}
@Composable
fun ExpenseRemember(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        var count by remember { mutableStateOf(0) }
        if (count > 0) {
            Text("You have added your expense.")
        }
        Button(onClick = { count++ }, Modifier.padding(8.dp)) {
            Text("Add expense")
        }
    }
}
@Composable
fun ExpenseAdd(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        var count by rememberSaveable { mutableStateOf(0) }
        if (count > 0) {
            Text("You have added your expense.")
        }
        Button(onClick = { count++ }, Modifier.padding(8.dp)) {
            Text("Add expense")
        }
    }
}

@Composable
fun StatelessCounter(count: Int, onIncrement: () -> Unit, modifier: Any = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        if (count > 0) {
            Text("Your Expenses.")
        }
        Button(onClick = onIncrement, Modifier.padding(top = 8.dp)) {
            Text("Add expense")
        }
    }
}


@Composable
fun StatefulCounter(modifier: Modifier = Modifier) {
    var count by rememberSaveable { mutableStateOf(0) }
    StatelessCounter(count,{ count++ }, modifier)
}





