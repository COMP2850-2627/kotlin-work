# Task 15.4.2

This is a KT project, containing Version 2 of the graphics application
case study.

The application uses Java's Swing UI framework and displays a canvas on
which a collection of graphic elements are drawn.

To build & run the application on Linux or macOS, do

    ./kotlin run

On Windows, use `.\kotlin.bat` instead of `./kotlin`.

## Discussion of Source Code

This improves on Version 1 by exploiting polymorphism.

Look at the `Shape` class first. Notice that it now has a `draw()` method,
declared as `open` for overriding, but that the method body is empty. This
method has no meaningful implementation. It exists solely to be overridden
by subclasses, thus enabling **dynamic binding** to take place.

Next, look at the new implementation of `draw()` in `Picture`. Compare it
with the implementation in Version 1. This new version exploits polymorphism,
and is much more maintainable. It won't need to be changed if a new kind of
shape is added to the application.

To prove this, edit `Main.kt` and uncomment the line that adds a `Triangle`
object to the picture. Rebuild and rerun the application. You should now see
a red triangle in addition to the other shapes.

**No changes were needed to the `Picture` class in order for this to happen.**
The shape drawing code in `Picture` will work for any class we write in the
future, so long as that class inherits from `Shape` and overrides `draw()`.
