/*
 *  Copyright (c) 2012 by Texas Instruments and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *      Texas Instruments - initial implementation
 *
 * */

#ifndef ti_catalog_arm_peripherals_timers_timer_h
#define ti_catalog_arm_peripherals_timers_timer_h

#include <xdc/std.h>

typedef volatile struct ti_catalog_arm_peripherals_timers_TimerRegs {
    UInt32 GPTMCFG;     /* 0x00 GPTM Config */
    UInt32 GPTMTAMR;    /* 0x04 GPTM TimerA Mode */
    UInt32 GPTMTBMR;    /* 0x08 GPTM TimerB Mode */
    UInt32 GPTMCTL;     /* 0x0C GPTM Control */
    UInt32 gap10;
    UInt32 gap14;
    UInt32 GPTMIMR;     /* 0x18 GPTM Interrupt Mask */
    UInt32 GPTMRIS;     /* 0x1C GPTM Raw Interrupt Status */
    UInt32 GPTMMIS;     /* 0x20 GPTM Masked Interrupt Status */
    UInt32 GPTMICR;     /* 0x24 GPTM Interrupt Clear */
    UInt32 GPTMTAILR;   /* 0x28 GPTM TimerA Interval Load */
    UInt32 GPTMTBILR;   /* 0x2C GPTM TimerB Interval Load */
    UInt32 GPTMTAMATCHR; /* 0x30 GPTM TimerA Match */
    UInt32 GPTMTBMATCHR; /* 0x34 GPTM TimerB Match */
    UInt32 GPTMTAPR;    /* 0x38 GPTM TimerA Prescale */
    UInt32 GPTMTBPR;    /* 0x3C GPTM TimerB Prescale */
    UInt32 GPTMTAPM;    /* 0x40 GPTM TimerA Prescale Match */
    UInt32 GPTMTBPMR;   /* 0x44 GPTM TimerB Prescale Match */
    UInt32 GPTMTAR;     /* 0x48 GPTM Timer A */
    UInt32 GPTMTBR;     /* 0x4C GPTM Timer B */
} ti_catalog_arm_peripherals_timers_TimerRegs;

#endif
/*
 *  @(#) ti.catalog.arm.peripherals.timers; 1,0,0,183; 8-17-2012 22:13:19; /db/ztree/library/trees/platform/platform-n27x/src/
 */

