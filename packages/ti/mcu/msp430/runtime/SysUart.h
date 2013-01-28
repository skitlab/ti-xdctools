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
 *     INTERNAL DEFINITIONS
 *     MODULE-WIDE CONFIGS
 *     VIRTUAL FUNCTIONS
 *     FUNCTION DECLARATIONS
 *     CONVERTORS
 *     SYSTEM FUNCTIONS
 *     
 *     EPILOGUE
 *     STATE STRUCTURES
 *     PREFIX ALIASES
 */


/*
 * ======== PROLOGUE ========
 */

#ifndef ti_mcu_msp430_runtime_SysUart__include
#define ti_mcu_msp430_runtime_SysUart__include

#ifndef __nested__
#define __nested__
#define ti_mcu_msp430_runtime_SysUart__top__
#endif

#ifdef __cplusplus
#define __extern extern "C"
#else
#define __extern extern
#endif

#define ti_mcu_msp430_runtime_SysUart___VERS 150


/*
 * ======== INCLUDES ========
 */

#include <xdc/std.h>

#include <xdc/runtime/xdc.h>
#include <xdc/runtime/Types.h>
#include <ti/mcu/msp430/runtime/package/package.defs.h>

#include <xdc/runtime/ISystemSupport.h>
#include <xdc/runtime/Types.h>


/*
 * ======== AUXILIARY DEFINITIONS ========
 */

/* GetLineFxn */
typedef xdc_Void (*ti_mcu_msp430_runtime_SysUart_GetLineFxn)(xdc_Char[], xdc_Int);


/*
 * ======== INTERNAL DEFINITIONS ========
 */


/*
 * ======== MODULE-WIDE CONFIGS ========
 */

/* Module__diagsEnabled */
typedef xdc_Bits32 CT__ti_mcu_msp430_runtime_SysUart_Module__diagsEnabled;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_SysUart_Module__diagsEnabled ti_mcu_msp430_runtime_SysUart_Module__diagsEnabled__C;

/* Module__diagsIncluded */
typedef xdc_Bits32 CT__ti_mcu_msp430_runtime_SysUart_Module__diagsIncluded;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_SysUart_Module__diagsIncluded ti_mcu_msp430_runtime_SysUart_Module__diagsIncluded__C;

/* Module__diagsMask */
typedef xdc_Bits16* CT__ti_mcu_msp430_runtime_SysUart_Module__diagsMask;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_SysUart_Module__diagsMask ti_mcu_msp430_runtime_SysUart_Module__diagsMask__C;

/* Module__gateObj */
typedef xdc_Ptr CT__ti_mcu_msp430_runtime_SysUart_Module__gateObj;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_SysUart_Module__gateObj ti_mcu_msp430_runtime_SysUart_Module__gateObj__C;

/* Module__gatePrms */
typedef xdc_Ptr CT__ti_mcu_msp430_runtime_SysUart_Module__gatePrms;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_SysUart_Module__gatePrms ti_mcu_msp430_runtime_SysUart_Module__gatePrms__C;

/* Module__id */
typedef xdc_runtime_Types_ModuleId CT__ti_mcu_msp430_runtime_SysUart_Module__id;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_SysUart_Module__id ti_mcu_msp430_runtime_SysUart_Module__id__C;

/* Module__loggerDefined */
typedef xdc_Bool CT__ti_mcu_msp430_runtime_SysUart_Module__loggerDefined;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_SysUart_Module__loggerDefined ti_mcu_msp430_runtime_SysUart_Module__loggerDefined__C;

/* Module__loggerObj */
typedef xdc_Ptr CT__ti_mcu_msp430_runtime_SysUart_Module__loggerObj;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_SysUart_Module__loggerObj ti_mcu_msp430_runtime_SysUart_Module__loggerObj__C;

/* Module__loggerFxn0 */
typedef xdc_runtime_Types_LoggerFxn0 CT__ti_mcu_msp430_runtime_SysUart_Module__loggerFxn0;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_SysUart_Module__loggerFxn0 ti_mcu_msp430_runtime_SysUart_Module__loggerFxn0__C;

/* Module__loggerFxn1 */
typedef xdc_runtime_Types_LoggerFxn1 CT__ti_mcu_msp430_runtime_SysUart_Module__loggerFxn1;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_SysUart_Module__loggerFxn1 ti_mcu_msp430_runtime_SysUart_Module__loggerFxn1__C;

