# Task 12.5.2

1. Edit `Person.kt`. Modify the definition of `Person` to look like this:

   ```kotlin
   class Person(_name: String, val birth: LocalDate) {

      var isMarried = false

      var name = _name
          get() {
              return field.uppercase()
          }
   }
   ```

2. Edit `Main.kt`. Add a `main()` function that creates a `Person` object
   and then prints that person's name.

3. Compile and run the program, with

       ./kotlin run

   You should see the name printed in uppercase.
