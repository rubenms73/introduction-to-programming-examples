# 31 BankAccount

## Problem statement

**Input and behaviour:** Construct with a non-empty holder name and a finite non-negative balance. Invalid setters leave the previous value unchanged; failed transactions return false.

Design a `BankAccount` class with an account holder, a balance and operations for deposit, withdrawal and transfer.

The class must include constructors, getters, setters and a `toString()` method. It must also prevent invalid operations, such as depositing a negative amount or withdrawing more money than the current balance.

Suggested approach: keep the attributes private. Use setters to validate direct changes, and use the deposit, withdrawal and transfer methods for operations that modify the balance.

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

