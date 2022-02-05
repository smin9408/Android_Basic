package com.example.kotlin_basic.kotlin_note

// 19.Interface
// - Interface는 약속이다!
// Interface를 구현하는 class는 interface가 가진 함수를 반드시 구현해줘야한다
// 구현해준다는 것은 그 기능을 정확하게 설명해야 한다는 것

// interface는 생성자가 없다
// 생성자가 없다는 것은 인스턴스화 시킬 수 없다 -> 설명서가 아니다 -> 지침서다
// 니가 이것을 구현하고 싶다면 반드시 아래의 기능을 구현해라

fun main(args: Array<String>) {
    val studentI: Student_ = Student_()
    val studentI2: Student_2 = Student_2()
    studentI2.eat()
    studentI2.sleep()
    studentI.eat()
    studentI.sleep()
}

interface Person_ {
    fun eat()
    fun sleep()
}

// interface안에 직접 구현부를 작성해도 된다
interface Person_2 {
    fun eat() {
        println("먹는다")
    }

    fun sleep() {
        println("잔다")
    }

    // abstract - 반드시 구현해야 한다, 인터페이스 내부에서 구현이 되어있더라도 클래스안에서 또 구현해야한다
    abstract fun study()
}

class Student_ : Person_ {
    override fun eat() {

    }

    override fun sleep() {
    }
}

class Student_2 : Person_2 {
    // interface안에 구현부가 있다면 구현부를 작성하지 않아도 에러가 발생하지 않는다
    override fun study() {
    }
}

class Teacher_2 : Person_2 {
    override fun study() {
    }
}


class SoccerPlayer : Person_ {
    override fun eat() {
    }

    override fun sleep() {
    }
}


open class Person() {
    open fun eat() {

    }

    fun sleep() {

    }
}

