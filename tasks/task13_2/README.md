# Task 13.2

1. Examine `Time.kt`. This contains a class to represent time on a 24-hour
   clock. A `Time` object as properties representing hours, minutes and
   econds, and the values provided for these are check to ensure that the
   object will be in a valid state.

   A `Time` object has a computed property, `secondsSinceMidnight`, which
   represents the time as a count of the number of seconds that have elapsed
   since 00:00:00.

   A `Time` object has a sensible string representation in "HH:MM:SS" format,
   produced by the overridden `toString()` method.

   The `advancedBy()` method can be used to move forward in time by a given
   number of seconds. The result of this calculation is returned as a new
   `Time` object, leaving the receiver of the call unchanged.

2. Study the demo program in `Main.kt`, then try running it with

       ./gradlew run

3. Study the unit tests in `TimeTest.kt`, then run them with

       ./gradlew test

   They should all pass.

4. Refactor the tests in `TimeTest.kt`, creating a test fixture and removing
   unnecessary code duplication - see the Programming Guide for further
   details of how to do this.

5. Rerun the tests, to check that they compile and that they still pass.