/* Module__loggerFxn2 */
typedef xdc_runtime_Types_LoggerFxn2 CT__ti_mcu_msp430_runtime_SysUart_Module__loggerFxn2;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_SysUart_Module__loggerFxn2 ti_mcu_msp430_runtime_SysUart_Module__loggerFxn2__C;

/* Module__loggerFxn4 */
typedef xdc_runtime_Types_LoggerFxn4 CT__ti_mcu_msp430_runtime_SysUart_Module__loggerFxn4;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_SysUart_Module__loggerFxn4 ti_mcu_msp430_runtime_SysUart_Module__loggerFxn4__C;

/* Module__loggerFxn8 */
typedef xdc_runtime_Types_LoggerFxn8 CT__ti_mcu_msp430_runtime_SysUart_Module__loggerFxn8;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_SysUart_Module__loggerFxn8 ti_mcu_msp430_runtime_SysUart_Module__loggerFxn8__C;

/* Module__startupDoneFxn */
typedef xdc_Bool (*CT__ti_mcu_msp430_runtime_SysUart_Module__startupDoneFxn)(void);
__extern __FAR__ const CT__ti_mcu_msp430_runtime_SysUart_Module__startupDoneFxn ti_mcu_msp430_runtime_SysUart_Module__startupDoneFxn__C;

/* Object__count */
typedef xdc_Int CT__ti_mcu_msp430_runtime_SysUart_Object__count;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_SysUart_Object__count ti_mcu_msp430_runtime_SysUart_Object__count__C;

/* Object__heap */
typedef xdc_runtime_IHeap_Handle CT__ti_mcu_msp430_runtime_SysUart_Object__heap;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_SysUart_Object__heap ti_mcu_msp430_runtime_SysUart_Object__heap__C;

/* Object__sizeof */
typedef xdc_SizeT CT__ti_mcu_msp430_runtime_SysUart_Object__sizeof;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_SysUart_Object__sizeof ti_mcu_msp430_runtime_SysUart_Object__sizeof__C;

/* Object__table */
typedef xdc_Ptr CT__ti_mcu_msp430_runtime_SysUart_Object__table;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_SysUart_Object__table ti_mcu_msp430_runtime_SysUart_Object__table__C;

/* getLineFxn */
#define ti_mcu_msp430_runtime_SysUart_getLineFxn (ti_mcu_msp430_runtime_SysUart_getLineFxn__C)
typedef ti_mcu_msp430_runtime_SysUart_GetLineFxn CT__ti_mcu_msp430_runtime_SysUart_getLineFxn;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_SysUart_getLineFxn ti_mcu_msp430_runtime_SysUart_getLineFxn__C;

/* lineSize */
#ifdef ti_mcu_msp430_runtime_SysUart_lineSize__D
#define ti_mcu_msp430_runtime_SysUart_lineSize (ti_mcu_msp430_runtime_SysUart_lineSize__D)
#else
#define ti_mcu_msp430_runtime_SysUart_lineSize (ti_mcu_msp430_runtime_SysUart_lineSize__C)
typedef xdc_Int CT__ti_mcu_msp430_runtime_SysUart_lineSize;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_SysUart_lineSize ti_mcu_msp430_runtime_SysUart_lineSize__C;
#endif

/* lineBuf */
#define ti_mcu_msp430_runtime_SysUart_lineBuf (ti_mcu_msp430_runtime_SysUart_lineBuf__C)
typedef xdc_Char __T1_ti_mcu_msp430_runtime_SysUart_lineBuf;
typedef xdc_Char *__ARRAY1_ti_mcu_msp430_runtime_SysUart_lineBuf;
typedef __ARRAY1_ti_mcu_msp430_runtime_SysUart_lineBuf __TA_ti_mcu_msp430_runtime_SysUart_lineBuf;
typedef __TA_ti_mcu_msp430_runtime_SysUart_lineBuf CT__ti_mcu_msp430_runtime_SysUart_lineBuf;
__extern __FAR__ const CT__ti_mcu_msp430_runtime_SysUart_lineBuf ti_mcu_msp430_runtime_SysUart_lineBuf__C;


/*
 * ======== VIRTUAL FUNCTIONS ========
 */

