package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Options for pasting test class objects. Whether test class should be copied including all it's data cases.
 * </p>
 */
public enum TEST_CASE_COPY_PASTE_MODE implements ComEnum
{
    /**
     * <p>
     * Do not copy data cases.
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    COPY_PASTE_NO_DATA_CASE(0),
    /**
     * <p>
     * Copy test class including all it's data cases.
     * </p>
     * <p>
     * The value of this constant is 32
     * </p>
     */
    COPY_PASTE_INCLUDE_DATA_CASE(32), ;
    
    private final int value;
    
    TEST_CASE_COPY_PASTE_MODE(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
