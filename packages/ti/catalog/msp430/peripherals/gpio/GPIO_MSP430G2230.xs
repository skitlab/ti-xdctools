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
 *  ======== GPIO_MSP430G2230.xs ========
 */

/*
 *  ======== instance$meta$init ========
 */
function instance$meta$init(usi, adc10)
{
    /* Call super's initializer */
    this.$module.$super.instance$meta$init.$apply(this, []);

    /* Initialize this config */
    this.usi = usi;
    this.adc10 = adc10;

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
                        ""
                    ],
                    functionConfig : [
                        [

                        ]
                    ]
                }
            },
            {
                pinName : "P1.1",
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
                pinName : "P1.2",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "Timer_A2.CCI1A",
                        "Timer_A2.TA1",
                        "A2"
                    ],
                    functionConfig : [
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "P1SEL", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "ADC10AE0", bitSetMask : 0x00, bitClearMask : 0x04 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x04, bitClearMask : 0x00 },
                            { register : "P1SEL", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "ADC10AE0", bitSetMask : 0x00, bitClearMask : 0x04 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x04 },
                            { register : "P1SEL", bitSetMask : 0x04, bitClearMask : 0x00 },
                            { register : "ADC10AE0", bitSetMask : 0x00, bitClearMask : 0x04 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x04, bitClearMask : 0x00 },
                            { register : "P1SEL", bitSetMask : 0x04, bitClearMask : 0x00 },
                            { register : "ADC10AE0", bitSetMask : 0x00, bitClearMask : 0x04 }
                        ],
                        [
                            { register : "ADC10AE0", bitSetMask : 0x04, bitClearMask : 0x00 }
                        ]
                    ]
                }
            },
            {
                pinName : "P1.3",
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
                pinName : "P1.4",
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
                pinName : "P1.5",
                pinFunction : {
                    functionName : [
                        "GPIO Input",
                        "GPIO Output",
                        "Timer_A2.TA0",
                        "A5",
                        "SCLK"
                    ],
                    functionConfig : [
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "P1SEL", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "USICTL0", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "ADC10AE0", bitSetMask : 0x00, bitClearMask : 0x20 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x20, bitClearMask : 0x00 },
                            { register : "P1SEL", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "USICTL0", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "ADC10AE0", bitSetMask : 0x00, bitClearMask : 0x20 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x20, bitClearMask : 0x00 },
                            { register : "P1SEL", bitSetMask : 0x20, bitClearMask : 0x00 },
                            { register : "USICTL0", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "ADC10AE0", bitSetMask : 0x00, bitClearMask : 0x20 }
                        ],
                        [
                            { register : "USICTL0", bitSetMask : 0x00, bitClearMask : 0x20 },
                            { register : "ADC10AE0", bitSetMask : 0x20, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "USICTL0", bitSetMask : 0x20, bitClearMask : 0x00 },
                            { register : "ADC10AE0", bitSetMask : 0x00, bitClearMask : 0x20 }
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
                        "Timer_A2.CCI1A",
                        "Timer_A2.TA1",
                        "A6",
                        "SDO/SCL"
                    ],
                    functionConfig : [
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "P1SEL", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "USICTL0", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "ADC10AE0", bitSetMask : 0x00, bitClearMask : 0x40 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x40, bitClearMask : 0x00 },
                            { register : "P1SEL", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "USICTL0", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "ADC10AE0", bitSetMask : 0x00, bitClearMask : 0x40 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "P1SEL", bitSetMask : 0x40, bitClearMask : 0x00 },
                            { register : "USICTL0", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "ADC10AE0", bitSetMask : 0x00, bitClearMask : 0x40 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x40, bitClearMask : 0x00 },
                            { register : "P1SEL", bitSetMask : 0x40, bitClearMask : 0x00 },
                            { register : "USICTL0", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "ADC10AE0", bitSetMask : 0x00, bitClearMask : 0x40 }
                        ],
                        [
                            { register : "USICTL0", bitSetMask : 0x00, bitClearMask : 0x40 },
                            { register : "ADC10AE0", bitSetMask : 0x40, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P1SEL", bitSetMask : 0x40, bitClearMask : 0x00 },
                            { register : "USICTL0", bitSetMask : 0x40, bitClearMask : 0x00 },
                            { register : "ADC10AE0", bitSetMask : 0x00, bitClearMask : 0x40 }
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
                        "A7",
                        "SDI/SDA"
                    ],
                    functionConfig : [
                        [
                            { register : "P1DIR", bitSetMask : 0x00, bitClearMask : 0x80 },
                            { register : "P1SEL", bitSetMask : 0x00, bitClearMask : 0x80 },
                            { register : "USICTL0", bitSetMask : 0x00, bitClearMask : 0x80 },
                            { register : "ADC10AE0", bitSetMask : 0x00, bitClearMask : 0x80 }
                        ],
                        [
                            { register : "P1DIR", bitSetMask : 0x80, bitClearMask : 0x00 },
                            { register : "P1SEL", bitSetMask : 0x00, bitClearMask : 0x80 },
                            { register : "USICTL0", bitSetMask : 0x00, bitClearMask : 0x80 },
                            { register : "ADC10AE0", bitSetMask : 0x00, bitClearMask : 0x80 }
                        ],
                        [
                            { register : "USICTL0", bitSetMask : 0x00, bitClearMask : 0x80 },
                            { register : "ADC10AE0", bitSetMask : 0x80, bitClearMask : 0x00 }
                        ],
                        [
                            { register : "P1SEL", bitSetMask : 0x80, bitClearMask : 0x00 },
                            { register : "USICTL0", bitSetMask : 0x80, bitClearMask : 0x00 },
                            { register : "ADC10AE0", bitSetMask : 0x00, bitClearMask : 0x80 }
                        ]
                    ]
                }
            }
        ]
    ];
}
