package com.hb.design_mode.mediator

fun main(args: Array<String>) {
    val mediator = ChatMediatorImpl()
    val user1 = UserImpl("user1", mediator)
    val user2 = UserImpl("user2", mediator)
    val user3 = UserImpl("user3", mediator)
    val user4 = UserImpl("user4", mediator)


    mediator.addUser(user1)
    mediator.addUser(user2)
    mediator.addUser(user3)
    mediator.addUser(user4)


    user2.send("my is user1")

    user4.send("my is user4")
}