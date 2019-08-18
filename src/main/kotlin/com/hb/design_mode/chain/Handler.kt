package com.hb.design_mode.chain

/**
 * 抽象处理类
 */
abstract class Handler {

    var handler: Handler? = null


    abstract fun handleRequest(request: String)
}