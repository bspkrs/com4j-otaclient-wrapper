package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * AutoComplete Type.
 * </p>
 */
public enum TDAPI_AUTOCOMPLETE_TYPE
{
    /**
     * <p>
     * No autocomplete.
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    AC_TYPE_NO_AUTOCOMPLETE, // 0
    /**
     * <p>
     * Req to Test autocomplete.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    AC_TYPE_REQ_TO_TEST, // 1
    /**
     * <p>
     * Test to all its test instances.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    AC_TYPE_TEST_TO_TEST_INSTANCE, // 2
}
