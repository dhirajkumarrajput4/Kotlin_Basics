package com.kotlin_basics.learning2

//Collections

class NewClass {

    companion object {

        @JvmStatic
        fun main(arg: Array<String>) {
//            '?' allowed to assign null value
            var str: String? = null
//            str ="Rohit"

//            '!!' symbol make sure to compiler value is not null
            println("length of name " + str!!.length)


            var name: String? = null

            //block will be execute when name is not null
            // null safe
            name?.let {
                println("The length of name is : " + it.length)
                println("The name is : $it")
            }


            //block will be execute when name is not null
            //also null safe
            val names = name?.run {
                println("The length of name is : " + this.length)
                println("The name is : $name")
                name
            }
        }
        }
    }


