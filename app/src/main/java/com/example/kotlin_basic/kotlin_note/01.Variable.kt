package com.example.kotlin_basic.kotlin_note

// 01. Variable 변수
// 내 마음대로 값을 바꿀수 있는 것 -> Variable -> var
// 한번 정하면 바꿀수 없는 것     -> Value -> val (이게 상수인듯)

// 변수 선언 방법
// var/val (변수명) = 값

var num = 10
var hello = "hello"
var point = 167.7

val fix = 29


fun main(args:Array<String>){
    num = 20
    hello = "bye"
//  fix = 50  (X) val로 선언된 변수는 바꿀 수 없음

    println(num)
    println(hello)
    println(point)
    println(fix)
}