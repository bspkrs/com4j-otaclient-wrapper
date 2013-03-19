package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Risk-based testing Requirement Type Risk Analysis Type.
 * </p>
 */
public enum TDAPI_RBT_REQUIREMENT_TYPE_RISK_ANALYSIS_TYPE
{
    /**
     * <p>
     * Risk-based testing does not apply to requirements of this type.
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    REQUIREMENT_TYPE_RISK_ANALYSIS_TYPE_NONE, // 0
    /**
     * <p>
     * The risk for requirements of this type can be Assessed, but not Analyzed.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    REQUIREMENT_TYPE_RISK_ANALYSIS_TYPE_ASSESS, // 1
    /**
     * <p>
     * The risk for requirements of this type can be Analyzed, but not Assessed.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    REQUIREMENT_TYPE_RISK_ANALYSIS_TYPE_ANALYSIS, // 2
}
