package com.example.demoapplication

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DemoActivity : ComponentActivity() {
    private val catViewModel: CatViewModel by viewModels()

    private val dogViewModel: DogViewModel by viewModels()

    companion object {
        fun callingIntent(context: Context): Intent {
            return Intent(context, DemoActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                AnimalButton(catViewModel.getFood().showInstance(), "Cat's Food")
                AnimalButton(dogViewModel.getFood().showInstance(), "Dog's Food")
                AnimalButton(catViewModel.getSharedFood().showInstance(), "Cat's SharedFood")
                AnimalButton(dogViewModel.getSharedFood().showInstance(), "Dog's SharedFood")
            }
        }
    }

    @Composable
    fun AnimalButton(instance: String, text: String) {
        var instanceText by remember { mutableStateOf("")}
        Column {
            Button(modifier = Modifier.fillMaxWidth(), onClick = { instanceText = instance }) {
                Text(text = text)
            }
            Text(text = instanceText, modifier = Modifier.fillMaxWidth())
        }
    }


    @Composable
    fun MyButton(item: Item, text: String) {
        var instanceText by remember { mutableStateOf("")}
        Column {
            Button(modifier = Modifier.fillMaxWidth(), onClick = { instanceText = item.showInstance() }) {
                Text(text = text)
            }
            Text(text = instanceText, modifier = Modifier.fillMaxWidth())
        }
    }
}
