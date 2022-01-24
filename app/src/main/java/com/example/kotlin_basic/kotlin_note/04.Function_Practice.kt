package com.example.kotlin_basic.kotlin_note

// 함수 축약 가능
fun plusThree(first: Int, second: Int, third: Int): Int {
    return first + second + third
}

fun minusThree(first: Int, second: Int, third: Int) = first - second - third

fun multiplyThree(first: Int = 1, second: Int = 1, third: Int = 1): Int {
    return (first * second * third)
}

// 내부함수
fun show(first: Int, second: Int): Int {
    println(first)
    println(second)

    fun plus(first1: Int, second1: Int): Int {
        return first1 + second1
    }
    return plus(first, second)
}

fun main(args: Array<String>) {
    val result1 = plusThree(1, 2, 3)
    println(result1)

    val result2 = minusThree(100, 50, 28)
    println(result2)

    val result3 = multiplyThree(13, 5, 2)
    println(result3)

    val result4 = multiplyThree()
    println(result4)

    val result5 = show(7,8)
    println(result5)

}