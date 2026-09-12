// x86-64, Windows (GCC/MinGW-w64) or Linux (GCC).
// GNU assembler, Intel syntax. The capital .S enables preprocessing.
// int count_primes(int limit), with 0 <= limit <= 1000000000.
// r8d = limit, r9d = number, r10d = divisor, r11d = count.
// eax = square / quotient, edx = remainder.
// Only caller-saved registers are modified. No stack frame or calls.

.intel_syntax noprefix
.text
.globl count_primes
#ifndef _WIN32
.type count_primes, @function
#endif

count_primes:
#ifdef _WIN32
    mov     r8d, ecx                // Windows: first int argument in ecx
#else
    mov     r8d, edi                // Linux: first int argument in edi
#endif
    mov     r9d, 2                  // number = 2
    xor     r11d, r11d              // count = 0

.Lnumber:
    cmp     r9d, r8d
    jg      .Ldone                  // stop when number > limit
    mov     r10d, 2                 // divisor = 2

.Ldivisor:
    mov     eax, r10d
    imul    eax, r10d               // divisor * divisor
    cmp     eax, r9d
    jg      .Lprime                 // no divisor found up to sqrt(number)

    mov     eax, r9d                // low half of dividend
    xor     edx, edx                // high half of dividend = 0
    div     r10d                    // eax = quotient, edx = remainder
    test    edx, edx
    jz      .Lnext                  // divisible: number is not prime
    inc     r10d                    // divisor++
    jmp     .Ldivisor

.Lprime:
    inc     r11d                    // count++

.Lnext:
    inc     r9d                     // number++
    jmp     .Lnumber

.Ldone:
    mov     eax, r11d               // return count
    ret

#ifndef _WIN32
.size count_primes, .-count_primes
.section .note.GNU-stack,"",@progbits
#endif
