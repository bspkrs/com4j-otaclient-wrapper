package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Parameter handling at run time.
 * </p>
 */
public enum TDAPI_RUN_PARAM_MODE implements ComEnum
{
    /**
     * <p>
     * Insert parameters before run.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    PARAM_SOURCE_PRE_RUN(1),
    /**
     * <p>
     * Insert parameters during the run (when steps are being created).
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    PARAM_SOURCE_STEPS(2), ;
    
    private final int value;
    
    TDAPI_RUN_PARAM_MODE(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
