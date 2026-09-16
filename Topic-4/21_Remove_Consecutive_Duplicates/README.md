# 21 Remove Consecutive Duplicates

## Problem statement

**Input and behaviour:** Print the result with an indexed loop, one value per line.

Write a program that receives a sorted array and creates a new array without repeated consecutive values.

For example, `{1, 1, 2, 2, 2, 5, 7, 7}` becomes `{1, 2, 5, 7}`.

Suggested approach: because the array is sorted, equal values are together. First count how many different values there are, then create and fill the result array.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

From this folder:

```sh
javac *.java
java RemoveConsecutiveDuplicates
```

The main method is in `RemoveConsecutiveDuplicates.java`. Run it and follow any input prompts.

## Prerequisites

Use indexed arrays, loops and the text operations taught in Topic 4: length(), charAt(), equals(), concatenation, next() and nextLine(). Implement traversals explicitly.

