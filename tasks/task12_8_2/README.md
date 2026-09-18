# Task 12.8.2

A Kotlin Toolchain project for the playing cards task. Source code can be
found in the `src` subdirectory.

`Suit.kt` contains the enum class for playing card suits that is discussed
in the Programming Guide.

You need to implement a comparable enum class for playing card ranks, in
the file `Rank.kt`, as instructed by the Programming Guide.

After that, edit `Card.kt` and define a `Card` class there. This class
should have a property named `rank`, of type `Rank`, and a property named
`suit`, of type `Suit`.

The `Card` class will also need a computed property named `fullName` and an
overridden `toString()` method - see the Programming Guide for more
details on those.

Finally, write a program in `Main.kt` that

* Creates a mutable list of `Card` objects, to represent a deck of cards
* Populates that list with a full set of 52 standard playing cards
* Shuffles the deck randomly
* Prints the full name of each card in the shuffled deck

## Linux & macOS Command Line

You can compile the code at any stage with

    ./kotlin build

You can run the main program with

    ./kotlin run

## Windows Command Line

Invoke the Kotlin Toolchain using `.\kotlin.bat` instead of `./kotlin`.

## IntelliJ IDE

If you are using IntelliJ, you should be able to open this directory as an
IntelliJ Project. The IDE should create a run configuration that can be
used to run the application.
