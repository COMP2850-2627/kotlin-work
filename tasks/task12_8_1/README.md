# Task 12.8.1

1. Edit `Day.kt`. Add the `Day` enum class shown in the notes.

2. Edit `Main.kt`. Add a `main()` function that asks the user to enter a day
   reads that day as a string, then attempts to parse the string using
   `Day.valueOf()`.

3. Compile and run the program, with

       ./gradlew run

   (Use `.\gradlew.bat run` on a Windows system.)

   Try entering `Monday` as the string. Run it again, this time entering
   `monday`. What happens?

4. Modify the program so that it handles errors more gracefully and indicates
   to the user what their options are.
