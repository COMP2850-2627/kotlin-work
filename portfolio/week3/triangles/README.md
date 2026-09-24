# Triangles

Copy the file `Triangles.kt` from your Week 2 solution into the directory
`triangles/src`. This will give you most of the code you need for this part
of the assignment.

Study the source files in the `test` subdirectory, so that you understand
how your code will be tested. See [Section 6.5][sec65] for explanations.

Run the tests with

    ./kotlin test -m triangles

If your implementation from Week 2 was successful, there should be 8 passing
tests and 2 failing tests.

Modify `triangleArea()` so that it throws the required exception if a triangle
is invalid. You should obviously use the existing function `isValidTriangle()`
to help you determine this.

Rerun the tests. If all ten of them pass, you have completed this part of
the assignment successfully.


[sec65]: https://comp2850.github.io/kotlin-guide/testing1/kotest
