package com.kotlin_basics.learning

class PracticeBasicsI {
    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello worlds !")

            val (a, b) = Pair("A", true)
            println("$a $b")

            val name = Pair("Dhiraj", 26)
            val nested = Pair("Dhiraj", Pair("Age", 26))
            println("Name: ${name.first} Age: ${name.second}")

            val triple = Triple("A", "B", "C")
            val nestedTriple = Triple("A", Triple(1, 2, 3), "C")

            println("${triple.first} ${triple.second} ${triple.third}")

        }
    }
}