# Task 8.4.2

A demonstration of the performance benefits of sequences.

`Benchmark.kt` contains code to operate on a text file in two different ways,
with and without using sequences.

The name of the file should be supplied on the command line. We have provided
a large file (Leo Tolstoy's *War And Peace*) for testing purposes. This is
over 3 MB in size and has over 66,000 lines of text.

Run the application with

    ./kotlin run war-and-peace.txt

(Use `.\kotlin.bat` if running this on a Windows system.)

You will see timings displayed for the two operations.
