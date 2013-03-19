package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Step parameter attributes.
 * </p>
 */
public enum TDAPI_STEP_PARAM_TYPE implements ComEnum
{
    /**
     * <p>
     * Pre-defined parameter.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    STEP_PARAM_PREDEF(1),
    /**
     * <p>
     * Parameter currently has null value.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    STEP_PARAM_NULL(2),
    /**
     * <p>
     * Parameter has an attached value.
     * </p>
     * <p>
     * The value of this constant is 3
     * </p>
     */
    STEP_PARAM_VALUE(3),
    /**
     * <p>
     * Parameter has a value attached to the base object.
     * </p>
     * <p>
     * The value of this constant is 4
     * </p>
     */
    STEP_PARAM_BASE(4), ;
    
    private final int value;
    
    TDAPI_STEP_PARAM_TYPE(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
