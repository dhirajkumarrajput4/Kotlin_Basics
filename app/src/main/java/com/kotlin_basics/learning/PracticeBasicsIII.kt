package com.kotlin_basics.learning

class PracticeBasicsIII constructor(num: Int) { // primary constructor

    init {
        println("Called object creation time $num")
    }

    var someInt: Int = 10;

    fun add(a: Int, b: Int): Int {
        return a + b;
    }
}

fun main() {
    val pb = PracticeBasicsIII(10) //called primary constructor
    println("Fetch value of SomeInt: ${pb.someInt}")
    println("Sum is : ${pb.add(2, 3)}")
}