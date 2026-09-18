// Task 12.7: data classes vs regular classes

import kotlinx.datetime.LocalDate

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false
}
