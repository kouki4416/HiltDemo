package com.example.demoapplication

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

class CatViewModel constructor(
    private val food: Food = Food(),
    private val sharedFood: SharedFood = SharedFood()
) : ViewModel(){
    fun getFood(): Item {
        return food
    }

    fun getSharedFood(): Item{
        return sharedFood
    }
}