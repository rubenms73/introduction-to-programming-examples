# 04 Invoice With Discount and VAT

## Problem statement

**Input and behaviour:** Use finite non-negative prices and percentages between 0 and 100. Apply the discount before VAT.

Write a program that reads a base price, a discount percentage and a VAT percentage. The program must calculate and print the final price.

Apply the discount first and then add VAT to the discounted amount.

Suggested approach: calculate the discount amount, subtract it from the base price, calculate VAT over the discounted price, and finally add it.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 InvoiceWithDiscountAndVat.java
java -cp "." InvoiceWithDiscountAndVat
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 InvoiceWithDiscountAndVat.java
java -cp "." InvoiceWithDiscountAndVat
```

The main method is in `InvoiceWithDiscountAndVat.java`. Run it and follow any input prompts.

## Prerequisites

Use the main/Scanner templates, primitive variables, arithmetic, assignment and console output. No conditionals, loops, arrays or helper methods.

