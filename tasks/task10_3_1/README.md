# Task 10.3.1

The provided code is the same as Task 10.1, with the call to `display()`
uncommented.

1. Verify that there is an 'argument type mismatch' error, using

       ./kotlin build

2. Replace the call to `display()` with this `when` expression:

   ```kotlin
   when (result) {
      null -> println("?")
      else -> display(result)
   }
   ```

3. Run the `build` command again. It should complete without errors.

4. Run the program to verify that it behaves as expected. You should now
   see a `?` displayed for untranslatable words, instead of `null`.
