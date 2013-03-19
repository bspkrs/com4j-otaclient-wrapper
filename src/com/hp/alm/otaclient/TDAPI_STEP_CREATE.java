package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Step modification mode.
 * </p>
 */
public enum TDAPI_STEP_CREATE implements ComEnum
{
    /**
     * <p>
     * Create mode.
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    TDOLE_STEP_CREATE(0),
    /**
     * <p>
     * Update mode.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    TDOLE_STEP_UPDATE(2), ;
    
    private final int value;
    
    TDAPI_STEP_CREATE(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
