package com.example.kotlintest

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    val mayval:String="hello";
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun result(){

        for(i in 1..3) {
            println(test1(i, i+1))
        }
    }
    fun test1(a:Int ,b:Int):Int{
        return a+b;
    }
}
