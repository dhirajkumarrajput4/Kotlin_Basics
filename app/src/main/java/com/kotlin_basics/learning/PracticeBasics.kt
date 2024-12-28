package com.kotlin_basics.learning

class PracticeBasics {
    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello worlds !")
            var num: Int = 0

            for (i in 0..10) { // 0 to 10  increment by 1
                println("Loop is count value ${num++} value of i: $i")
            }

            for (i in 0 until 10) { // 0 to 9
                println("Loop is count value ${num++} value of i: $i")
            }

            for (i in 10 downTo 0) { // 10 to 0
                println("Loop is count value ${num++} value of i: $i")
            }

            for (i in 0 until 10 step 2) { // 10 to 0 increment by 2 by using step
                println("Loop is count value ${num++} value of i: $i")
            }

            val arrNo = ArrayList<Int>()
            arrNo.add(1)
            arrNo.add(2)
            arrNo.add(3)
            arrNo.add(4)
            arrNo.add(5)
            arrNo.add(6)
            arrNo.add(7)

            for (i in arrNo) {
                println("Iterating list: $i")
            }


        }
    }
}