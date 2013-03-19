package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Modification permissions.
 * </p>
 */
public enum TDAPI_GRANT_MODIFY
{
    /**
     * <p>
     * Allow modification.
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    GRANT_MODIFY_PERMIT, // 0
    /**
     * <p>
     * Do not allow modification.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    GRANT_MODIFY_DENY, // 1
    /**
     * <p>
     * Allow modification only by owner.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    GRANT_MODIFY_BY_OWNER_ONLY, // 2
}
