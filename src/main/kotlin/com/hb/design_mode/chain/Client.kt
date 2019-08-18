package com.hb.design_mode.chain

/**
 *责任链模式
 */
fun main(args: Array<String>) {
    val handler1 = ConcreteHandler1()
    val handler2 = ConcreteHandler2()

    handler1.handler = handler2

    handler1.handleRequest("two")
}