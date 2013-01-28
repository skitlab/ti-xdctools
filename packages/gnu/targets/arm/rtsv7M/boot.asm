@ --COPYRIGHT--,EPL
@   Copyright (c) 2011 Texas Instruments and others.
@   All rights reserved. This program and the accompanying materials
@   are made available under the terms of the Eclipse Public License v1.0
@   which accompanies this distribution, and is available at
@   http://www.eclipse.org/legal/epl-v10.html
@
@   Contributors:
@       Texas Instruments - initial implementation
@
@ --/COPYRIGHT--
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@  boot.asm
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

    .syntax unified

    .global	_c_int00
    .global	_reset_fxns_done_

    .sect ".bootVecs"
    .long 0		@ real stack pointer will be initialized in
    .long _c_int00	@ startup routine

    .text
    .func _c_int00
    .thumb_func

_c_int00: 
    @ initialize stack pointer
    ldr r0, =__TI_STACK_BASE
    mov sp, r0
    ldr r0, =__TI_STACK_SIZE
    add sp, r0

    @ align to 64-bits for EABI
    mov r7, sp
    mov r0, #0x07
    bic r7, r0
    mov sp, r7

    @ run any reset functions
    ldr r0, =xdc_runtime_Startup_reset__I
    cmp r0, #0
    beq _reset_fxns_done_
    blx r0

_reset_fxns_done_:

    @ do more initialization in C, go to main()
    bl startupC

    .endfunc
    .end

