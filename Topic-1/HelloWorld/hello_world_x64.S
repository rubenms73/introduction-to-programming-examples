// x86-64, Windows (GCC/MinGW-w64) or Linux (GCC).
// GNU assembler, Intel syntax. Keep the capital .S extension.
// A complete main function calling puts, which adds a newline.

.intel_syntax noprefix
.text
.globl main

#ifdef _WIN32
.seh_proc main
#else
.type main, @function
#endif
main:
#ifdef _WIN32
    sub     rsp, 40                 // 32-byte shadow space + stack alignment
    .seh_stackalloc 40
    .seh_endprologue
    lea     rcx, [rip + .Lmessage]  // Windows: first argument in rcx
    call    puts
    add     rsp, 40
#else
    sub     rsp, 8                  // align the stack before calling puts
    lea     rdi, [rip + .Lmessage]  // Linux: first argument in rdi
    call    puts@PLT
    add     rsp, 8
#endif
    xor     eax, eax                // return 0 to the operating system
    ret
#ifdef _WIN32
.seh_endproc
.section .rdata,"dr"
#else
.size main, .-main
.section .rodata
#endif
.Lmessage:
    .asciz "Hello, World!"

#ifndef _WIN32
.section .note.GNU-stack,"",@progbits
#endif
