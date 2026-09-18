// Task 13.2: demo program for Time class

fun main() {
    val t = Time(23, 15, 36)

    println(t)
    println("Advanced by 30s   = ${t advancedBy 30.seconds}")
    println("Advanced by 2h18m = ${t advancedBy 2.hours + 18.minutes}")
}
