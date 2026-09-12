// Apple Silicon, macOS. Assemble with Apple's clang (see README).
// int count_primes(int limit), with 0 <= limit <= 1000000000.
// w0 = limit (argument), w1 = number, w2 = count, w3 = divisor.
// w4 = divisor squared, w5 = quotient, w6 = remainder.
// All used registers are caller-saved. This leaf function makes no calls.

.text
.p2align 2
.globl _count_primes

_count_primes:
    mov     w1, #2                  // number = 2
    mov     w2, #0                  // count = 0

Lnumber:
    cmp     w1, w0
    b.gt    Ldone                   // stop when number > limit
    mov     w3, #2                  // divisor = 2

Ldivisor:
    mul     w4, w3, w3              // divisor * divisor
    cmp     w4, w1
    b.gt    Lprime                  // no divisor found up to sqrt(number)

    udiv    w5, w1, w3              // quotient = number / divisor
    msub    w6, w5, w3, w1          // remainder = number - quotient * divisor
    cbz     w6, Lnext               // divisible: number is not prime
    add     w3, w3, #1              // divisor++
    b       Ldivisor

Lprime:
    add     w2, w2, #1              // count++

Lnext:
    add     w1, w1, #1              // number++
    b       Lnumber

Ldone:
    mov     w0, w2                  // return count
    ret
