package com.hb.design_mode.iterator

/**
 * 迭代器模式
 */
class Sentence(val words: List<String>)

operator fun Sentence.iterator(): Iterator<String> = words.iterator()

