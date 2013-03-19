package com.hp.alm.otaclient;

import com4j.*;

/**
 */
public enum ESTORAGE_STATISTIC_FILE_STATUS implements ComEnum
{
    /**
     * <p>
     * The value of this constant is 1
     * </p>
     */
    FILE_IN_CLIENT(1),
    /**
     * <p>
     * The value of this constant is 2
     * </p>
     */
    FILE_IN_SERVER(2),
    /**
     * <p>
     * The value of this constant is 4
     * </p>
     */
    FILE_CHANGE(4),
    /**
     * <p>
     * The value of this constant is 8
     * </p>
     */
    FILE_MOVED(8),
    /**
     * <p>
     * The value of this constant is 16
     * </p>
     */
    FILE_MOVING(16), ;
    
    private final int value;
    
    ESTORAGE_STATISTIC_FILE_STATUS(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
