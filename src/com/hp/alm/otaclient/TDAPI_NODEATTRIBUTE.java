package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Tree node attributes.
 * </p>
 */
public enum TDAPI_NODEATTRIBUTE
{
    /**
     * <p>
     * System folder. The folder cannot be modified, and sub-folders cannot be added or removed.
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    TDOLE_NODE_SYSTEM, // 0
    /**
     * <p>
     * Read-only folder. Only the add and delete sub-folders operations are enabled.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    TDOLE_NODE_READONLY, // 1
    /**
     * <p>
     * Changeable folder. All operations are enabled except delete.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    TDOLE_NODE_CHANGEABLE, // 2
    /**
     * <p>
     * Full access folder. All operations are enabled.
     * </p>
     * <p>
     * The value of this constant is 3
     * </p>
     */
    TDOLE_NODE_FULLACCESS, // 3
}
