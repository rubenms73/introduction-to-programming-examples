# 09 Harshad Number

## Problem statement

Write a program that reads a positive integer and determines whether it is a Harshad number.

A Harshad number is divisible by the sum of its digits. For example, `18` is a Harshad number because `1 + 8 = 9` and `18` is divisible by `9`.

Suggested approach: first calculate the sum of the digits. Then check whether the original number is divisible by that sum.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

From this folder:

```sh
javac *.java
java HarshadNumber
```

The main method is in `HarshadNumber.java`. Run it and follow any input prompts.

## Prerequisites

Use the constructs introduced in Topic 3, including static methods, conditions and loops. Process numbers arithmetically; do not manipulate strings or arrays.
