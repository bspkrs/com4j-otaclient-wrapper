package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Risk-based Quality Management Risk kinds.
 * </p>
 */
public enum TDAPI_RBT_RISK_KINDS implements ComEnum
{
    /**
     * <p>
     * Business Criticality.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    RBT_RISK_KIND_BI(1),
    /**
     * <p>
     * Failure Probability.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    RBT_RISK_KIND_FP(2),
    /**
     * <p>
     * Functional Complexity.
     * </p>
     * <p>
     * The value of this constant is 3
     * </p>
     */
    RBT_RISK_KIND_FC(3), ;
    
    private final int value;
    
    TDAPI_RBT_RISK_KINDS(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
