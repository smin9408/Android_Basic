package com.example.kotlin_basic.kotlin_note

// 02. 자료형
// 정수형 -> Long > Int > Short > Byte
// 실수형 -> Double > Float
// 문자 -> Char
// 문자열 -> String
// 논리형(참 True / 거짓 False) -> Boolean

// 변수 선언하는 방법(1)
// var/val 변수명 = 값
var number = 10

// 변수 선언하는 방법(2)
// var/val 변수명 : 자료형 = 값
// kotlin에서 변수를 선언할 때 자료형을 직접 선언하지 않으면 값에대한 자료형을 자동적으로 선택해줌
var number2 : Int = 1004
var number3 : Double = 3015.4
var number4 : Float = 3015.4f
/*
    Q.
    - Double 실수형은 무조건 . 이 들어가야 하나?? 정수도 실수에 포함되는데?? 수학적인 부분과 차이가 있나봄
    - Float는 어떻게 쓸 수 있지?? 3.215 이렇게 작은 수를 해도 에러가 난다.
    A.
    - 그렇다. 컴퓨터과학과 수학은 다르니 소수점을 무조건 쓰자...
    - Float를 쓰려면 실수뒤에 f를 명시해주자 ex) 0.15f
 */

var a = "1"
var b = a.toInt()
var c = a.toFloat()

var d = "SeungMin"
var e = "My name is $d Nice to meet you"


// Null
// kotlin은 Null Safety 언어
// Null - 존재 하지 않는다
// var abc : Int = null (X) null을 사용하려면 자료형 뒤에 ?를 넣어줘야함
var abc : Int? = null



fun main(args:Array<String>){
    number = 20
//  number = 20.5 (X) number는 자료형이 정수형이기 때문에 실수를 넣을 수 없음
    println(number)

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(abc) //출력 했을때 나오는 null은 문자열이 아님
}