package com.ridzdev.rubyfilm.ui.favourite

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FavouriteViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is favourite Fragment"
    }
    val text: LiveData<String> = _text
}