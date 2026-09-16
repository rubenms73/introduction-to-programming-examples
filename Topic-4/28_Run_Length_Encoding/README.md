# 28 Run Length Encoding

## Problem statement

**Input and behaviour:** Build the result by concatenating each character and its count; use no conversion utilities.

Write a program that reads a string and compresses consecutive repeated characters.

For example, `aaabbc` becomes `a3b2c1`.

Suggested approach: traverse the string while remembering the current character and how many times it has appeared consecutively. When the character changes, append the previous character and its count.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

From this folder:

```sh
javac *.java
java RunLengthEncoding
```

The main method is in `RunLengthEncoding.java`. Run it and follow any input prompts.

## Prerequisites

Use indexed arrays, loops and the text operations taught in Topic 4: length(), charAt(), equals(), concatenation, next() and nextLine(). Implement traversals explicitly.

