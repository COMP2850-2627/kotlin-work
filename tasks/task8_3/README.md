# Task 8.3

See the Programming Guide for full details of this task.

In `src/Funcs.kt`, you need to complete the implementation of `fetchData()`
so that it reads station and temperature details from the named CSV file. An
example file is provided in `temps.csv`.

Note: you can adapt your solution to Task 7.7.1 here!

In `src/Main.kt`, you need to write a `main()` function that reads data
from a file named on the command line and then displays

- Details of the station with the lowest temperature
- Details of the station with the highest temperature
- Average temperature for all stations in the file

Test your solution with

    ./kotlin run temps.csv

Make sure your solution handles the case of a missing command line argument
in a sensible way.
