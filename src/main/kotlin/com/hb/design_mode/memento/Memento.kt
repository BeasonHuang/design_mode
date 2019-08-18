package com.hb.design_mode.memento

data class Memento(val fileName: String, val content: StringBuffer)

class FileWriter(var fileName: String) {
    var content = StringBuffer()

    fun writer(str: String) {
        content.append(str)
    }

    fun save() = Memento(fileName, content)

    fun restory(m: Memento) {
        fileName = m.fileName
        content = m.content
    }

}

fun main(args: Array<String>) {
    val memento = Memento("temp", StringBuffer("fileContent"))

    val fileWriter = FileWriter("temp2")
    fileWriter.save()
    println(fileWriter.content)

    fileWriter.writer("hahaha")
    println(fileWriter.content)


    fileWriter.restory(memento)
    println(fileWriter.content)

}