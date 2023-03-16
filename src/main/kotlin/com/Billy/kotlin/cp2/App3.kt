package com.Billy.kotlin.cp2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var openQuote = true

    while (scanner.hasNextLine()) {
        val line = scanner.nextLine()
        var result = ""
        for (c in line) {
            if (c == '"') {
                result += if (openQuote) "``" else "''"
                openQuote = !openQuote

            } else {
                result += c
            }
        }
        println(result)
        }
}

