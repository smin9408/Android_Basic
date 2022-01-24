package com.example.kotlin_basic.kotlin_note

// 06. 제어 흐름
// - if, else
fun main(args: Array<String>) {
    val a: Int = 5
    val b: Int = 10

    // if / else 사용하는 방법(1)
    if (a > b) {
        println("a가 b보다 크다")
    } else {
        println("a가 b보다 작다")
    }
    println("3번")

    // if / else 사용하는 방법(2)
    if (a > b) {
        println("a가 b보다 크다")
    }//else 사용 안하기

    // if / else / else if 사용하기
    if (a > b) {
        println("a가 b보다 크다")
    } else if (a < b) {
        println("a가 b보다 작다")
    } else {
        println("a와 b가 같다")
    }

    // 값을 return 하는 if 사용법 (1)
    val max = if(a > b) {
        a
    } else {
        b
    }
    println(max)

    // 값을 return 하는 if 사용법 (2)
    val max2 = if(a < b) a else b
    println("max2 = " + max2)

    // 엘비스 연산자
    val number1 : Int? = null
    val number2 = number1 ?: 10 // number1 이 null인 경우에는 10이 들어간다 null이 아닌 경우에 number1이 들어간다
    println(number2)
}