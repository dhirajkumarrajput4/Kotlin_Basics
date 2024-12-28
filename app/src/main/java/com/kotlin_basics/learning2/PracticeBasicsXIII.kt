package com.kotlin_basics.learning2

fun main() {
    val number: Int?
    number = 5

    val testClass = TestClass()
    val add = testClass.Add(number, 5)
    println(add)


}

class TestClass {

    fun Add(a: Int, b: Int): Int {
        return a + b
    }
}