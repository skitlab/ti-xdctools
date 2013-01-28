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

/*
 *  ======== Boot.xs ========
 *
 */

var Boot = null;
var Program = null;

/*
 *  ======== module$meta$init ========
 */
function module$meta$init()
{
    /* Only process during "cfg" phase */
    if (xdc.om.$name != "cfg") {
        return;
    }
    Boot = this;
    
    /* Assign setters to the Clock configs. */
    var GetSet = xdc.module("xdc.services.getset.GetSet");
    
    GetSet.init(Boot);
    
    GetSet.onSet(this, "configureClocks", updateFrequency);    
    GetSet.onSet(this, "OSCCLK", updateFrequency);
    GetSet.onSet(this, "SPLLIMULT", updateFrequency);
    GetSet.onSet(this, "SPLLFMULT", updateFrequency);
    GetSet.onSet(this, "SYSDIVSEL", updateFrequency);
    GetSet.onSet(this, "M3SSDIVSEL", updateFrequency);
}

/*
 *  ======== module$use ========
 */
function module$use()
{
    Program = xdc.useModule('xdc.cfg.Program');

    /* only install Boot_init if using XDC runtime */
    if (Program.build.rtsName === null) {
        return;
    }

    /* install Boot_init as a Reset functions */
    var Reset = xdc.useModule('xdc.runtime.Reset');
    Reset.fxns[Reset.fxns.length++]
        = '&ti_catalog_arm_cortexm3_concertoInit_Boot_init';

    /* if the Limp abort function is undefined, use default */
    if (Boot.limpAbortFunction === undefined) {
            Boot.limpAbortFunction = '&ti_catalog_arm_cortexm3_concertoInit_Boot_defaultLimpAbortFunction';
    }

    /* place initial branch to c_int00 if booting from Flash */
    if ( (Boot.bootFromFlash == true) &&
         (Program.sectMap[".ti_catalog_arm_cortexm3_concertoInit_begin"] === 
              undefined)) {
            Program.sectMap[".ti_catalog_arm_cortexm3_concertoInit_begin"] =
                new Program.SectionSpec();
            Program.sectMap[".ti_catalog_arm_cortexm3_concertoInit_begin"].loadSegment = "FLASH_BOOT";
    }

    /* compute Flash wait states */
    if (Boot.configureFlashWaitStates == true) {

        var foundBIOS; 
        var freq;

        /* 
         * Notes: 
         * For SYS/BIOS apps we need to get the CPU frequency set in the
         * BIOS package.  Applications may change the frequency value in their
         * config, so we must check it after the app config has been processed.
         *
         * For non-SYS/BIOS apps we need to get the frequency from the platform
         * setting.  
         *
         * To handle both cases, we need to first check to see if the BIOS 
         * package is found.  If it is, then we need to check if BIOS is used
         * in the app.
         *
         * It is very unfortunate to have this linkage to the BIOS module here,
         * but this will likely be reworked soon with a move of the Boot module.
         *
         */ 
        try {
            var BIOS = xdc.module("ti.sysbios.BIOS");
            foundBIOS = true;
        }
        catch (e) {
            foundBIOS = false;
        }

        /* first get CPU freq from platform */
        freq = Program.cpu.clockRate;       /* MHz */

        /* if BIOS is used in the app update freq from BIOS.cpuFreq.lo */
        if (foundBIOS == true) {
            if (BIOS.$used == true) {
                freq = BIOS.cpuFreq.lo / 1000000;   /* MHz */
            }
        }

        /*
         * Compute wait states.  These threshold values are from initial
         * characterization by Concerto apps team. (RWAIT = (SYSCLK/FCLK)-1)
         */
        if (freq < 41) {
            Boot.flashWaitStates = 0;
        }
        else if (freq < 81) {
            Boot.flashWaitStates = 1;
        }
        else if (freq < 121) {
            Boot.flashWaitStates = 2;
        }
        else {
            Boot.flashWaitStates = 3;
        }
    }

    /* install Boot_initStartup as a Startup first function */
    if ( (Boot.configureFlashWaitStates == true) ||
         (Boot.enableFlashProgramCache == true) ||
         (Boot.enableFlashDataCache == true) ) {

        var Startup = xdc.useModule('xdc.runtime.Startup');
        Startup.firstFxns[Startup.firstFxns.length++] =
            '&ti_catalog_arm_cortexm3_concertoInit_Boot_initStartup';
    }

}

/*
 *  ======== getEnumString ========
 *  Get the enum value string name, not 0, 1, 2 or 3, etc.  For an enumeration
 *  type property.
 *
 *  Example usage:
 *  if obj contains an enumeration type property "Enum enumProp"
 *
 *  view.enumString = getEnumString(obj.enumProp);
 *
 */
