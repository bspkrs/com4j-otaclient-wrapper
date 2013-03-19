package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Possible results of template propagation analysis and enforcement.
 * </p>
 */
public enum TDAPI_TEMPLATE_PROPAGATION_STATUS
{
    /**
     * <p>
     * Template analysis / enforcement has completed successfully.
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    TDAPI_PROPAGATION_SUCCESS, // 0
    /**
     * <p>
     * Template analysis / enforcement has completed with warnings.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    TDAPI_PROPAGATION_WARNINGS, // 1
    /**
     * <p>
     * Template analysis / enforcement has failed.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    TDAPI_PROPAGATION_FAILURE, // 2
}