/* Fxns__ */
struct ti_mcu_msp430_runtime_SysUart_Fxns__ {
    xdc_runtime_Types_Base* __base;
    const xdc_runtime_Types_SysFxns2* __sysp;
    xdc_Void (*abort)(xdc_String);
    xdc_Void (*exit)(xdc_Int);
    xdc_Void (*flush)(void);
    xdc_Void (*putch)(xdc_Char);
    xdc_Bool (*ready)(void);
    xdc_runtime_Types_SysFxns2 __sfxns;
};

/* Module__FXNS__C */
__extern const ti_mcu_msp430_runtime_SysUart_Fxns__ ti_mcu_msp430_runtime_SysUart_Module__FXNS__C;


/*
 * ======== FUNCTION DECLARATIONS ========
 */

/* Module_startup */
#define ti_mcu_msp430_runtime_SysUart_Module_startup ti_mcu_msp430_runtime_SysUart_Module_startup__E
xdc__CODESECT(ti_mcu_msp430_runtime_SysUart_Module_startup__E, "ti_mcu_msp430_runtime_SysUart_Module_startup")
__extern xdc_Int ti_mcu_msp430_runtime_SysUart_Module_startup__E( xdc_Int state );
xdc__CODESECT(ti_mcu_msp430_runtime_SysUart_Module_startup__F, "ti_mcu_msp430_runtime_SysUart_Module_startup")
__extern xdc_Int ti_mcu_msp430_runtime_SysUart_Module_startup__F( xdc_Int state );
xdc__CODESECT(ti_mcu_msp430_runtime_SysUart_Module_startup__R, "ti_mcu_msp430_runtime_SysUart_Module_startup")
__extern xdc_Int ti_mcu_msp430_runtime_SysUart_Module_startup__R( xdc_Int state );

/* Module__startupDone__S */
xdc__CODESECT(ti_mcu_msp430_runtime_SysUart_Module__startupDone__S, "ti_mcu_msp430_runtime_SysUart_Module__startupDone")
__extern xdc_Bool ti_mcu_msp430_runtime_SysUart_Module__startupDone__S( void );

/* abort__E */
#define ti_mcu_msp430_runtime_SysUart_abort ti_mcu_msp430_runtime_SysUart_abort__E
xdc__CODESECT(ti_mcu_msp430_runtime_SysUart_abort__E, "ti_mcu_msp430_runtime_SysUart_abort")
__extern xdc_Void ti_mcu_msp430_runtime_SysUart_abort__E( xdc_String str );
xdc__CODESECT(ti_mcu_msp430_runtime_SysUart_abort__F, "ti_mcu_msp430_runtime_SysUart_abort")
__extern xdc_Void ti_mcu_msp430_runtime_SysUart_abort__F( xdc_String str );
__extern xdc_Void ti_mcu_msp430_runtime_SysUart_abort__R( xdc_String str );

/* exit__E */
#define ti_mcu_msp430_runtime_SysUart_exit ti_mcu_msp430_runtime_SysUart_exit__E
xdc__CODESECT(ti_mcu_msp430_runtime_SysUart_exit__E, "ti_mcu_msp430_runtime_SysUart_exit")
__extern xdc_Void ti_mcu_msp430_runtime_SysUart_exit__E( xdc_Int stat );
xdc__CODESECT(ti_mcu_msp430_runtime_SysUart_exit__F, "ti_mcu_msp430_runtime_SysUart_exit")
__extern xdc_Void ti_mcu_msp430_runtime_SysUart_exit__F( xdc_Int stat );
__extern xdc_Void ti_mcu_msp430_runtime_SysUart_exit__R( xdc_Int stat );

/* flush__E */
#define ti_mcu_msp430_runtime_SysUart_flush ti_mcu_msp430_runtime_SysUart_flush__E
xdc__CODESECT(ti_mcu_msp430_runtime_SysUart_flush__E, "ti_mcu_msp430_runtime_SysUart_flush")
__extern xdc_Void ti_mcu_msp430_runtime_SysUart_flush__E( void );
xdc__CODESECT(ti_mcu_msp430_runtime_SysUart_flush__F, "ti_mcu_msp430_runtime_SysUart_flush")
__extern xdc_Void ti_mcu_msp430_runtime_SysUart_flush__F( void );
__extern xdc_Void ti_mcu_msp430_runtime_SysUart_flush__R( void );

