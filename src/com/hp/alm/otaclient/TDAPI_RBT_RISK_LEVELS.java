package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Risk-based Quality Management Risk levels.
 * </p>
 */
public enum TDAPI_RBT_RISK_LEVELS implements ComEnum
{
    /**
     * <p>
     * High Risk.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    RBT_RISK_LEVEL_HIGH(1),
    /**
     * <p>
     * Medium Risk.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    RBT_RISK_LEVEL_MEDIUM(2),
    /**
     * <p>
     * Low Risk.
     * </p>
     * <p>
     * The value of this constant is 3
     * </p>
     */
    RBT_RISK_LEVEL_LOW(3), ;
    
    private final int value;
    
    TDAPI_RBT_RISK_LEVELS(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
