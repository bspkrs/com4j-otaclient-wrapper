package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Attachment Flags.
 * </p>
 */
public enum TDAPI_ATTACH implements ComEnum
{
    /**
     * <p>
     * Synchronous upload or download.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    TDATT_COPY(1),
    /**
     * <p>
     * Move attachment.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    TDATT_MOVE(2),
    /**
     * <p>
     * Create URL attachment.
     * </p>
     * <p>
     * The value of this constant is 3
     * </p>
     */
    TDATT_LINK(3),
    /**
     * <p>
     * Asynchronous upload or download.
     * </p>
     * <p>
     * The value of this constant is 4
     * </p>
     */
    TDATT_COPY_ASINCHRONE(4), ;
    
    private final int value;
    
    TDAPI_ATTACH(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
