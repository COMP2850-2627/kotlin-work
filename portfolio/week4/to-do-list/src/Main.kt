// COMP2850 Portfolio: Week 4
// To Do list demo program

import kotlinx.datetime.LocalDate
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Error: filename and date required as arguments")
        exitProcess(1)
    }

    val date = LocalDate.parse(args[1])
    val toDo = ToDoList(args[0])

    println("Full list:")
    toDo.getItems().forEach(::println)

    println("\nIn Progress items:")
    toDo.getItems(ItemStatus.InProgress).forEach(::println)

    println("\nItems due on $date:")
    toDo.getItemsDueOn(date).forEach(::println)
}
