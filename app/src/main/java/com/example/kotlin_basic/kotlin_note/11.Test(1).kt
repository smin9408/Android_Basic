package com.example.kotlin_basic.kotlin_note

fun main(args: Array<String>) {
    first()
    println(second(90))
    println(third(89))
    gugudan()
}

// 1번 문제
// List를 2개 만든다
// 첫번째 List에는 1부터 9까지 값을 넣는다 (반복문 사용)
// 두번째 List에는 첫번째 ArrayList의 값을 하나씩 확인환 후
// 짝수면 True 홀수면 False를 넣어준다
fun first() {
    val list1 = MutableList(9, { 0 })
    val list2 = MutableList(9, { true })

    for (i in 0..8) {
        list1[i] = i + 1
    }
    println(list1)

    list1.forEachIndexed { index, value ->
        if (value % 2 == 0) {
            // 짝수
            list2[index] = true
        } else {
            // 홀수
            list2[index] = false
        }
    }
    println(list2)
}


// 2번 문제
// 학점을 구하자
// 80 ~ 90 -> A
// 70 ~ 79 -> B
// 60 ~ 69 -> C
// 나머지 F
fun second(score: Int): String {
    when (score) {
        in 90..100 -> {
            return "A"
        }
        in 80..89 -> {
            return "B"
        }
        in 70..79 -> {
            return "C"
        }
        else -> {
            return "F"
        }
    }
}

// 3번 문제
// 전달 받은 숫자의 각 자리 수의 합을 구하자
// 조건 : 전달 받은 숫자는 무조건 두자리 숫자이다
fun third(number: Int): Int {
    val a: Int = number / 10
    val b: Int = number % 10

    return a + b
}

// 4번 문제
// 구구단을 출력하자
fun gugudan() {
    for (x in 1..9) {
        for (y in 1..9) {
            println("$x x $y = ${x*y}")
        }
    }
}

