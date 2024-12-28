package com.kotlin_basics.learning

// you need to open class by using open keyword for extending
enum class Days(val holiday: Boolean = false) {
    SUNDAY(true),
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}


fun main() {

    for (day in Days.values()) {
        if (day.holiday) {
            println("$day is a holiday !")
        }
    }

    val v = GenClass(12);
    val v1 = GenClass(12.23);
    val v2 = GenClass("12");
    val v3 = GenClass(true);
}


//Generic on Class level
class GenClass<T>(value: T) {
    init {
        println("The value is $value")
        check("Apple")
        check(12)
        check(true)
    }
}

fun <T> check(text: T) {
    println("Recieved value is $text")
}