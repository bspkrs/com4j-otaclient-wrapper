package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Run condition statuses.
 * </p>
 */
public enum TDAPI_CONDSTAT implements ComEnum
{
    /**
     * <p>
     * The run finished.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    TDCOND_FINISHED(1),
    /**
     * <p>
     * The run finished successfully.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    TDCOND_PASSED(2),
    /**
     * <p>
     * FAILED condition status.
     * </p>
     * <p>
     * The value of this constant is 3
     * </p>
     */
    TDCOND_FAILED(3), ;
    
    private final int value;
    
    TDAPI_CONDSTAT(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
