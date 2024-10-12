package com.dicoding.exam.optionalexam1

// TODO
fun sumOfBigThree(vararg numbers: Int): Int {
    val sortedDescending = numbers.sortedDescending()
    var result = 0
    for ((index, value) in sortedDescending.withIndex()) {
        if (index == 3) {
            break
        }
        result += value
    }
    return result
}