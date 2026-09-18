// Task 1.3.1

import kotlin.time.Clock
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

fun today(): LocalDate {
    val thisMoment = Clock.System.now()
    val timeZone = TimeZone.currentSystemDefault()
    return thisMoment.toLocalDateTime(timeZone).date
}
