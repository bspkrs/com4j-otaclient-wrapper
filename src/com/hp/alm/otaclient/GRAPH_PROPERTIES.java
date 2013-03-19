package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Graph properties.
 * </p>
 */
public enum GRAPH_PROPERTIES implements ComEnum
{
    /**
     * <p>
     * Name of the field to use as X axis for summary graph.
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    GRAPH_XAXIS(0),
    /**
     * <p>
     * Name of the field to group by.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    GRAPH_GROUP_BY(1),
    /**
     * <p>
     * Name of the field to sum the values of. The sum is displayed instead of the entities' count.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    GRAPH_SUM_OF(2),
    /**
     * <p>
     * Starting date for trend and progress graphs.
     * </p>
     * <p>
     * The value of this constant is 3
     * </p>
     */
    GRAPH_START_DATE(3),
    /**
     * <p>
     * In requirements module, if true, not-covered parent requirements are included as well.
     * </p>
     * <p>
     * The value of this constant is 4
     * </p>
     */
    GRAPH_SHOW_NOT_COVERED_PARENTS(4),
    /**
     * <p>
     * In test lab module, defines the ID of the test set to build graph for.
     * </p>
     * <p>
     * The value of this constant is 5
     * </p>
     */
    GRAPH_TEST_SET_ID(5),
    /**
     * <p>
     * In test plan and test lab modules, defines whether XAxis subject or test set full paths should be displayed.
     * </p>
     * <p>
     * The value of this constant is 8
     * </p>
     */
    GRAPH_XAXIS_SHOW_FULL_PATH(8),
    /**
     * <p>
     * In test plan and test lab modules, defines whether Group By subject or test set full paths should be displayed.
     * </p>
     * <p>
     * The value of this constant is 9
     * </p>
     */
    GRAPH_GROUP_BY_SHOW_FULL_PATH(9),
    /**
     * <p>
     * In test requirment module, set the cycle for the coverage graph.
     * </p>
     * <p>
     * The value of this constant is 10
     * </p>
     */
    GRAPH_CYCLE(10),
    /**
     * <p>
     * In test requirment module, set the release for the coverage graph.
     * </p>
     * <p>
     * The value of this constant is 11
     * </p>
     */
    GRAPH_RELEASE(11),
    /**
     * <p>
     * Defines the selected projects for cross project graph generation.
     * </p>
     * <p>
     * The value of this constant is 12
     * </p>
     */
    GRAPH_PROJECTS(12), ;
    
    private final int value;
    
    GRAPH_PROPERTIES(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
