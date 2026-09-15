# Introduction to Programming

Classroom code examples for Introduction to Programming at the University of Oviedo.

## Topic 1: languages and execution

1. [Hello, World!](Topic-1/HelloWorld/README.md): the same minimal program in C,
   Java, Python, Apple Silicon assembly and x64 assembly.
2. [Counting primes](Topic-1/PrimeCount/README.md): the same CPU-intensive
   calculation in those languages, with elapsed-time measurement.

Each directory includes build and run commands. Start with Hello World, then use
PrimeCount to compare calculation times.

## Classroom exercises

Java solutions to the 37 classroom exercises.
Each exercise is self-contained, uses the default package and includes its own
compile and run instructions. Class-design exercises also include a `main`
demonstration.

Solutions are grouped by topic, following the classroom exercise handout:

- [Topic 2: Expressions, Types and Simple Programs](Topic-2/README.md)
- [Topic 3: Conditional and Iterative Statements](Topic-3/README.md)
- [Topic 4: Arrays, Strings and Matrices](Topic-4/README.md)
- [Topic 5: Classes and Objects](Topic-5/README.md)

## Compiling and running Java exercises

Use JDK 11 or later. Each exercise folder contains all its classes in the default
package. Compile each exercise separately; several folders use the name `Main`.
In an IDE, use one Java project per exercise without `module-info.java`.

From the repository root, for example:

```sh
cd Topic-2/01_Breaking_Down_Seconds
javac *.java
java BreakingDownSeconds
```

Exercises 31–37 include `Main.java` demonstrations. Other examples either prompt
for input or use sample values in their main method. Exercise numbers follow
the classroom exercise handout. Introductory solutions assume inputs within the
exercise's intended domain and numeric range.
