package com.kotlin_basics.learning

class PracticeBasicsV {

    var anotherValue = 10
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    companion object {
        var num = 11
        fun product(a: Int, b: Int): Int {
            return a * b
        }
    }
}

fun main() {
    val pb = PracticeBasicsV()
    pb.add(1,2)

    val product = PracticeBasicsV.product(3, 4)
    println("Product is : $product")
}