# 27 IPv4 address parts

## Problem statement

**Input and behaviour:** Each of the four parts contains one to three decimal digits and has a value from 0 to 255. Print one part per line or report invalid input.

Write a program that reads an IPv4 address and generates an integer array with its four parts, without using `String.split()`.

For example, `"156.35.95.10"` should produce the array `{156, 35, 95, 10}`. The program should also check that there are exactly four parts, that no part is empty and that every value is between `0` and `255`.

Suggested approach: traverse the string looking for dots. Each time a dot is found, process the current part and store its numeric value. At the end, process the final part.

## A trace of the algorithm

`parseIPv4` reads the address once, character by character:

- a digit is added to the value of the current part;
- a dot stores the current part and starts the next one;
- any other character makes the address invalid.

The last part has no dot after it, so it is stored after the loop.

### A valid address: `"10.2.255.0"`

Each row shows the variables after processing the character.

| Character | What happens | `value` | `digits` | `partIndex` | `parts` |
| :---: | --- | ---: | ---: | ---: | --- |
| `1` | digit | 1 | 1 | 0 | {0, 0, 0, 0} |
| `0` | digit | 10 | 2 | 0 | {0, 0, 0, 0} |
| `.` | store part 0, start part 1 | 0 | 0 | 1 | {10, 0, 0, 0} |
| `2` | digit | 2 | 1 | 1 | {10, 0, 0, 0} |
| `.` | store part 1, start part 2 | 0 | 0 | 2 | {10, 2, 0, 0} |
| `2` | digit | 2 | 1 | 2 | {10, 2, 0, 0} |
| `5` | digit | 25 | 2 | 2 | {10, 2, 0, 0} |
| `5` | digit | 255 | 3 | 2 | {10, 2, 0, 0} |
| `.` | store part 2, start part 3 | 0 | 0 | 3 | {10, 2, 255, 0} |
| `0` | digit | 0 | 1 | 3 | {10, 2, 255, 0} |
| end | `digits > 0` and `partIndex == 3`: store part 3 | | | | {10, 2, 255, 0} |

The method returns `{10, 2, 255, 0}`.

### Three invalid addresses

| Address | Where it stops | Why |
| --- | --- | --- |
| `"1..2.3"` | second `.` | `digits == 0`: the part between the two dots is empty. |
| `"1.2.300.4"` | second `0` of `300` | `value > 255`. |
| `"1.2.3"` | after the loop | `partIndex == 2`: only three parts were found. |

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 IPv4AddressParts.java
java -cp "." IPv4AddressParts
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 IPv4AddressParts.java
java -cp "." IPv4AddressParts
```

The main method is in `IPv4AddressParts.java`. Run it and follow any input prompts.

## Prerequisites

Use indexed arrays, loops and the text operations taught in Topic 4: `length()`, `charAt()`, `equals()`, concatenation, `next()` and `nextLine()`. Write every traversal explicitly.
