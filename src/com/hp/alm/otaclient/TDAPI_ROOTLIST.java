package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Selector for tree root nodes.
 * </p>
 */
public enum TDAPI_ROOTLIST
{
    /**
     * <p>
     * All tree roots. A root is a record where AL_FATHER_ID = 0.
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    TDOLE_ALL, // 0
    /**
     * <p>
     * Only the subject tree node.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    TDOLE_SUBJECT, // 1
    /**
     * <p>
     * All tree roots except the subject root. This includes all customization lists.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    TDOLE_NOT_SUBJECT, // 2
}
