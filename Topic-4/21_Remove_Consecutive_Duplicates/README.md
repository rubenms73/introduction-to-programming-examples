# 21 Remove Consecutive Duplicates

## Problem statement

**Input and behaviour:** Print the result with an indexed loop, one value per line.

Write a program that receives a sorted array and creates a new array without repeated consecutive values.

For example, `{1, 1, 2, 2, 2, 5, 7, 7}` becomes `{1, 2, 5, 7}`.

Suggested approach: because the array is sorted, equal values are together. First count how many different values there are, then create and fill the result array.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 RemoveConsecutiveDuplicates.java
java -cp "." RemoveConsecutiveDuplicates
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 RemoveConsecutiveDuplicates.java
java -cp "." RemoveConsecutiveDuplicates
```

The main method is in `RemoveConsecutiveDuplicates.java`. Run it and follow any input prompts.

## Prerequisites

Use indexed arrays, loops and the text operations taught in Topic 4: length(), charAt(), equals(), concatenation, next() and nextLine(). Implement traversals explicitly.

