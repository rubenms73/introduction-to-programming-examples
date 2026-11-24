# Control 2, PL-02 — 23 November 2026

[Handout](ExamPL02.pdf) · Solution: [Program.java](Program.java)

`removeFixed` shifts the elements of the array itself and returns the same reference. `randomCode` builds a random code with letters at even indexes and digits at odd indexes.

## Compile and run

From this folder, with a JDK on your `PATH` (Windows, macOS and Linux):

```text
javac -encoding UTF-8 Program.java
java -cp "." Program
```

No keyboard input is needed: `main` prints the expected and actual results. The random codes change in every run, so `main` prints codes of length 0, 1 and 5 to check that letters and digits alternate.

For terminal setup and paths containing spaces, see the
[repository instructions](../../../README.md#compiling-and-running-java-exercises).
