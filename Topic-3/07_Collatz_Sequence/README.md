# 07 Collatz Sequence

## Problem statement

**Input and behaviour:** Use positive starting values no greater than 1000000 for this classroom exercise.

Write a program that reads a positive integer and prints its Collatz sequence.

At each step, if the number is even, divide it by two. Otherwise, multiply it by three and add one. The sequence finishes when the number reaches `1`. The program must also print the number of steps needed to reach `1`.

Suggested approach: use a loop that continues while the current number is different from `1`. Inside the loop, use an `if` statement to choose the update rule.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 CollatzSequence.java
java -cp "." CollatzSequence
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 CollatzSequence.java
java -cp "." CollatzSequence
```

The main method is in `CollatzSequence.java`. Run it and follow any input prompts.

## Prerequisites

Use the constructs introduced in Topic 3, including static methods, conditions and loops. Process numbers arithmetically; do not manipulate strings or arrays.

