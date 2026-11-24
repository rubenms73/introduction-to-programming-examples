# Introduction to Programming

University of Oviedo · Rubén Muñiz Sánchez

Code examples for Introduction to Programming at the University of Oviedo.

## Topic 1: languages and execution

1. [Hello, World!](Topic-1/HelloWorld/README.md): the same minimal program in C,
   Java, Python, Apple Silicon assembly and x64 assembly.
2. [Counting primes](Topic-1/PrimeCount/README.md): the same CPU-intensive
   calculation in those languages, with elapsed-time measurement.

Each directory includes build and run commands. Start with Hello World, then use
PrimeCount to compare calculation times.

## Additional exercises

Java solutions to the 38 additional exercises.
Each exercise is self-contained, uses the default package and includes its own
compile and run instructions. Class-design exercises also include a `main`
demonstration.

Solutions are grouped by topic, following the additional exercises handout:

- [Topic 2: Expressions, Types and Simple Programs](Topic-2/README.md)
- [Topic 3: Conditional and Iterative Statements](Topic-3/README.md)
- [Topic 4: Arrays, Strings and Matrices](Topic-4/README.md)
- [Topic 5: Classes and Objects](Topic-5/README.md)

## Code from the slides

[Complete programs for the code in the theory slides](Slides-code/README.md),
grouped by topic from Topic 1 to Topic 5. When a slide shows only a fragment,
the program adds what is needed to run it.

## Practical exam solutions

[Solutions to the laboratory controls](PracticalExamSolutions/README.md),
grouped by academic year, with each handout and a runnable `Program.java`.

## Compiling and running Java exercises

Use JDK 11 or later. Each exercise folder contains all its classes in the default
package. Compile each exercise separately; several folders use the name `Main`.
In an IDE, use one Java project per exercise without `module-info.java`.

### Windows (PowerShell and CMD)

Install a JDK (not only a JRE) and ensure its `bin` directory is on `PATH`.
Open a new terminal after changing `PATH`. Check both commands:

```text
java -version
javac -version
```

In PowerShell, enter your local repository folder (replace the example path):

```powershell
Set-Location -LiteralPath "C:\Courses\IP\Student examples"
```

In CMD, use `cd /d` so that the command also changes drives:

```bat
cd /d "C:\Courses\IP\Student examples"
```

Then, in either terminal, run these commands one at a time:

```text
cd "Topic-2\01_Breaking_Down_Seconds"
javac -encoding UTF-8 BreakingDownSeconds.java
java -cp "." BreakingDownSeconds
```

Only run the program if compilation succeeds. This example prompts for input;
enter `3661` and press Enter to obtain 1 hour, 1 minute and 1 second.
Other examples have their own class names and source-file lists in their READMEs.

### macOS and Linux

From the repository root:

```sh
cd "Topic-2/01_Breaking_Down_Seconds"
javac -encoding UTF-8 BreakingDownSeconds.java
java -cp "." BreakingDownSeconds
```

### Troubleshooting

- If `javac` is not found, check your JDK installation and `PATH`.
- If Java cannot find the main class, check the current folder, compilation
  result and class name. Do not append `.java` or `.class` to that name.
- Keep paths containing spaces in double quotes. Compile each example separately;
  do not compile all folders together, as several examples contain `Main`.
- The 38 additional exercises require only the JDK. C, Python and assembly tools
  are needed only for their corresponding Topic 1 demonstrations.

Exercises 31–37 include `Main.java` demonstrations. Other examples either prompt
for input or use sample values in their main method. Exercise numbers follow
the additional exercises handout. Introductory solutions assume inputs within the
exercise's intended domain and numeric range.

## Checking the examples

Run `python3 tools/check_examples.py` (Windows: `py -3 tools/check_examples.py`)
with JDK 11 or later on `PATH` to compile every Java example on its own, run it
with the input listed in `tools/examples.txt` and compare its output with the
one stored in `tools/expected`. GitHub Actions runs the same check with JDK 11,
17, 21 and 25 on Windows, macOS and Linux.

## Topic 1 demonstration

The prime-counting programs are supplied for an instructor-led comparison of
compilation and execution times. In Topic 1, run them and observe the results;
you are not expected to understand or write their algorithms yet. Study loops
and helper methods after Topic 3. The Hello World Java program is the coding
example for Topic 1.

## Code style

Java and C examples use Allman style: opening braces go on a new line, aligned
with the closing braces, and block contents use four spaces per indentation level.
The `.clang-format` file records these formatting rules. Python and assembly
follow their own syntax and formatting conventions.

Loops and conditional branches whose body is a single statement omit braces.
Braces are retained when needed to preserve the association of an `else` with
its `if`. Bodies with several statements use braces in Allman style.

Every Java class, attribute, constructor and method has a Javadoc comment
(`/** ... */`) that explains what it does, with `@param` for each parameter and
`@return` for the result. Short `//` comments inside the methods explain the
steps that are harder to follow. To generate the HTML documentation of a
program, run `javadoc -d doc *.java` in its folder.
