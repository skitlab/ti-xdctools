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
    
    /* Assign setters to the PLL configs. */
    var GetSet = xdc.module("xdc.services.getset.GetSet");
    
    GetSet.init(Boot);
    
    GetSet.onSet(this, "pllOSCCLK", updateFrequency);
    GetSet.onSet(this, "pllcrDIV", updateFrequency);
    GetSet.onSet(this, "pllstsDIVSEL", updateFrequency);
    GetSet.onSet(this, "pllType", updateFrequency);
    GetSet.onSet(this, "configurePll", updateFrequency);
}

/*
 *  ======== module$use ========
 */
function module$use()
{
    Program = xdc.useModule('xdc.cfg.Program');

    if (Program.cpu.deviceName.match(/F28M35/)) {
        Boot.concertoDevice = true;
    }

    if (Program.build.rtsName !== null) {
        /* Install Boot_init as one of Reset functions */
        var Reset = xdc.useModule('xdc.runtime.Reset');
        Reset.fxns[Reset.fxns.length++] = '&ti_catalog_c2800_init_Boot_init';

        if (Boot.limpAbortFunction === undefined) {
            Boot.limpAbortFunction = '&ti_catalog_c2800_init_Boot_defaultLimpAbortFunction';
        }

        if ( (Boot.bootFromFlash == true) && 
             (Program.sectMap[".ti_catalog_c2800_init_begin"] === undefined)) {
            Program.sectMap[".ti_catalog_c2800_init_begin"] = 
                new Program.SectionSpec();
            Program.sectMap[".ti_catalog_c2800_init_begin"].loadSegment = 
                "BEGIN";
        }
    }
}

/*
 *  ======== viewInitModule ========
 *  Display the module properties in ROV
 */
function viewInitModule(view, obj)
{
    var Program = xdc.useModule('xdc.rov.Program');
    var Boot = xdc.useModule('ti.catalog.c2800.init.Boot');
    var bootModConfig = Program.getModuleConfig(Boot.$name);

    view.disableWatchdog = bootModConfig.disableWatchdog;
    view.configurePll    = bootModConfig.configurePll;
    view.pllcrDIV = bootModConfig.pllcrDIV;
    view.pllstsDIVSEL = bootModConfig.pllstsDIVSEL;
}

/*
 *  ======== module$validate ========
 */
function module$validate()
{
    if (((Boot.pllType == Boot.Type_280x) || (Boot.pllType == Boot.Type_281x)) 
        && (Boot.configurePll == true)) {
       Boot.$logWarning("\nPLL configuration is not supported for this PLL " +
           "type.  Setting configurePll to true will have no effect.", Boot,
           "configurePll");
    }
}

/*
 *  ======== getFrequency ========
 */
function getFrequency()
{
    if (Boot.configurePll == true) {

        var divider;

        if ( (Boot.pllType == Boot.Type_282xx_283xx) ||
             (Boot.pllType == Boot.Type_2802x_2803x_2806x) ) {

            /* determine divide factor */
            if ((Boot.pllstsDIVSEL == 0) || (Boot.pllstsDIVSEL == 1)) {
                divider = 4;
            }
            else if (Boot.pllstsDIVSEL == 2) {
                divider = 2;
            }
            else if (Boot.pllstsDIVSEL == 3) {
                divider = 1;
            }
            else {
                Boot.$logError("Invalid divide value specified for pllstsDIVSEL.", Boot, "pllstsDIVSEL");
            }

            return((Boot.pllOSCCLK * Boot.pllcrDIV * 1000000) / divider);
        }

        else if (Boot.pllType == Boot.Type_2834x) {

            /* determine divide factor */
            if (Boot.pllstsDIVSEL == 0) {
                divider = 8;
            }
            else if (Boot.pllstsDIVSEL == 1) {
                divider = 4;
            }
            else if (Boot.pllstsDIVSEL == 2) {
                divider = 2;
            }
            else if (Boot.pllstsDIVSEL == 3) {
                divider = 1;
            }
            else {
                Boot.$logError("Invalid divide value specified for pllstsDIVSEL.", Boot, "pllstsDIVSEL");
            }

            return((Boot.pllOSCCLK * (Boot.pllcrDIV + 1) * 1000000) / divider);

        }
    }

    return (0);
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
 *  (assuming configurePll is true).
 */
function updateFrequency(field, val)
{
    /* Don't fire the update if configurePll is false. */
    if (!Boot.configurePll) {
        return;
    }
    
    /* Compute the new frequency. */
    var newFreq = getFrequency();
    
    /* Update the display. */
    Boot.displayFrequency = freqToString(newFreq);
    
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
 *  @(#) ti.catalog.c2800.init; 1, 0, 0,250; 8-17-2012 22:13:24; /db/ztree/library/trees/platform/platform-n27x/src/
 */

