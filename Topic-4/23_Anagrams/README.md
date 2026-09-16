# 23 Anagrams

## Problem statement

**Input and behaviour:** Use non-empty English words containing letters A-Z or a-z. Ignore letter case using character comparisons and arithmetic.

Write a program that reads two words and determines whether they are anagrams.

An anagram is a word or phrase formed by rearranging the letters of another word or phrase. In this exercise, two words are anagrams if they contain exactly the same letters with the same frequencies. For example, `listen` and `silent` are anagrams.

Suggested approach: use an array of counters for the letters. Increment counters with the first word and decrement them with the second one. At the end, all counters should be zero.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

From this folder:

```sh
javac *.java
java Anagrams
```

The main method is in `Anagrams.java`. Run it and follow any input prompts.

## Prerequisites

Use indexed arrays, loops and the text operations taught in Topic 4: length(), charAt(), equals(), concatenation, next() and nextLine(). Implement traversals explicitly.

