# 24 Letter histogram

## Problem statement

**Input and behaviour:** Count the English letters A-Z and a-z without distinguishing case, and ignore any other character. Use character comparisons and arithmetic.

Write a program that reads a text and calculates a histogram with the number of times each letter from `a` to `z` appears.

The program should ignore case, spaces and punctuation marks. For example, `Java!` contains two `a` letters, one `j` and one `v`.

Suggested approach: use an array of 26 counters. Traverse the text character by character, convert each letter to lowercase and increment the corresponding counter.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 LetterHistogram.java
java -cp "." LetterHistogram
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 LetterHistogram.java
java -cp "." LetterHistogram
```

The main method is in `LetterHistogram.java`. Run it and follow any input prompts.

## Prerequisites

Use indexed arrays, loops and the text operations taught in Topic 4: `length()`, `charAt()`, `equals()`, concatenation, `next()` and `nextLine()`. Write every traversal explicitly.
