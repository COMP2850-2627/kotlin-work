# Task 12.3.2

1. Edit `Person.kt`. Add to this file the `Person` class definition described
   in the Programming Guide. Check that the code compiles, with

       ./kotlin build

2. Edit `Main.kt`. Add to this file a `main()` function that creates a
   `Person` object and then prints the person's name, date of birth and
   marital status.

   Check that your program compiles and runs successfully, with

       ./kotlin run

3. Dates are often manipulated as strings, in the standard ISO 8601 format
   (e.g., `"1997-08-23"`). Add a secondary constructor to `Person` that
   allows date of birth to be supplied as such a string.

   Check that your code compiles before moving on to the final step.

4. Modify `main()` so that when the `Person` object is created, date of
   birth is now specified as a string. Recompile and rerun the program to
   verify that it behaves as expected.
