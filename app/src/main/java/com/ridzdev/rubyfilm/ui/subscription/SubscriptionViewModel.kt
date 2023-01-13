package com.ridzdev.rubyfilm.ui.subscription

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SubscriptionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is subscription Fragment"
    }
    val text: LiveData<String> = _text
}