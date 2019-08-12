package com.hb.design_mode.component

class Leaf(override var name: String) : Component(name) {

    override fun add(component: Component) {
        println("Can not add a component to a leaf.")
    }

    override fun remove(component: Component) {
        println("Can not remove component from a leaf.")
    }

    override fun display(level: Int) {
        println("Leaf $level - $name")
    }
}