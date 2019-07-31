package com.hb.design_mode.adapter

/**
 * 适配器模式
 */
interface Target {
    fun request()
}

interface Adaptee {
    fun ask()
}

open class TargetImpl : Target {
    override fun request() {
        println("do request")
    }
}

open class AdapteeImpl : Adaptee {
    override fun ask() {
        println("do ask")
    }

}

class Adapter(private val wrapper: Adaptee) : TargetImpl() {

    override fun request() {
        super.request()
        wrapper.ask()
    }
}


fun main(args: Array<String>) {
    val adapteeImpl = AdapteeImpl()
    val adapter = Adapter(adapteeImpl)
    adapter.request()

}
