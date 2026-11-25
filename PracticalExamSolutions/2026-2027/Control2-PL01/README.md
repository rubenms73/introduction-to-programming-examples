# Control 2, PL-01 — 25 November 2026

[Handout](ExamPL01.pdf) · Solutions: [without checks](Program.java) · [with checks](WithChecks/Program.java)

`insertNew` copies the elements into a new array one position longer, leaving room for the new value, so the original array does not change. `removeConsonants` builds a new string with every character that is not a consonant.

There are two solutions. [Program.java](Program.java) assumes valid data, as the statement allows. [WithChecks/Program.java](WithChecks/Program.java) first checks the data the statement allows (at most 100 elements or characters, an index from 0 to the array length and values from −1000 to 1000) and returns `null` when they are not valid; its `main` also tests invalid data.

## Compile and run

From this folder (or from `WithChecks` for the solution with checks), with a JDK on your `PATH` (Windows, macOS and Linux):

```text
javac -encoding UTF-8 Program.java
java -cp "." Program
```

No keyboard input is needed: `main` prints the expected and actual results.

For terminal setup and paths containing spaces, see the
[repository instructions](../../../README.md#compiling-and-running-java-exercises).
