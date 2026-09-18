# Task 3.5

1. Create a program in `src/Main.kt` that writes some text to a file named
   `test.txt`, using the `writeText()` extension function of a `Path` object.

   Run the program to check that the text is written correctly to the file.

2. Add another call to `writeText()`. Run the program and check that the
   file contains only the text written by this second function fall.

3. Change the second call so that `appendText()` is called, instead of
   `writeText()`. Check that the file now contains the text written by both
   function calls.

4. Add code that uses `readText()` to read from `test.txt`. Print the string
   returned by this function call. Run the program and check that the printed
   string matches the contents of the file.
