package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * License types.
 * </p>
 */
public enum TDAPI_LICENSE implements ComEnum
{
    /**
     * <p>
     * Defect License.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    LIC_DEFECT(1),
    /**
     * <p>
     * Test Lab License.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    LIC_TEST_LAB(2),
    /**
     * <p>
     * Requirement License.
     * </p>
     * <p>
     * The value of this constant is 3
     * </p>
     */
    LIC_REQUIREMENT(3),
    /**
     * <p>
     * OTA Client License.
     * </p>
     * <p>
     * The value of this constant is 4
     * </p>
     */
    LIC_OTA_CLIENT(4),
    /**
     * <p>
     * Collaboration License.
     * </p>
     * <p>
     * The value of this constant is 6
     * </p>
     */
    LIC_COLLABORATION(6),
    /**
     * <p>
     * Dashboard License.
     * </p>
     * <p>
     * The value of this constant is 12
     * </p>
     */
    LIC_DASHBOARD(12),
    /**
     * <p>
     * Components License.
     * </p>
     * <p>
     * The value of this constant is 13
     * </p>
     */
    LIC_COMPONENTS(13), ;
    
    private final int value;
    
    TDAPI_LICENSE(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
