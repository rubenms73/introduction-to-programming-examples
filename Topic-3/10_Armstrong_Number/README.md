# 10 Armstrong Number

## Problem statement

Write a program that reads a three-digit positive integer and determines whether it is an Armstrong number.

A three-digit number is an Armstrong number if it is equal to the sum of the cubes of its digits. For example, `153` is an Armstrong number because `1^3 + 5^3 + 3^3 = 153`.

Suggested approach: extract the hundreds, tens and units digits. Cube each digit, add the three results and compare the sum with the original number.

Optional extension: generalise the solution so that it works for numbers with any number of digits.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 ArmstrongNumber.java
java -cp "." ArmstrongNumber
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 ArmstrongNumber.java
java -cp "." ArmstrongNumber
```

The main method is in `ArmstrongNumber.java`. Run it and follow any input prompts.

## Prerequisites

Use the constructs introduced in Topic 3, including static methods, conditions and loops. Process numbers arithmetically; do not manipulate strings or arrays.
