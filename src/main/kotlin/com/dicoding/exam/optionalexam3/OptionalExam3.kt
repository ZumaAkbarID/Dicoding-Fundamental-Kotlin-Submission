package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    val filterString = str.filter { !it.isDigit() }
    val filterNumber = str.filter { it.isDigit() }
    val number: Int = if(filterNumber.isEmpty()) 1 else filterNumber.toInt()
    return filterString + (number * int)
}