/* putch__E */
#define ti_mcu_msp430_runtime_SysUart_putch ti_mcu_msp430_runtime_SysUart_putch__E
xdc__CODESECT(ti_mcu_msp430_runtime_SysUart_putch__E, "ti_mcu_msp430_runtime_SysUart_putch")
__extern xdc_Void ti_mcu_msp430_runtime_SysUart_putch__E( xdc_Char ch );
xdc__CODESECT(ti_mcu_msp430_runtime_SysUart_putch__F, "ti_mcu_msp430_runtime_SysUart_putch")
__extern xdc_Void ti_mcu_msp430_runtime_SysUart_putch__F( xdc_Char ch );
__extern xdc_Void ti_mcu_msp430_runtime_SysUart_putch__R( xdc_Char ch );

/* ready__E */
#define ti_mcu_msp430_runtime_SysUart_ready ti_mcu_msp430_runtime_SysUart_ready__E
xdc__CODESECT(ti_mcu_msp430_runtime_SysUart_ready__E, "ti_mcu_msp430_runtime_SysUart_ready")
__extern xdc_Bool ti_mcu_msp430_runtime_SysUart_ready__E( void );
xdc__CODESECT(ti_mcu_msp430_runtime_SysUart_ready__F, "ti_mcu_msp430_runtime_SysUart_ready")
__extern xdc_Bool ti_mcu_msp430_runtime_SysUart_ready__F( void );
__extern xdc_Bool ti_mcu_msp430_runtime_SysUart_ready__R( void );

/* rxtxInit__I */
#define ti_mcu_msp430_runtime_SysUart_rxtxInit ti_mcu_msp430_runtime_SysUart_rxtxInit__I
xdc__CODESECT(ti_mcu_msp430_runtime_SysUart_rxtxInit__I, "ti_mcu_msp430_runtime_SysUart_rxtxInit")
__extern xdc_Void ti_mcu_msp430_runtime_SysUart_rxtxInit__I( void );

/* tx__I */
#define ti_mcu_msp430_runtime_SysUart_tx ti_mcu_msp430_runtime_SysUart_tx__I
xdc__CODESECT(ti_mcu_msp430_runtime_SysUart_tx__I, "ti_mcu_msp430_runtime_SysUart_tx")
__extern xdc_Void ti_mcu_msp430_runtime_SysUart_tx__I( xdc_Char c );

/* rx__I */
#define ti_mcu_msp430_runtime_SysUart_rx ti_mcu_msp430_runtime_SysUart_rx__I
xdc__CODESECT(ti_mcu_msp430_runtime_SysUart_rx__I, "ti_mcu_msp430_runtime_SysUart_rx")
__extern xdc_Void ti_mcu_msp430_runtime_SysUart_rx__I( xdc_Char c );


/*
 * ======== CONVERTORS ========
 */

/* Module_upCast */
static inline xdc_runtime_ISystemSupport_Module ti_mcu_msp430_runtime_SysUart_Module_upCast( void )
{
    return (xdc_runtime_ISystemSupport_Module)&ti_mcu_msp430_runtime_SysUart_Module__FXNS__C;
}

/* Module_to_xdc_runtime_ISystemSupport */
#define ti_mcu_msp430_runtime_SysUart_Module_to_xdc_runtime_ISystemSupport ti_mcu_msp430_runtime_SysUart_Module_upCast


/*
 * ======== SYSTEM FUNCTIONS ========
 */

/* Module_startupDone */
#define ti_mcu_msp430_runtime_SysUart_Module_startupDone() ti_mcu_msp430_runtime_SysUart_Module__startupDone__S()

/* Object_heap */
#define ti_mcu_msp430_runtime_SysUart_Object_heap() ti_mcu_msp430_runtime_SysUart_Object__heap__C

/* Module_heap */
#define ti_mcu_msp430_runtime_SysUart_Module_heap() ti_mcu_msp430_runtime_SysUart_Object__heap__C

/* Module_id */
static inline CT__ti_mcu_msp430_runtime_SysUart_Module__id ti_mcu_msp430_runtime_SysUart_Module_id( void ) 
{
    return ti_mcu_msp430_runtime_SysUart_Module__id__C;
}

