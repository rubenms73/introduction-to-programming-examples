# 32 CarTrip

## Problem statement

**Input and behaviour:** Construct with finite non-negative values. If distance is zero, the consumption and cost per kilometre methods return zero.

Design a `CarTrip` class that stores kilometres travelled, litres consumed and fuel cost.

The class must include constructors, getters, setters and a `toString()` method. It must calculate average consumption, total cost and cost per kilometre.

Suggested approach: store only the data needed to describe the trip. Calculate derived values, such as total cost or consumption, with methods instead of storing them as extra attributes.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 CarTrip.java Main.java
java -cp "." Main
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 CarTrip.java Main.java
java -cp "." Main
```

`Main.java` demonstrates the classes with sample data.

## Prerequisites

Use classes, constructors, encapsulation, this, composition, toString() and the explicitly explained equality operations. Do not use exceptions or additional utility libraries.

