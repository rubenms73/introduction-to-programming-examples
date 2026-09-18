# Hello, World!

## Problem statement

Write a program that prints `Hello, World!` followed by a newline. Compare
implementations in C, Java, Python and assembly, and the steps needed to build
and run each version. Use the assembly version appropriate for your platform.

The same first program in C, Java, Python and assembly. Every version prints:

```text
Hello, World!
```

This example compares source code and the steps needed to run it. Use
[PrimeCount](../PrimeCount/README.md) for timing: printing one line is too small a
workload to compare calculation speed.

## macOS

Requirements: Apple's Command Line Tools, a JDK and Python 3 (CPython). Run from
this directory.

```sh
cc hello_world.c -o hello_c
./hello_c

javac -encoding UTF-8 HelloWorld.java
java -cp "." HelloWorld

python3 hello_world.py
```

On an Apple Silicon Mac, in a native ARM64 terminal:

```sh
clang -arch arm64 hello_world_arm64.S -o hello_arm64
./hello_arm64
```

## Windows x64

Requirements: a 64-bit GCC/MinGW-w64 toolchain, a JDK and Python 3. See the
[toolchain notes](../PrimeCount/README.md#c-java-python-and-x64-assembly-on-windows)
if GCC is not installed. Run from this directory in PowerShell or CMD.
Execute each command separately, and run a program only after its compilation succeeds.
The `.\\` executable prefix works in both terminals:

```text
gcc hello_world.c -o hello_c.exe
.\hello_c.exe

javac -encoding UTF-8 HelloWorld.java
java -cp "." HelloWorld

python hello_world.py

gcc hello_world_x64.S -o hello_x64.exe
.\hello_x64.exe
```

You can replace `python` with `py` if needed on your installation.

## Linux x64

```sh
gcc hello_world.c -o hello_c
gcc hello_world_x64.S -o hello_x64
javac -encoding UTF-8 HelloWorld.java

./hello_c
./hello_x64
java -cp "." HelloWorld
python3 hello_world.py
```

## What to notice

| Version | Source | Before execution |
|---|---|---|
| C | `hello_world.c` | Compile and link to a native executable |
| Java | `HelloWorld.java` | `javac` produces bytecode in `HelloWorld.class`; `java` runs it on the JVM |
| Python | `hello_world.py` | Start CPython with the source file; CPython handles bytecode compilation internally |
| ARM64 assembly | `hello_world_arm64.S` | Assemble and link for Apple Silicon / macOS |
| x64 assembly | `hello_world_x64.S` | Assemble and link for x64 Windows or Linux |

The assembly files implement `main` directly. They call the standard C library's
`puts` function, just like the C version. The C compiler driver links the runtime
and library; there is no separate C launcher in this example.

Compare the address of the message, the argument register, the function call and
the return. ARM64 uses `x0` for the string argument and saves the return address
in `x30` when making a call. x64 uses `rcx` on Windows or `rdi` on Linux, and `call`
places a return address on the stack. Both examples preserve the stack alignment
required by their platforms.

The conditional directives in the x64 source select the operating system's
calling convention. They are processed at build time, not executed by the CPU.

For Topic 1, students only need to recognise the different levels of detail.
They do not need to understand every assembly instruction yet.

Native macOS and Windows execution must be checked on those systems. The Linux
C/x64 executables, Java and Python have been run and their output checked.

The assembly sources also cross-assemble successfully into macOS ARM64 and
Windows x64 object files. Native execution on those systems is still pending.
