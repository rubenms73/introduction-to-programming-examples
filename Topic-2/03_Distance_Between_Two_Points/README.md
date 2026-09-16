# 03 Distance Between Two Points

## Problem statement

**Input and behaviour:** Coordinates are finite real values with magnitudes at most 1000000. Math.sqrt is available.

Write a program that reads the coordinates of two points, `(x1, y1)` and `(x2, y2)`, and calculates the Euclidean distance between them.

Use real numbers for the coordinates and print the result with a reasonable number of decimal places.

Suggested approach: calculate the horizontal and vertical differences first. Then apply the distance formula using `Math.sqrt()`.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

From this folder:

```sh
javac *.java
java DistanceBetweenPoints
```

The main method is in `DistanceBetweenPoints.java`. Run it and follow any input prompts.

## Prerequisites

Use the main/Scanner templates, primitive variables, arithmetic, assignment and console output. No conditionals, loops, arrays or helper methods.

