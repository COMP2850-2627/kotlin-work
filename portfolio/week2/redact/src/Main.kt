// COMP2850 Portfolio: Week 2
// File redaction program

import kotlin.io.path.Path
import kotlin.io.path.readText
import kotlin.io.path.writeText
import kotlin.system.exitProcess

fun usage() {
    println("Error: three command line arguments required")
    println("(text to be redacted, input filename, output filename)")
    exitProcess(1)
}

fun main(args: Array<String>) {
    if (args.size != 3) {
        usage()
    }

    val inputFile = Path(args[1])
    val outputFile = Path(args[2])

    val originalText = inputFile.readText()
    val redactedText = redact(originalText, args[0])

    outputFile.writeText(redactedText)
}
