package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Library Asynchronous import process statuses.
 * </p>
 */
public enum tagTDAPI_LIBRARY_ASYNCH_STATE implements ComEnum
{
    /**
     * <p>
     * LIB_ASYNCH_STATE_ERROR.
     * </p>
     * <p>
     * The value of this constant is -1
     * </p>
     */
    LIB_ASYNCH_STATE_ERROR(-1),
    /**
     * <p>
     * LIB_ASYNCH_STATE_NOT_IMPORTED_YET.
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    LIB_ASYNCH_STATE_NOT_IMPORTED_YET(0),
    /**
     * <p>
     * LIB_ASYNCH_STATE_STABLE.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    LIB_ASYNCH_STATE_STABLE(1),
    /**
     * <p>
     * LIB_ASYNCH_STATE_IMPORT_IN_PROGRESS.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    LIB_ASYNCH_STATE_IMPORT_IN_PROGRESS(2),
    /**
     * <p>
     * LIB_ASYNCH_STATE_SYNCHING.
     * </p>
     * <p>
     * The value of this constant is 3
     * </p>
     */
    LIB_ASYNCH_STATE_SYNCHING(3), ;
    
    private final int value;
    
    tagTDAPI_LIBRARY_ASYNCH_STATE(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
