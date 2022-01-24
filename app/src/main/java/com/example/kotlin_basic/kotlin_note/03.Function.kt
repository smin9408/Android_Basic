package com.example.kotlin_basic.kotlin_note

// 03. Function 함수
// - 함수란 어떤 inout을 넣어주면 output이 나오는 것

// 함수 선언법
// fun 함수명 (변수명: 타입, 변수명: 타입...) : 반환형{
//     함수 내용
//     return 반환값
// }
fun plus(num1: Int, num2: Int): Int {
    val result: Int = num1 + num2
    return result
}

// - 디폴트 값을 갖는 함수 만들기
//   second 인수는 사용자가 아무것도 입력하지 않았을때 정수형 5를 가진다
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

// - 반환값이 없는 함수 만들기
//   모든 함수가 반환값을 꼭 가져야 하는것은 아니다
//   Unit의 의미 : 아무것도 return 하지 않겠다 (자바의 void 같은 의미일까?)
/*
    Q.
    - Unit 은 자바의 void 같은 의미인가?
    A.
    - 비슷하다고 볼 수 있다. 하지만 Unit이 더 편리한듯
    p.s https://kumgo1d.tistory.com/61
 */
//  Unit은 생략 가능함
//  fun printPlus (first: Int, second: Int){
//      val result : Int = first + second
//      println(result)
//  }
fun printPlus(first: Int, second: Int): Unit {
    val result: Int = first + second
    println(result)
}

// - 가변인자를 갖는 함수 만들기
//   가변인자 vararg 여러개의 인자를 받을 수 있다
fun manyPlus(vararg numbers : Int) {
    for(number in numbers){
        println(number)
    }
}

fun main(args: Array<String>) {
//  함수를 호출하는 방법
    val result = plus(1, 2)
    println(result)
    val result2 = plus(num1 = 20, num2 = 50)
    println(result2)
    val result3 = plus(num2 = 40, num1 = 60) //인수를 명시적으로 넣어줄 수 있다 순서 바꾸기도 가능
    println(result3)
    println()
    val result4 = plusFive(5)
    println(result4)
    println()
    printPlus(10, 20)

    println()
    manyPlus(1,2,3,4,5)
}