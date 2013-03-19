package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Position markers for a list or collection.
 * </p>
 */
public enum TDAPI_POS_ORDER implements ComEnum
{
    /**
     * <p>
     * Marker for the last position in a list or collection.
     * </p>
     * <p>
     * The value of this constant is -4
     * </p>
     */
    TDPOSITION_LAST(-4), ;
    
    private final int value;
    
    TDAPI_POS_ORDER(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
