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
 *  ======== Timer_B7.xs ========
 */

/*
 *  ======== module$meta$init ========
 */
function module$meta$init()
{
}

/*
 *  ======== instance$meta$init ========
 */
function instance$meta$init(clock)
{
    this.clock = clock;

    this.interruptSource[0].registerName = "TBIE";
    this.interruptSource[0].registerDescription = "Timer_B overflow interrupt enable";
    this.interruptSource[0].interruptEnable = false;
    this.interruptSource[0].interruptHandler = false;

    this.interruptSource[1].registerName = "CCIE.0";
    this.interruptSource[1].registerDescription = "Capture/compare interrupt enable 0";
    this.interruptSource[1].interruptEnable = false;
    this.interruptSource[1].interruptHandler = false;

    this.interruptSource[2].registerName = "CCIE.1";
    this.interruptSource[2].registerDescription = "Capture/compare interrupt enable 1";
    this.interruptSource[2].interruptEnable = false;
    this.interruptSource[2].interruptHandler = false;

    this.interruptSource[3].registerName = "CCIE.2";
    this.interruptSource[3].registerDescription = "Capture/compare interrupt enable 2";
    this.interruptSource[3].interruptEnable = false;
    this.interruptSource[3].interruptHandler = false;

    this.interruptSource[4].registerName = "CCIE.3";
    this.interruptSource[4].registerDescription = "Capture/compare interrupt enable 3";
    this.interruptSource[4].interruptEnable = false;
    this.interruptSource[4].interruptHandler = false;

    this.interruptSource[5].registerName = "CCIE.4";
    this.interruptSource[5].registerDescription = "Capture/compare interrupt enable 4";
    this.interruptSource[5].interruptEnable = false;
    this.interruptSource[5].interruptHandler = false;

    this.interruptSource[6].registerName = "CCIE.5";
    this.interruptSource[6].registerDescription = "Capture/compare interrupt enable 5";
    this.interruptSource[6].interruptEnable = false;
    this.interruptSource[6].interruptHandler = false;

    this.interruptSource[7].registerName = "CCIE.6";
    this.interruptSource[7].registerDescription = "Capture/compare interrupt enable 6";
    this.interruptSource[7].interruptEnable = false;
    this.interruptSource[7].interruptHandler = false;
}

/*
 *  ======== setTxxCCRx ========
 */
function setTxxCCRx(ccrNumber , value)
{
    switch (ccrNumber) {
        case 0:
            this.TBCCR0 = value;
            break;
        case 1:
            this.TBCCR1 = value;
            break;
        case 2:
            this.TBCCR2 = value;
            break;
        case 3:
            this.TBCCR3 = value;
            break;
        case 4:
            this.TBCCR4 = value;
            break;
        case 5:
            this.TBCCR5 = value;
            break;
        case 6:
            this.TBCCR6 = value;
            break;
        default:
    }
}

/*
 *  ======== getTxxCCRx ========
 */
function getTxxCCRx(ccrNumber)
{
    switch (ccrNumber) {
        case 0:
            return this.TBCCR0;
            break;
        case 1:
            return this.TBCCR1;
            break;
        case 2:
            return this.TBCCR2;
            break;
        case 3:
            return this.TBCCR3;
            break;
        case 4:
            return this.TBCCR4;
            break;
        case 5:
            return this.TBCCR5;
            break;
        case 6:
            return this.TBCCR6;
            break;
        default:
            return null;
            break;
    }
}
