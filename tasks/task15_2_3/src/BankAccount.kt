// Task 15.2.3: BankAccount class

open class BankAccount(val holder: String) {
    init {
        require(holder.isNotBlank()) { "Account holder must not be blank" }
    }

    var balance: Int = 0
        private set(value) {
            field = value
        }

    fun deposit(amount: Int) {
        require(amount > 0) { "Deposit amount must be greater than 0" }
        balance += amount
    }

    fun withdraw(amount: Int) {
        require(amount > 0) { "Withdrawal amount must be greater than 0" }
        require(amount <= balance) { "Withdrawal amount cannot exceed balance" }
        balance -= amount
    }
}
