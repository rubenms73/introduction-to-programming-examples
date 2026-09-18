# 14 Longest Run in a Sequence

## Problem statement

Write a program that reads a sequence of positive integers ending in `0` and prints the length of the longest run of equal consecutive values.

For example, in the sequence `4 4 2 7 7 7 3 3 0`, the longest run has length `3`.

Suggested approach: remember the previous value, the length of the current run and the best run found so far. When the current value changes, restart the current run.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 LongestRunInSequence.java
java -cp "." LongestRunInSequence
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 LongestRunInSequence.java
java -cp "." LongestRunInSequence
```

The main method is in `LongestRunInSequence.java`. Run it and follow any input prompts.

## Prerequisites

Use the constructs introduced in Topic 3, including static methods, conditions and loops. Process numbers arithmetically; do not manipulate strings or arrays.
