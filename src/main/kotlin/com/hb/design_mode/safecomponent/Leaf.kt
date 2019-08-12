package com.hb.design_mode.safecomponent

class Leaf(override val name: String) : Component(name) {

    override fun display(level: Int) {
        println("Leaf $level - $name")
    }
}