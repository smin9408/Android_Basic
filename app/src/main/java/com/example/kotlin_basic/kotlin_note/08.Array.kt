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

    
}