// Benchmarking program showing the impact of sequences on performance

import java.io.File
import kotlin.system.exitProcess
import kotlin.time.measureTime

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: no filename on command line")
        exitProcess(1)
    }

    val timeWithout = measureTime {
        File(args[0]).readLines().filter { it.isNotBlank() }.filter { it.length < 10 }
            .map { it.lowercase() }
    }

    val timeWith = measureTime {
        File(args[0]).useLines { seq ->
            seq.filter { it.isNotBlank() }.filter { it.length < 10 }
                .map { it.lowercase() }.toList()
        }
    }

    println("Without sequence: $timeWithout")
    println("With sequence: $timeWith")
}
