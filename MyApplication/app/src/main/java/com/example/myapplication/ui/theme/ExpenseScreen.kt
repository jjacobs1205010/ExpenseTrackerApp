package com.example.myapplication.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import com.example.myapplication.ExpenseApp
import androidx.compose.foundation.layout.Column

@Composable
fun ExpenseScreen(modifier: Modifier = Modifier) {
    ExpenseApp(modifier)
}


@Composable
fun Expenses(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        StatefulCounter()
        WellnessTasksList()
    }
}
@Composable
fun ExpenseScreening (modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        StatefulCounter()

        val list = remember { ExpenseTasks().toMutableStateList() }
        ExpenseList(list = list, onCloseTask = { task -> list.remove(task) })
    }
}

private fun ExpenseTasks() = List(5) { i -> com.example.myapplication.ui.theme.ExpenseTasks()Task(i, "Task # $i") }