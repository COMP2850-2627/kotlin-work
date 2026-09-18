// Task 12.7: data classes vs regular classes

import kotlinx.datetime.LocalDate

fun main() {
    val birthDate = LocalDate(1997, 8, 23)
    val p1 = Person("Dave", birthDate)
    val p2 = Person("Dave", birthDate)

    println("p1 == p1?     : ${p1 == p1}")
    println("p1 == p2?     : ${p1 == p2}")

    println("p1.hashCode() : %08x".format(p1.hashCode()))
    println("p2.hashCode() : %08x".format(p2.hashCode()))

    println("p1.toString() : $p1")
    println("p2.toString() : $p2")

    // println("p1 marries")
    // p1.isMarried = true
    // println("p1 == p2?     : ${p1 == p2}")
    // println("p1.hashCode() : %08x".format(p1.hashCode()))
    // println("p1.toString() : $p1")
}
