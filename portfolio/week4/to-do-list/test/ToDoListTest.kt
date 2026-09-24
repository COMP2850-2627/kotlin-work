// Tests for ToDoList class
// DO NOT ALTER ANYTHING IN THIS FILE!

import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import kotlin.io.path.createTempFile
import kotlin.io.path.deleteIfExists
import kotlinx.datetime.LocalDate
import kotlin.io.path.readText
import kotlin.io.path.writer

@Suppress("Unused")
class ToDoListTest : FreeSpec({
    // Test fixture

    val pastDate = LocalDate(2026, 10, 4)
    val futureDate = LocalDate(2026, 10, 6)

    val pastItem1 = ToDoItem(pastDate, ItemStatus.NotStarted, "Item 1")
    val pastItem2 = ToDoItem(pastDate, ItemStatus.Done, "Item 2")
    val futureItem1 = ToDoItem(futureDate, ItemStatus.Done, "Item 3")
    val futureItem2 = ToDoItem(futureDate, ItemStatus.InProgress, "Item 4")

    val toDo = ToDoList()

    val tempFile = createTempFile(suffix = ".csv")

    beforeTest {
        tempFile.writer().use {
            it.write("2026-10-04: NotStarted: Item 1\n")
            it.write("2026-10-04: Done: Item 2\n")
            it.write("2026-10-06: Done: Item 3\n")
            it.write("2026-10-06: InProgress: Item 4\n")
        }
    }

    afterTest {
        // Clean up
        tempFile.deleteIfExists()
    }

    // Tests

    "Can create an empty ToDoList" {
        toDo.size shouldBe 0
    }

    "Can add items to a ToDoList" {
        toDo.add(pastItem1)
        withClue("One item") { toDo.size shouldBe 1 }
        withClue("One item") { toDo.getItems() shouldBe listOf(pastItem1) }

        toDo.add(pastItem2, futureItem1)
        withClue("Three items") { toDo.size shouldBe 3 }
        withClue("Three items") {
            toDo.getItems() shouldBe listOf(pastItem1, pastItem2, futureItem1)
        }
    }

    "notStarted property computed correctly" {
        withClue("No items") { toDo.notStarted shouldBe 0 }
        toDo.add(pastItem1)
        withClue("One item, not started") { toDo.notStarted shouldBe 1 }
        toDo.add(pastItem2)
        withClue("Two items, one not started") { toDo.notStarted shouldBe 1 }
    }

    "inProgress property computed correctly" {
        withClue("No items") { toDo.inProgress shouldBe 0 }
        toDo.add(pastItem1)
        withClue("One item, none in progress") { toDo.inProgress shouldBe 0 }
        toDo.add(futureItem2)
        withClue("Two items, one in progress") { toDo.inProgress shouldBe 1 }
    }

    "done property computed correctly" {
        withClue("No items") { toDo.done shouldBe 0 }
        toDo.add(pastItem1)
        withClue("One item, none done") { toDo.done shouldBe 0 }
        toDo.add(pastItem2)
        withClue("Two items, one done") { toDo.done shouldBe 1 }
        toDo.add(futureItem1)
        withClue("Three items, two done") { toDo.done shouldBe 2 }
    }

    "overdue property computed correctly" {
        withClue("No items") { toDo.overdue shouldBe 0 }
        toDo.add(pastItem1, pastItem2, futureItem1, futureItem2)
        withClue("Four items, one overdue") { toDo.overdue shouldBe 1 }
    }

    "Can delete done items from a ToDoList" {
        toDo.add(pastItem1, pastItem2, futureItem1, futureItem2)
        val deleted = toDo.deleteDone()
        withClue("Return value") { deleted shouldBe true }
        withClue("List size") { toDo.size shouldBe 2 }
        withClue("List contents") { toDo.getItems() shouldBe listOf(pastItem1, futureItem2) }
    }

    "Deletion does nothing when there are no done items" {
        toDo.add(pastItem1)
        val deleted = toDo.deleteDone()
        withClue("Return value") { deleted shouldBe false }
        withClue("List size") { toDo.size shouldBe 1 }
        withClue("List contents") { toDo.getItems() shouldBe listOf(pastItem1) }
    }

    "ToDoList can be loaded from a file" {
        toDo.load(tempFile.toString())
        withClue("List size") { toDo.size shouldBe 4 }
        withClue("List contents") {
            toDo.getItems() shouldBe listOf(pastItem1, pastItem2, futureItem1, futureItem2)
        }
    }

    "ToDoList can be saved to a file" {
        toDo.add(pastItem1)
        toDo.save(tempFile.toString())
        val fileContents = tempFile.readText().trimEnd()
        fileContents shouldBe pastItem1.toString()
    }

    "Done items can be retrieved" {
        toDo.add(pastItem1, pastItem2, futureItem1, futureItem2)
        toDo.getItems(ItemStatus.Done) shouldBe listOf(pastItem2, futureItem1)
    }

    "In-progress items can be retrieved" {
        toDo.add(pastItem1, pastItem2, futureItem1, futureItem2)
        toDo.getItems(ItemStatus.InProgress) shouldBe listOf(futureItem2)
    }

    "Items due on a specific date can be retrieved" {
        toDo.add(pastItem1, pastItem2, futureItem1, futureItem2)
        toDo.getItemsDueOn(futureDate) shouldBe listOf(futureItem1, futureItem2)
    }
})
