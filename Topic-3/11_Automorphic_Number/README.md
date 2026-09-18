# 11 Automorphic Number

## Problem statement

**Input and behaviour:** Use a positive int. Store both its square and the power of ten in long variables.

Write a program that reads a positive integer `n` and determines whether it is automorphic.

A number is automorphic if `n * n` ends with the digits of `n`. For example, `25` is automorphic because `25 * 25 = 625`.

Suggested approach: calculate `n * n`. Then find the power of ten needed to isolate the last digits of the square and compare them with `n`.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 AutomorphicNumber.java
java -cp "." AutomorphicNumber
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 AutomorphicNumber.java
java -cp "." AutomorphicNumber
```

The main method is in `AutomorphicNumber.java`. Run it and follow any input prompts.

## Prerequisites

Use the constructs introduced in Topic 3, including static methods, conditions and loops. Process numbers arithmetically; do not manipulate strings or arrays.

