package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Last position in list.
 * </p>
 */
public enum TDAPI_EUM_ORDER implements ComEnum
{
    /**
     * <p>
     * Set object order to be last in its list.
     * </p>
     * <p>
     * The value of this constant is -4
     * </p>
     */
    TDOLE_LAST_ORDER(-4), ;
    
    private final int value;
    
    TDAPI_EUM_ORDER(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
