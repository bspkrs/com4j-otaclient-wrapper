package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Risk-based Quality Management Failure Probability levels.
 * </p>
 */
public enum TDAPI_RBT_FP_LEVELS implements ComEnum
{
    /**
     * <p>
     * Failure Probability 1 - most likely to fail.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    RBT_FP_LEVEL_1(1),
    /**
     * <p>
     * Failure Probability 2 - medium failure probability.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    RBT_FP_LEVEL_2(2),
    /**
     * <p>
     * Failure Probability 3 - least likely to fail.
     * </p>
     * <p>
     * The value of this constant is 3
     * </p>
     */
    RBT_FP_LEVEL_3(3), ;
    
    private final int value;
    
    TDAPI_RBT_FP_LEVELS(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
