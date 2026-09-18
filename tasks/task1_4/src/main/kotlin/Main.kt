// Task 1.4

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.rendering.TextStyles.*
import com.github.ajalt.mordant.terminal.Terminal

fun main() {
    val term = Terminal(AnsiLevel.TRUECOLOR)

    val helloStyle = italic + underline + yellow
    term.println(helloStyle("HELLO WORLD!"))

    val date = today()
    val dateStyle = bold + green
    term.println(dateStyle("Today is $date"))
}
