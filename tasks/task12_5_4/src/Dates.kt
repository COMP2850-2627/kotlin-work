// Task 12.5.4: date manipulation utilities

import kotlin.time.Clock
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

fun today(zone: TimeZone = TimeZone.currentSystemDefault()): LocalDate {
    val now = Clock.System.now()
    return now.toLocalDateTime(zone).date
}
