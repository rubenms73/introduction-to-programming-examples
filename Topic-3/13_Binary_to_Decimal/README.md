# 13 Binary to Decimal

## Problem statement

**Input and behaviour:** Read a non-negative long whose decimal digits represent binary digits. Reject negative input or digits other than 0 and 1.

Write a program that reads an integer whose digits are only `0` and `1`, and calculates its decimal value.

For example, the binary number `1011` represents the decimal value `11`.

Suggested approach: process the digits from right to left. Keep the current power of two and add it to the result whenever the current binary digit is `1`.

Optional extension: detect and report invalid digits.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 BinaryToDecimal.java
java -cp "." BinaryToDecimal
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 BinaryToDecimal.java
java -cp "." BinaryToDecimal
```

The main method is in `BinaryToDecimal.java`. Run it and follow any input prompts.

## Prerequisites

Use the constructs introduced in Topic 3, including static methods, conditions and loops. Process numbers arithmetically; do not manipulate strings or arrays.

