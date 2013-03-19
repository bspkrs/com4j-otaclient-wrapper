package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Types of fields to fetch.
 * </p>
 */
public enum TDAPI_FETCH_LEVEL
{
    /**
     * <p>
     * Active and system fields.
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    TDOLE_FIRST_LEVEL, // 0
    /**
     * <p>
     * Memo fields.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    TDOLE_SECOND_LEVEL, // 1
    /**
     * <p>
     * User-defined fields.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    TDOLE_THIRD_LEVEL, // 2
}
