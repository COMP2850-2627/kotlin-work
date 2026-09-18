# Task 3.1

1. Write a program in `src/Main.kt` that accepts command line arguments
   and prints the values of the first two of those arguments.

2. Try running the program in the following two ways:

       ./kotlin run arg1 arg2
       ./kotlin run 'arg1 arg2'

   Do you understand why the second of these causes a runtime error?

3. Add code to check that two command line arguments have been supplied.
   If this isn't the case, the program should print a suitable message and
   then terminate by calling `exitProcess()` with a non-zero exit status.

4. Try running the program with different numbers of command line arguments,
   checking the exit status in each case:

       ./kotlin run arg1
       echo $?
       ./kotlin run arg1 arg2
       echo $?
       ./kotlin run arg1 arg2 arg3
       echo $?
