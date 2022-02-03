package com.example.kotlin_basic.kotlin_note

// 접근 제어자


fun main(args: Array<String>) {

    var testAccess : TestAccess = TestAccess("아무개")
    // testAccess.name 접근불가
    // println(testAccess.name) 접근불가
    // testAccess.test()
    testAccess.changeName("승민이")
    // testAccess.test()

    // testAccess.name = "아무개2" 접근불가
    // println(testAccess.name) 접근불가
}

class TestAccess {
    private var name: String = ""

    constructor(name: String) {
        this.name = name
    }

    private fun test(){
        println("테스트")
        println(name)
    }

    fun changeName(newName:String){
        this.name = newName
    }
}