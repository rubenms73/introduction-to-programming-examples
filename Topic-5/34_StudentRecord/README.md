# 34 StudentRecord

## Problem statement

**Input and behaviour:** Use a non-empty name and finite marks between 0 and 10. For this exercise only, finalMark = 0.6 * theoryMark + 0.4 * labMark; passing requires both marks >= 4 and finalMark >= 5. These are not the course assessment rules.

Design a `StudentRecord` class that stores a student's name and several marks.

The class must include constructors, getters, setters and a `toString()` method. It must calculate the final mark, determine whether the student has passed and print a short report.

Suggested approach: validate marks in the setters. Calculate the final mark with a method, and let `toString()` reuse the same information that appears in the report.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 Main.java StudentRecord.java
java -cp "." Main
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 Main.java StudentRecord.java
java -cp "." Main
```

`Main.java` demonstrates the classes with sample data.

The 60% theory / 40% lab weights are part of this exercise, not the course assessment rules.

## Prerequisites

Use classes, constructors, encapsulation, this, composition, toString() and the explicitly explained equality operations. Do not use exceptions or additional utility libraries.

