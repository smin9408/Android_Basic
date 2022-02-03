package com.example.kotlin_basic.kotlin_note

// 변수의 접근 범위
// 1.전역 변수
// 2.지역 변수

// 접근 범위는 가능한 작은범위에서 선언한다

var number100: Int = 10

fun main(args: Array<String>) {

    val test = Test("승민")
    test.name
    println(test.name)
    println(number100)

    test.testFun()
    println(test.name)
    println(number100)
}

class Test(var name: String) {
    fun testFun() {
        name = "홍길동"
        number100 = 100
    }
}
