# 15 Local Peaks in a Sequence

## Problem statement

Write a program that reads a sequence of positive integers ending in `0` and counts how many values are greater than both their previous and next values.

For example, in the sequence `3 8 4 5 9 2 0`, the local peaks are `8` and `9`.

Suggested approach: keep a sliding window of three values: previous, current and next. You can only decide whether the current value is a peak after reading the next one.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

From this folder:

```sh
javac *.java
java LocalPeaksInSequence
```

The main method is in `LocalPeaksInSequence.java`. Run it and follow any input prompts.

## Prerequisites

Use the constructs introduced in Topic 3, including static methods, conditions and loops. Process numbers arithmetically; do not manipulate strings or arrays.
