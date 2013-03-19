package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Risk-based Quality Management Testing levels.
 * </p>
 */
public enum TDAPI_RBT_TESTING_LEVELS implements ComEnum
{
    /**
     * <p>
     * Full Testing level - perform all possible tests.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    RBT_TESTING_LEVEL_FULL(1),
    /**
     * <p>
     * Partial Testing level - perform sub-set of tests.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    RBT_TESTING_LEVEL_PARTIAL(2),
    /**
     * <p>
     * Sanity Testing level - perform only sanity tests.
     * </p>
     * <p>
     * The value of this constant is 3
     * </p>
     */
    RBT_TESTING_LEVEL_SANITY(3),
    /**
     * <p>
     * None Testing level - do not perform any tests.
     * </p>
     * <p>
     * The value of this constant is 4
     * </p>
     */
    RBT_TESTING_LEVEL_NONE(4), ;
    
    private final int value;
    
    TDAPI_RBT_TESTING_LEVELS(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
