# Palindromes with an early return

The search inside a method that returns `false` as soon as it finds a mismatch.

From the Topic 4 slides.

## Compile and run

All Java files in this folder belong to the default package. This example is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 PalindromeReturn.java
java -cp "." PalindromeReturn
```

For terminal setup and paths containing spaces, see the
[repository instructions](../../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 PalindromeReturn.java
java -cp "." PalindromeReturn
```

Example input:

```text
racecar
```
