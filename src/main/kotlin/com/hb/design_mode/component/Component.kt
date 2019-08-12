package com.hb.design_mode.component

/**
 * 抽象声明，用于管理与访问子部件
 */
open abstract class Component(open var name: String) {
    /**
     * 添加节点
     */
    abstract fun add(component: Component)

    /**
     * 删除节点
     */
    abstract fun remove(component: Component)

    /**
     * 显示节点
     */
    abstract fun display(level: Int)
}