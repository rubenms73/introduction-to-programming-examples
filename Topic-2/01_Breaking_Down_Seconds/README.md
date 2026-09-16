# 01 Breaking Down Seconds

## Problem statement

**Input and behaviour:** Input is a non-negative integer number of seconds that fits in int.

Write a program that reads a number of seconds and expresses it as hours, minutes and remaining seconds.

For example, `3661` seconds should be displayed as `1` hour, `1` minute and `1` second.

Suggested approach: use integer division to obtain complete hours and minutes, and the remainder operator `%` to keep what is still left to convert.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

From this folder:

```sh
javac *.java
java BreakingDownSeconds
```

The main method is in `BreakingDownSeconds.java`. Run it and follow any input prompts.

## Prerequisites

Use the main/Scanner templates, primitive variables, arithmetic, assignment and console output. No conditionals, loops, arrays or helper methods.

