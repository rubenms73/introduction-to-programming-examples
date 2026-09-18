# 37 ContactCard and Address

## Problem statement

**Input and behaviour:** Constructor preconditions: non-null, non-empty text fields and a non-null Address. Compare email text exactly, including letter case, with equals(); supply a matching hashCode(). Copy the address in the constructor, setter and getter.

Design an `Address` class and a `ContactCard` class.

The `ContactCard` class must be composed of an `Address` object. It should store a name, an email address and a postal address. Both classes must include constructors, getters, setters and `toString()` methods. The `ContactCard` class should also include an `equals()` method that compares contacts by email address.

Suggested approach: implement `Address` first. Then add an address attribute to the contact card. This is composition: a contact card has an address as part of its state.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 Address.java ContactCard.java Main.java
java -cp "." Main
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 Address.java ContactCard.java Main.java
java -cp "." Main
```

`Main.java` demonstrates the classes with sample data.

## Prerequisites

Use classes, constructors, encapsulation, this, composition, toString() and the explicitly explained equality operations. Do not use exceptions or additional utility libraries.

