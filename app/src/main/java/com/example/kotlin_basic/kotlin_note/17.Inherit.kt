package com.example.kotlin_basic.kotlin_note

// 같은코드가 2개있는 거 까진 봐준다
// 2개 이상이라면 리펙토링 해라

// 17. 상속
// 부모로부터 설명서를 물려받는다
// class 앞에 접근제어자를 생략하면 private가 기본으로 적용된다
// Q. class 앞에만 해당하는가??
// A. function도 기본적으로 private가 적용됨, 변수는 해당안함


fun main(args: Array<String>) {
    val superCar: IsSuperCar = IsSuperCar()
    println(superCar.drive())
    superCar.stop()
}

// 부모 : IsCar
// 자식 : IsSuperCar, IsBus
open class IsCar() {
    open fun drive(): String {
        return "달린다"
        // println("달린다")
    }

    fun stop() {

    }
}

class IsSuperCar() : IsCar() {

    // override
    // 덮어쓴 함수다
    // 부모의 함수를 덮어쓴 함수는 override 라는 키워드를 붙여줘야한다
    override fun drive(): String {
        val run: String = super.drive()
        return "빨리 $run"

        //println("빨리 달린다")
        //super.drive() // super = 부모 즉, IsSuperCar의 drive함수를 호출하면 부모의 drive함수를 호출하겠다는 뜻
    }
}

class IsBus() : IsCar() {

}
