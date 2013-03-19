package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Action to take on test run.
 * </p>
 */
public enum TDAPI_EXECUTIONEVENTACTION
{
    /**
     * <p>
     * Do Nothing.
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    EXECEVENTACTION_DEFAULT, // 0
    /**
     * <p>
     * Do Nothing.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    EXECEVENTACTION_DONOTHING, // 1
    /**
     * <p>
     * Stop Test or TestSet.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    EXECEVENTACTION_STOP, // 2
    /**
     * <p>
     * Restart Test or TestSet.
     * </p>
     * <p>
     * The value of this constant is 3
     * </p>
     */
    EXECEVENTACTION_RESTART, // 3
}
