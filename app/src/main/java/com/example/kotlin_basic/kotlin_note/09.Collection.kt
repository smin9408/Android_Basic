package com.example.kotlin_basic.kotlin_note

import android.os.Build
import androidx.annotation.RequiresApi

// 09. Collection
// -> list, set, map


//@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>) {

    // Immutable collection -> 값을 변경하거나 추가, 삭제 등이 불가능한 collection들 (list, set, map)
    // set함수가 존재하지 않음
    // List -> 중복을 허용 한다
    val numberList = listOf<Int>(1, 2, 3, 3, 3)
    println(numberList) // [1, 2, 3, 3, 3] 들어간 대로 나옴
    println(numberList.get(0)) // 1
    println(numberList[1]) // 2

    // Set -> 중복을 허용하지 않는다
    // -> 순서가 없다!! -> index가 없다
    val numberSet = setOf<Int>(1, 2, 3, 3, 3)
    println(numberSet) // [1, 2, 3] 중복 값은 한번만 나옴
    numberSet.forEach {
        println(it)
    }

    // Map -> key, value 방식으로 관리한다
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    // <>안에 첫번째는 key의 자료형, 두번째는 value의 자료형
    // key to value 형식
    println(numberMap.get("one"))

    // Mutable collection -> 변경가능
    val mNumberList = mutableListOf<Int>(1, 2, 3)
    mNumberList.add(3, 4)
    println(mNumberList) // [1, 2, 3, 4]

    val mNumberSet = mutableSetOf<Int>(1, 2, 3, 4, 4, 4)
    mNumberSet.add(10) // Set은 index가 없으니 index를 적을필요 없고 들어갈 element만 적는다
    println(mNumberSet) // [1, 2, 3, 4, 10]

    val mNumberMap = mutableMapOf<String, Int>("one" to 1)
    mNumberMap.put("two", 2) // Map은 add가 아닌 put을 사용
    println(mNumberMap) // {one=1, two=2}

    val a = mutableListOf<Int>(1, 2, 3)
    a.add(4)
    println(a) // [1, 2, 3, 4]
    a.add(0, 100) // 0번째 index를 100으로 바꾸지 않고 0번째에 100을 넣고 나머지는 우측으로 민다
    println(a) // [100, 1, 2, 3, 4]

    a.set(0, 200) // 0번째 index를 100으로 바꾼다
    println(a) // [200, 1, 2, 3, 4]

    a.removeAt(0) // 0번째 index를 지운다
    println(a) // [1, 2, 3, 4]

    val b = mutableSetOf<Int>(1, 2, 3, 4)
    b.add(2)
    println(b) // [1, 2, 3, 4]
    b.remove(2) // index가 없으니 지우고 싶은 element를 적는다
    println(b) // [1, 3, 4]
    b.remove(100)  // Set 안에 100이 있으면 지워주고 없어도 코드는 실행되며 에러가 발생되지는 않는다

    val c = mutableMapOf<String, Int>("one" to 1)
    c.put("two", 2)
    println(c) // {one=1, two=2}
    c.replace("two", 4) // 수정
    println(c) // {one=1, two=4}
    println(c.keys) // key만 보기 [one, two]
    println(c.values) // value만 보기 [1, 4]
    c.clear() // 전부 삭제
    println(c) // {}



}