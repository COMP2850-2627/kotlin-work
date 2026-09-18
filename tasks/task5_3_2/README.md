# Task 5.3.2

See the Programming Guide for full details of this task.

1. Implement the `rollDice()` function in `src/Dice.kt`. This function should
   have two parameters:

   - The number of dice to roll (default = 1)
   - The number of die sides (default = 6)

2. Implement a `main()` function in `src/Main.kt` that accepts a 'dice
   specification' as its only command line argument.

   A dice specification considers of the number of dice to roll, followed
   by the character `d`, followed by the number of die sides.

   Examples: 3d6, 2d12, 1d8

   Your program should parse this dice specification and then invoke
   `rollDice()` accordingly.
