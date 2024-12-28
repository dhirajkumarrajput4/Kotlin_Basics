package com.kotlin_basics.learning2

//Collections

class MyClass {

    companion object {

        @JvmStatic
        fun main(arg: Array<String>) {
            println("Jai Shree Ram")

            //List
            val listOf = listOf("Ram", "Shyam", "Hanuman")
            val listOf1 = listOf<String>("Ram", "Shyam", "Hanuman")
            val anyTypeList = listOf("Ram", 1, "Hanuman")
            val anyTypeList1 = listOf<Any>("Ram", 1, "Hanuman")
            println(listOf)


            val mutableListOf = mutableListOf("Ram", "Mohan", "Shyam", "Marooti")
            mutableListOf.add("Radhe")

            println(mutableListOf)

//  ==========================================>>>>>>>>>>>>>>>>>>>>>>>


//Map

            //immutable map
            val mapOf = mapOf(1 to "mohan", 2 to "Sohan", 3 to "ramesh")

            val mapOf1 = mapOf(1 to "mohan", 2 to "Sohan", "Sonam" to "ramesh", "check" to true)

            println("This is map value: $mapOf")

            val mutableMapOf = mutableMapOf<Int, String>()

            mutableMapOf.putAll(mapOf);

            println(mutableMapOf)

//            ========================================================================


            //ArrayList

            val arrayList = ArrayList<String>()
            arrayList.add("Mohan")
            arrayList.add("Murari")
            arrayList.add("Rohit")

            println(arrayList)


//            =======================================================================


            //
        }
    }
}

