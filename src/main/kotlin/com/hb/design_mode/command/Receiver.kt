package com.hb.design_mode.command

/**
 * 命令接受执行者
 */
interface Receiver {
    fun execute()
}

class Receiver1 : Receiver {
    override fun execute() {
        println("receiver1 execute")
    }
}

class Receiver2 : Receiver {
    override fun execute() {
        println("receiver2 execute")
    }
}