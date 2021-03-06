package com.hb.design_mode.safecomponent


class Composite(override val name: String) : Component(name) {

    private val children = mutableListOf<Component>()

    override fun display(level: Int) {
        println("Composite $level - $name")
        children.forEach { it.display(level + 1) }
    }

    /**
     * 添加元素
     */
    fun add(component: Component) {
        children.add(component)
    }

    /**
     * 删除元素
     */
    fun remove(component: Component) {
        children.remove(component)
    }
}
fun main(args: Array<String>) {
    val root = Composite("root")
    //增加叶节点
    root.add(Leaf("Leaf A in root."))
    root.add(Leaf("Leaf B in root."))

    //增加树枝节点点
    val branchA = Composite("Branch A in root.")
    val branchB = Composite("Branch B in root.")

    root.add(branchA)
    root.add(branchB)

    branchA.add(Leaf("Leaf AA in BranchA."))
    //遍历显示整个树结构
    root.display(1)
}