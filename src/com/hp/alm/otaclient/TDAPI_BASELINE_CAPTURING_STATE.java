package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Baseline capture states.
 * </p>
 */
public enum TDAPI_BASELINE_CAPTURING_STATE
{
    /**
     * <p>
     * BASELINE_CAPTURING_STATE_NONE (Baseline not captured).
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    BASELINE_CAPTURING_STATE_NONE, // 0
    /**
     * <p>
     * BASELINE_CAPTURING_STATE_IN_PROGRESS (Baseline capture in progress).
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    BASELINE_CAPTURING_STATE_IN_PROGRESS, // 1
    /**
     * <p>
     * BASELINE_CAPTURING_STATE_FAIL (Baseline capture failed).
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    BASELINE_CAPTURING_STATE_FAIL, // 2
    /**
     * <p>
     * BASELINE_CAPTURING_STATE_COMPLETE (Baseline capture succeeded).
     * </p>
     * <p>
     * The value of this constant is 3
     * </p>
     */
    BASELINE_CAPTURING_STATE_COMPLETE, // 3
}
