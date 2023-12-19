package com.example.demoapplication

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CatViewModel @Inject constructor(
    private val viewModelItem: ViewModelItem,
    private val viewModelSharedItem: ViewModelSharedItem
) : ViewModel(){
    fun getItemInstance(): ViewModelItem {
        return viewModelItem
    }

    fun getSharedItemInstance(): ViewModelSharedItem{
        return viewModelSharedItem
    }
}