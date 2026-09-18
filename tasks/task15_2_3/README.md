# Task 15.2.3

1. Examine `BankAccount.kt`.

   Notice that `balance` has been given a custom setter that is **private**.

   This means that only code within `BankAccount` has permission to
   assign to `balance` directly. The methods `deposit()` and `withdraw()`
   constitute the public API for altering the balance on an account.

2. Edit `SavingsAccount.kt` and implement the `SavingsAccount` class in this
   file, as indicated by the class diagram in Programming Guide.

   Note that the `rate` property should be a `val`. The `applyInterest()`
   method should treat `rate` as as a percentage and use it to compute
   the accrued interest. It should then deposit the computed amount in the
   account.

   Check that both classes compile, using

       ./kotlin build

3. Edit `Main.kt` and modify `main()` so that it

   * Creates a savings account with an interest rate of 1.8%
   * Deposits £1,250 in the account
   * Accrues interest for 5 years, by invoking `applyInterest()` 5 times
   * Withdraws £50 from the account
   * Displays the final balance of the account

   Run your program with

       ./kotlin run

## Using Windows

Invoke the Kotlin Toolchain with `.\kotlin.bat` instead of `./kotlin`.

## IntelliJ IDE

If you are using IntelliJ, you should be able to open this directory as an
IntelliJ Project. The IDE should create a run configuration that can be
used to run the application.
