package com.hb.design_mode.command

/**
 * 命令模式
 */
fun main(args: Array<String>) {
    val command1 = ConcreteCommand1()
    val command2 = ConcreteCommand2()

    command1.execute()
    command2.execute()
}
