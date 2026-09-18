# Task 12.9

1. Edit `Person.kt`. Modify the definition of the `Person` class, in the
   manner described in the notes.

2. Edit `Main.kt`. Add a `main()` function that attempts to create a `Person`
   in the normal way, by invoking a constructor. If you try compiling this
   code, you should see a compiler error.

3. Modify `main()` so that it attempts to create a `Person` object by
   invoking the class-level `create()` method. Verify that this new version
   of the program compiles and runs successfully.

4. Add a line to `main()` that attempts to create a second `Person` object,
   having the same value for the `name` property as the first. Verify that
   this causes a run-time error.
