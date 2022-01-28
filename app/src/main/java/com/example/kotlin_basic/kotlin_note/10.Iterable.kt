package com.example.kotlin_basic.kotlin_note

// 10. Iterable

fun main(args: Array<String>) {

    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // 반복하는 방법 (1)
    // item을 원하는 이름으로 사용가능
    for (item in a) {
        if (item == 5) {
            println("item is Five") //
        } else {
            println("item is not Five")
        }
    }
    println()

    // 반복하는 방법 (2)
    // index, item은 원하는 이름 사용 가능
    for ((index, item) in a.withIndex()) {
        println("index : " + index + " value : " + item)
    }
    println()

    // 반복하는 방법 (3)
    // it을 사용
    a.forEach {
        println(it)
    }
    println()

    // 반복하는 방법 (4)
    a.forEach { tmdals -> // 원하는 이름으로 바꿔서 사용하려면 '->' 이용
        println(tmdals)
    }
    println()

    // 반복하는 방법 (5)
    // index, i는 원하는 이름 사용 가능
    // withIndex() 보다 직관적으로 보임
    a.forEachIndexed { index, i ->
        println("index : " + index + " value : " + i)
    }
    println()

    // 반복하는 방법 (6)
    println(a.size) // 9
    for (i in 0 until a.size) {
        // i는 index, index 0 부터 a의 사이즈까지인데 마지막 포함안하기 ex) 0 < 9, 0 < a.size
        // until은 마지막을 포함하지 않는다
        // 0 부터 8까지
        println(a.get(i))
    }
    println()

    // 반복하는 방법 (7)
    for (i in 0 until a.size step (2)) {
        // 0 부터 a.size 전까지 반복하지만 2만큼 증가하면서 반복
        println(a.get(i))
    }
    println()

    // 반복하는 방법 (8)
    for (i in a.size - 1 downTo (0)) {
        // 8(a.size-1)부터 0까지 내려가면서 반복
        println(a.get(i))
    }
    println()

    // 반복하는 방법 (9)
    for (i in a.size - 1 downTo (0) step (2)) {
        // 8(a.size-1)부터 0까지 내려가면서 반복하지만 2만큼 증가
        println(a.get(i))
    }
    println()

    // 반복하는 방법 (10)
    for (i in 0..a.size) {
        // 0~9 출력
        // .. -> 마지막을 포함한다 until과 다름
        println(i)
    }
    println()

    // 반복하는 방법 (11)
    var b: Int = 0
    var c: Int = 4

    while (b < c) {
        b++ // while 문을 정지시키기 위한 코드
        println("b")
    }
    println()

    // 반복하는 방법 (12)
    var d: Int = 0
    var e: Int = 5
    do {
        println("hello")
        d++ // 무한루프를 깨주는 코드
    } while (d < e) // c < b 조건이 만족하지 못하더라도 do 안의 코드는 반드시 한번 실행된다
}