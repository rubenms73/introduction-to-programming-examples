# Control 2, PL-01 — 25 November 2026

[Handout](ExamPL01.pdf) · Solution: [Program.java](Program.java)

`insertNew` copies the elements into a new array one position longer, leaving room for the new value, so the original array does not change. `removeConsonants` builds a new string with every character that is not a consonant.

## Compile and run

From this folder, with a JDK on your `PATH` (Windows, macOS and Linux):

```text
javac -encoding UTF-8 Program.java
java -cp "." Program
```

No keyboard input is needed: `main` prints the expected and actual results.

For terminal setup and paths containing spaces, see the
[repository instructions](../../../README.md#compiling-and-running-java-exercises).
