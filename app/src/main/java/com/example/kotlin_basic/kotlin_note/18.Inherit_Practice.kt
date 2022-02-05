package com.example.kotlin_basic.kotlin_note

// 과제
// Knight, Monster (부모)
// SuperKnight, SuperMonster (자식)


fun main(args: Array<String>) {
    val monster = SuperMonster(100, 10)
    val knight = SuperKnight(200, 20)
    monster.attack(knight)
    monster.bite(knight)
}

// 상속이 만들어 낸 특징
// - 자식 class는 부모 class의 타입이다.

open class Character(var hp: Int, val power: Int) {
    fun attack(character: Character, power: Int = this.power) {
        character.defense(power)
    }

    open fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) {
            println("${javaClass.simpleName}의 남은 체력 $hp 입니다")
        } else {
            println("사망했습니다")
        }
    }
}

// 자식 class가 인스턴스화 되기 위해서는 부모 class가 먼저 인스턴스화되어야 한다
// 자식생성자에서 부모한테 받은 생성자들은 var, val 을 붙이지 않고 새로 자식에게서 생성한 생성자는 var, val 을 붙인다
class SuperMonster(hp: Int, power: Int /* , val item: String */) : Character(hp, power) {
    fun bite(character: Character) {
        super.attack(character, power + 2)
    }
}

class SuperKnight(hp: Int, power: Int) : Character(hp, power) {
    val defensePower: Int = 2
    override fun defense(damage: Int) {
        super.defense(damage - defensePower)
    }
}