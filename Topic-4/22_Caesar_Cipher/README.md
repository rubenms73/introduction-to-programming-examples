# 22 Caesar cipher

## Problem statement

Write a program that reads a text and prints it encrypted with a simple Caesar cipher that moves every letter one position forward in the alphabet: a becomes b, b becomes c, and z becomes a. Uppercase letters work the same way, and non-letter characters remain unchanged.

Then write a method that decrypts the text, moving each letter one position back, and check that it recovers the original text.

Suggested approach: process the text character by character. A letter moves to the next one, except z and Z, which go back to the start of the alphabet. Decrypting does the opposite.

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

Use indexed arrays, loops and the text operations taught in Topic 4: `length()`, `charAt()`, `equals()`, concatenation, `next()` and `nextLine()`. Write every traversal explicitly.
