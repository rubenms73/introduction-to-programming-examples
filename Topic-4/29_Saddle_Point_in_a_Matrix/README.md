# 29 Saddle Point in a Matrix

## Problem statement

Write a program that reads a matrix and determines whether it has a saddle point.

A saddle point is an element that is the minimum value in its row and the maximum value in its column.

Suggested approach: for each matrix element, check whether it satisfies both conditions: minimum in its row and maximum in its column.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

From this folder:

```sh
javac *.java
java SaddlePoint
```

The main method is in `SaddlePoint.java`. Run it and follow any input prompts.

## Prerequisites

Use indexed arrays, loops and the text operations taught in Topic 4: length(), charAt(), equals(), concatenation, next() and nextLine(). Implement traversals explicitly.
