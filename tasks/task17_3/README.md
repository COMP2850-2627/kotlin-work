# Task 17.3

This is a simple example of creating and implementing an interface.

1. Edit `Printable.kt`. In this file, define an interface named `Printable`.
   This should specify a single abstract method named `print()`, with an
   empty parameter list.

2. Edit `Document.kt`. Add a class named `Document` to this file, with a
   `val` property named `filename`, of type `String`.

3. Make your `Document` class implement the `Printable` interface. Your
   implementation of `print()` should display "Printing " on the console,
   followed by the value of the `filename` property.

4. Compile and run the program, with

       ./kotlin run
