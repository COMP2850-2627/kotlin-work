# Task 12.3.1

1. Study the code in `Point.kt` and `Main.kt`, then verify that the program
   runs using

       ./kotlin run

2. Edit `Main.kt` and modify the line that creates the `Point` object,
   removing the values that have been supplied for x and y coordinates. Try
   recompiling with

       ./kotlin build

   What errors do you see?

3. Modify the class definition so that it includes the secondary constructor
   described in the Programming Guide. Compile and run the program to verify
   that this fixes the issue.

4. Now add these lines to `main()`:

   ```kotlin
   val q = Point(4, 7)
   println("(${q.x}, ${q.y})")
   ```

   Try recompiling the code. What happens?

5. Add another secondary constructor to `Point` that fixes the issue.
   Verify that the program compiles and runs successfully.
