package com.hb.design_mode.flyweight

/**
 * 创建共享实例
 */
object FlyweightFactory {

    var pool: HashMap<String, Flyweight> = hashMapOf()

    fun getFlyweight(extrinsic: String): Flyweight {
        var flyweight: Flyweight

        if (!pool.containsKey(extrinsic)) {
            println("创建Flyweight")
            flyweight = ConcreteFlyweight(extrinsic)
            pool[extrinsic] = flyweight
        } else {
            println("从池中获取")
            flyweight = pool[extrinsic]!!
        }
        return flyweight
    }

}