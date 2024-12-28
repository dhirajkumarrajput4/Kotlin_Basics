package com.kotlin_basics.learning2


//Scope functions
fun main() {

    var user = User().apply {
        name = "John"
        age = 35
        mobile = "9759642664"
    }

    val age = with(user) {
        println("The name of the user is : $name")
        age
    }
    println("Age of user is: $age")

    user.also {
        it.name = "Mohan";
        println("Name of user has been changed !")
    }

    println("Now user name is : ${user.name}")


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


class User {
    var name = ""
    var age = 30
    var mobile = ""
}