/*
 *  Do not modify this file; it is automatically 
 *  generated and any modifications will be overwritten.
 *
 * @(#) xdc-y44
 */

/*
 * ======== GENERATED SECTIONS ========
 *     
 *     PROLOGUE
 *     INCLUDES
 *     
 *     MODULE-WIDE CONFIGS
 *     VIRTUAL FUNCTIONS
 *     FUNCTION DECLARATIONS
 *     CONVERTORS
 *     SYSTEM FUNCTIONS
 *     
 *     EPILOGUE
 *     PREFIX ALIASES
 */


/*
 * ======== PROLOGUE ========
 */

#ifndef ti_mcu_msp430_runtime_LoggerUart_TimestampProxy__include
#define ti_mcu_msp430_runtime_LoggerUart_TimestampProxy__include

#ifndef __nested__
#define __nested__
#define ti_mcu_msp430_runtime_LoggerUart_TimestampProxy__top__
#endif

#ifdef __cplusplus
#define __extern extern "C"
#else
#define __extern extern
#endif

#define ti_mcu_msp430_runtime_LoggerUart_TimestampProxy___VERS 150


/*
 * ======== INCLUDES ========
 */

#include <xdc/std.h>

#include <xdc/runtime/xdc.h>
#include <xdc/runtime/Types.h>
#include <ti/mcu/msp430/runtime/package/package.defs.h>

#include <xdc/runtime/ITimestampClient.h>


/*
 * ======== AUXILIARY DEFINITIONS ========
 */


/*
 * ======== MODULE-WIDE CONFIGS ========
 */

/* Module__diagsEnabled */
typedef xdc_Bits32 CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__diagsEnabled;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__diagsEnabled ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__diagsEnabled__C;

/* Module__diagsIncluded */
typedef xdc_Bits32 CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__diagsIncluded;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__diagsIncluded ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__diagsIncluded__C;

/* Module__diagsMask */
typedef xdc_Bits16* CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__diagsMask;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__diagsMask ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__diagsMask__C;

/* Module__gateObj */
typedef xdc_Ptr CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__gateObj;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__gateObj ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__gateObj__C;

/* Module__gatePrms */
typedef xdc_Ptr CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__gatePrms;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__gatePrms ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__gatePrms__C;

/* Module__id */
typedef xdc_runtime_Types_ModuleId CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__id;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__id ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__id__C;

/* Module__loggerDefined */
typedef xdc_Bool CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__loggerDefined;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__loggerDefined ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__loggerDefined__C;

/* Module__loggerObj */
typedef xdc_Ptr CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__loggerObj;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__loggerObj ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__loggerObj__C;

/* Module__loggerFxn0 */
typedef xdc_runtime_Types_LoggerFxn0 CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__loggerFxn0;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__loggerFxn0 ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__loggerFxn0__C;

/* Module__loggerFxn1 */
typedef xdc_runtime_Types_LoggerFxn1 CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__loggerFxn1;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__loggerFxn1 ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__loggerFxn1__C;

/* Module__loggerFxn2 */
typedef xdc_runtime_Types_LoggerFxn2 CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__loggerFxn2;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__loggerFxn2 ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__loggerFxn2__C;

/* Module__loggerFxn4 */
typedef xdc_runtime_Types_LoggerFxn4 CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__loggerFxn4;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__loggerFxn4 ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__loggerFxn4__C;

/* Module__loggerFxn8 */
typedef xdc_runtime_Types_LoggerFxn8 CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__loggerFxn8;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__loggerFxn8 ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__loggerFxn8__C;

/* Module__startupDoneFxn */
typedef xdc_Bool (*CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__startupDoneFxn)(void);
__extern __FAR__ const CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__startupDoneFxn ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__startupDoneFxn__C;

/* Object__count */
typedef xdc_Int CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__count;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__count ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__count__C;

/* Object__heap */
typedef xdc_runtime_IHeap_Handle CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__heap;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__heap ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__heap__C;

/* Object__sizeof */
typedef xdc_SizeT CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__sizeof;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__sizeof ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__sizeof__C;

/* Object__table */
typedef xdc_Ptr CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__table;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__table ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__table__C;


/*
 * ======== VIRTUAL FUNCTIONS ========
 */

/* Fxns__ */
struct ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Fxns__ {
    xdc_runtime_Types_Base* __base;
    const xdc_runtime_Types_SysFxns2* __sysp;
    xdc_Bits32 (*get32)(void);
    xdc_Void (*get64)(xdc_runtime_Types_Timestamp64*);
    xdc_Void (*getFreq)(xdc_runtime_Types_FreqHz*);
    xdc_runtime_Types_SysFxns2 __sfxns;
};

/* Module__FXNS__C */
__extern const ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Fxns__ ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__FXNS__C;


/*
 * ======== FUNCTION DECLARATIONS ========
 */

/* Module_startup */
#define ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module_startup( state ) (-1)

/* Handle__label__S */
xdc__CODESECT(ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Handle__label__S, "ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Handle__label")
__extern xdc_runtime_Types_Label* ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Handle__label__S( xdc_Ptr obj, xdc_runtime_Types_Label* lab );

/* Module__startupDone__S */
xdc__CODESECT(ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__startupDone__S, "ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__startupDone")
__extern xdc_Bool ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__startupDone__S( void );

/* Object__create__S */
xdc__CODESECT(ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__create__S, "ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__create")
__extern xdc_Ptr ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__create__S( xdc_Ptr __oa, xdc_SizeT __osz, xdc_Ptr __aa, const xdc_UChar* __pa, xdc_SizeT __psz, xdc_runtime_Error_Block* __eb );