function getEnumString(enumProperty)
{
    /*
     *  Split the string into tokens in order to get rid of the huge package
     *  path that precedes the enum string name. Return the last 2 tokens
     *  concatenated with "_" 
     */
    var enumStrArray = String(enumProperty).split(".");
    var len = enumStrArray.length;
    return (enumStrArray[len - 1]);
}

/*
 *  ======== viewInitModule ========
 *  Display the module properties in ROV
 */
function viewInitModule(view, obj)
{
    var Program = xdc.useModule('xdc.rov.Program');
    var Boot = xdc.useModule('ti.catalog.arm.cortexm3.concertoInit.Boot');
    var modCfg = Program.getModuleConfig(Boot.$name);

    view.configureClocks = modCfg.configureClocks;
    view.OSCCLK = modCfg.OSCCLK;
    view.SPLLIMULT = modCfg.SPLLIMULT;
    view.SPLLFMULT = getEnumString(modCfg.SPLLFMULT);
    view.SYSDIVSEL = getEnumString(modCfg.SYSDIVSEL);
    view.M3SSDIVSEL = getEnumString(modCfg.M3SSDIVSEL);
    view.bootC28 = modCfg.bootC28;
}

/*
 *  ======== getFrequency ========
 */
function getFrequency()
{
    var fractMult = 0;
    var frequency;

    /* apply integer and fractional multiply values */
    if (Boot.SPLLFMULT == Boot.Fract_25) {
        fractMult = 0.25;
    }
    else if (Boot.SPLLFMULT == Boot.Fract_50) {
        fractMult = 0.5;
    }
    else if (Boot.SPLLFMULT == Boot.Fract_75) {
        fractMult = 0.75;
    }

    if (Boot.SPLLIMULT == 0) {  /* multiplier bypasses PLL ? */
        frequency = Boot.OSCCLK;
    }
    else {
        frequency = (Boot.OSCCLK * (Boot.SPLLIMULT + fractMult) / 2);
    }
  
    /* convert to Hz */
    frequency *= 1000000;

    /* apply sys clock dividers */
    if (Boot.SYSDIVSEL == Boot.Div_2) {
        frequency /= 2;
    }
    else if (Boot.SYSDIVSEL == Boot.Div_4) {
        frequency /= 4;
    }
    else if (Boot.SYSDIVSEL == Boot.Div_8) {
        frequency /= 8;
    }

    /* set the Timestamp frequency */
    Boot.timestampFreq = frequency;

    /* apply M3 subsystem clock dividers */
    if (Boot.M3SSDIVSEL == Boot.M3Div_2) {
        frequency /= 2;
    }
    if (Boot.M3SSDIVSEL == Boot.M3Div_4) {
        frequency /= 4;
    }

    return (frequency);
}


/* Array of listeners, used by 'registerFreqListener' and 'updateFrequency'. */
var listeners = new Array();

/*
 *  ======== registerFreqListener ========
 *  Called by other modules (e.g., BIOS), to register themselves to listen
 *  for changes to the device frequency configured by the Boot module.
 */
function registerFreqListener(listener)
{
    listeners[listeners.length] = listener;

    /*
     * Invoke updateFrequency in case changes were made before the module
     * was registered (e.g., if the Platform meta$init ran before BIOS
     * meta$init)
     */
    updateFrequency();
}

/*
 *  ======== updateFrequency ========
 *  Update all of the listeners whenever the PLL configuration changes
 *  (assuming configureClocks is true).
 */
function updateFrequency(field, val)
{
    /* Don't fire the update if configureClocks is false. */
    if (!Boot.configureClocks) {
        return;
    }

    /* Compute the new M3 frequency. */
    var newFreq = getFrequency();

    /* Compute the new C28 frequency. */
    var newFreq28 = newFreq;
    if (Boot.M3SSDIVSEL == Boot.M3Div_2) {
        newFreq28 *= 2;
    }
    if (Boot.M3SSDIVSEL == Boot.M3Div_4) {
        newFreq28 *= 4;
    }

    /* Update the displayed frequency values. */
    Boot.displayFrequency = freqToString(newFreq);
    Boot.displayFrequency28 = freqToString(newFreq28);

    /* Notify each of the listeners of the new frequency value. */
    for each (var listener in listeners) {
        listener.fireFrequencyUpdate(newFreq);
    }
}

/*
 *  ======== freqToString ========
 *  Convert the frequency to a string with appropriate MHz / KHz label.
 */
function freqToString(freq)
{
    if ((freq / 1000000) >= 1) {
        var mhz = freq / 1000000.0;
        return (String(mhz) + " MHz");
    }
    else if ((freq / 1000) >= 1) {
        var khz = freq / 1000.0;
        return (String(khz) + " KHz");
    }
    else {
        return (freq + " Hz");
    }
}
/*
 *  @(#) ti.catalog.arm.cortexm3.concertoInit; 1, 0, 0,35; 8-17-2012 22:13:14; /db/ztree/library/trees/platform/platform-n27x/src/
 */

