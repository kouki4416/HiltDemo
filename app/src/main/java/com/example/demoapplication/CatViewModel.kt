package com.example.demoapplication

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CatViewModel @Inject constructor(
    private val food: Food,
    private val sharedFood: SharedFood
) : ViewModel(){
    fun getFood(): Item {
        return food
    }

    fun getSharedFood(): Item{
        return sharedFood
    }
}