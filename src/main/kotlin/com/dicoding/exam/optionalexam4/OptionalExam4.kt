package com.dicoding.exam.optionalexam4

// TODO
fun getMiddleCharacters(string: String): String {
    val arr = string.toCharArray()
    val middle = arr.size / 2

    return if (arr.size == 1) {
        arr[0].toString()
    } else if (arr.size % 2 == 0) {
        "${arr[middle - 1]}${arr[middle]}"
    } else {
        arr[middle].toString()
    }
}