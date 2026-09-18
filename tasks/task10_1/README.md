# Task 10.1

1. Run the program with the word "hello" as a command line argument:

       ./kotlin run hello

   It should print the French translation of this word.

2. Run the program with a word on the command line that isn't in the
   translation database (see `en-to-fr.csv`).

   It should print "null" in this case.

3. Comment out the call to `println()` and uncomment the call to `display()`.
   Attempt to recompile the program, with

       ./kotlin build

   This should fail, with an 'argument type mismatch' error.

See the Programming Guide for further discussion of what is going on here.
