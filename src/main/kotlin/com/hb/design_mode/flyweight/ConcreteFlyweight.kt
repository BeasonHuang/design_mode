package com.hb.design_mode.flyweight

/**
 * 具体的共享实例
 */
class ConcreteFlyweight(override val extrinsic: String) : Flyweight(extrinsic) {

    override fun operate(extrinsic: String) {
        println("共享的ConcreteFlyWeight:$extrinsic")
    }

}

class UnsharedConcreteFlyweight(override val extrinsic: String) : Flyweight(extrinsic) {

    override fun operate(extrinsic: String) {
        println("不共享的UnsharedConcreteFlyweight $extrinsic")
    }
}