# Task 12.5.4

1. Edit `Person.kt`. Add the following import to the file:

   ```kotlin
   import kotlinx.datetime.yearsUntil
   ```

2. Examine `Dates.kt`. This contains a function named `today()` that returns
   today's date, as a `LocalDate` object.

2. Add a computed property named `age` to the `Person` class. This should
   use the `yearsUntil()` extension function to compute the number of
   whole years between a person's birth date and today's date:

   ```kotlin
   val age get() = birth.yearsUntil(today())
   ```

3. Add a `main()` function to `Main.kt`. This program should create a `Person`
   object and then print the value of that object's `age` property.

4. Compile and run the program. Check that it is calculating age correctly.
