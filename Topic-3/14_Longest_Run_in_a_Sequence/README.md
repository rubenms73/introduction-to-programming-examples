# 14 Longest Run in a Sequence

## Problem statement

Write a program that reads a sequence of positive integers ending in `0` and prints the length of the longest run of equal consecutive values.

For example, in the sequence `4 4 2 7 7 7 3 3 0`, the longest run has length `3`.

Suggested approach: remember the previous value, the length of the current run and the best run found so far. When the current value changes, restart the current run.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

From this folder:

```sh
javac *.java
java LongestRunInSequence
```

The main method is in `LongestRunInSequence.java`. Run it and follow any input prompts.

## Prerequisites

Use the constructs introduced in Topic 3, including static methods, conditions and loops. Process numbers arithmetically; do not manipulate strings or arrays.
