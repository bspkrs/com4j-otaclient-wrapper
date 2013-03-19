package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Extended Storage file deletion flags. These can be used individually or combined with bitwise OR.
 * </p>
 */
public enum TDAPI_EXSTOR_DELMODE implements ComEnum
{
    /**
     * <p>
     * Delete local file(s).
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    TDOLE_DELETE_LOCAL(1),
    /**
     * <p>
     * Delete remote file(s).
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    TDOLE_DELETE_REMOTE(2), ;
    
    private final int value;
    
    TDAPI_EXSTOR_DELMODE(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
