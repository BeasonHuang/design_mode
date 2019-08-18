package com.hb.design_mode.mediator

abstract class User(open val name: String, open val mediator: ChatMediator) {
    abstract fun send(msg: String)
    abstract fun receiver(msg: String)
}


class UserImpl(override val name: String, override val mediator: ChatMediator) : User(name, mediator) {

    override fun send(msg: String) {
        println("$name : sending messages = $msg")
        mediator.sendMsg(msg, this)
    }

    override fun receiver(msg: String) {
        println("$name : received messages = $msg")
    }
}