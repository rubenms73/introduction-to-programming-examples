# 27 IPv4 Address Parts

## Problem statement

**Input and behaviour:** Each of the four parts contains one to three decimal digits and has a value from 0 to 255. Print one part per line or report invalid input.

Write a program that reads an IPv4 address and generates an integer array with its four parts, without using `String.split()`.

For example, `"156.35.95.10"` should produce the array `{156, 35, 95, 10}`. The program should also check that there are exactly four parts, that no part is empty and that every value is between `0` and `255`.

Suggested approach: traverse the string looking for dots. Each time a dot is found, process the current part and store its numeric value. At the end, process the final part.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 IPv4AddressParts.java
java -cp "." IPv4AddressParts
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 IPv4AddressParts.java
java -cp "." IPv4AddressParts
```

The main method is in `IPv4AddressParts.java`. Run it and follow any input prompts.

## Prerequisites

Use indexed arrays, loops and the text operations taught in Topic 4: length(), charAt(), equals(), concatenation, next() and nextLine(). Implement traversals explicitly.

