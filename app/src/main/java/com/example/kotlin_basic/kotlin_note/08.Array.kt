package com.example.kotlin_basic.kotlin_note

// 08. 배열

// 배열이 필요한 이유
// - 그룹이 필요할 때


fun main(args: Array<String>) {

    // 배열을 생성하는 방법(1)
    var group1 = arrayOf<Int>(1, 2, 3, 4, 5)
    println(group1 is Array) // 배열인지 물어보고 true false를 반환

    // 배열을 생성하는 방법(1)
    var group2 = arrayOf(1, 2, 3.5, "hello")


    // Index 란
    // -> 순서(번째)
    // [1, 2, 3, 4, 5]
    // "0"부터 시작
    // index 0 -> 1, index 1 -> 2

    // 배열의 값을 꺼내는 방법(1)
    val test1 = group1.get(0)
    val test2 = group1.get(4)
    println(test1)
    println(test2)

    // 배열의 값을 꺼내는 방법(2)
    val test3 = group1[0]
    println(test3)

    // 배열의 값을 바꾸는 방법(1)
    group1.set(0, 100)
    println(group1[0])

    // 배열의 값을 바꾸는 방법(2)
    group1[0] = 50
    println(group1[0])


    val array = arrayOf<Int>(1, 2, 3)

    // get, set
    val number = array.get(0)
    println(number)
    //val num1 = array.get(100) //100번째 인덱스가 없으니 오류

    array.set(0, 100)
    val num2 = array.get(0)
    println(num2)

    //array.set(100, 100) //100번째 인덱스가 없으니 오류

    // Array 의 Bounds(범위)
    // 처음 만들 때 결정된다

    // Array 를 만드는 방법(3)
    val a1 = intArrayOf(1, 2, 3) // int 정수형만 가능
    val a2 = charArrayOf('b', 'c') // char -> '' , string -> ""
    val a3 = doubleArrayOf(1.2, 345.1)
    val a4 = booleanArrayOf(true, false, false, true)

    // Array 를 만드는 방법(4)
    // 첫번째 인수는 사이즈를 받고, 두번째 인수는 람다를 이용한 값을 받음
    var a5 = Array(10, { 0 }) // { 0 } 이 부분은 lambda라고 함
    var a6 = Array(5, { 1; 2; 3; 4; 5 }) //lambda는 , 대신 ; 를 사용함


}