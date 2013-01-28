/******************************************************************************
 *
 * Default linker script for the Texas Instruments LM4F232H5QD
 *
 *****************************************************************************/

MEMORY 
{
    FLASH (RX) : ORIGIN = 0x00000000,   LENGTH = 0x40000
    VECS (WX)  : ORIGIN = 0x20000000,   LENGTH = 0x380
    SRAM (WX)  : ORIGIN = 0x20000380,   LENGTH = 0x7C80
}

SECTIONS {

    .text : {
        CREATE_OBJECT_SYMBOLS
        KEEP (*(.resetVecs))
        KEEP (*(.text))
        *(.text.*)
        . = ALIGN(0x4);
        KEEP (*(.ctors))
        *(.rodata)
        *(.rodata.*)
        . = ALIGN(0x4);
        __init_array_start = .;
        KEEP (*(.init_array*))
        __init_array_end = .;
        *(.init)
        *(.fini*)
    } > FLASH

    .ARM.exidx : {
        __exidx_start = .;
        *(.ARM.exidx* .gnu.linkonce.armexidx.*)
        __exidx_end = .;
    } > FLASH

    .data : {
        __data_load__ = LOADADDR (.data);
        __data_start__ = .;
        KEEP (*(.data))
        KEEP (*(.data*))
        . = ALIGN (4);
        __data_end__ = .;
    } > SRAM AT> FLASH

    .bss : {
        __bss_start__ = .;
        *(.shbss)
        KEEP (*(.bss))
        *(.bss.*)
        *(COMMON)
        . = ALIGN (4);
        __bss_end__ = .;
    } > SRAM
}

REGION_ALIAS("REGION_STACK", SRAM);
REGION_ALIAS("REGION_HEAP", SRAM);

