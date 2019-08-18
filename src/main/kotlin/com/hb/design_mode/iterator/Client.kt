package com.hb.design_mode.iterator

fun main(args: Array<String>) {
    val sentence = Sentence(mutableListOf("111", "222", "333"))

    sentence.iterator().forEach { println(it) }

}