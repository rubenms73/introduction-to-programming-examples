# 35 PasswordPolicy

## Problem statement

**Input and behaviour:** Use a non-negative minimum length. Required uppercase letters are A-Z, lowercase letters are a-z, and digits are 0-9. Detect these ranges with character comparisons.

Design a class that validates passwords according to a configurable policy.

The class must include constructors, getters, setters and a `toString()` method. The policy may include minimum length, at least one upper-case letter, at least one lower-case letter and at least one digit.

Suggested approach: store the rules as attributes. To validate a password, traverse it once and remember whether each required kind of character has appeared.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 Main.java PasswordPolicy.java
java -cp "." Main
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 Main.java PasswordPolicy.java
java -cp "." Main
```

`Main.java` demonstrates the classes with sample data.

## Prerequisites

Use classes, constructors, encapsulation, this, composition, toString() and the explicitly explained equality operations. Do not use exceptions or additional utility libraries.

