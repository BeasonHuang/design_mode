package com.hb.design_mode.flyweight

/**
 * 享元必须接受外部状态(共享的方式高效地支持大量细粒度对象的重用)
 */
abstract class Flyweight(open val extrinsic: String) {

    var intrinsic: String = extrinsic

    abstract fun operate(extrinsic: String)
}