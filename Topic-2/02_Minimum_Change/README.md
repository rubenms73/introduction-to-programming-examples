# 02 Minimum Change

## Problem statement

**Input and behaviour:** Input is a non-negative amount in cents that fits in int. Use only sequential statements and individual variables; print every denomination count.

Write a program that reads a non-negative amount of money in cents and prints the minimum number of notes and coins of each denomination needed to represent it.

Use euro denominations from 500 euro notes down to 1 cent coins. Write a separate sequence of integer divisions and remainder operations for each denomination, using individual variables. Print every count, including zero counts. Do not use arrays, loops or conditional statements.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 MinimumChange.java
java -cp "." MinimumChange
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 MinimumChange.java
java -cp "." MinimumChange
```

The main method is in `MinimumChange.java`. Run it and follow any input prompts.

## Prerequisites

Use the main/Scanner templates, primitive variables, arithmetic, assignment and console output. No conditionals, loops, arrays or helper methods.

