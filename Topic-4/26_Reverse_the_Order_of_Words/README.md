# 26 Reverse the Order of Words

## Problem statement

**Input and behaviour:** Build the word array using length(), charAt() and concatenation. Keep this exercise self-contained; do not import another exercise.

Write a program that reads a sentence and prints its words in reverse order, without using `String.split()`.

For example, `"Java is quite fun"` should be printed as `"fun quite is Java"`.

Suggested approach: first generate the array of words manually, as in the previous exercise. Then traverse that array from the last position to the first one.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

From this folder:

```sh
javac *.java
java ReverseWords
```

The main method is in `ReverseWords.java`. Run it and follow any input prompts.

## Prerequisites

Use indexed arrays, loops and the text operations taught in Topic 4: length(), charAt(), equals(), concatenation, next() and nextLine(). Implement traversals explicitly.

