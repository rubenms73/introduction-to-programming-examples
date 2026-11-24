# Circle, Point2D and Point3D

The example classes from the Topic 5 slides:

- `Point2D`: a point in the plane with integer coordinates `x` and `y`.
- `Circle`: composition. A circle **has a** `Point2D` as its centre.
- `Point3D`: inheritance. A `Point3D` **is a** `Point2D` with a third coordinate.

## What it shows

- **Composition and a hidden centre.** `Circle` has no `getCentre()` or
  `setCentre()`. It offers `getX()`, `setX()`, `getY()` and `setY()`, which pass
  the work on to its centre. Only the methods of `Circle` can change the centre.
- **Valid objects.** The radius must be positive: `setRadius` ignores other
  values and the circle keeps radius 1.
- **Null checks with an `if`.** The copy constructors check `null` and, in that
  case, build the default object. No exceptions are used.
- **Deep copy.** The copy constructor of `Circle` creates a new `Point2D`, so the
  copy and the original do not share their centre.
- **Inheritance, `protected` and `super`.** `x` and `y` are `protected`, so
  `Point3D` uses them directly in `norm()`. The constructors of `Point3D` call
  `super(...)` to let `Point2D` initialise `x` and `y`.
- **`toString()` with `String.format`.**

## Compile and run

All Java files in this folder belong to the default package. This example is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 Point2D.java Point3D.java Circle.java Main.java
java -cp "." Main
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
For terminal setup and paths containing spaces, see the
[repository instructions](../../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 Point2D.java Point3D.java Circle.java Main.java
java -cp "." Main
```

`Main.java` demonstrates the three classes with sample data.
