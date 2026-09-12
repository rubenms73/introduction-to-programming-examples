// Apple Silicon, macOS. A complete main function calling the C library.
// puts prints a string and adds a newline.

.section __TEXT,__text,regular,pure_instructions
.p2align 2
.globl _main

_main:
    stp     x29, x30, [sp, #-16]!    // save frame pointer and return address
    mov     x29, sp                 // establish frame, keeping 16-byte alignment

    adrp    x0, Lmessage@PAGE        // page containing the message
    add     x0, x0, Lmessage@PAGEOFF // x0 = address of the string
    bl      _puts                   // first argument in x0

    mov     w0, #0                  // return 0 to the operating system
    ldp     x29, x30, [sp], #16      // restore the saved registers and stack
    ret

.section __TEXT,__cstring,cstring_literals
Lmessage:
    .asciz "Hello, World!"
