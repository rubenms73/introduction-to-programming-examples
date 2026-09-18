# 33 BoundedCounter

## Problem statement

**Input and behaviour:** Constructor precondition: minimum <= initialValue <= maximum. Invalid changes and attempts to pass a limit return false without changing the counter. reset() sets the value to minimum.

Design a counter class with a minimum value, a maximum value and a current value.

The class must include constructors, getters, setters and a `toString()` method. The counter must support increment, decrement and reset operations. Decide what should happen when the counter reaches one of its limits.

Suggested approach: make sure every constructor and setter preserves the rule that the current value must always be between the minimum and the maximum.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 BoundedCounter.java Main.java
java -cp "." Main
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 BoundedCounter.java Main.java
java -cp "." Main
```

`Main.java` demonstrates the classes with sample data.

## Prerequisites

Use classes, constructors, encapsulation, this, composition, toString() and the explicitly explained equality operations. Do not use exceptions or additional utility libraries.

