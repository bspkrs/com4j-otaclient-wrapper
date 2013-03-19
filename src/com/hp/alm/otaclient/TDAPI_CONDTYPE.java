package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Execution flow condition type.
 * </p>
 */
public enum TDAPI_CONDTYPE implements ComEnum
{
    /**
     * <p>
     * The condition is a run status.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    TDCOND_RUN(1), ;
    
    private final int value;
    
    TDAPI_CONDTYPE(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
