# 16 Square Root by Bisection

## Problem statement

**Input and behaviour:** Use finite numbers between 0 and 1000000 and a tolerance between 0.000000001 and 1; report values outside these intervals.

Write a program that reads a non-negative real number and approximates its square root using the bisection method.

The program must stop when the approximation error is smaller than a given tolerance, for example `0.00001`.

Suggested approach: maintain an interval that contains the solution. Test the middle point and keep the half interval where the square root must still be.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 SquareRootByBisection.java
java -cp "." SquareRootByBisection
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 SquareRootByBisection.java
java -cp "." SquareRootByBisection
```

The main method is in `SquareRootByBisection.java`. Run it and follow any input prompts.

## Prerequisites

Use the constructs introduced in Topic 3, including static methods, conditions and loops. Process numbers arithmetically; do not manipulate strings or arrays.

