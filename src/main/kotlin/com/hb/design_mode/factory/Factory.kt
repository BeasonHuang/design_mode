package com.hb.design_mode.factory

/**
 * 简单工厂
 */
interface Factory {
    fun create(): Product
}

class FactoryA : Factory {
    override fun create() = ProductA()
}

class FactoryB : Factory {
    override fun create() = ProductB()
}

fun main(args: Array<String>) {
    val factoryA = FactoryA()
    val factoryB = FactoryB()

    println(factoryA.create())
    println(factoryB.create())
}