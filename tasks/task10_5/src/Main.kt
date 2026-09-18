// Task 10.5

import kotlin.system.exitProcess

fun display(text: String?) {
    when (text) {
        null -> println("?")
        else -> println(text.uppercase())
    }
}

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Single word required as a command line argument")
        exitProcess(1)
    }

    val translate = loadDatabase("en-to-fr.csv")

    val word = args[0].lowercase()
    val result = translate[word]

    //println(result)
    display(result)
}
