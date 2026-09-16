# 33 BoundedCounter

## Problem statement

**Input and behaviour:** Constructor precondition: minimum <= initialValue <= maximum. Invalid changes and attempts to pass a limit return false without changing the counter. reset() sets the value to minimum.

Design a counter class with a minimum value, a maximum value and a current value.

The class must include constructors, getters, setters and a `toString()` method. The counter must support increment, decrement and reset operations. Decide what should happen when the counter reaches one of its limits.

Suggested approach: make sure every constructor and setter preserves the rule that the current value must always be between the minimum and the maximum.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

From this folder:

```sh
javac *.java
java Main
```

`Main.java` demonstrates the classes with sample data.

## Prerequisites

Use classes, constructors, encapsulation, this, composition, toString() and the explicitly explained equality operations. Do not use exceptions or additional utility libraries.

