package com.example.kotlin_basic.kotlin_note

// 12. Class

// OOP -> Object Oriented Programing (객체지향 프로그래밍)

// 객체란?
// - 이름이 있는 모든 것

// 절차지향 프로그래밍의 문제 해결 방법 - 코드를 위에서 부터 아래로 실행을 하면 문제가 해결된다!

// 객체지향 프로그래밍의 문제 해결 방법
// - 객체를 만들어서, 객체에게 일을 시켜서 문제를 해결한다
// - 선수, 심판, 경기장, 관중 -> 축구 게임

// 객체를 만드는 방법
// - 설명서가 있어야 한다


fun main(args: Array<String>) {

    // 클래스(설명서)를 통해서 실체를 만드는 방법
    // 실체를 만들었다 -> 인스턴스화 -> 인스턴스(객체)
    Car("v8 engine", "big")

    // 인스턴스틑 변수에 담을 수 있다
    val bigCar = Car("v8 engine", "big")

    // 우리가 만든 클래스(설명서)는 자료형이 된다
    val bigCar1: Car = Car("v8 engine", "big")

    val superCar: SuperCar = SuperCar("good engine", "big", "white")
    val superCar1: SuperCar = SuperCar("nice engine", "middle", "black")

    // 인스턴스가 가지고 있는 기능을 사용하는 방법
    val myCar: RunableCar = RunableCar("v8 engine", "coupe")
    myCar.ride()
    myCar.navi("우리 집")
    myCar.drive()

    // 인스턴스의 멤버 변수에 접근하는 방법
    val myCar2: RunableCar2 = RunableCar2("v12 engine", "SUV")
    println(myCar2.engine)
    println(myCar2.body)

    println()
    val testClass:TestClass = TestClass()
    testClass.test(1,2)
}

// 클래스(설명서) 만드는 방법(1)
// 설명서만 만들어진거지 실체가 만들어진건 아님
class Car(var engine: String, var body: String) {

}

// 클래스 만드는 방법(2)
class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String) {
        //println(engine)
        //println(body)
        //println(door)

        this.engine = engine
        this.body = body
        this.door = door
    }
}

// 클래스 만드는 방법(3) -> 1번 방법의 확장
// 클래스 이름 옆의 생성자(constructor)는 써도되고 생략해도 된다
class Car1 constructor(engine: String, body: String) {
    var door: String = ""

    // 생성자
    constructor(engine: String, body: String, door: String) : this(engine, body) {
        this.door = door
    }

}


// 클래스 만드는 방법(4) -> 2번 방법의 확장
class Car2 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}


class RunableCar(engine: String, body: String) {

    fun ride() {
        println("탑승하였습니다")
    }

    fun drive() {
        println("달립니다!!")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다")
    }
}

class RunableCar2 {
    var engine: String
    var body: String

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    // init은 클래스가 인스턴스화 될때 가장먼저 실행된다
    // 초기 세팅을 할 때 유용하다
    init {
        println("RunableCar2가 만들어 졌습니다")
    }

    fun ride() {
        println("탑승하였습니다")
    }

    fun drive() {
        println("달립니다!!")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다")
    }
}

// 오버로딩 - 이름이 같지만 받는 파라미터가 다른 함수
// 한 클래스 안에 동일한 이름의 함수를 작설할 수 없다
// 하지만 함수안에 받는 인자가 다르다면 이름이 같아도 만들 수 있다
class TestClass() {
    fun test(a:Int) {
        println("UP")
    }

    fun test(a:Int, b:Int) {
        println("DOWN")
    }
}










