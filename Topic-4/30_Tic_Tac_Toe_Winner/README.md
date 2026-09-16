# 30 Tic Tac Toe Winner

## Problem statement

Write a program that receives a `3 x 3` matrix representing a tic-tac-toe board and determines whether `X`, `O` or nobody has won.

The program must check rows, columns and diagonals.

Suggested approach: write a helper method that checks whether three cells form a winning line. Use it for all rows, columns and diagonals.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

From this folder:

```sh
javac *.java
java TicTacToeWinner
```

The main method is in `TicTacToeWinner.java`. Run it and follow any input prompts.

## Prerequisites

Use indexed arrays, loops and the text operations taught in Topic 4: length(), charAt(), equals(), concatenation, next() and nextLine(). Implement traversals explicitly.
