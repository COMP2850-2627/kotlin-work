// COMP2850 Portfolio: Week 4
// ToDoItem class

import kotlinx.datetime.LocalDate

data class ToDoItem(val dueDate: LocalDate, var status: ItemStatus, val description: String) {
    override fun toString() = "$dueDate: $status: $description"
    fun isOverdue() = dueDate < today() && status != ItemStatus.Done
}
