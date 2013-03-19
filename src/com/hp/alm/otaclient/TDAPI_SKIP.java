package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Interval flags for graphs and summation by interval methods.
 * </p>
 */
public enum TDAPI_SKIP
{
    /**
     * <p>
     * Graph interval is in days.
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    TDOLE_SKIP_DAYS, // 0
    /**
     * <p>
     * Graph interval is in weeks.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    TDOLE_SKIP_WEEKS, // 1
    /**
     * <p>
     * Graph interval is in months.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    TDOLE_SKIP_MONTHS, // 2
    /**
     * <p>
     * Graph interval is in years.
     * </p>
     * <p>
     * The value of this constant is 3
     * </p>
     */
    TDOLE_SKIP_YEARS, // 3
}
