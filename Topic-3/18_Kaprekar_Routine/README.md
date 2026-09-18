# 18 Kaprekar Routine

## Problem statement

Write a program that reads a four-digit number whose digits are not all equal and repeatedly applies Kaprekar's routine until reaching `6174`.

In each step, form the largest and smallest numbers that can be made from the four digits, subtract the smaller one from the larger one, and continue with the result. The program must print every intermediate value and the number of steps.

Suggested approach: in each iteration, extract the four digits, order them to build the largest and smallest possible numbers, subtract and repeat until the result is `6174`.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 KaprekarRoutine.java
java -cp "." KaprekarRoutine
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 KaprekarRoutine.java
java -cp "." KaprekarRoutine
```

The main method is in `KaprekarRoutine.java`. Run it and follow any input prompts.

## Prerequisites

Use the constructs introduced in Topic 3, including static methods, conditions and loops. Process numbers arithmetically; do not manipulate strings or arrays.
