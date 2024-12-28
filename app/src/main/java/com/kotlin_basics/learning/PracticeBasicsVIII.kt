package com.kotlin_basics.learning

fun main() {

    println("Square is : " + Square(12))

    println("Square using lambda " + square(13))

    highOrder(print)
}

// It is lambda expression

var square: (Int) -> Int = { x -> x * x }

var square1 = { x: Int -> x * x }

var print: (String) -> Unit = { str -> println("This is the value: $str") }

var printAnother = { str: String -> println("This is the value: $str") }

fun Square(a: Int): Int {
    return a * a
}

//high order function

fun highOrder(func: (String) -> Unit) {
    func("Dhiraj Kumar")
}