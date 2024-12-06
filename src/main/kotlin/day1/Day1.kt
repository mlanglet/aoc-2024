package com.mathiaslanglet.day1

import java.nio.file.Path
import kotlin.io.path.readLines
import kotlin.math.abs

fun main() {
    val leftNumbers = mutableListOf<Int>()
    val rightNumbers = mutableListOf<Int>()
    Path.of("input/day1/day1.txt").readLines().map { line ->
        val numbers = line.split("\\s+".toRegex()).map { it.toInt() }
        leftNumbers.add(numbers.first().toInt())
        rightNumbers.add(numbers.last().toInt())
    }

    leftNumbers.sort()
    rightNumbers.sort()

    var score = 0
    for (i in 0..leftNumbers.lastIndex) {
        score += rightNumbers.count { it == leftNumbers[i] } * leftNumbers[i]
    }

    println(score)
}