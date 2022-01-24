package com.example.kotlin_basic.kotlin_note

// 07. 제어 흐름

// when
// when은 ()안에 조건이 true 또는 false 이어야 한다

fun main(args: Array<String>) {

    val value: Int = 36

    when (value) {
        1 -> {
            println("value is 1")
        }
        2 -> {
            println("value is 2")
        }
        3 -> {
            println("value is 3")
        }
        else -> {
            println("I do not know value")
        }
    }

    // kotlin은 간단한 구문일경우 중괄호 생략 가능
    when (value) {
        1 -> println("value is 1")
        2 -> println("value is 2")
        3 -> println("value is 3")
        else -> println("I do not know value")
    }

    // 값을 return하는 when 사용법
    val value2 = when (value) {
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100
    }
    println(value2)


    // Practice

    val val1: Int? = null

    when (val1) {
        null -> println("value is null")
        else -> println("value is not null")
    }

    val val2: Boolean? = null
    // when 구문은 조건으로 갖는 값의 모든 경우에 대응 해줘야 한다
    when (val2) {
        true -> println("")
        false -> println("")
        null -> println("")
    }

    // 값을 return 하는 when 구문의 경우 반듯이 값을 리턴해야 한다
    val val3 = when (val2) {
        true -> 1
        false -> 3
        null -> 10 // 또는 else -> 10
    }

    val val4: Int = 10

    when (val4) {
        is Int -> { // is 는 타입을 물을 수 있는 연산자이다. true 와 false 를 반환한다
            println("val4 is Int")
        }
        else -> {
            println("val4 is not Int")
        }
    }

    //when 의 다양한 조선식
    val val5: Int = 87
    when (val5) {
        in 60..70 -> { // val5 가 60과 70 사이에 있다면 이라는 뜻
            println("val5 is in 60-70")
        }
        in 70..80 -> {
            println("val5 is in 70-80")
        }
        in 80..90 -> { // val5 가 80 이라면 위에먼저 나온 코드인 70..80에 출력된다 (자세한 내용은 반복문에서..)
            println("val5 is in 80-90")
        }
    }
}