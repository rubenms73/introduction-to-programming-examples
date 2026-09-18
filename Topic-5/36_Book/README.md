# 36 Book

## Problem statement

**Input and behaviour:** Constructor preconditions: non-null, non-empty ISBN, title and author; positive publication year. Compare ISBN text exactly with equals(). Supply a matching hashCode() using the ISBN string code.

Design a `Book` class that stores an ISBN, a title, an author and a publication year.

The class must include constructors, getters, setters, an `equals()` method and a `toString()` method. Two books should be considered equal if they have the same ISBN.

Suggested approach: use the ISBN as the equality criterion in `equals()`. Use `toString()` to return a readable description containing the title, author, year and ISBN.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 Book.java Main.java
java -cp "." Main
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 Book.java Main.java
java -cp "." Main
```

`Main.java` demonstrates the classes with sample data.

## Prerequisites

Use classes, constructors, encapsulation, this, composition, toString() and the explicitly explained equality operations. Do not use exceptions or additional utility libraries.

