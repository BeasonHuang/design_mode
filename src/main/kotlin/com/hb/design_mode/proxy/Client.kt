package com.hb.design_mode.proxy

fun main(args: Array<String>) {
    val subject = RealSubject()
    val proxySubject = ProxySubject(subject)
    proxySubject.doSomething()
}