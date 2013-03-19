package com.hp.alm.otaclient;

import com4j.*;

/**
 */
public enum EXTENDED_STORAGE_PUT_STATISTICS_MODE implements ComEnum
{
    /**
     * <p>
     * The value of this constant is 0
     * </p>
     */
    NO_STATISTICS(0),
    /**
     * <p>
     * The value of this constant is 1
     * </p>
     */
    CIENT_FILES_ONLY(1),
    /**
     * <p>
     * The value of this constant is 2
     * </p>
     */
    SERVER_FILES_ONLY(2),
    /**
     * <p>
     * The value of this constant is 4
     * </p>
     */
    FILES_FOR_MOVE(4), ;
    
    private final int value;
    
    EXTENDED_STORAGE_PUT_STATISTICS_MODE(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
