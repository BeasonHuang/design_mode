package com.hb.design_mode.command

/**
 * 抽象命令接口
 */
interface Command {
    /**
     * 命令执行
     */
    fun execute()
}

/**
 * 具体命令1
 */
class ConcreteCommand1 : Command {

    private var receiver: Receiver? = null

    init {
        receiver = Receiver1()
    }

    /**
     * 命令1执行
     */
    override fun execute() {
        println("command1 execute.")
        receiver?.execute()
    }

}

/**
 * 具体命令2
 */
class ConcreteCommand2 : Command {
    private val receiver = Receiver2()

    /**
     * 命令1执行
     */
    override fun execute() {
        println("command2 execute.")
        receiver?.execute()
    }

}