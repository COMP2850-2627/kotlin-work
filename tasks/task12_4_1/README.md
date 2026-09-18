# Task 12.4.1

1. Examine `Point.kt`, in the `src` subdirectory of the project.

2. Edit `Circle.kt`. In this file, implement a new class named `Circle`.
   Give your class two `val` properties:

   * `centre`, a `Point` object representing the circle's centre
   * `radius`, a `Double` value representing the radius

   Check that the class compiles, using

       ./kotlin build

3. Add an `init` block to `Circle` that guarantees `radius` will be greater
   than zero when a `Circle` object is created.

4. Add methods `area()` and `perimeter()` to `Circle`. These methods should
   have no parameters. They should return the area and perimeter,
   respectively, of the circle.

5. Add a method `contains()` to `Circle`. This should have a single parameter,
   of type `Point`. It should return `true` if the given point is inside
   the circle, `false` otherwise. The point should be considered inside if
   the distance from it to the centre of the circle is less than or equal to
   the radius.

6. In `Main.kt`, write a program that creates a `Circle` object and then
   demonstrates the use of its three methods.

   Run the program with

       ./kotlin run

## Using Windows

The commmands shown above assume you are using Linux or macOS. If you are
working on a Windows system, invoke the Kotlin Toolchain with `.\kotlin.bat`
instead of `./kotlin`.

## IntelliJ IDE

If you are using IntelliJ, you should be able to open this directory as an
IntelliJ Project. The IDE should create a run configuration that can be
used to run the application.
