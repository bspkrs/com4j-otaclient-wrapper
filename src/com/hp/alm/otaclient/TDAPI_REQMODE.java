package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Flags for requirement factory Find method. Can be combined with binary OR.
 * </p>
 */
public enum TDAPI_REQMODE implements ComEnum
{
    /**
     * <p>
     * Not in use.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    TDREQMODE_REC(1),
    /**
     * <p>
     * Case sensitive search.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    TDREQMODE_SMART(2),
    /**
     * <p>
     * Not in use.
     * </p>
     * <p>
     * The value of this constant is 4
     * </p>
     */
    TDREQMODE_REM_REM_ALL(4),
    /**
     * <p>
     * Requirement name starts with pattern.
     * </p>
     * <p>
     * The value of this constant is 8
     * </p>
     */
    TDREQMODE_FIND_START_WITH(8),
    /**
     * <p>
     * Requirement name exactly matches pattern.
     * </p>
     * <p>
     * The value of this constant is 16
     * </p>
     */
    TDREQMODE_FIND_EXACT(16),
    /**
     * <p>
     * Search for pattern anywhere in requirement name.
     * </p>
     * <p>
     * The value of this constant is 32
     * </p>
     */
    TDREQMODE_FIND_ANYWHERE(32), ;
    
    private final int value;
    
    TDAPI_REQMODE(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
