package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Graph types.
 * </p>
 */
public enum GRAPH_TYPE implements ComEnum
{
    /**
     * <p>
     * Summary.
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    GRAPH_SUMMARY(0),
    /**
     * <p>
     * Age.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    GRAPH_AGE(1),
    /**
     * <p>
     * Progress.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    GRAPH_PROGRESS(2),
    /**
     * <p>
     * Trend.
     * </p>
     * <p>
     * The value of this constant is 3
     * </p>
     */
    GRAPH_TREND(3),
    /**
     * <p>
     * Coverage.
     * </p>
     * <p>
     * The value of this constant is 5
     * </p>
     */
    GRAPH_COVERAGE(5),
    /**
     * <p>
     * KPI progress.
     * </p>
     * <p>
     * The value of this constant is 6
     * </p>
     */
    KPI_PROGRESS(6),
    /**
     * <p>
     * Release Scorecard.
     * </p>
     * <p>
     * The value of this constant is 7
     * </p>
     */
    GRAPH_RELEASE_SCORECARD(7),
    /**
     * <p>
     * KPI breakdown.
     * </p>
     * <p>
     * The value of this constant is 8
     * </p>
     */
    KPI_BREAKDOWN(8),
    /**
     * <p>
     * KPI breakdown progress.
     * </p>
     * <p>
     * The value of this constant is 9
     * </p>
     */
    KPI_BREAKDOWN_PROGRESS(9),
    /**
     * <p>
     * BPM Requirement Summary.
     * </p>
     * <p>
     * The value of this constant is 10
     * </p>
     */
    GRAPH_BPM_REQUIREMENS(10),
    /**
     * <p>
     * BPM Test Summary.
     * </p>
     * <p>
     * The value of this constant is 11
     * </p>
     */
    GRAPH_BPM_TESTS(11),
    /**
     * <p>
     * BPM Defect Summary.
     * </p>
     * <p>
     * The value of this constant is 12
     * </p>
     */
    GRAPH_BPM_DEFECTS(12), ;
    
    private final int value;
    
    GRAPH_TYPE(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
