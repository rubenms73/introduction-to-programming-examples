# 26 Reverse the Order of Words

## Problem statement

**Input and behaviour:** Build the word array using length(), charAt() and concatenation. Keep this exercise self-contained; do not import another exercise.

Write a program that reads a sentence and prints its words in reverse order, without using `String.split()`.

For example, `"Java is quite fun"` should be printed as `"fun quite is Java"`.

Suggested approach: first generate the array of words manually, as in the previous exercise. Then traverse that array from the last position to the first one.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 ReverseWords.java
java -cp "." ReverseWords
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 ReverseWords.java
java -cp "." ReverseWords
```

The main method is in `ReverseWords.java`. Run it and follow any input prompts.

## Prerequisites

Use indexed arrays, loops and the text operations taught in Topic 4: length(), charAt(), equals(), concatenation, next() and nextLine(). Implement traversals explicitly.

