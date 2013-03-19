package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Business Process Testing version.
 * </p>
 */
public enum BPT_VERSION implements ComEnum
{
    /**
     * <p>
     * Starting on QC 8.2 SP1.
     * </p>
     * <p>
     * The value of this constant is 3
     * </p>
     */
    BPT_VERSION_3(3),
    /**
     * <p>
     * QC 9.0.
     * </p>
     * <p>
     * The value of this constant is 4
     * </p>
     */
    BPT_VERSION_4(4), ;
    
    private final int value;
    
    BPT_VERSION(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
