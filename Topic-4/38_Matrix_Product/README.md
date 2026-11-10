# 38 Matrix product

This Topic 4 exercise is numbered 38 so that the numbers of the other exercises do not change.

## Problem statement

**Input and behaviour:** Dimensions are positive and values are integers between -1000 and 1000, so every result fits in an `int`. If the product cannot be calculated, report it.

Write a program that reads two matrices of integers and calculates their product.

The product A · B exists only when the number of columns of A is equal to the number of rows of B. The result has as many rows as A and as many columns as B, and each component is c[i][j] = a[i][0]·b[0][j] + a[i][1]·b[1][j] + …, that is, row i of A multiplied component by component by column j of B, and added up.

For example, the product of the 2 × 3 matrix {{1, 2, 3}, {4, 5, 6}} and the 3 × 2 matrix {{7, 8}, {9, 10}, {11, 12}} is {{58, 64}, {139, 154}}, because 1·7 + 2·9 + 3·11 = 58.

Suggested approach: first check the dimensions. Then create the result matrix and fill it with three nested loops: two to choose the component (i, j) and a third one to add up the products.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

### Windows (PowerShell or CMD)

Open a terminal in this example folder. With a JDK on your `PATH`, run the
following commands separately. Run the second command only if compilation succeeds.

```text
javac -encoding UTF-8 MatrixProduct.java
java -cp "." MatrixProduct
```

These commands work in both PowerShell and CMD and require no IDE, Bash or WSL.
They list source files explicitly and use the current folder as the classpath.
For terminal setup and paths containing spaces, see the
[repository instructions](../../README.md#compiling-and-running-java-exercises).

### macOS and Linux

From this example folder:

```sh
javac -encoding UTF-8 MatrixProduct.java
java -cp "." MatrixProduct
```

The main method is in `MatrixProduct.java`. Run it and follow any input prompts.

## Prerequisites

Use indexed arrays, loops and the text operations taught in Topic 4: `length()`, `charAt()`, `equals()`, concatenation, `next()` and `nextLine()`. Write every traversal explicitly.
