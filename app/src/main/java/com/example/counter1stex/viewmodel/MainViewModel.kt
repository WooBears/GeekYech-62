package com.example.counter1stex.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.counter1stex.model.Counter

class MainViewModel : ViewModel() {

    private val counterLiveData = MutableLiveData<Int>()
    private val counter = Counter()

    fun inc(){
        counterLiveData.value = counter.inc()
    }

    fun dec(){
        counterLiveData.value = counter.dec()
    }

    fun getCounterLiveData() = counterLiveData
}