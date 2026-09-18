// Task 13.2: unit tests for Time class

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class TimeTest : FreeSpec({
    "Hours stored correctly" {
        val midnight = Time(0, 0, 0)
        val noon = Time(12, 0, 0)
        withClue("00:00:00") { midnight.hours shouldBe 0 }
        withClue("12:00:00") { noon.hours shouldBe 12 }
    }

    "Minutes stored correctly" {
        val midnight = Time(0, 0, 0)
        val thirtyMin = Time(0, 30, 0)
        withClue("00:00:00") { midnight.minutes shouldBe 0 }
        withClue("00:30:00") { thirtyMin.minutes shouldBe 30 }
    }

    "Seconds stored correctly" {
        val midnight = Time(0, 0, 0)
        val thirtySec = Time(0, 0, 30)
        withClue("00:00:00") { midnight.seconds shouldBe 0 }
        withClue("00:00:30") { thirtySec.seconds shouldBe 30 }
    }

    "Exception if hours are invalid" {
        withClue("-1") {
            shouldThrow<IllegalArgumentException> { Time(-1, 0, 0) }
        }
        withClue("24") {
            shouldThrow<IllegalArgumentException> { Time(24, 0, 0) }
        }
    }

    "Exception if minutes are invalid" {
        withClue("-1") {
            shouldThrow<IllegalArgumentException> { Time(0, -1, 0) }
        }
        withClue("60") {
            shouldThrow<IllegalArgumentException> { Time(0, 60, 0) }
        }
    }

    "Exception if seconds are invalid" {
        withClue("-1") {
            shouldThrow<IllegalArgumentException> { Time(0, 0, -1) }
        }
        withClue("60") {
            shouldThrow<IllegalArgumentException> { Time(0, 0, 60) }
        }
    }

    "00:00:00 is zero seconds since midnight" {
        val midnight = Time(0, 0, 0)
        midnight.secondsSinceMidnight shouldBe 0
    }

    "00:00:30 is 30 seconds since midnight" {
        val thirtySec = Time(0, 0, 30)
        thirtySec.secondsSinceMidnight shouldBe 30
    }

    "00:05:00 is 300 seconds since midnight" {
        val fiveMin = Time(0, 5, 0)
        fiveMin.secondsSinceMidnight shouldBe 300
    }

    "05:00:00 is 18,000 seconds since midnight" {
        val fiveHours = Time(5, 0, 0)
        fiveHours.secondsSinceMidnight shouldBe 18_000
    }

    "23:59:59 is 86,399 seconds since midnight" {
        val t = Time(23, 59, 59)
        t.secondsSinceMidnight shouldBe 86_399
    }

    "Hours formatted correctly as string" {
        val midnight = Time(0, 0, 0)
        val fiveHours = Time(5, 0, 0)
        val noon = Time(12, 0, 0)
        withClue("midnight") { midnight.toString() shouldBe "00:00:00" }
        withClue("5am") { fiveHours.toString() shouldBe "05:00:00" }
        withClue("noon") { noon.toString() shouldBe "12:00:00"}
    }

    "Minutes formatted correctly as string" {
        val fiveMin = Time(0, 5, 0)
        val thirtyMin = Time(0, 30, 0)
        withClue("5 min") { fiveMin.toString() shouldBe "00:05:00" }
        withClue("30 min") { thirtyMin.toString() shouldBe "00:30:00" }
    }

    "Seconds formatted correctly as string" {
        val fiveSec = Time(0, 0, 5)
        val thirtySec = Time(0, 0, 30)
        withClue("5 sec") { fiveSec.toString() shouldBe "00:00:05" }
        withClue("30 sec") { thirtySec.toString() shouldBe "00:00:30" }
    }
})
