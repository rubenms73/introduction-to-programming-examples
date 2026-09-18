# 23 Anagrams

## Problem statement

**Input and behaviour:** Use non-empty English words containing letters A-Z or a-z. Ignore letter case using character comparisons and arithmetic.

Write a program that reads two words and determines whether they are anagrams.

An anagram is a word or phrase formed by rearranging the letters of another word or phrase. In this exercise, two words are anagrams if they contain exactly the same letters with the same frequencies. For example, `listen` and `silent` are anagrams.

Suggested approach: use an array of counters for the letters. Increment counters with the first word and decrement them with the second one. At the end, all counters should be zero.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 Anagrams.java
java -cp "." Anagrams
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 Anagrams.java
java -cp "." Anagrams
```

The main method is in `Anagrams.java`. Run it and follow any input prompts.

## Prerequisites

Use indexed arrays, loops and the text operations taught in Topic 4: length(), charAt(), equals(), concatenation, next() and nextLine(). Implement traversals explicitly.

