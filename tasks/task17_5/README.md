# Task 17.5

This is a Kotlin Toolchain project, containing Version 4 of the graphics
application case study.

Note: unlike earlier versions, the project is organized as two separate
**modules**. The `app` module contains the application itself, whereas the
`lib` module contains the image handling library needed by the application.

To build & run the application on Linux or macOS, do

    ./kotlin run

On Windows, use `.\kotlin.bat` instead of `./kotlin`.

## Discussion of Source Code

This final version of the application has the ability to draw images as well
as shapes. The relevant source code can be found in `app/src`.

As in Version 3, circles, rectangles and other shapes are represented as
subclasses of an abstract `Shape` class.

Images, however, are represented differently. If you look at `Image.kt`,
you can see that the `Image` class inherits from a *different* class,
`Bitmap`. This class isn't part of the the application itself, but is
provided as a separate software library.

Given that the shape classes and the image class belong to different class
hierarchies, the only way of drawing both shapes *and* images polymorphically
is to have the shape classes and the image class implement a common interface,
`Drawable`. You can see this implemented in `Drawable.kt`. It specifies a
single method, `draw()`. If you look at `Shape.kt`, you'll see that the
`Shape` class no longer specifies this `draw()` method, but the class remains
abstract to prevent creation of `Shape` objects.

The `Picture` class also changes in this new version of the application.
It now represents a picture as a list of instances of classes that implement
`Drawable`, rather than a list of instances of classes that inherit from
`Shape`. This allows it to store images as well as shapes.
