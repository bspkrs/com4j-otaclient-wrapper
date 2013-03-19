package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Modules.
 * </p>
 */
public enum TDAPI_MODULE implements ComEnum
{
    /**
     * <p>
     * Invalid module ID.
     * </p>
     * <p>
     * The value of this constant is -1
     * </p>
     */
    MODULE_INVALID(-1),
    /**
     * <p>
     * Defect Module.
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    MODULE_DEFECT(0),
    /**
     * <p>
     * Test Planning Module.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    MODULE_TEST_PLANNING(1),
    /**
     * <p>
     * Test Execution Module.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    MODULE_TEST_EXECUTION(2),
    /**
     * <p>
     * Requirement Module.
     * </p>
     * <p>
     * The value of this constant is 3
     * </p>
     */
    MODULE_REQUIREMENT(3),
    /**
     * <p>
     * Collaboration Module.
     * </p>
     * <p>
     * The value of this constant is 4
     * </p>
     */
    MODULE_COLLABORATION(4),
    /**
     * <p>
     * Dashboard Module.
     * </p>
     * <p>
     * The value of this constant is 5
     * </p>
     */
    MODULE_DASHBOARD(5),
    /**
     * <p>
     * Components Module.
     * </p>
     * <p>
     * The value of this constant is 6
     * </p>
     */
    MODULE_COMPONENTS(6),
    /**
     * <p>
     * Releases Module.
     * </p>
     * <p>
     * The value of this constant is 7
     * </p>
     */
    MODULE_RELEASE(7),
    /**
     * <p>
     * Release Cycle Module.
     * </p>
     * <p>
     * The value of this constant is 8
     * </p>
     */
    MODULE_RELEASE_CYCLE(8),
    /**
     * <p>
     * DataType Module.
     * </p>
     * <p>
     * The value of this constant is 9
     * </p>
     */
    MODULE_DATATYPE(9),
    /**
     * <p>
     * Business Models Module.
     * </p>
     * <p>
     * The value of this constant is 10
     * </p>
     */
    MODULE_MODELS(10),
    /**
     * <p>
     * Libraries Module.
     * </p>
     * <p>
     * The value of this constant is 11
     * </p>
     */
    MODULE_LIBRARIES(11), ;
    
    private final int value;
    
    TDAPI_MODULE(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
