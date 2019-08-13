package com.hb.design_mode.proxy

/**
 * 真实对象实现
 */
class RealSubject : Subject() {

    override fun doSomething() {
        println("RealSubject:doSomething")
    }

}