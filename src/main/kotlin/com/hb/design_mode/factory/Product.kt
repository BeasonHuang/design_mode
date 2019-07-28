package com.hb.design_mode.factory

/**
 * 工厂对象
 */
interface Product {
    val name: String
}

class ProductA(override val name: String = "productA") : Product {

    override fun toString(): String {
        return name
    }
}

class ProductB(override val name: String = "productB") : Product {
    override fun toString(): String {
        return name
    }
}
