package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Components Automation Type Values.
 * </p>
 */
public enum TDAPI_COMPONENT_AUTO_TYPE implements ComEnum
{
    /**
     * <p>
     * Manual AutoType.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    MANUAL(1),
    /**
     * <p>
     * QTP's KeyWord AutoType.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    KW(2),
    /**
     * <p>
     * Scripted AutoType.
     * </p>
     * <p>
     * The value of this constant is 3
     * </p>
     */
    SCRIPTED(3), ;
    
    private final int value;
    
    TDAPI_COMPONENT_AUTO_TYPE(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
