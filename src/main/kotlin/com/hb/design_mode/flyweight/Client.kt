package com.hb.design_mode.flyweight

fun main(args: Array<String>) {
    var flyweightA = FlyweightFactory.getFlyweight("A")
    flyweightA.operate("A operate")

    var flyweightB = FlyweightFactory.getFlyweight("B")
    flyweightB.operate("B operate")

    var flyweightC = FlyweightFactory.getFlyweight("C")
    flyweightC.operate("C operate")

    var flyweightD = FlyweightFactory.getFlyweight("A")
    flyweightD.operate("D operate")

    var flyweightE = FlyweightFactory.getFlyweight("A")
    flyweightE.operate("E operate")

}