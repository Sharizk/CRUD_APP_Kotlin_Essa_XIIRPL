package com.example.crud_app_essa_xiirpl.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SettingViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is setting Fragment"
    }
    val text: LiveData<String> = _text
}