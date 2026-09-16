# 17 Russian Peasant Multiplication

## Problem statement

Write a program that multiplies two non-negative integers using only addition, doubling and halving.

At each step, if the second number is odd, add the first number to the result. Then double the first number and divide the second one by two.

Suggested approach: keep an accumulated result. While the second factor is greater than zero, add the first factor only when the second one is odd, then double and halve.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

From this folder:

```sh
javac *.java
java RussianPeasantMultiplication
```

The main method is in `RussianPeasantMultiplication.java`. Run it and follow any input prompts.

## Prerequisites

Use the constructs introduced in Topic 3, including static methods, conditions and loops. Process numbers arithmetically; do not manipulate strings or arrays.
