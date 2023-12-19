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
import javax.inject.Inject

@AndroidEntryPoint
class DemoActivity : ComponentActivity() {

    @Inject
    lateinit var activitySharedItem: ActivitySharedItem

    @Inject
    lateinit var activityItem: ActivityItem

    @Inject
    lateinit var singletonSharedItem: SingletonSharedItem

    @Inject
    lateinit var singletonItem: SingletonItem

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
                MyButton(activitySharedItem, "ActivitySharedItem")
                MyButton(activityItem, "ActivityItem")
                MyButton(singletonSharedItem, "SingletonSharedItem")
                MyButton(singletonItem, "SingletonItem")
                MyButton(catViewModel.getItemInstance(), "CatItem")
                MyButton(dogViewModel.getItemInstance(), "DogItem")
                MyButton(catViewModel.getSharedItemInstance(), "CatSharedItem")
                MyButton(dogViewModel.getSharedItemInstance(), "DogSharedItem")
            }
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
