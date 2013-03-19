package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Library Sharing Statuses.
 * </p>
 */
public enum TDAPI_LIBRARY_TYPE
{
    /**
     * <p>
     * LIBRARY_TYPE_NONE (temporary state).
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    LIBRARY_TYPE_NONE, // 0
    /**
     * <p>
     * LIBRARY_TYPE_IMPORTED (shared - created from).
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    LIBRARY_TYPE_IMPORTED, // 1
    /**
     * <p>
     * LIBRARY_TYPE_EXPORTABLE (sharable - used by).
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    LIBRARY_TYPE_EXPORTABLE, // 2
}
