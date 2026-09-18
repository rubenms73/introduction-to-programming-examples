# 05 Fibonacci Number

## Problem statement

**Input and behaviour:** Use 1 <= n <= 92 so that the Fibonacci result fits in long; report other values as invalid.

Write a program that reads a positive integer `n` and prints the `n`th Fibonacci number.

Assume that the first two Fibonacci numbers are `1` and `1`.

Suggested approach: keep the two previous Fibonacci values in two variables. In each iteration, calculate the next value and update both variables carefully.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 FibonacciNumber.java
java -cp "." FibonacciNumber
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 FibonacciNumber.java
java -cp "." FibonacciNumber
```

The main method is in `FibonacciNumber.java`. Run it and follow any input prompts.

## Prerequisites

Use the constructs introduced in Topic 3, including static methods, conditions and loops. Process numbers arithmetically; do not manipulate strings or arrays.

