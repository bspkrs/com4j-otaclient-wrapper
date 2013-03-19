package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * The dependency types of an object in uses<->used-by relations with other objects.
 * </p>
 */
public enum DEPENDENCIES_TYPE
{
    /**
     * <p>
     * Has no dependencies.
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    DEPENDENCIES_TYPE_NONE, // 0
    /**
     * <p>
     * This object is dependent on at least one other.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    DEPENDENCIES_TYPE_USING, // 1
    /**
     * <p>
     * At least one other object is dependent this object.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    DEPENDENCIES_TYPE_USED_BY, // 2
    /**
     * <p>
     * This object is dependent on others and other are dependent on it.
     * </p>
     * <p>
     * The value of this constant is 3
     * </p>
     */
    DEPENDENCIES_TYPE_BOTH, // 3
}
