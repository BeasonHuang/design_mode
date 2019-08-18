package com.hb.design_mode.chain


/**
 * 具体处理类1
 */
class ConcreteHandler1 : Handler() {

    override fun handleRequest(request: String) {
        if (request == "one") {
            println("handler1 handle request $request")
        } else {
            if (handler == null) {
                println("not response")
            } else {
                handler?.handleRequest(request)
            }
        }
    }

}

/**
 * 具体处理类2
 */
class ConcreteHandler2 : Handler() {

    override fun handleRequest(request: String) {
        if (request == "two") {
            println("handler2 handle request2 $request")
        } else {
            if (handler == null) {
                println("not response")
            } else {
                handler?.handleRequest(request)
            }
        }
    }

}