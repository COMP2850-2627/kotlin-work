# Task 15.2.1

1. Add the following class definitions to `Classes.kt`:

   ```kotlin
   open class Parent

   class Child : Parent()
   ```

2. Try compiling the code, with

       ./kotlin build

   This should succeed.

3. Add a subclass of `Child` to the file:

   ```kotlin
   class GrandChild : Child()
   ```

   Try recompiling. Take note of the compiler error message.

4. Fix the problem and then verify that the file compiles successfully. 
