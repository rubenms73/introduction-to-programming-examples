# 20 Merge Two Sorted Arrays

## Problem statement

**Input and behaviour:** Print the merged array with an indexed loop, one value per line.

Write a program that receives two sorted arrays and creates a third sorted array containing all their elements.

For example, merging `{1, 4, 8}` and `{2, 3, 9}` should produce `{1, 2, 3, 4, 8, 9}`.

Suggested approach: use one index for each input array and one index for the result. Repeatedly copy the smaller current value into the result array.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 MergeSortedArrays.java
java -cp "." MergeSortedArrays
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 MergeSortedArrays.java
java -cp "." MergeSortedArrays
```

The main method is in `MergeSortedArrays.java`. Run it and follow any input prompts.

## Prerequisites

Use indexed arrays, loops and the text operations taught in Topic 4: length(), charAt(), equals(), concatenation, next() and nextLine(). Implement traversals explicitly.

