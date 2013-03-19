package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * The units by which to purge.
 * </p>
 */
public enum TDAPI_PURGE_RUNS implements ComEnum
{
    /**
     * <p>
     * Purge by number of days.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    TDDAY_PURGE(1),
    /**
     * <p>
     * Purge by number of weeks.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    TDWEEK_PURGE(2),
    /**
     * <p>
     * Purge by number of months.
     * </p>
     * <p>
     * The value of this constant is 3
     * </p>
     */
    TDMONTH_PURGE(3),
    /**
     * <p>
     * Purge by number of years.
     * </p>
     * <p>
     * The value of this constant is 4
     * </p>
     */
    TDYEAR_PURGE(4),
    /**
     * <p>
     * Purge by date.
     * </p>
     * <p>
     * The value of this constant is 5
     * </p>
     */
    TDDATE_PURGE(5), ;
    
    private final int value;
    
    TDAPI_PURGE_RUNS(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
