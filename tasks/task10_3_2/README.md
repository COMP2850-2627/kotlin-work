# Task 10.3.2

The provided code is the same as Task 10.1, with the call to `display()`
uncommented.

1. Verify that there is an 'argument type mismatch' error in this code.

2. Modify the implementation of `display()` to look like this:

   ```kotlin
   display(text: String?) {
      when (text) {
         null -> println("?")
         else -> println(text.uppercase())
      }
   }
   ```

3. Run `./kotlin build` again. It should complete without errors.

4. Run the program to verify that it behaves as expected, for both
   translatable and untranslatable words.
