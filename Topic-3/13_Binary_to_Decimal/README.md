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

From this folder:

```sh
javac *.java
java BinaryToDecimal
```

The main method is in `BinaryToDecimal.java`. Run it and follow any input prompts.

## Prerequisites

Use the constructs introduced in Topic 3, including static methods, conditions and loops. Process numbers arithmetically; do not manipulate strings or arrays.

