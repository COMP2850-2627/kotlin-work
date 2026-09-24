# Computing a Median

Copy the file `Stats.kt` from your [Task 7.7.1][task] solution into the
directory `median/src`. This will give you most of the code you need for this
part of the assignment.

Study the file `MedianTest.kt`, in the `test` subdirectory. This is an
incomplete set of unit tests for the `median()` function. Currently, it tests
only that the function throws an exception when invoked on an empty list.

Run the tests with

    ./kotlin test -m median

A single failed test should be reported.

Modify your implementation of `median()` so that it throws the required
exception. Rerun the tests and make sure that the failing test now passes.

To complete the assignment, add **four** more tests to `MedianTest.kt`.
These should check that the function behaves correctly when invoked on lists
containing 1, 2, 3 and 4 elements. Be sure to use appropriate Kotest matchers
in your tests (see [Section 6.5][sec65]), and choose each test case carefully
so that the test will fail if a median isn't being calculated correctly.

If the tests reveal any problems with your implementation of `median()`, fix
them. When you have five well-chosen tests that all pass, you will have
completed this part of the assignment sucessfully.


[sec65]: https://comp2850.github.io/kotlin-guide/testing1/kotest
[task]: https://comp2850.github.io/kotlin-guide/collect/tasks/#task-7-7-1
