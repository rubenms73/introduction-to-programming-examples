# Counting primes: one algorithm, different languages

Count the prime numbers between 2 and an upper limit `N`, inclusive. Each version
prints the count and the calculation time. All messages and code are in
English.

Start with `N = 100000` to check that everything works. Try `1000000` for the live
comparison, then `5000000` if the runs are too short on your machine. You can stop
a long run with Ctrl+C.

## The algorithm

For each candidate number, try divisors starting at 2. Stop as soon as a divisor
is found or its square exceeds the candidate. Count the candidate if no divisor
was found.

All versions use the same candidate order, divisors, early stopping and one
thread. The workload uses one CPU core intensively and needs very little memory.
It does not print each prime.

The accepted input range is **0 to 1000000000**. This bound keeps the squared
divisor and loop counters within a signed 32-bit integer in C, Java and assembly.
The upper bound is a correctness limit, not a suggested classroom workload.

| Upper limit | Expected prime count |
|---:|---:|
| 0 or 1 | 0 |
| 2 | 1 |
| 10 | 4 |
| 100 | 25 |
| 1000 | 168 |
| 10000 | 1229 |
| 100000 | 9592 |
| 1000000 | 78498 |

## Files

| File | Purpose |
|---|---|
| `count_primes.c` | C algorithm and main program |
| `CountPrimes.java` | Java algorithm and main program |
| `count_primes.py` | Python algorithm and main program |
| `assembly/count_primes_arm64.S` | Apple Silicon / macOS assembly calculation |
| `assembly/count_primes_x64.S` | x64 assembly calculation for Windows or Linux |
| `assembly/main.c` | Input, timing and output for either assembly version |
| `console.h` | Shared C input validation and monotonic clock |

The assembly versions perform **all prime counting in assembly**. The small C
launcher only handles the console and timer. Start reading at `count_primes` to
compare the algorithms without getting distracted by input validation.

## C, Java and Python on macOS

You need Apple's Command Line Tools (`xcode-select --install` if absent), a JDK
with `javac`, and Python 3 (CPython). Run these commands from this directory.

```sh
cc -O2 -std=c11 count_primes.c -o prime_c
./prime_c 1000000

javac CountPrimes.java
java CountPrimes 1000000

python3 count_primes.py 1000000
```

Java and Python use their normal execution modes. The C executable uses the
usual `-O2` optimisation level. Compilation is a separate step from execution.

## Apple Silicon assembly on macOS

Run this in a native Apple Silicon terminal, with `uname -m` reporting `arm64`:

```sh
clang -O2 -arch arm64 assembly/main.c assembly/count_primes_arm64.S -o prime_arm64
./prime_arm64 1000000
```

`clang` assembles the `.S` file, compiles the C launcher and links them into one
executable. No separate assembler installation is needed.

## Suggested classroom comparison on macOS

After compiling the programs, use `/usr/bin/time` to measure each **complete
process**, not only the calculation performed inside it:

```sh
/usr/bin/time -p ./prime_c 1000000
/usr/bin/time -p java CountPrimes 1000000
/usr/bin/time -p python3 count_primes.py 1000000
/usr/bin/time -p ./prime_arm64 1000000
```

Each program reports `Calculation time`, while `/usr/bin/time` reports `real`,
`user` and `sys`. For this activity, compare `real`: it includes process startup,
and therefore includes starting the Java Virtual Machine and the Python
interpreter. It still excludes source compilation because compilation was run as
a separate command.

For example, Java may report a calculation time shorter than C but a longer
`real` time. This is not a contradiction. The Java Virtual Machine has a startup
cost, but its just-in-time compiler (JIT) can translate frequently executed
bytecode into highly optimised native machine code. As the workload becomes
longer, the startup cost matters less and Java may match or even outperform C for
this particular calculation.

The useful lesson is not a fixed ranking that applies to every program. It is
that performance depends on the execution model, startup costs, compiler and JIT
optimisations, workload, machine, and exactly what is being measured.

## C, Java, Python and x64 assembly on Windows

