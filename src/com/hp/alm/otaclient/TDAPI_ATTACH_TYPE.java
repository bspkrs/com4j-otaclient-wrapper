package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Attachment Type.
 * </p>
 */
public enum TDAPI_ATTACH_TYPE implements ComEnum
{
    /**
     * <p>
     * File attachment.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    TDATT_FILE(1),
    /**
     * <p>
     * URL attachment.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    TDATT_INTERNET(2), ;
    
    private final int value;
    
    TDAPI_ATTACH_TYPE(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
