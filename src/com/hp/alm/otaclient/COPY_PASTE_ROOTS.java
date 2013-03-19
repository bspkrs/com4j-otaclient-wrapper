package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Special Copy Paste Roots.
 * </p>
 */
public enum COPY_PASTE_ROOTS implements ComEnum
{
    /**
     * <p>
     * Private root.
     * </p>
     * <p>
     * The value of this constant is -2147483646
     * </p>
     */
    CPR_ANALYSIS_PRIVATE(-2147483646),
    /**
     * <p>
     * Public root.
     * </p>
     * <p>
     * The value of this constant is -2147483645
     * </p>
     */
    CPR_ANALYSIS_PUBLIC(-2147483645), ;
    
    private final int value;
    
    COPY_PASTE_ROOTS(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
