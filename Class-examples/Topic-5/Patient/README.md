# Patient

The `Patient` class from the Topic 5 slides: a patient with a first name, last name,
weight, height and membership number. Weight is in kilograms and height in
metres; zero means that a measurement is unknown.

## What it shows

- **`String` attributes** together with numeric ones.
- **Constructor chaining with `this(...)`.** The constructor without parameters
  creates a patient whose data are unknown.
- **Setters that filter values.** `setWeight` and `setHeight` ignore negative
  values, and the constructor calls them for that reason.
- **A method that computes a result:** `bmi()`. The caller checks that weight
  and height are positive before calling it.
- **`toString()` with `String.format`.**

## Compile and run

All Java files in this folder belong to the default package. This example is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 Patient.java Main.java
java -cp "." Main
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
For terminal setup and paths containing spaces, see the
[repository instructions](../../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 Patient.java Main.java
java -cp "." Main
```

`Main.java` demonstrates the class with sample data.