/* Module_hasMask */
static inline xdc_Bool ti_mcu_msp430_runtime_SysUart_Module_hasMask( void ) 
{
    return ti_mcu_msp430_runtime_SysUart_Module__diagsMask__C != NULL;
}

/* Module_getMask */
static inline xdc_Bits16 ti_mcu_msp430_runtime_SysUart_Module_getMask( void ) 
{
    return ti_mcu_msp430_runtime_SysUart_Module__diagsMask__C != NULL ? *ti_mcu_msp430_runtime_SysUart_Module__diagsMask__C : 0;
}

/* Module_setMask */
static inline xdc_Void ti_mcu_msp430_runtime_SysUart_Module_setMask( xdc_Bits16 mask ) 
{
    if (ti_mcu_msp430_runtime_SysUart_Module__diagsMask__C != NULL) *ti_mcu_msp430_runtime_SysUart_Module__diagsMask__C = mask;
}


/*
 * ======== EPILOGUE ========
 */

#ifdef ti_mcu_msp430_runtime_SysUart__top__
#undef __nested__
#endif

#endif /* ti_mcu_msp430_runtime_SysUart__include */


/*
 * ======== STATE STRUCTURES ========
 */

#if defined(__config__) || (!defined(__nested__) && defined(ti_mcu_msp430_runtime_SysUart__internalaccess))

#ifndef ti_mcu_msp430_runtime_SysUart__include_state
#define ti_mcu_msp430_runtime_SysUart__include_state

/* Module_State */
struct ti_mcu_msp430_runtime_SysUart_Module_State {
    xdc_UInt lineIdx;
};

/* Module__state__V */
extern struct ti_mcu_msp430_runtime_SysUart_Module_State__ ti_mcu_msp430_runtime_SysUart_Module__state__V;

#endif /* ti_mcu_msp430_runtime_SysUart__include_state */

#endif


/*
 * ======== PREFIX ALIASES ========
 */

#if !defined(__nested__) && !defined(ti_mcu_msp430_runtime_SysUart__nolocalnames)

#ifndef ti_mcu_msp430_runtime_SysUart__localnames__done
#define ti_mcu_msp430_runtime_SysUart__localnames__done

/* module prefix */
#define SysUart_GetLineFxn ti_mcu_msp430_runtime_SysUart_GetLineFxn
#define SysUart_Module_State ti_mcu_msp430_runtime_SysUart_Module_State
#define SysUart_getLineFxn ti_mcu_msp430_runtime_SysUart_getLineFxn
#define SysUart_lineSize ti_mcu_msp430_runtime_SysUart_lineSize
#define SysUart_lineBuf ti_mcu_msp430_runtime_SysUart_lineBuf
#define SysUart_abort ti_mcu_msp430_runtime_SysUart_abort
#define SysUart_exit ti_mcu_msp430_runtime_SysUart_exit
#define SysUart_flush ti_mcu_msp430_runtime_SysUart_flush
#define SysUart_putch ti_mcu_msp430_runtime_SysUart_putch
#define SysUart_ready ti_mcu_msp430_runtime_SysUart_ready
#define SysUart_Module_name ti_mcu_msp430_runtime_SysUart_Module_name
#define SysUart_Module_id ti_mcu_msp430_runtime_SysUart_Module_id
#define SysUart_Module_startup ti_mcu_msp430_runtime_SysUart_Module_startup
#define SysUart_Module_startupDone ti_mcu_msp430_runtime_SysUart_Module_startupDone
#define SysUart_Module_hasMask ti_mcu_msp430_runtime_SysUart_Module_hasMask
#define SysUart_Module_getMask ti_mcu_msp430_runtime_SysUart_Module_getMask
#define SysUart_Module_setMask ti_mcu_msp430_runtime_SysUart_Module_setMask
#define SysUart_Object_heap ti_mcu_msp430_runtime_SysUart_Object_heap
#define SysUart_Module_heap ti_mcu_msp430_runtime_SysUart_Module_heap
#define SysUart_Module_upCast ti_mcu_msp430_runtime_SysUart_Module_upCast
#define SysUart_Module_to_xdc_runtime_ISystemSupport ti_mcu_msp430_runtime_SysUart_Module_to_xdc_runtime_ISystemSupport

#endif /* ti_mcu_msp430_runtime_SysUart__localnames__done */
#endif
