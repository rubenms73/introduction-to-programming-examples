# 22 Caesar Cipher

## Problem statement

Write a program that reads a text and an integer shift, and prints the text encrypted with the Caesar cipher.

Letters must be shifted by the indicated amount. Non-letter characters should remain unchanged.

Suggested approach: process the text character by character. For letters, calculate their new position inside the alphabet; for other characters, copy them unchanged.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 CaesarCipher.java
java -cp "." CaesarCipher
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 CaesarCipher.java
java -cp "." CaesarCipher
```

The main method is in `CaesarCipher.java`. Run it and follow any input prompts.

## Prerequisites

Use indexed arrays, loops and the text operations taught in Topic 4: length(), charAt(), equals(), concatenation, next() and nextLine(). Implement traversals explicitly.
