package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Test run item on which to perform stop or restart.
 * </p>
 */
public enum TDAPI_EXECUTIONEVENTACTIONTARGET implements ComEnum
{
    /**
     * <p>
     * Perform action (Stop or Restart) on Test.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    EXECEVENTACTIONTARGET_TEST(1),
    /**
     * <p>
     * Perform action (Stop or Restart) on TestSet.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    EXECEVENTACTIONTARGET_TESTSET(2), ;
    
    private final int value;
    
    TDAPI_EXECUTIONEVENTACTIONTARGET(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
