package com.mathiaslanglet.day2

import java.nio.file.Path
import kotlin.io.path.readLines
import kotlin.math.abs


fun main() {
    println( Path.of("input/day2/day2.txt").readLines().count { line ->
        val reports = line.split(" ").map { it.toInt() }
        val isValidAsc = reports.windowed(2).all {
            val a = it.first()
            val b = it.last()
            a > b && abs(a - b) <= 3
        }
        val isValidAcending = reports.windowed(2).all {
            val a = it.first()
            val b = it.last()
            a < b && abs(a - b) <= 3
        }
        isValidAsc || isValidAcending
    })
}