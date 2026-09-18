# 19 Rotate an Array

## Problem statement

**Input and behaviour:** Print the resulting array with an indexed loop, one value per line.

Write a program that reads an array of integers and rotates its elements one position to the right.

For example, `{4, 8, 1, 6}` becomes `{6, 4, 8, 1}`.

Suggested approach: save the last element before overwriting anything. Then move the remaining elements from right to left and place the saved value at the beginning.

Optional extension: rotate the array `k` positions.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 RotateArray.java
java -cp "." RotateArray
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 RotateArray.java
java -cp "." RotateArray
```

The main method is in `RotateArray.java`. Run it and follow any input prompts.

## Prerequisites

Use indexed arrays, loops and the text operations taught in Topic 4: length(), charAt(), equals(), concatenation, next() and nextLine(). Implement traversals explicitly.

