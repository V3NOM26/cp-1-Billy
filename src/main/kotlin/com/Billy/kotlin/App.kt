/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.Billy.kotlin

fun isPrime(x: Int, i: Int = 2): Boolean {
    if (x < 2)
        return false
    if (i * i > x)
        return true
    if (x % i == 0)
        return false
    return isPrime(x, i + 1)
}


fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val x = readLine()!!.toInt()
        val result = if (isPrime(x)) "Prime Number" else "Not Prime Number"
        println("Case #${it+1}: $result")
        }
}

