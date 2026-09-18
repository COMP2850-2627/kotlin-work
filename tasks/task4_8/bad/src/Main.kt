// Task 4.8: demo of bad approach to building strings iteratively

import kotlin.system.exitProcess
import kotlin.time.measureTime

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: missing command line argument!")
        exitProcess(1)
    }

    val limit = args[0].toInt()

    val time = measureTime {
        var result = ""
        for (n in 1..limit) {
            result += n
            if (n < limit) {
                result += ','
            }
        }
    }

    println("Bad approach: $time")
}
