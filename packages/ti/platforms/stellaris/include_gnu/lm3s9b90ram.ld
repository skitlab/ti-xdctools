/******************************************************************************
 *
 * Default linker script for the Texas Instruments LM3S9B90, using RAM only
 *
 *****************************************************************************/

MEMORY 
{
    VECS (WX)  : ORIGIN = 0x20000000,  	LENGTH = 0x200
    IRAM (WX)  : ORIGIN = 0x20000200,  	LENGTH = 0x17E00
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
    } > IRAM

    .ARM.exidx : {
        __exidx_start = .;
        *(.ARM.exidx* .gnu.linkonce.armexidx.*)
        __exidx_end = .;
    } > IRAM

    .data : {
        __data_load__ = LOADADDR (.data);
        __data_start__ = .;
        KEEP (*(.data))
        KEEP (*(.data*))
        . = ALIGN (4);
        __data_end__ = .;
    } > IRAM AT> IRAM

    .bss : {
        __bss_start__ = .;
        *(.shbss)
        KEEP (*(.bss))
        *(.bss.*)
        *(COMMON)
        . = ALIGN (4);
        __bss_end__ = .;
    } > IRAM
}

REGION_ALIAS("REGION_STACK", IRAM);
REGION_ALIAS("REGION_HEAP", IRAM);

