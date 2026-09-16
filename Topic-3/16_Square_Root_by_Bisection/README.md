# 16 Square Root by Bisection

## Problem statement

**Input and behaviour:** Use finite numbers between 0 and 1000000 and a tolerance between 0.000000001 and 1; report values outside these intervals.

Write a program that reads a non-negative real number and approximates its square root using the bisection method.

The program must stop when the approximation error is smaller than a given tolerance, for example `0.00001`.

Suggested approach: maintain an interval that contains the solution. Test the middle point and keep the half interval where the square root must still be.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

From this folder:

```sh
javac *.java
java SquareRootByBisection
```

The main method is in `SquareRootByBisection.java`. Run it and follow any input prompts.

## Prerequisites

Use the constructs introduced in Topic 3, including static methods, conditions and loops. Process numbers arithmetically; do not manipulate strings or arrays.

