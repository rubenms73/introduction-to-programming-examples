# 39 Temperature logger

## Problem statement

**Input and behaviour:** Hours are integers from 0 to 23 and temperatures are in degrees Celsius. Any object received as an argument may be `null`; check it with an `if`. Use an array, not collections.

A weather station records the temperature once an hour, so it takes at most 24 readings a day. The readings are stored in the order they arrive, which need not be the order of the hours.

Design a `Reading` class with an hour and a temperature. It must include a default constructor, a constructor with parameters, a copy constructor, getters, setters, `equals()` and `toString()`, which returns, for example, `08:00 12.5 C`. An invalid hour is ignored.

Design a `DailyLog` class composed of the date of the day and an array of 24 readings, with:

- a default constructor (date `Unknown`), a constructor that receives the date, and a copy constructor that copies the array and every reading;
- `boolean addReading(Reading reading)`: stores a copy of the reading. It returns `false` and does nothing if `reading` is `null`, the log is full or that hour already has a reading;
- `Reading getReading(int hour)`: a copy of the reading of that hour, or `null` if there is none;
- `Reading maximum()`: a copy of the reading with the highest temperature (the first one stored if there is a tie), or `null` if the log is empty;
- `double average()`: the average temperature, or 0 if the log is empty;
- `int hoursAbove(double limit)`: how many readings are strictly above `limit`;
- `equals()` and `toString()`, which returns, for example, `2026-12-01 [08:00 9.5 C, 10:00 14.0 C]`.

Suggested approach: implement `Reading` first. In `DailyLog`, keep the array and the number of readings stored, and traverse only the positions in use. Searching for an hour is a loop that stops at the first match; it is used both to reject a repeated hour and in `getReading`. For the maximum, remember the position of the best reading so far.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 DailyLog.java Main.java Reading.java
java -cp "." Main
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 DailyLog.java Main.java Reading.java
java -cp "." Main
```

`Main.java` records the temperatures of a morning, searches them and checks that the copies are independent.

## Prerequisites

Use classes, constructors, encapsulation, `this`, composition, arrays of objects, `equals()` and `toString()`, as explained in Topics 4 and 5. Do not use collections or exceptions.
