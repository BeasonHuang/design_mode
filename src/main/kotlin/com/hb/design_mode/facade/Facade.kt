package com.hb.design_mode.facade

/**
 * 外观模式为一个复杂的子系统提供一个简化的统一接口
 */
class Facade {
    var subSystemA: SubSystemA = SubSystemA()
    var subSystemB: SubSystemB = SubSystemB()
    var subSystemC: SubSystemC = SubSystemC()
    var subSystemD: SubSystemD = SubSystemD()

    fun doSomethingA() {
        subSystemA.doSomething()
    }

    fun doSomethingB() {
        subSystemB.doSomething()
    }

    fun doSomethingC() {
        subSystemC.doSomething()
    }

    fun doSomethingD() {
        subSystemD.doSomething()
    }
}