# Triangles

Edit `triangles/src/Triangles.kt`. Notice how it defines a data structure
named `Triangle`, which is simply an alias for `Triple<Double,Double,Double>`.
The purpose of this triple is to bundle together three values that represent
the lengths of a triangle's three sides.

Your task is to add functions named `isValidTriangle()` and `triangleArea()`
to this file. Each of these functions should have a single parameter, of
type `Triangle`. The return type of `isValidTriangle()` should be `Boolean`,
and the return type of `triangleArea()` should be `Double`.

Start by creating suitable **stubs** (i.e., empty implementations) for these
functions. Your stub for `isValidTriangle()` should return `false`, and your
stub for `triangleArea()` should return `0.0`.

Next, run the tests for the two functions by entering the following command,
from within the `week2` subdirectory:

    ./kotlin test -m triangles

Some of the tests will pass, but most should fail.

Your goal now is to replace the stubs with valid implementations of the two
functions, so that the tests all pass. If all of these tests pass, you
have completed this part of the assignment successfully.

Your implementation of `isValidTriangle()` should return `true` if the three
sides lengths in the provided `Triangle` object represent a valid triangle,
`false` if they do not. **The test for validity is that each side length
should be smaller than the sum of the other two side lengths.**

Your implementation of `triangleArea()` should reuse the code you wrote
for your Week 1 portfolio solution. **Note that your function should not print
anything on screen!** It should simply return the computed triangle area to
the caller.
