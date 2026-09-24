# Redaction

[Redaction][red] is the process of removing sensitive information from a
document, typically by 'blanking out' that information in some way. Your task
here is to write a function that performs this operation on a string.

This function should be implemented in the file `redact/src/Redaction.kt`.
It should be named `redact()`, and it should have three parameters:

1. The input document, in the form of a `String` object
2. The text to be redacted from the document, also a `String` object
3. The character used in the redaction (a `Char`, defaulting to `'X'`)

The function should return the redacted document as a `String` object. It
should not print anything on screen.

For example, invoking the function with

```kotlin
redact("Hello World!", "World")
```

should return `"Hello XXXXX!"`, whereas invoking it with

```kotlin
redact("Hello World!", "World", '-')
```

should return `"Hello -----!"`.

As with the triangle geometry functions, the first step is to write the
function as a stub that simply returns a fixed string. This will allow you
to run the tests:

    ./kotlin test -m redact

These tests should compile and run but fail. At this point, you can proceed
with rewriting the function so that it behaves in the manner described above.

You will find it useful to consult the [API documentation for `String`][api].
Select the 'Members & Extensions' tab, then scroll down the list of extension
functions to see if there is anything there that can help...

When all of the tests pass, you will have completed this part of the
assignment successfully.

Optionally, you can perform some extra manual testing by running the small
program provided in `redact/src/Main.kt`. This expects three command line
arguments: the text to be redacted (enclosed in quotes if it contains spaces),
the filename of the input document, and a filename for the output document.
You can run the program like this:

    ./kotlin run -m redact "Hello World" document.txt redacted.txt


[red]: https://en.wikipedia.org/wiki/Redaction
[api]: https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/
