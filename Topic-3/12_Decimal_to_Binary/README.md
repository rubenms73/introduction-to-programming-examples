# 12 Decimal to Binary

## Problem statement

**Input and behaviour:** Print the remainders immediately, from least significant digit to most significant digit. Input 10 produces 0101, and input 0 produces 0. Do not build or reverse a string.

Write a program that reads a non-negative decimal integer and prints its binary digits in reverse order (least significant digit first). For example, input 10 must print 0101; input 0 must print 0.

Repeatedly print the remainder of division by two, then replace the number with its integer quotient. Print each digit immediately, without storing or reversing the result. Do not use arrays or string manipulation. Handle zero separately and report negative input. In Topic 4, this exercise can be revisited using arrays or strings to display the digits in the usual order.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 DecimalToBinary.java
java -cp "." DecimalToBinary
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 DecimalToBinary.java
java -cp "." DecimalToBinary
```

The main method is in `DecimalToBinary.java`. Run it and follow any input prompts.

## Prerequisites

Use the constructs introduced in Topic 3, including static methods, conditions and loops. Process numbers arithmetically; do not manipulate strings or arrays.

