package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Client license types.
 * </p>
 */
public enum TDLICENSE_CLIENT implements ComEnum
{
    /**
     * <p>
     * BUG Client License.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    TDLICENSE_BUG(1),
    /**
     * <p>
     * Lab Client License.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    TDLICENSE_LAB(2),
    /**
     * <p>
     * Requirements Client License.
     * </p>
     * <p>
     * The value of this constant is 4
     * </p>
     */
    TDLICENSE_REQ(4),
    /**
     * <p>
     * OTA Client License.
     * </p>
     * <p>
     * The value of this constant is 8
     * </p>
     */
    TDLICENSE_OTA_CLIENT(8),
    /**
     * <p>
     * Collaboration Client License.
     * </p>
     * <p>
     * The value of this constant is 32
     * </p>
     */
    TDLICENSE_COLLAB(32),
    /**
     * <p>
     * Dashboard Client License.
     * </p>
     * <p>
     * The value of this constant is 2048
     * </p>
     */
    TDLICENSE_DASHBOARD(2048),
    /**
     * <p>
     * Components Client License.
     * </p>
     * <p>
     * The value of this constant is 4096
     * </p>
     */
    TDLICENSE_COMPONENTS(4096), ;
    
    private final int value;
    
    TDLICENSE_CLIENT(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
