package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    val mapped = number.toString().map { it.toString().toInt() }
    return mapped.min() + mapped.max()
}
