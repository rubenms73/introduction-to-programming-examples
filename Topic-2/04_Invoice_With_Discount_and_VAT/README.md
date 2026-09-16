# 04 Invoice With Discount and VAT

## Problem statement

**Input and behaviour:** Use finite non-negative prices and percentages between 0 and 100. Apply the discount before VAT.

Write a program that reads a base price, a discount percentage and a VAT percentage. The program must calculate and print the final price.

Apply the discount first and then add VAT to the discounted amount.

Suggested approach: calculate the discount amount, subtract it from the base price, calculate VAT over the discounted price, and finally add it.

## Compile and run

All Java files in this folder belong to the default package. This exercise is
self-contained and requires only JDK 11 or later.

From this folder:

```sh
javac *.java
java InvoiceWithDiscountAndVat
```

The main method is in `InvoiceWithDiscountAndVat.java`. Run it and follow any input prompts.

## Prerequisites

Use the main/Scanner templates, primitive variables, arithmetic, assignment and console output. No conditionals, loops, arrays or helper methods.

