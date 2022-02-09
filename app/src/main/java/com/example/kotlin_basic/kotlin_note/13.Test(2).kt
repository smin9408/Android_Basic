package com.example.kotlin_basic.kotlin_note

fun main(args: Array<String>) {
    val calculator1: Calculator1 = Calculator1()
    println(calculator1.plus(5, 15))
    println(calculator1.minus(10, 5))
    println(calculator1.minus(5, 15))
    println(calculator1.multiply(20, 10))
    println(calculator1.divide(30, 2))
}

// 1.사칙 연산을 수행할 수 있는 클래스
// 가장 쉬운 방법
class Calculator1() {
    fun plus(a: Int, b: Int): Int {
        return a + b
    }

    fun minus(a: Int, b: Int): Int {
        // 먼저 들어온 수에서 뒤에 들어온 수를 뺸다
        return a - b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Int, b: Int): Int {
        // 먼저 들어온 수에소 뒤에 들어온 수를 나눈다
        // 리턴은 몫만 한다
        return a / b
    }
}

// 여러개의 수
class Calculator2() {
    fun plus(vararg numbers: Int): Int {
        var result: Int = 0
        numbers.forEach {
            result = result + it
        }
        return result
    }

    fun minus(vararg numbers: Int): Int {
        var result: Int = 0
        for (i in 0 until numbers.size) {
            result = result - numbers[i]
        }
        return result
    }

    fun multiply(vararg numbers: Int): Int {
        var result: Int = 1
        numbers.forEach {
            if (it != 0) {
                result = result * it
            }
        }
        return result
    }

    fun divide(vararg numbers: Int): Int {
        var result: Int = numbers[0]
        numbers.forEachIndexed { index, value ->
            if (value != 0 && index != 0) {
                result = result / value
            }
        }
        return result
    }
}


// 2.은행 계좌 만들기
//   - 계좌 생성 기능 (이름, 생년월일)
//   - 잔고를 확인하는 기능
//   - 출금 기능
//   - 예금 기능

// 3.TV 클래스
//   - on/off 기능
//   - 채널을 돌리는 기능
//   - 초기 채널은 (S사 M사 K사 3개)
