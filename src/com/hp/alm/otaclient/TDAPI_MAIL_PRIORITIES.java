package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Mail Priority.
 * </p>
 */
public enum TDAPI_MAIL_PRIORITIES implements ComEnum
{
    /**
     * <p>
     * Low mail importance.
     * </p>
     * <p>
     * The value of this constant is 5
     * </p>
     */
    MAIL_PRIORITY_LOW(5),
    /**
     * <p>
     * Normal mail importance.
     * </p>
     * <p>
     * The value of this constant is 3
     * </p>
     */
    MAIL_PRIORITY_NORMAL(3),
    /**
     * <p>
     * High mail importance.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    MAIL_PRIORITY_HIGH(1), ;
    
    private final int value;
    
    TDAPI_MAIL_PRIORITIES(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
