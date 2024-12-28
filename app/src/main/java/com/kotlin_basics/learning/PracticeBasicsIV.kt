package com.kotlin_basics.learning

class PracticeBasicsIV { // primary constructor

    constructor(num1: Int, num2: Int) {
        println("Calling custom constructor")
    }

    constructor(num2: Int, num1: Int, num3: Int) {
        println("Calling custom parameterized constructor")
    }

    constructor() {
        //default constructors
    }


    var someInt: Int = 10
    fun add(a: Int, b: Int): Int {
        return a + b;
    }
}

fun main() {
    val pb = PracticeBasicsIV() //called primary constructor
    println("Fetch value of SomeInt: ${pb.someInt}")
    println("Sum is : ${pb.add(2, 3)}")
}