package com.hb.design_mode.absfactory

/**
 * 抽象工厂模式
 */
abstract class AbsCreator {
    /**
     * 创建A产品线路
     */
    abstract fun createA(): AbsProductA

    /**
     * 创建B产品线
     */
    abstract fun createB(): AbsProductB
}

/**
 * 1系列
 */
class Creator1 : AbsCreator() {
    override fun createB() = ProductB1()
    override fun createA() = ProductA1()
}

/**
 * 2系列
 */
class Creator2 : AbsCreator() {
    override fun createA() = ProductA2()
    override fun createB() = ProductB2()
}

fun main(args: Array<String>) {
    val creator1 = Creator1()
    val creator2 = Creator2()

    creator1.createA().doSomething()
    creator2.createA().doSomething()

    creator1.createB().doSomething()
    creator2.createB().doSomething()
}