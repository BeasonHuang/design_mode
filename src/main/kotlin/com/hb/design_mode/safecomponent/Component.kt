package com.hb.design_mode.safecomponent

/**
 * 安全组合
 */
abstract class Component(open val name: String) {

    abstract fun display(level: Int)

}