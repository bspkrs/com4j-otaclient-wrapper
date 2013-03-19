package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Business process parameter types.
 * </p>
 */
public enum BPPARAMS_TYPE
{
    /**
     * <p>
     * Constant parameter value.
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    BPPARAM_TYPE_CONSTANT, // 0
    /**
     * <p>
     * The value is from an output BPParameter of a previous action.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    BPPARAM_TYPE_REFERENCE, // 1
    /**
     * <p>
     * Run time parameter value.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    BPPARAM_TYPE_RUNTIME, // 2
}