/* Object__delete__S */
xdc__CODESECT(ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__delete__S, "ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__delete")
__extern xdc_Void ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__delete__S( xdc_Ptr instp );

/* Object__destruct__S */
xdc__CODESECT(ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__destruct__S, "ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__destruct")
__extern xdc_Void ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__destruct__S( xdc_Ptr objp );

/* Object__get__S */
xdc__CODESECT(ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__get__S, "ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__get")
__extern xdc_Ptr ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__get__S( xdc_Ptr oarr, xdc_Int i );

/* Object__first__S */
xdc__CODESECT(ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__first__S, "ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__first")
__extern xdc_Ptr ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__first__S( void );

/* Object__next__S */
xdc__CODESECT(ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__next__S, "ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__next")
__extern xdc_Ptr ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__next__S( xdc_Ptr obj );

/* Params__init__S */
xdc__CODESECT(ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Params__init__S, "ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Params__init")
__extern xdc_Void ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Params__init__S( xdc_Ptr dst, xdc_Ptr src, xdc_SizeT psz, xdc_SizeT isz );

/* Proxy__abstract__S */
xdc__CODESECT(ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Proxy__abstract__S, "ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Proxy__abstract")
__extern xdc_Bool ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Proxy__abstract__S( void );

/* Proxy__delegate__S */
xdc__CODESECT(ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Proxy__delegate__S, "ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Proxy__delegate")
__extern xdc_Ptr ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Proxy__delegate__S( void );

/* get32__E */
#define ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_get32 ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_get32__E
xdc__CODESECT(ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_get32__E, "ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_get32")
__extern xdc_Bits32 ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_get32__E( void );
xdc__CODESECT(ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_get32__R, "ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_get32")
__extern xdc_Bits32 ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_get32__R( void );

/* get64__E */
#define ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_get64 ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_get64__E
xdc__CODESECT(ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_get64__E, "ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_get64")
__extern xdc_Void ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_get64__E( xdc_runtime_Types_Timestamp64* result );
xdc__CODESECT(ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_get64__R, "ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_get64")
__extern xdc_Void ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_get64__R( xdc_runtime_Types_Timestamp64* result );

/* getFreq__E */
#define ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_getFreq ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_getFreq__E
xdc__CODESECT(ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_getFreq__E, "ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_getFreq")
__extern xdc_Void ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_getFreq__E( xdc_runtime_Types_FreqHz* freq );
xdc__CODESECT(ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_getFreq__R, "ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_getFreq")
__extern xdc_Void ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_getFreq__R( xdc_runtime_Types_FreqHz* freq );


/*
 * ======== CONVERTORS ========
 */

/* Module_upCast */
static inline xdc_runtime_ITimestampClient_Module ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module_upCast( void )
{
    return (xdc_runtime_ITimestampClient_Module)ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Proxy__delegate__S();
}

/* Module_to_xdc_runtime_ITimestampClient */
#define ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module_to_xdc_runtime_ITimestampClient ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module_upCast


/*
 * ======== SYSTEM FUNCTIONS ========
 */

/* Module_startupDone */
#define ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module_startupDone() ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__startupDone__S()

/* Object_heap */
#define ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object_heap() ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__heap__C

/* Module_heap */
#define ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module_heap() ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object__heap__C

/* Module_id */
static inline CT__ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__id ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module_id( void ) 
{
    return ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module__id__C;
}

/* Proxy_abstract */
#define ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Proxy_abstract() ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Proxy__abstract__S()

/* Proxy_delegate */
#define ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Proxy_delegate() ((xdc_runtime_ITimestampClient_Module)ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Proxy__delegate__S())


/*
 * ======== EPILOGUE ========
 */

#ifdef ti_mcu_msp430_runtime_LoggerUart_TimestampProxy__top__
#undef __nested__
#endif

#endif /* ti_mcu_msp430_runtime_LoggerUart_TimestampProxy__include */


/*
 * ======== PREFIX ALIASES ========
 */

#if !defined(__nested__) && !defined(ti_mcu_msp430_runtime_LoggerUart_TimestampProxy__nolocalnames)

#ifndef ti_mcu_msp430_runtime_LoggerUart_TimestampProxy__localnames__done
#define ti_mcu_msp430_runtime_LoggerUart_TimestampProxy__localnames__done

/* module prefix */
#define LoggerUart_TimestampProxy_get32 ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_get32
#define LoggerUart_TimestampProxy_get64 ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_get64
#define LoggerUart_TimestampProxy_getFreq ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_getFreq
#define LoggerUart_TimestampProxy_Module_name ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module_name
#define LoggerUart_TimestampProxy_Module_id ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module_id
#define LoggerUart_TimestampProxy_Module_startup ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module_startup
#define LoggerUart_TimestampProxy_Module_startupDone ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module_startupDone
#define LoggerUart_TimestampProxy_Module_hasMask ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module_hasMask
#define LoggerUart_TimestampProxy_Module_getMask ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module_getMask
#define LoggerUart_TimestampProxy_Module_setMask ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module_setMask
#define LoggerUart_TimestampProxy_Object_heap ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Object_heap
#define LoggerUart_TimestampProxy_Module_heap ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module_heap
#define LoggerUart_TimestampProxy_Proxy_abstract ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Proxy_abstract
#define LoggerUart_TimestampProxy_Proxy_delegate ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Proxy_delegate
#define LoggerUart_TimestampProxy_Module_upCast ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module_upCast
#define LoggerUart_TimestampProxy_Module_to_xdc_runtime_ITimestampClient ti_mcu_msp430_runtime_LoggerUart_TimestampProxy_Module_to_xdc_runtime_ITimestampClient

#endif /* ti_mcu_msp430_runtime_LoggerUart_TimestampProxy__localnames__done */
#endif
