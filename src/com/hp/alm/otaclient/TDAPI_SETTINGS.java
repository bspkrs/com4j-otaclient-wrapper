package com.hp.alm.otaclient;

import com4j.*;

/**
 */
public enum TDAPI_SETTINGS implements ComEnum
{
    /**
     * <p>
     * The value of this constant is -10
     * </p>
     */
    TDAPI_STARTVIRTUAL_VALUE(-10), ;
    
    private final int value;
    
    TDAPI_SETTINGS(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
