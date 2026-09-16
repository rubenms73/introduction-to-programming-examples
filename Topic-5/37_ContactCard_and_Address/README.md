# 37 ContactCard and Address

## Problem statement

**Input and behaviour:** Constructor preconditions: non-null, non-empty text fields and a non-null Address. Compare email text exactly, including letter case, with equals(); supply a matching hashCode(). Copy the address in the constructor, setter and getter.

Design an `Address` class and a `ContactCard` class.

The `ContactCard` class must be composed of an `Address` object. It should store a name, an email address and a postal address. Both classes must include constructors, getters, setters and `toString()` methods. The `ContactCard` class should also include an `equals()` method that compares contacts by email address.

Suggested approach: implement `Address` first. Then add an address attribute to the contact card. This is composition: a contact card has an address as part of its state.

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

