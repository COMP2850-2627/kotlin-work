# Task 15.4.1

This is a KT project, containing Version 1 of the graphics application
case study.

The application uses Java's Swing UI framework and displays a canvas on
which a collection of graphic elements are drawn.

To build & run the application on Linux or macOS, do

    ./kotlin run

On Windows, use `.\kotlin.bat` instead of `./kotlin`.

## Discussion of Source Code

Look first at how `Shape` and its subclasses `Circle` and `Rectangle` are
defined. Notice that these subclasses contain a `draw()` method, but `Shape`
does not.

Then examine the `Picture` class. Notice that it represents a picture as a
list of `Shape` objects - or, more accurately, as a list of instances
of classes that inherit from `Shape`. Look at the `draw()` method of this
class. Notice how it needs to do run time type identification using `is`, to
determine the actual types of shape stored in the list. This triggers a
'smart cast' of the object in the list, allowing it to be treated as an
instance of the appropriate type, and therefore allowing the relevant
`draw()` method to be called in each case.

**This is bad, non-polymorphic code**.  Every time a new kind of shape is
added to the application, the `draw()` method of `Picture` will need to be
modified to cope with the new type.
