package com.hb.design_mode.singleton

/**
 * 通过object类修饰符，默认实现恶汉式单列
 */
object Singleton1 {

    fun doSomethong() {
        println("Singleton1.doSomething")
    }
}

/**
 * 懒汉式单列
 */
class Singleton2 private constructor() {

    companion object {
        val instance: Singleton2 by lazy { Singleton2() }
    }

    fun doSomething() {
        println("Singleton2.doSomething")
    }


}

fun main(args: Array<String>) {
    Singleton1.doSomethong()
    Singleton2.instance.doSomething()
}

