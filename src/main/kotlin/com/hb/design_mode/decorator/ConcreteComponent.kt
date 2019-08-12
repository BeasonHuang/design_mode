package com.hb.design_mode.decorator

/**
 * 装饰模式，可以通过扩展函数简单实现
 */
class ConcreteComponent : Component() {

    override fun doSomething(string: String) {
        print(string)
    }

}

fun Component.underLine(decorated: Component.() -> Unit) {
    print("_")
    this.decorated()
    print("_")
}

fun ConcreteComponent.underLine(str: String) {
    print("_")
    this.doSomething(str)
    print("_")
}

fun main(args: Array<String>) {
    var component = ConcreteComponent()
    component.underLine { doSomething("hb") }
}