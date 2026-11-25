# Point

The `Point` class from the Topic 5 slides: a point of any dimension whose
coordinates are stored in an array of `double`.

## What it shows

- **An array as an attribute.** The constructors create it, and the
  dimension is its length.
- **Defensive copying.** The constructors copy the coordinates, so changing the
  original array or point later does not change the new point.
- **Valid objects.** A dimension that is not positive, a `null` or empty array
  and a `null` point give the two-dimensional origin. The constructors check
  them with an `if`; no exceptions are used.
- **Methods that receive another object of the same class:** `dotProduct`,
  `distance`, `angle` and `isOrthogonal`. They can use `point.coordinates`
  directly because the code is inside `Point`.
- **A private helper method:** `cosine`, used by `angle` and `isOrthogonal`.
- **`toString()` with `String.format`** and **`equals()`** with exact comparison.

## Compile and run

All Java files in this folder belong to the default package. This example is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 Point.java Main.java
java -cp "." Main
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
For terminal setup and paths containing spaces, see the
[repository instructions](../../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 Point.java Main.java
java -cp "." Main
```

`Main.java` demonstrates the class with sample data.
