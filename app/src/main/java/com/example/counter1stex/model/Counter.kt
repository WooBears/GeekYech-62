package com.example.counter1stex.model

class Counter {

    private var count = 0

    fun inc() : Int{
        return count++
    }

    fun dec() : Int{
        return count--
    }


}

