package com.hb.design_mode.mediator

interface ChatMediator {
    fun sendMsg(msg: String, user: User)
    fun addUser(user: User)
}


class ChatMediatorImpl : ChatMediator {
    val users = mutableListOf<User>()


    override fun sendMsg(msg: String, user: User) {
        users.filter { it != user }
                .forEach { it.receiver(msg) }
    }

    override fun addUser(user: User) {
        users.add(user)
    }

}