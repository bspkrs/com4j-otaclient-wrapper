package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Risk-based Quality Management Functional Complexity levels.
 * </p>
 */
public enum TDAPI_RBT_FC_LEVELS implements ComEnum
{
    /**
     * <p>
     * Functional Complexity 1 - most complex.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    RBT_FC_LEVEL_1(1),
    /**
     * <p>
     * Functional Complexity 2 - medium complexity.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    RBT_FC_LEVEL_2(2),
    /**
     * <p>
     * Functional Complexity 3 - least complex.
     * </p>
     * <p>
     * The value of this constant is 3
     * </p>
     */
    RBT_FC_LEVEL_3(3), ;
    
    private final int value;
    
    TDAPI_RBT_FC_LEVELS(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
