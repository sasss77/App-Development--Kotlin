package com.example.delz

fun main() {

    // array in kotlin
    val arr = arrayOf("Saugat" , "Ram", "Shyam")
    //    for loop
        for (i in arr) {
            print(i + "   ")

    }
    println()
    // Arraylist in kotlin
    val arrlst = ArrayList <Any> ()
    arrlst.add(10)
    arrlst.add(120)
    arrlst.add("Sauagt")
    arrlst.add(11)
    for (i in arrlst) {
        print(i)
        print("  ")
    }
    for (i in 1 .. 10){
        print(i)
        print("   ")

    }
}