// Tests for StudentAccount class
// DO NOT ALTER ANYTHING IN THIS FILE!

package comp2850.banking

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.reflection.shouldBeSubtypeOf
import io.kotest.matchers.shouldBe
import io.kotest.matchers.throwable.shouldHaveMessage

@Suppress("Unused")
class StudentAccountTest : FreeSpec({
    val account = StudentAccount("Sarah")

    "StudentAccount is a subclass of BankAccount" {
        account::class.shouldBeSubtypeOf<BankAccount>()
    }

    "Can create a StudentAccount" {
        withClue("Holder") { account.holder shouldBe "Sarah" }
        withClue("Balance") { account.balance shouldBe 0 }
    }

    "Account holder cannot be an empty string" {
        shouldThrow<IllegalArgumentException> {
            StudentAccount("")
        }
    }

    "Account holder cannot be a string of whitespace" {
        shouldThrow<IllegalArgumentException> {
            StudentAccount("  ")
        }
    }

    "Can set an overdraft" {
        account.overdraft = 50
        account.overdraft shouldBe 50
    }

    "Overdraft cannot be negative" {
        shouldThrow<IllegalArgumentException> {
            account.overdraft = -1
        }
    }

    "Overdraft cannot exceed upper limit" {
        shouldThrow<IllegalArgumentException> {
            account.overdraft = MAX_OVERDRAFT + 1
        }
    }

    "Can deposit money in a StudentAccount" {
        account.deposit(100)
        account.balance shouldBe 100
    }

    "Deposit amount cannot be 0" {
        val exception = shouldThrow<IllegalArgumentException> {
            account.deposit(0)
        }
        exception shouldHaveMessage "Deposit amount must be greater than 0"
    }

    "Deposit amount cannot be negative" {
        val exception = shouldThrow<IllegalArgumentException> {
            account.deposit(-1)
        }
        exception shouldHaveMessage "Deposit amount must be greater than 0"
    }

    "Can withdraw money from an in-credit StudentAccount" {
        account.deposit(100)
        account.withdraw(50)
        account.balance shouldBe 50

    }

    "Can withdraw money from in-credit StudentAccount, leaving balance at 0" {
        account.deposit(50)
        account.withdraw(50)
        account.balance shouldBe 0
    }

    "Can withdraw amounts up to overdraft" {
        account.overdraft = 50
        account.withdraw(50)
        account.balance shouldBe -50
    }

    "Cannot exceed overdraft limit" {
        val exception = shouldThrow<IllegalArgumentException> {
            account.overdraft = 50
            account.withdraw(51)
        }
        exception shouldHaveMessage "Insufficient funds for withdrawal"
    }

    "Withdrawal amount cannot be 0" {
        val exception = shouldThrow<IllegalArgumentException> {
            account.withdraw(0)
        }
        exception shouldHaveMessage "Withdrawal amount must be greater than 0"
    }

    "Withdrawal amount cannot be negative" {
        val exception = shouldThrow<IllegalArgumentException> {
            account.withdraw(-1)
        }
        exception shouldHaveMessage "Withdrawal amount must be greater than 0"
    }

    "Correct checking of whether withdrawals are allowed" {
        withClue("Balance 0") {
            account.withdrawalsAllowed() shouldBe false
        }
        withClue("Balance 1") {
            account.deposit(1)
            account.withdrawalsAllowed() shouldBe true
        }
        withClue("Balance 0, Overdraft 1") {
            val acc = StudentAccount("Test")
            acc.overdraft = 1
            acc.withdrawalsAllowed() shouldBe true
        }
        withClue("Balance -1, Overdraft 1") {
            val acc = StudentAccount("Test")
            acc.overdraft = 1
            acc.withdraw(1)
            acc.withdrawalsAllowed() shouldBe false
        }
    }

    "StudentAccount has correct string representation" {
        withClue("Balance 0, Overdraft 0") {
            account.toString() shouldBe "Account for Sarah, balance = 0 (overdraft = 0)"
        }
        withClue("Balance 50, Overdraft 100") {
            account.deposit(50)
            account.overdraft = 100
            account.toString() shouldBe "Account for Sarah, balance = 50 (overdraft = 100)"
        }
    }
})
