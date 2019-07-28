package com.hb.design_mode.copy


/**
 * 原型模式
 */
data class Human(var sex: Int, var age: Int, var name: String)

fun main(args: Array<String>) {
    val human1 = Human(1, 22, "tom")
    val human2 = human1.copy();

    println(human1)
    human2.name = "hb"
    println(human2)
}