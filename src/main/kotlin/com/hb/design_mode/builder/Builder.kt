package com.hb.design_mode.builder

/**
 * 建造者模式，Kotlin中本身可以通过具名的可选参数实现
 */
class Car(val mode: String?, val year: Int) {

    private constructor(builder: Builder) : this(builder.model, builder.year)

    class Builder {
        var model: String? = null
        var year = 2

        fun build() = Car(this)
    }

    /**
     * 伴生对象构造方法
     */
    companion object {
        inline fun build(block: Builder.() -> Unit) = Builder().apply(block).build()
    }

    override fun toString(): String {
        return "mode=$mode,year=$year"
    }
}


fun main(args: Array<String>) {

    val car1 = Car.build {
        model = "bc"
        year = 3
    }

    val car2 = Car(
            mode = "bmw",
            year = 4)

    println(car1)
    println(car2)

}