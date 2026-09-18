# Task 16.3

This is a Kotlin Toolchain project, containing Version 3 of the graphics
application case study.

The application uses Java's Swing UI framework and displays a canvas on
which a collection of graphic elements are drawn.

To build & run the application on Linux or macOS, do

    ./kotlin run

On Windows, use `.\kotlin.bat` instead of `./kotlin`.

## Discussion of Source Code

The only difference between this version and Version 2 is that `Shape` is
now an **abstract class**, with an abstract `draw()` method.

If you build and run the application, you should see the same picture as
for Version 2.

However, if you attempt to create an actual `Shape` object and add it to the
picture, this will now be a compiler error. You are not allowed to create
instances of an abstract class.
