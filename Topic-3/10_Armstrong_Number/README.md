# 10 Armstrong Number

## Problem statement

Write a program that reads a three-digit positive integer and determines whether it is an Armstrong number.

A three-digit number is an Armstrong number if it is equal to the sum of the cubes of its digits. For example, `153` is an Armstrong number because `1^3 + 5^3 + 3^3 = 153`.

Suggested approach: extract the hundreds, tens and units digits. Cube each digit, add the three results and compare the sum with the original number.

Optional extension: generalise the solution so that it works for numbers with any number of digits.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

From this folder:

```sh
javac *.java
java ArmstrongNumber
```

The main method is in `ArmstrongNumber.java`. Run it and follow any input prompts.

## Prerequisites

Use the constructs introduced in Topic 3, including static methods, conditions and loops. Process numbers arithmetically; do not manipulate strings or arrays.
