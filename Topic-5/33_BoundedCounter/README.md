# 33 BoundedCounter

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

## Input and behaviour

Constructor precondition: minimum <= initialValue <= maximum. Invalid changes and attempts to pass a limit return false without changing the counter. reset() sets the value to minimum.
