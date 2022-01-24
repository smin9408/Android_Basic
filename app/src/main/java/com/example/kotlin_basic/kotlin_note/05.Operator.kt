package com.example.kotlin_basic.kotlin_note

// 05. 연산자

// 산술 연산자
// +, -, *, /(몫만 취함), %(나머지만 취함)

// 대입 연산자
// 좌변 = 우변 (우변 값이 좌변에 저장)
// a = 5 (O) , 5 = a (X)

// 복합 대입 연산자
// +=, -=, *=, /=, %=
// a += 10 -> a = a + 10 (a에 10을 더한 값을 다시 a에 초기화)

// 증감 연산자
// ++, --
// a++ (a에 1을 증가)

// 비교 연산자
// >, >=, <, <=, ==, !=
// True == True -> True
// True == False -> False
// True != True -> False
// True != False -> True

// 논리 연산자
// &&, ||, !
// True && True -> True
// True || False -> True
// !True -> False
// !False -> True

fun main(args: Array<String>){
    // 산술 연산자
    var a = 10 + 1
    var b = 20 - 1
    var c = 1 * 9
    var d = 20 / 3
    var e = 20 % 3

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println()

    // 대입 연산자
    val f = 5
    // val 5 = f (X)

    //복합 대입 연산자
    a += 10 //a가 val로 선언됬다면 복합대입 연산자 에러남
    b -= 10
    c *= 3
    d /= 2
    e %= 2

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println()

    //비교 연산자
    var g = a > b
    println(g)
    var h = a == b //a와 b가 같은지 비교하고 그 값을 h에 대입
    println(h)
    var i = !h
    println(i)
    println()

    //논리 연산자
    var j = h && i
    var k = h || i
    println(j)
    println(k)
}



