# 36 Book

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

Constructor preconditions: non-null, non-empty ISBN, title and author; positive publication year. Compare ISBN text exactly with equals(). Supply a matching hashCode() using the ISBN string code.
