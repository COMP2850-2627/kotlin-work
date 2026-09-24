// Tests for ToDoItem class
// DO NOT ALTER ANYTHING IN THIS FILE!

import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockkStatic
import kotlinx.datetime.LocalDate

@Suppress("Unused")
class ToDoItemTest : FreeSpec({
    val pastDate = LocalDate(2026, 10, 4)
    val futureDate = LocalDate(2026, 10, 6)
    val pastItem1 = ToDoItem(pastDate, ItemStatus.NotStarted, "Item 1")
    val pastItem2 = ToDoItem(pastDate, ItemStatus.Done, "Item 2")
    val futureItem = ToDoItem(futureDate, ItemStatus.Done, "Item 3")

    mockkStatic(::today)
    every { today() } returns LocalDate(2026, 10, 5)

    "!Can create a ToDoItem" {
        withClue("Due Date") { pastItem1.dueDate shouldBe pastDate }
        withClue("Status") { pastItem1.status shouldBe ItemStatus.NotStarted }
        withClue("Description") { pastItem1.description shouldBe "Item 1" }
    }

    "!Can create a different ToDoItem" {
        withClue("Due Date") { futureItem.dueDate shouldBe futureDate }
        withClue("Status") { futureItem.status shouldBe ItemStatus.Done }
        withClue("Description") { futureItem.description shouldBe "Item 3" }
    }

    "!Overdue items identified successfully" {
        withClue("Due yesterday, not started") { pastItem1.isOverdue() shouldBe true }
        withClue("Due yesterday, done") { pastItem2.isOverdue() shouldBe false }
        withClue("Due tomorrow") { futureItem.isOverdue() shouldBe false }
    }

    "!Correct string representation for a ToDoItem" {
        withClue("Due yesterday, not started") {
            pastItem1.toString() shouldBe "2026-10-04: NotStarted: Item 1"
        }
        withClue("Due tomorrow, done") {
            futureItem.toString() shouldBe "2026-10-06: Done: Item 3"
        }
    }
})
