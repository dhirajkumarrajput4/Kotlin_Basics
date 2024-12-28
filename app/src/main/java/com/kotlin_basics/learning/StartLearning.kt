package com.kotlin_basics.learning


class StartLearning {

    companion object {
        @JvmStatic
        fun main(arg: Array<String>) {

            // definition of variable -- Integer
            var a: Int = 8

            // -- String
            var name: String = "Rahul"

            //  Define a final variable -- it can't change from anywhere.
            val b = 12;

            println("Jai Shree Ram ! $name ")

            // add function
            println("Sum is : ${add(a, b)}")
            getResult(12, 12)
        }

        // create a function or method
        //where, a: Int -- Integer Type, b: Int -- Integer type vale
        // In the last 'Int' a return type of method add();
        fun add(a: Int, b: Int): Int {
            return a + b;
        }

        fun getResult(a: Int, b: Int) {

            // Instead of switch there are when block
            //
            //
            when {
                (a > b) -> {
                    println("a is greater then b.");
                }

                (a < b) -> {
                    println("a is less then b")
                }

                (a == b) -> {
                    println("Both are equals")
                }

            }
        }
    }
}