# Task 12.5.1

1. Examine `Person.kt`. This file contains an implementation of the `Person`
   class seen previously.

2. Compile `Person.kt` with

       ./kotlin build

3. cd into this directory:

       build/artifacts/CompiledJvmArtifact/task12_5_1jvm/kotlin-output/

   You should see a file named `Person.class`, containing the Java bytecode
   representation of the class.

4. Run the Java class disassembler tool on the class, like so:

       javap -p Person

   Study the output carefully.

See the Programming Guide for further discussion of this task.
