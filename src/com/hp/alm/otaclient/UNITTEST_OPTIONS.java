package com.hp.alm.otaclient;

import com4j.*;

/**
 */
public enum UNITTEST_OPTIONS implements ComEnum
{
    /**
     * <p>
     * The value of this constant is -1
     * </p>
     */
    UNIT_TEST_DISABLE(-1),
    /**
     * <p>
     * The value of this constant is 0
     * </p>
     */
    UNIT_TEST_EXECUTE(0),
    /**
     * <p>
     * The value of this constant is 1
     * </p>
     */
    UNIT_TEST_RECORD(1), ;
    
    private final int value;
    
    UNITTEST_OPTIONS(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
