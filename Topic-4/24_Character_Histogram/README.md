# 24 Character Histogram

## Problem statement

**Input and behaviour:** Count English letters A-Z and a-z without distinguishing case; ignore other characters. Use character comparisons and arithmetic.

Write a program that reads a text and calculates a histogram with the number of times each letter from `a` to `z` appears.

The program should ignore case, spaces and punctuation marks. For example, `Java!` contains two `a` letters, one `j` and one `v`.

Suggested approach: use an array of 26 counters. Traverse the text character by character, convert each letter to lower case and increment the corresponding counter.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

From this folder:

```sh
javac *.java
java CharacterHistogram
```

The main method is in `CharacterHistogram.java`. Run it and follow any input prompts.

## Prerequisites

Use indexed arrays, loops and the text operations taught in Topic 4: length(), charAt(), equals(), concatenation, next() and nextLine(). Implement traversals explicitly.

