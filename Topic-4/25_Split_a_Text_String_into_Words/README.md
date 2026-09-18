# 25 Split a Text String into Words

## Problem statement

**Input and behaviour:** Build each word by appending its characters. Use length(), charAt() and concatenation, without split(), substring() or array utility methods. Print one word per line.

Write a program that reads a sentence and generates an array with its words, without using `String.split()`.

The program should ignore leading, trailing and repeated spaces. For example, `"  Java   is fun  "` should produce the words `"Java"`, `"is"` and `"fun"`.

Suggested approach: first count the words by traversing the string and detecting transitions from spaces to non-space characters. Then create the array and traverse the string again to build each word by appending its characters with `charAt()`.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 SplitIntoWords.java
java -cp "." SplitIntoWords
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 SplitIntoWords.java
java -cp "." SplitIntoWords
```

The main method is in `SplitIntoWords.java`. Run it and follow any input prompts.

## Prerequisites

Use indexed arrays, loops and the text operations taught in Topic 4: length(), charAt(), equals(), concatenation, next() and nextLine(). Implement traversals explicitly.