Use a **64-bit GCC/MinGW-w64** toolchain, a JDK and Python 3 (CPython). One option
for GCC is the [MSYS2 UCRT64 environment](https://www.msys2.org/docs/environments/):
install `mingw-w64-ucrt-x86_64-gcc` from that environment. If using PowerShell,
make sure its `PATH` includes your toolchain's `bin` directory, such as
`C:\msys64\ucrt64\bin`.

From this directory in PowerShell:

```powershell
gcc -O2 -std=c11 count_primes.c -o prime_c.exe
.\prime_c.exe 1000000

javac CountPrimes.java
java CountPrimes 1000000

python count_primes.py 1000000

gcc -O2 assembly/main.c assembly/count_primes_x64.S -o prime_x64.exe
.\prime_x64.exe 1000000
```

On Windows, `py` can replace `python` if that is how your installation is exposed.
The x64 source uses **GNU assembler Intel syntax**, not NASM or MASM syntax. GCC
already includes the assembler it needs. Keep the capital **`.S`** extension so
GCC selects the Windows argument convention before assembling.

## Linux x64

With GCC, a JDK and Python 3 installed:

```sh
gcc -O2 -std=c11 count_primes.c -o prime_c
gcc -O2 assembly/main.c assembly/count_primes_x64.S -o prime_x64
javac CountPrimes.java

./prime_c 1000000
./prime_x64 1000000
java CountPrimes 1000000
python3 count_primes.py 1000000
```

The same x64 `.S` file selects the Linux calling convention automatically.

## Keyboard input

Omit the number to enter it interactively, for example:

```sh
java CountPrimes
```

The program prompts for the upper limit. The timer starts **after** reading it.

## What the times mean

- `Calculation time`, printed by the program, covers one call to the counting
  function. It excludes console input/output, source compilation and
  process/JVM/interpreter startup.
- `real`, printed by `/usr/bin/time -p`, covers the complete process. Use this
  value for the suggested classroom comparison.
- Java runs normally. JIT compilation that occurs during the calculation is part
  of its measured time. There is no special warm-up or benchmark framework.
- Python runs normally with CPython. It also compiles source to bytecode; calling
  it interpreted does not mean that it executes source text directly.
- Compare languages on the **same machine**, with the same `N`, and avoid running
  them simultaneously. Repeat a run if you want to see timing variation.
- The activity compares these implementations of this workload. Assembly is not
  guaranteed to beat an optimising C compiler or Java's JIT.
- Comparing the Mac's time against a different x64 computer also changes the CPU,
  operating system and toolchain. Use the two assembly files to compare machine
  instructions, not to infer a universal winner between architectures.

The first output line must agree across versions. Timing differences are the
measurement, not an expected fixed result.

## What to compare in the assembly

Both machines are 64-bit platforms. We use their **32-bit register views** for
these bounded integer values.

| Idea | Apple Silicon ARM64 | x64 |
|---|---|---|
| Candidate number | `w1` | `r9d` |
| Divisor | `w3` | `r10d` |
| Prime count | `w2` | `r11d` |
| Square of divisor | `mul w4, w3, w3` | `mov eax, r10d` then `imul eax, r10d` |
| Division and remainder | `udiv` gives a quotient; `msub` obtains the remainder | `div` gives quotient in `eax` and remainder in `edx` |
| Conditional branch | `b.gt`, `cbz` | `jg`, `jz` |
| Integer return value | `w0` | `eax` |

Instruction sets depend on the CPU architecture. Calling conventions and object
formats also depend on the operating system: the x64 source receives its first
integer in `ecx` on Windows and `edi` on Linux. macOS exposes the C function name
as `_count_primes` in the assembly file.

The algorithm is deliberately straightforward. At this stage, recognising the
extra machine-level detail matters more than memorising every instruction.

## References

- [Apple: writing ARM64 code for Apple platforms](https://developer.apple.com/documentation/xcode/writing-arm64-code-for-apple-platforms)
- [Microsoft: x64 calling convention](https://learn.microsoft.com/en-us/cpp/build/x64-calling-convention)
- [GNU assembler: Intel and AT&T syntax](https://sourceware.org/binutils/docs/as/i386_002dVariations.html)
- [Python glossary: bytecode](https://docs.python.org/3/glossary.html#term-bytecode)

## Verification

C, Java, Python, macOS ARM64 assembly and Linux x64 assembly were compiled and
run against known prime counts, including 78498 for one million. Small and
boundary cases were checked against an independent sieve. The Windows x64
calling-convention branch was executed through a compatible adapter on Linux.

Both assembly sources also cross-assemble successfully into their native object
formats. Native execution of the Windows x64 version remains to be checked.

## Topic 1 demonstration

The prime-counting programs are supplied for an instructor-led comparison of
compilation and execution times. In Topic 1, run them and observe the results;
you are not expected to understand or write their algorithms yet. Study loops
and helper methods after Topic 3. The Hello World Java program is the coding
example for Topic 1.
