package com.kotlin_basics.learning

class PracticeBasicsII {

    var someInt: Int = 10;

    fun add(a: Int, b: Int): Int {
        return a + b;
    }
}

fun main() {
    val pb = PracticeBasicsII()
    println("Fetch value of SomeInt: ${pb.someInt}")
    println("Sum is : ${pb.add(2,3)}")
}