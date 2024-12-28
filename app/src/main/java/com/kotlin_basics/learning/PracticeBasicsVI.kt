package com.kotlin_basics.learning

// you need to open class by using open keyword for extending
open class PracticeBasicsVI {
    var name = "John"

    fun Add(a: Int, b: Int): Int {
        return a + b;
    }
}

// extend class by using ' : ' operator
class ClassB : PracticeBasicsVI(), InterfaceA {

    override fun addTwoNumbers(a: Int, b: Int): Int {
        return a * b
    }

    override fun addThreeNumbers(a: Int, b: Int, c: Int): Int {
        return a * b * c
    }

}


interface InterfaceA {

    fun addTwoNumbers(a: Int, b: Int): Int

    fun addThreeNumbers(a: Int, b: Int, c: Int): Int
}


fun main() {
    val classB = ClassB()
    val name = classB.name
    println("Name is: $name")
    println("Add method call get sum: ${classB.Add(2, 3)}")
}