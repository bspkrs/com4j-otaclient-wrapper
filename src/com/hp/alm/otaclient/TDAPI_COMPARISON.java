package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Comparison related constants.
 * </p>
 */
public enum TDAPI_COMPARISON implements ComEnum
{
    /**
     * <p>
     * ID that should be passed to compare baselines when comparing to current status (and not to another baseline).
     * </p>
     * <p>
     * The value of this constant is -1
     * </p>
     */
    COMPARE_TO_CURRENT_ID(-1), ;
    
    private final int value;
    
    TDAPI_COMPARISON(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
