// Task 13.2: class to represent time on a 24-hour clock

data class Time(val hours: Int, val minutes: Int, val seconds: Int) {
    companion object {
        // Various useful constants relating to time

        const val HOURS_PER_DAY = 24
        const val MINUTES_PER_HOUR = 60
        const val SECONDS_PER_MINUTE = 60
        const val SECONDS_PER_HOUR = SECONDS_PER_MINUTE * MINUTES_PER_HOUR

        const val MAX_HOURS = HOURS_PER_DAY - 1
        const val MAX_MINUTES = MINUTES_PER_HOUR - 1
        const val MAX_SECONDS = SECONDS_PER_MINUTE - 1
    }

    init {
        // Validation for time parameters

        require(hours in 0..MAX_HOURS) { "invalid hours" }
        require(minutes in 0..MAX_MINUTES) { "invalid minutes" }
        require(seconds in 0..MAX_SECONDS) { "invalid seconds" }
    }

    val secondsSinceMidnight: Int get() {
        return seconds + SECONDS_PER_MINUTE * minutes + SECONDS_PER_HOUR * hours
    }

    override fun toString() = "%02d:%02d:%02d".format(hours, minutes, seconds)

    infix fun advancedBy(increment: Int): Time {
        require(increment >= 0) { "invalid increment" }

        val future = secondsSinceMidnight + increment
        val h = (future / SECONDS_PER_HOUR) % HOURS_PER_DAY

        val remainingSeconds = future % SECONDS_PER_HOUR
        val m = remainingSeconds / SECONDS_PER_MINUTE
        val s = remainingSeconds % SECONDS_PER_MINUTE

        return Time(h, m, s)
    }
}

// Extension functions to help with representing time increments
// (see Main.kt for examples of use)

val Int.seconds get() = this
val Int.minutes get() = Time.SECONDS_PER_MINUTE * this
val Int.hours get() = Time.SECONDS_PER_HOUR * this
