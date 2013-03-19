package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Extension selector.
 * </p>
 */
public enum TDAPI_GET_EXTENSION_MODE
{
    /**
     * <p>
     * Get All extensions registered to server.
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    GET_EXTENSION_MODE_ALL, // 0
    /**
     * <p>
     * Get extensions that are Enabled in project.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    GET_EXTENSION_MODE_ENABLED, // 1
}
