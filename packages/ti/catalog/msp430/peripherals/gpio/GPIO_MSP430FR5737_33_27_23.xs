/* --COPYRIGHT--,EPL
 *  Copyright (c) 2008 Texas Instruments and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *      Texas Instruments - initial implementation
 *
 * --/COPYRIGHT--*/

/*
 *  ======== GPIO_MSP430FR5737_33_27_23.xs ========
 */

/*
 *  ======== instance$meta$init ========
 */
function instance$meta$init(clock)
{
    /* Call super's initializer */
    this.$module.$super.instance$meta$init.$apply(this, []);

    /* Initialize this config */
    this.clock = clock;

    /* Define the device pin configuration */
    /* TODO: This here should really be a module-wide feature, rather than an instance feature,
     * however due to limitations in XDCtools 3.21.0.0 the data is located here */
    this.devicePins =
    [
        [
            {
                pinName : "P1.0",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "TA0.CCI1A",
                        "TA0.1",
                        "DMAE0",
                        "RTCCLK",
                        "CD0"
                    ],
                    functionConfig : [
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x01 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x01, bitClearMask : 0x00 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x01 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "P1SEL0", bitSetMask : 0x01, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x01, bitClearMask : 0x00 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "P1SEL0", bitSetMask : 0x01, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "P1SEL1", bitSetMask : 0x01, bitClearMask : 0x00 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x01 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x01, bitClearMask : 0x00 },
                            { register : "P1SEL1", bitSetMask : 0x01, bitClearMask : 0x00 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x01 }
                        ],
                        [
                            { register : "P1SEL1", bitSetMask : 0x01, bitClearMask : 0x00 },
                            { register : "P1SEL0", bitSetMask : 0x01, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "P1.1",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "TA0.CCI2A",
                        "TA0.2",
                        "TA1CLK",
                        "CDOUT",
                        "CD1"
                    ],
                    functionConfig : [
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x02 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x02 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x02 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x02, bitClearMask : 0x00 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x02 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x02 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x02 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x02 },
                            { register : "P1SEL0", bitSetMask : 0x02, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x02, bitClearMask : 0x00 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x02 },
                            { register : "P1SEL0", bitSetMask : 0x02, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x02 },
                            { register : "P1SEL1", bitSetMask : 0x02, bitClearMask : 0x00 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x02 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x02, bitClearMask : 0x00 },
                            { register : "P1SEL1", bitSetMask : 0x02, bitClearMask : 0x00 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x02 }
                        ],
                        [
                            { register : "P1SEL1", bitSetMask : 0x02, bitClearMask : 0x00 },
                            { register : "P1SEL0", bitSetMask : 0x02, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "P1.2",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "TA1.CCI1A",
                        "TA1.1",
                        "TA0CLK",
                        "CDOUT",
                        "CD2"
                    ],
                    functionConfig : [
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x04 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x04, bitClearMask : 0x00 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x04 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "P1SEL0", bitSetMask : 0x04, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x04, bitClearMask : 0x00 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "P1SEL0", bitSetMask : 0x04, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "P1SEL1", bitSetMask : 0x04, bitClearMask : 0x00 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x04 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x04, bitClearMask : 0x00 },
                            { register : "P1SEL1", bitSetMask : 0x04, bitClearMask : 0x00 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x04 }
                        ],
                        [
                            { register : "P1SEL1", bitSetMask : 0x04, bitClearMask : 0x00 },
                            { register : "P1SEL0", bitSetMask : 0x04, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "P1.3",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "TA1.CCI2A",
                        "TA1.2",
                        "UCB0STE",
                        "CD3"
                    ],
                    functionConfig : [
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x08 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x08 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x08 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x08, bitClearMask : 0x00 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x08 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x08 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x08 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x08 },
                            { register : "P1SEL0", bitSetMask : 0x08, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x08, bitClearMask : 0x00 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x08 },
                            { register : "P1SEL0", bitSetMask : 0x08, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P1SEL1", bitSetMask : 0x08, bitClearMask : 0x00 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x08 }
                        ],
                        [
                            { register : "P1SEL1", bitSetMask : 0x08, bitClearMask : 0x00 },
                            { register : "P1SEL0", bitSetMask : 0x08, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "P1.4",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "TB0.CCI1A",
                        "TB0.1",
                        "UCA0STE",
                        "CD4"
                    ],
                    functionConfig : [
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x10 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x10 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x10 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x10, bitClearMask : 0x00 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x10 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x10 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x10 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x10 },
                            { register : "P1SEL0", bitSetMask : 0x10, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x10, bitClearMask : 0x00 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x10 },
                            { register : "P1SEL0", bitSetMask : 0x10, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P1SEL1", bitSetMask : 0x10, bitClearMask : 0x00 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x10 }
                        ],
                        [
                            { register : "P1SEL1", bitSetMask : 0x10, bitClearMask : 0x00 },
                            { register : "P1SEL0", bitSetMask : 0x10, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "P1.5",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "TB0.CCI2A",
                        "TB0.2",
                        "UCA0CLK",
                        "CD5"
                    ],
                    functionConfig : [
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x20 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x20, bitClearMask : 0x00 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x20 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "P1SEL0", bitSetMask : 0x20, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x20, bitClearMask : 0x00 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "P1SEL0", bitSetMask : 0x20, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P1SEL1", bitSetMask : 0x20, bitClearMask : 0x00 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x20 }
                        ],
                        [
                            { register : "P1SEL1", bitSetMask : 0x20, bitClearMask : 0x00 },
                            { register : "P1SEL0", bitSetMask : 0x20, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "P1.6",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "TB1.CCI1A",
                        "TB1.1",
                        "UCB0SIMO/UCB0SDA",
                        "TA0.CCI0A",
                        "TA0.0"
                    ],
                    functionConfig : [
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x40 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x40, bitClearMask : 0x00 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x40 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "P1SEL0", bitSetMask : 0x40, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x40, bitClearMask : 0x00 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "P1SEL0", bitSetMask : 0x40, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P1SEL1", bitSetMask : 0x40, bitClearMask : 0x00 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x40 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "P1SEL1", bitSetMask : 0x40, bitClearMask : 0x00 },
                            { register : "P1SEL0", bitSetMask : 0x40, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x40, bitClearMask : 0x00 },
                            { register : "P1SEL1", bitSetMask : 0x40, bitClearMask : 0x00 },
                            { register : "P1SEL0", bitSetMask : 0x40, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "P1.7",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "TB1.CCI2A",
                        "TB1.2",
                        "UCB0SOMI/UCB0SCL",
                        "TA1.CCI0A",
                        "TA1.0"
                    ],
                    functionConfig : [
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x80 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x80 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x80 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x80, bitClearMask : 0x00 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x80 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x80 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x80 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x80 },
                            { register : "P1SEL0", bitSetMask : 0x80, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x80, bitClearMask : 0x00 },
                            { register : "P1SEL1", bitSetMask : 0x00, bitClearMask : 0x80 },
                            { register : "P1SEL0", bitSetMask : 0x80, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P1SEL1", bitSetMask : 0x80, bitClearMask : 0x00 },
                            { register : "P1SEL0", bitSetMask : 0x00, bitClearMask : 0x80 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x80 },
                            { register : "P1SEL1", bitSetMask : 0x80, bitClearMask : 0x00 },
                            { register : "P1SEL0", bitSetMask : 0x80, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x80, bitClearMask : 0x00 },
                            { register : "P1SEL1", bitSetMask : 0x80, bitClearMask : 0x00 },
                            { register : "P1SEL0", bitSetMask : 0x80, bitClearMask : 0x00 }
                        ]
                    ]
                }
            }
        ],
        [
            {
                pinName : "P2.0",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "TB2.CCI0A",
                        "TB2.0",
                        "UCA0TXD/UCA0SIMO",
                        "TB0CLK",
                        "ACLK"
                    ],
                    functionConfig : [
                        [
                            { register : "P2DIR", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "P2SEL0", bitSetMask : 0x00, bitClearMask : 0x01 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x01, bitClearMask : 0x00 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "P2SEL0", bitSetMask : 0x00, bitClearMask : 0x01 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "P2SEL0", bitSetMask : 0x01, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x01, bitClearMask : 0x00 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "P2SEL0", bitSetMask : 0x01, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P2SEL1", bitSetMask : 0x01, bitClearMask : 0x00 },
                            { register : "P2SEL0", bitSetMask : 0x00, bitClearMask : 0x01 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "P2SEL1", bitSetMask : 0x01, bitClearMask : 0x00 },
                            { register : "P2SEL0", bitSetMask : 0x01, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x01, bitClearMask : 0x00 },
                            { register : "P2SEL1", bitSetMask : 0x01, bitClearMask : 0x00 },
                            { register : "P2SEL0", bitSetMask : 0x01, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "P2.1",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "TB2.CCI1A",
                        "TB2.1",
                        "UCA0RXD/UCA0SOMI",
                        "TB0.CCI0A",
                        "TB0.0"
                    ],
                    functionConfig : [
                        [
                            { register : "P2DIR", bitSetMask : 0x00, bitClearMask : 0x02 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x02 },
                            { register : "P2SEL0", bitSetMask : 0x00, bitClearMask : 0x02 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x02, bitClearMask : 0x00 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x02 },
                            { register : "P2SEL0", bitSetMask : 0x00, bitClearMask : 0x02 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x00, bitClearMask : 0x02 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x02 },
                            { register : "P2SEL0", bitSetMask : 0x02, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x02, bitClearMask : 0x00 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x02 },
                            { register : "P2SEL0", bitSetMask : 0x02, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P2SEL1", bitSetMask : 0x02, bitClearMask : 0x00 },
                            { register : "P2SEL0", bitSetMask : 0x00, bitClearMask : 0x02 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x00, bitClearMask : 0x02 },
                            { register : "P2SEL1", bitSetMask : 0x02, bitClearMask : 0x00 },
                            { register : "P2SEL0", bitSetMask : 0x02, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x02, bitClearMask : 0x00 },
                            { register : "P2SEL1", bitSetMask : 0x02, bitClearMask : 0x00 },
                            { register : "P2SEL0", bitSetMask : 0x02, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "P2.2",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "TB2.CCI2A",
                        "TB2.2",
                        "UCB0CLK",
                        "TB1.CCI0A",
                        "TB1.0"
                    ],
                    functionConfig : [
                        [
                            { register : "P2DIR", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "P2SEL0", bitSetMask : 0x00, bitClearMask : 0x04 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x04, bitClearMask : 0x00 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "P2SEL0", bitSetMask : 0x00, bitClearMask : 0x04 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "P2SEL0", bitSetMask : 0x04, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x04, bitClearMask : 0x00 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "P2SEL0", bitSetMask : 0x04, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P2SEL1", bitSetMask : 0x04, bitClearMask : 0x00 },
                            { register : "P2SEL0", bitSetMask : 0x00, bitClearMask : 0x04 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "P2SEL1", bitSetMask : 0x04, bitClearMask : 0x00 },
                            { register : "P2SEL0", bitSetMask : 0x04, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x04, bitClearMask : 0x00 },
                            { register : "P2SEL1", bitSetMask : 0x04, bitClearMask : 0x00 },
                            { register : "P2SEL0", bitSetMask : 0x04, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "P2.3",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "TA0.CCI0B",
                        "TA0.0",
                        "UCA1STE",
                        "CD10"
                    ],
                    functionConfig : [
                        [
                            { register : "P2DIR", bitSetMask : 0x00, bitClearMask : 0x08 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x08 },
                            { register : "P2SEL0", bitSetMask : 0x00, bitClearMask : 0x08 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x08, bitClearMask : 0x00 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x08 },
                            { register : "P2SEL0", bitSetMask : 0x00, bitClearMask : 0x08 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x00, bitClearMask : 0x08 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x08 },
                            { register : "P2SEL0", bitSetMask : 0x08, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x08, bitClearMask : 0x00 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x08 },
                            { register : "P2SEL0", bitSetMask : 0x08, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P2SEL1", bitSetMask : 0x08, bitClearMask : 0x00 },
                            { register : "P2SEL0", bitSetMask : 0x00, bitClearMask : 0x08 }
                        ],
                        [
                            { register : "P2SEL1", bitSetMask : 0x08, bitClearMask : 0x00 },
                            { register : "P2SEL0", bitSetMask : 0x08, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "P2.4",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "TA1.CCI0B",
                        "TA1.0",
                        "UCA1CLK",
                        "CD11"
                    ],
                    functionConfig : [
                        [
                            { register : "P2DIR", bitSetMask : 0x00, bitClearMask : 0x10 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x10 },
                            { register : "P2SEL0", bitSetMask : 0x00, bitClearMask : 0x10 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x10, bitClearMask : 0x00 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x10 },
                            { register : "P2SEL0", bitSetMask : 0x00, bitClearMask : 0x10 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x00, bitClearMask : 0x10 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x10 },
                            { register : "P2SEL0", bitSetMask : 0x10, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x10, bitClearMask : 0x00 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x10 },
                            { register : "P2SEL0", bitSetMask : 0x10, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P2SEL1", bitSetMask : 0x10, bitClearMask : 0x00 },
                            { register : "P2SEL0", bitSetMask : 0x00, bitClearMask : 0x10 }
                        ],
                        [
                            { register : "P2SEL1", bitSetMask : 0x10, bitClearMask : 0x00 },
                            { register : "P2SEL0", bitSetMask : 0x10, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "P2.5",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "TB0.CCI0B",
                        "TB0.0",
                        "UCA1TXD/UCA1SIMO"
                    ],
                    functionConfig : [
                        [
                            { register : "P2DIR", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "P2SEL0", bitSetMask : 0x00, bitClearMask : 0x20 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x20, bitClearMask : 0x00 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "P2SEL0", bitSetMask : 0x00, bitClearMask : 0x20 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "P2SEL0", bitSetMask : 0x20, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x20, bitClearMask : 0x00 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "P2SEL0", bitSetMask : 0x20, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P2SEL1", bitSetMask : 0x20, bitClearMask : 0x00 },
                            { register : "P2SEL0", bitSetMask : 0x00, bitClearMask : 0x20 }
                        ]
                    ]
                }
            },
            {
                pinName : "P2.6",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "TB1.CCI0B",
                        "TB1.0",
                        "UCA1RXD/UCA1SOMI"
                    ],
                    functionConfig : [
                        [
                            { register : "P2DIR", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "P2SEL0", bitSetMask : 0x00, bitClearMask : 0x40 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x40, bitClearMask : 0x00 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "P2SEL0", bitSetMask : 0x00, bitClearMask : 0x40 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "P2SEL0", bitSetMask : 0x40, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x40, bitClearMask : 0x00 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "P2SEL0", bitSetMask : 0x40, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P2SEL1", bitSetMask : 0x40, bitClearMask : 0x00 },
                            { register : "P2SEL0", bitSetMask : 0x00, bitClearMask : 0x40 }
                        ]
                    ]
                }
            },
            {
                pinName : "P2.7",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output"
                    ],
                    functionConfig : [
                        [
                            { register : "P2DIR", bitSetMask : 0x00, bitClearMask : 0x80 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x80 },
                            { register : "P2SEL0", bitSetMask : 0x00, bitClearMask : 0x80 }
                        ],
                        [
                            { register : "P2DIR", bitSetMask : 0x80, bitClearMask : 0x00 },
                            { register : "P2SEL1", bitSetMask : 0x00, bitClearMask : 0x80 },
                            { register : "P2SEL0", bitSetMask : 0x00, bitClearMask : 0x80 }
                        ]
                    ]
                }
            }
        ],
        [
            {
                pinName : "P3.0",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "CD12"
                    ],
                    functionConfig : [
                        [
                            { register : "P3DIR", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "P3SEL1", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "P3SEL0", bitSetMask : 0x00, bitClearMask : 0x01 }
                        ],
                        [
                            { register : "P3DIR", bitSetMask : 0x01, bitClearMask : 0x00 },
                            { register : "P3SEL1", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "P3SEL0", bitSetMask : 0x00, bitClearMask : 0x01 }
                        ],
                        [
                            { register : "P3SEL1", bitSetMask : 0x01, bitClearMask : 0x00 },
                            { register : "P3SEL0", bitSetMask : 0x01, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "P3.1",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "CD13"
                    ],
                    functionConfig : [
                        [
                            { register : "P3DIR", bitSetMask : 0x00, bitClearMask : 0x02 },
                            { register : "P3SEL1", bitSetMask : 0x00, bitClearMask : 0x02 },
                            { register : "P3SEL0", bitSetMask : 0x00, bitClearMask : 0x02 }
                        ],
                        [
                            { register : "P3DIR", bitSetMask : 0x02, bitClearMask : 0x00 },
                            { register : "P3SEL1", bitSetMask : 0x00, bitClearMask : 0x02 },
                            { register : "P3SEL0", bitSetMask : 0x00, bitClearMask : 0x02 }
                        ],
                        [
                            { register : "P3SEL1", bitSetMask : 0x02, bitClearMask : 0x00 },
                            { register : "P3SEL0", bitSetMask : 0x02, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "P3.2",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "CD14"
                    ],
                    functionConfig : [
                        [
                            { register : "P3DIR", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "P3SEL1", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "P3SEL0", bitSetMask : 0x00, bitClearMask : 0x04 }
                        ],
                        [
                            { register : "P3DIR", bitSetMask : 0x04, bitClearMask : 0x00 },
                            { register : "P3SEL1", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "P3SEL0", bitSetMask : 0x00, bitClearMask : 0x04 }
                        ],
                        [
                            { register : "P3SEL1", bitSetMask : 0x04, bitClearMask : 0x00 },
                            { register : "P3SEL0", bitSetMask : 0x04, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "P3.3",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "CD15"
                    ],
                    functionConfig : [
                        [
                            { register : "P3DIR", bitSetMask : 0x00, bitClearMask : 0x08 },
                            { register : "P3SEL1", bitSetMask : 0x00, bitClearMask : 0x08 },
                            { register : "P3SEL0", bitSetMask : 0x00, bitClearMask : 0x08 }
                        ],
                        [
                            { register : "P3DIR", bitSetMask : 0x08, bitClearMask : 0x00 },
                            { register : "P3SEL1", bitSetMask : 0x00, bitClearMask : 0x08 },
                            { register : "P3SEL0", bitSetMask : 0x00, bitClearMask : 0x08 }
                        ],
                        [
                            { register : "P3SEL1", bitSetMask : 0x08, bitClearMask : 0x00 },
                            { register : "P3SEL0", bitSetMask : 0x08, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "P3.4",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "TB1.CCI1B",
                        "TB1.1",
                        "TB2CLK",
                        "SMCLK"
                    ],
                    functionConfig : [
                        [
                            { register : "P3DIR", bitSetMask : 0x00, bitClearMask : 0x10 },
                            { register : "P3SEL1", bitSetMask : 0x00, bitClearMask : 0x10 },
                            { register : "P3SEL0", bitSetMask : 0x00, bitClearMask : 0x10 }
                        ],
                        [
                            { register : "P3DIR", bitSetMask : 0x10, bitClearMask : 0x00 },
                            { register : "P3SEL1", bitSetMask : 0x00, bitClearMask : 0x10 },
                            { register : "P3SEL0", bitSetMask : 0x00, bitClearMask : 0x10 }
                        ],
                        [
                            { register : "P3DIR", bitSetMask : 0x00, bitClearMask : 0x10 },
                            { register : "P3SEL1", bitSetMask : 0x00, bitClearMask : 0x10 },
                            { register : "P3SEL0", bitSetMask : 0x10, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P3DIR", bitSetMask : 0x10, bitClearMask : 0x00 },
                            { register : "P3SEL1", bitSetMask : 0x00, bitClearMask : 0x10 },
                            { register : "P3SEL0", bitSetMask : 0x10, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P3DIR", bitSetMask : 0x00, bitClearMask : 0x10 },
                            { register : "P3SEL1", bitSetMask : 0x10, bitClearMask : 0x00 },
                            { register : "P3SEL0", bitSetMask : 0x10, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P3DIR", bitSetMask : 0x10, bitClearMask : 0x00 },
                            { register : "P3SEL1", bitSetMask : 0x10, bitClearMask : 0x00 },
                            { register : "P3SEL0", bitSetMask : 0x10, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "P3.5",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "TB1.CCI2B",
                        "TB1.2",
                        "CDOUT"
                    ],
                    functionConfig : [
                        [
                            { register : "P3DIR", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "P3SEL1", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "P3SEL0", bitSetMask : 0x00, bitClearMask : 0x20 }
                        ],
                        [
                            { register : "P3DIR", bitSetMask : 0x20, bitClearMask : 0x00 },
                            { register : "P3SEL1", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "P3SEL0", bitSetMask : 0x00, bitClearMask : 0x20 }
                        ],
                        [
                            { register : "P3DIR", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "P3SEL1", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "P3SEL0", bitSetMask : 0x20, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P3DIR", bitSetMask : 0x20, bitClearMask : 0x00 },
                            { register : "P3SEL1", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "P3SEL0", bitSetMask : 0x20, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P3DIR", bitSetMask : 0x20, bitClearMask : 0x00 },
                            { register : "P3SEL1", bitSetMask : 0x20, bitClearMask : 0x00 },
                            { register : "P3SEL0", bitSetMask : 0x20, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "P3.6",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "TB2.CCI1B",
                        "TB2.1",
                        "TB1CLK"
                    ],
                    functionConfig : [
                        [
                            { register : "P3DIR", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "P3SEL1", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "P3SEL0", bitSetMask : 0x00, bitClearMask : 0x40 }
                        ],
                        [
                            { register : "P3DIR", bitSetMask : 0x40, bitClearMask : 0x00 },
                            { register : "P3SEL1", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "P3SEL0", bitSetMask : 0x00, bitClearMask : 0x40 }
                        ],
                        [
                            { register : "P3DIR", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "P3SEL1", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "P3SEL0", bitSetMask : 0x40, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P3DIR", bitSetMask : 0x40, bitClearMask : 0x00 },
                            { register : "P3SEL1", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "P3SEL0", bitSetMask : 0x40, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P3DIR", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "P3SEL1", bitSetMask : 0x40, bitClearMask : 0x00 },
                            { register : "P3SEL0", bitSetMask : 0x40, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "P3.7",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "TB2.CCI2B",
                        "TB2.2"
                    ],
                    functionConfig : [
                        [
                            { register : "P3DIR", bitSetMask : 0x00, bitClearMask : 0x80 },
                            { register : "P3SEL1", bitSetMask : 0x00, bitClearMask : 0x80 },
                            { register : "P3SEL0", bitSetMask : 0x00, bitClearMask : 0x80 }
                        ],
                        [
                            { register : "P3DIR", bitSetMask : 0x80, bitClearMask : 0x00 },
                            { register : "P3SEL1", bitSetMask : 0x00, bitClearMask : 0x80 },
                            { register : "P3SEL0", bitSetMask : 0x00, bitClearMask : 0x80 }
                        ],
                        [
                            { register : "P3DIR", bitSetMask : 0x00, bitClearMask : 0x80 },
                            { register : "P3SEL1", bitSetMask : 0x00, bitClearMask : 0x80 },
                            { register : "P3SEL0", bitSetMask : 0x80, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P3DIR", bitSetMask : 0x80, bitClearMask : 0x00 },
                            { register : "P3SEL1", bitSetMask : 0x00, bitClearMask : 0x80 },
                            { register : "P3SEL0", bitSetMask : 0x80, bitClearMask : 0x00 }
                        ]
                    ]
                }
            }
        ],
        [
            {
                pinName : "P4.0",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "TB2.CCI0B",
                        "TB2.0"
                    ],
                    functionConfig : [
                        [
                            { register : "P4DIR", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "P4SEL1", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "P4SEL0", bitSetMask : 0x00, bitClearMask : 0x01 }
                        ],
                        [
                            { register : "P4DIR", bitSetMask : 0x01, bitClearMask : 0x00 },
                            { register : "P4SEL1", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "P4SEL0", bitSetMask : 0x00, bitClearMask : 0x01 }
                        ],
                        [
                            { register : "P4DIR", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "P4SEL1", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "P4SEL0", bitSetMask : 0x01, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P4DIR", bitSetMask : 0x01, bitClearMask : 0x00 },
                            { register : "P4SEL1", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "P4SEL0", bitSetMask : 0x01, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "P4.1",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output"
                    ],
                    functionConfig : [
                        [
                            { register : "P4DIR", bitSetMask : 0x00, bitClearMask : 0x02 },
                            { register : "P4SEL1", bitSetMask : 0x00, bitClearMask : 0x02 },
                            { register : "P4SEL0", bitSetMask : 0x00, bitClearMask : 0x02 }
                        ],
                        [
                            { register : "P4DIR", bitSetMask : 0x02, bitClearMask : 0x00 },
                            { register : "P4SEL1", bitSetMask : 0x00, bitClearMask : 0x02 },
                            { register : "P4SEL0", bitSetMask : 0x00, bitClearMask : 0x02 }
                        ]
                    ]
                }
            },
            {
                pinName : "P4.2",
                pinFunction : {
                    functionName : [
                        ""
                    ],
                    functionConfig : [
                        [

                        ]
                    ]
                }
            },
            {
                pinName : "P4.3",
                pinFunction : {
                    functionName : [
                        ""
                    ],
                    functionConfig : [
                        [

                        ]
                    ]
                }
            },
            {
                pinName : "P4.4",
                pinFunction : {
                    functionName : [
                        ""
                    ],
                    functionConfig : [
                        [

                        ]
                    ]
                }
            },
            {
                pinName : "P4.5",
                pinFunction : {
                    functionName : [
                        ""
                    ],
                    functionConfig : [
                        [

                        ]
                    ]
                }
            },
            {
                pinName : "P4.6",
                pinFunction : {
                    functionName : [
                        ""
                    ],
                    functionConfig : [
                        [

                        ]
                    ]
                }
            },
            {
                pinName : "P4.7",
                pinFunction : {
                    functionName : [
                        ""
                    ],
                    functionConfig : [
                        [

                        ]
                    ]
                }
            }
        ],
        [
            {
                pinName : "PJ.0",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "TB0OUTH",
                        "SMCLK",
                        "CD6"
                    ],
                    functionConfig : [
                        [
                            { register : "PJDIR", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "PJSEL1", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "PJSEL0", bitSetMask : 0x00, bitClearMask : 0x01 }
                        ],
                        [
                            { register : "PJDIR", bitSetMask : 0x01, bitClearMask : 0x00 },
                            { register : "PJSEL1", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "PJSEL0", bitSetMask : 0x00, bitClearMask : 0x01 }
                        ],
                        [
                            { register : "PJDIR", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "PJSEL1", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "PJSEL0", bitSetMask : 0x01, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "PJDIR", bitSetMask : 0x01, bitClearMask : 0x00 },
                            { register : "PJSEL1", bitSetMask : 0x00, bitClearMask : 0x01 },
                            { register : "PJSEL0", bitSetMask : 0x01, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "PJSEL1", bitSetMask : 0x01, bitClearMask : 0x00 },
                            { register : "PJSEL0", bitSetMask : 0x01, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "PJ.1",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "TB1OUTH",
                        "MCLK",
                        "CD7"
                    ],
                    functionConfig : [
                        [
                            { register : "PJDIR", bitSetMask : 0x00, bitClearMask : 0x02 },
                            { register : "PJSEL1", bitSetMask : 0x00, bitClearMask : 0x02 },
                            { register : "PJSEL0", bitSetMask : 0x00, bitClearMask : 0x02 }
                        ],
                        [
                            { register : "PJDIR", bitSetMask : 0x02, bitClearMask : 0x00 },
                            { register : "PJSEL1", bitSetMask : 0x00, bitClearMask : 0x02 },
                            { register : "PJSEL0", bitSetMask : 0x00, bitClearMask : 0x02 }
                        ],
                        [
                            { register : "PJDIR", bitSetMask : 0x00, bitClearMask : 0x02 },
                            { register : "PJSEL1", bitSetMask : 0x00, bitClearMask : 0x02 },
                            { register : "PJSEL0", bitSetMask : 0x02, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "PJDIR", bitSetMask : 0x02, bitClearMask : 0x00 },
                            { register : "PJSEL1", bitSetMask : 0x00, bitClearMask : 0x02 },
                            { register : "PJSEL0", bitSetMask : 0x02, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "PJSEL1", bitSetMask : 0x02, bitClearMask : 0x00 },
                            { register : "PJSEL0", bitSetMask : 0x02, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "PJ.2",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "TB2OUTH",
                        "ACLK",
                        "CD8"
                    ],
                    functionConfig : [
                        [
                            { register : "PJDIR", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "PJSEL1", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "PJSEL0", bitSetMask : 0x00, bitClearMask : 0x04 }
                        ],
                        [
                            { register : "PJDIR", bitSetMask : 0x04, bitClearMask : 0x00 },
                            { register : "PJSEL1", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "PJSEL0", bitSetMask : 0x00, bitClearMask : 0x04 }
                        ],
                        [
                            { register : "PJDIR", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "PJSEL1", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "PJSEL0", bitSetMask : 0x04, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "PJDIR", bitSetMask : 0x04, bitClearMask : 0x00 },
                            { register : "PJSEL1", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "PJSEL0", bitSetMask : 0x04, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "PJSEL1", bitSetMask : 0x04, bitClearMask : 0x00 },
                            { register : "PJSEL0", bitSetMask : 0x04, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "PJ.3",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "CD9"
                    ],
                    functionConfig : [
                        [
                            { register : "PJDIR", bitSetMask : 0x00, bitClearMask : 0x08 },
                            { register : "PJSEL1", bitSetMask : 0x00, bitClearMask : 0x08 },
                            { register : "PJSEL0", bitSetMask : 0x00, bitClearMask : 0x08 }
                        ],
                        [
                            { register : "PJDIR", bitSetMask : 0x08, bitClearMask : 0x00 },
                            { register : "PJSEL1", bitSetMask : 0x00, bitClearMask : 0x08 },
                            { register : "PJSEL0", bitSetMask : 0x00, bitClearMask : 0x08 }
                        ],
                        [
                            { register : "PJSEL1", bitSetMask : 0x08, bitClearMask : 0x00 },
                            { register : "PJSEL0", bitSetMask : 0x08, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "PJ.4",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "XIN"
                    ],
                    functionConfig : [
                        [
                            { register : "PJDIR", bitSetMask : 0x00, bitClearMask : 0x10 },
                            { register : "PJSEL1", bitSetMask : 0x00, bitClearMask : 0x10 },
                            { register : "PJSEL0", bitSetMask : 0x00, bitClearMask : 0x10 }
                        ],
                        [
                            { register : "PJDIR", bitSetMask : 0x10, bitClearMask : 0x00 },
                            { register : "PJSEL1", bitSetMask : 0x00, bitClearMask : 0x10 },
                            { register : "PJSEL0", bitSetMask : 0x00, bitClearMask : 0x10 }
                        ],
                        [
                            { register : "PJSEL1", bitSetMask : 0x00, bitClearMask : 0x10 },
                            { register : "PJSEL0", bitSetMask : 0x10, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "PJ.5",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "XOUT"
                    ],
                    functionConfig : [
                        [
                            { register : "PJDIR", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "PJSEL1", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "PJSEL0", bitSetMask : 0x00, bitClearMask : 0x20 }
                        ],
                        [
                            { register : "PJDIR", bitSetMask : 0x20, bitClearMask : 0x00 },
                            { register : "PJSEL1", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "PJSEL0", bitSetMask : 0x00, bitClearMask : 0x20 }
                        ],
                        [
                            { register : "PJSEL1", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "PJSEL0", bitSetMask : 0x20, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "PJ.6",
                pinFunction : {
                    functionName : [
                        ""
                    ],
                    functionConfig : [
                        [

                        ]
                    ]
                }
            },
            {
                pinName : "PJ.7",
                pinFunction : {
                    functionName : [
                        ""
                    ],
                    functionConfig : [
                        [

                        ]
                    ]
                }
            }
        ]
    ];
}
