# 06 First Fibonacci Number Above a Limit

## Problem statement

**Input and behaviour:** Use a positive integer limit no greater than 1000000000; report values outside that interval.

Write a program that reads a positive limit and prints the first Fibonacci number greater than that limit.

The program must also print the position of that Fibonacci number in the sequence.

Suggested approach: start from the first Fibonacci values and continue while the current value is not greater than the limit. Keep a counter for the position.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 FirstFibonacciAboveLimit.java
java -cp "." FirstFibonacciAboveLimit
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 FirstFibonacciAboveLimit.java
java -cp "." FirstFibonacciAboveLimit
```

The main method is in `FirstFibonacciAboveLimit.java`. Run it and follow any input prompts.

## Prerequisites

Use the constructs introduced in Topic 3, including static methods, conditions and loops. Process numbers arithmetically; do not manipulate strings or arrays.

