package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Risk-based Quality Management Business Criticality levels.
 * </p>
 */
public enum TDAPI_RBT_BI_LEVELS implements ComEnum
{
    /**
     * <p>
     * Business Criticality level A - the highest criticality.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    RBT_BI_LEVEL_A(1),
    /**
     * <p>
     * Business Criticality level B - medium criticality.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    RBT_BI_LEVEL_B(2),
    /**
     * <p>
     * Business Criticality level C - the lowest criticality.
     * </p>
     * <p>
     * The value of this constant is 3
     * </p>
     */
    RBT_BI_LEVEL_C(3), ;
    
    private final int value;
    
    TDAPI_RBT_BI_LEVELS(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
