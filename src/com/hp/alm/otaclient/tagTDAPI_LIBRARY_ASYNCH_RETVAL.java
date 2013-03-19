package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Library Asynchronous import process return values.
 * </p>
 */
public enum tagTDAPI_LIBRARY_ASYNCH_RETVAL implements ComEnum
{
    /**
     * <p>
     * LIBRARY_ASYNCH_RETVAL_THREAD_NOT_SPAWNED.
     * </p>
     * <p>
     * The value of this constant is -3
     * </p>
     */
    LIBRARY_ASYNCH_RETVAL_THREAD_NOT_SPAWNED(-3),
    /**
     * <p>
     * LIBRARY_ASYNCH_RETVAL_WRONG_LIBTYPE.
     * </p>
     * <p>
     * The value of this constant is -2
     * </p>
     */
    LIBRARY_ASYNCH_RETVAL_WRONG_LIBTYPE(-2),
    /**
     * <p>
     * LIBRARY_ASYNCH_RETVAL_ALREADY_RUNNING.
     * </p>
     * <p>
     * The value of this constant is -1
     * </p>
     */
    LIBRARY_ASYNCH_RETVAL_ALREADY_RUNNING(-1),
    /**
     * <p>
     * LIBRARY_ASYNCH_RETVAL_SUCCESFUL.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    LIBRARY_ASYNCH_RETVAL_SUCCESFUL(1), ;
    
    private final int value;
    
    tagTDAPI_LIBRARY_ASYNCH_RETVAL(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
