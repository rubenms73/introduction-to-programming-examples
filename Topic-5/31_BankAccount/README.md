# 31 BankAccount

## Problem statement

**Input and behaviour:** Construct with a non-empty holder name and a finite non-negative balance. Invalid setters leave the previous value unchanged; failed transactions return false.

Design a `BankAccount` class with an account holder, a balance and operations for deposit, withdrawal and transfer.

The class must include constructors, getters, setters and a `toString()` method. It must also prevent invalid operations, such as depositing a negative amount or withdrawing more money than the current balance.

Suggested approach: keep the attributes private. Use setters to validate direct changes, and use the deposit, withdrawal and transfer methods for operations that modify the balance.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 BankAccount.java Main.java
java -cp "." Main
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 BankAccount.java Main.java
java -cp "." Main
```

`Main.java` demonstrates the classes with sample data.

## Prerequisites

Use classes, constructors, encapsulation, this, composition, toString() and the explicitly explained equality operations. Do not use exceptions or additional utility libraries.

