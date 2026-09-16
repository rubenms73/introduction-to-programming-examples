# 12 Decimal to Binary

## Problem statement

**Input and behaviour:** Print the remainders immediately, from least significant digit to most significant digit. Input 10 produces 0101, and input 0 produces 0. Do not build or reverse a string.

Write a program that reads a non-negative decimal integer and prints its binary digits in reverse order (least significant digit first). For example, input 10 must print 0101; input 0 must print 0.

Repeatedly print the remainder of division by two, then replace the number with its integer quotient. Print each digit immediately, without storing or reversing the result. Do not use arrays or string manipulation. Handle zero separately and report negative input. In Topic 4, this exercise can be revisited using arrays or strings to display the digits in the usual order.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

From this folder:

```sh
javac *.java
java DecimalToBinary
```

The main method is in `DecimalToBinary.java`. Run it and follow any input prompts.

## Prerequisites

Use the constructs introduced in Topic 3, including static methods, conditions and loops. Process numbers arithmetically; do not manipulate strings or arrays.

