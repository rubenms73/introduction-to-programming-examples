# 08 Numeric Palindrome

## Problem statement

**Input and behaviour:** Use a positive int. Reverse the digits numerically in a long variable; do not convert the number to text.

Write a program that reads a positive integer and determines whether it is a palindrome.

In this exercise, you must solve the problem using arithmetic operations on digits, not by converting the number into a string.

Suggested approach: keep a copy of the original number. Build the reversed number digit by digit using `% 10` and `/ 10`. At the end, compare the reversed number with the original one.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 NumericPalindrome.java
java -cp "." NumericPalindrome
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 NumericPalindrome.java
java -cp "." NumericPalindrome
```

The main method is in `NumericPalindrome.java`. Run it and follow any input prompts.

## Prerequisites

Use the constructs introduced in Topic 3, including static methods, conditions and loops. Process numbers arithmetically; do not manipulate strings or arrays.

