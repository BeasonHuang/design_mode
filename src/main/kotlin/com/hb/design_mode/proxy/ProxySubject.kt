package com.hb.design_mode.proxy

/**
 * 代理类
 */
class ProxySubject(var subject: Subject?) : Subject() {

    override fun doSomething() {
        println("before doSomething")
        subject?.doSomething()
        println("after doSomething")
    }
}