/* 
 *  Copyright (c) 2012 Texas Instruments and others.
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
 *  ======== hostwrite.c ========
 *  Utility function for sending text to the CCS console window.  
 * 
 *  This code is derived from HOSTwrite() in the TI Runtime Support Library. 
 *
 */
#define LOADSHORT(x,y,z)  { x[(z)]   = (unsigned short) (y); \
                            x[(z)+1] = (unsigned short) (y) >> 8;  }

#define UNLOADSHORT(x,z) ((short) ( (short) x[(z)] +             \
                                   ((short) x[(z)+1] << 8)))

#define PACKCHAR(val, base, byte) ( (base)[(byte)] = (val) )

#define UNPACKCHAR(base, byte)    ( (base)[byte] )
 
#define DTWRITE 0xF3

#define BUFSIZ          256
#define CIOBUFSIZ       ((BUFSIZ)+32)

volatile unsigned int _CIOBUF_[CIOBUFSIZ/sizeof(unsigned int)];

/*
 *  ======== HOSTwrite =======
 */
int HOSTwrite(int dev_fd, const char *buf, unsigned count)
{
    volatile unsigned char *p = (volatile unsigned char *)(_CIOBUF_ + 1);
    unsigned char parmbuf[8];
    int result;
    int i;

    if (count > BUFSIZ) {
        count = BUFSIZ;
    }

    LOADSHORT(parmbuf, dev_fd, 0);
    LOADSHORT(parmbuf, count, 2);

    _CIOBUF_[0] = count;
    *p++ = DTWRITE;

    for (i = 0; i < 8; i++) {
        PACKCHAR(parmbuf[i], p, i);
    }

    for (i = 0; i < count; i++) {
        PACKCHAR(*buf++, p, i+8);
    }
    
    asm(" .global C$$IO$$");
    asm("C$$IO$$:");
    asm(" nop");

    p = (volatile unsigned char *)(_CIOBUF_+1);

    for (i = 0; i < 8; i++) {
        parmbuf[i] = UNPACKCHAR(p, i);
    }
    result = UNLOADSHORT(parmbuf, 0);

    return (result);
}

/*
 *  @(#) gnu.targets.arm.rtsv7A; 1, 0, 0, 0,211; 11-4-2012 21:51:29; /db/ztree/library/trees/xdctargets/xdctargets-f40x/src/ xlibrary

 */

