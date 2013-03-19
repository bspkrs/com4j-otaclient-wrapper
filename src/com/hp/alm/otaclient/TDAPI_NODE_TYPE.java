package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Node Types.
 * </p>
 */
public enum TDAPI_NODE_TYPE implements ComEnum
{
    /**
     * <p>
     * Undefined node type.
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    NODE_TYPE_UNDEFINED(0),
    /**
     * <p>
     * Release folder node type.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    NODE_TYPE_RELEASE_FOLDER(1),
    /**
     * <p>
     * Release node type.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    NODE_TYPE_RELEASE(2),
    /**
     * <p>
     * ReleaseCycle node type.
     * </p>
     * <p>
     * The value of this constant is 3
     * </p>
     */
    NODE_TYPE_RELEASECYCLE(3),
    /**
     * <p>
     * Favorite folder node type.
     * </p>
     * <p>
     * The value of this constant is 4
     * </p>
     */
    NODE_TYPE_FAVORITE_FOLDER(4),
    /**
     * <p>
     * Favorite node type.
     * </p>
     * <p>
     * The value of this constant is 5
     * </p>
     */
    NODE_TYPE_FAVORITE(5),
    /**
     * <p>
     * Library Folder node type.
     * </p>
     * <p>
     * The value of this constant is 6
     * </p>
     */
    NODE_TYPE_LIBRARY_FOLDER(6),
    /**
     * <p>
     * Library node type.
     * </p>
     * <p>
     * The value of this constant is 7
     * </p>
     */
    NODE_TYPE_LIBRARY(7),
    /**
     * <p>
     * Library Part node type.
     * </p>
     * <p>
     * The value of this constant is 8
     * </p>
     */
    NODE_TYPE_LIBRARY_PART(8),
    /**
     * <p>
     * Baseline node type.
     * </p>
     * <p>
     * The value of this constant is 9
     * </p>
     */
    NODE_TYPE_BASELINE(9),
    /**
     * <p>
     * QC Resource folder node type.
     * </p>
     * <p>
     * The value of this constant is 10
     * </p>
     */
    NODE_TYPE_QCRESOURCE_FOLDER(10),
    /**
     * <p>
     * QC Resource node type.
     * </p>
     * <p>
     * The value of this constant is 11
     * </p>
     */
    NODE_TYPE_QCRESOURCE(11),
    /**
     * <p>
     * Analysis Item folder node type.
     * </p>
     * <p>
     * The value of this constant is 12
     * </p>
     */
    NODE_TYPE_ANALYSISITEM_FOLDER(12),
    /**
     * <p>
     * Analysis Item node type.
     * </p>
     * <p>
     * The value of this constant is 13
     * </p>
     */
    NODE_TYPE_ANALYSISITEM(13),
    /**
     * <p>
     * dashboard folder node type.
     * </p>
     * <p>
     * The value of this constant is 14
     * </p>
     */
    NODE_TYPE_DASHBOARD_FOLDER(14),
    /**
     * <p>
     * dashboard page node type.
     * </p>
     * <p>
     * The value of this constant is 15
     * </p>
     */
    NODE_TYPE_DASHBOARD_PAGE(15),
    /**
     * <p>
     * Comparison node type.
     * </p>
     * <p>
     * The value of this constant is 16
     * </p>
     */
    NODE_TYPE_COMPARISON(16),
    /**
     * <p>
     * BPM Model Path type.
     * </p>
     * <p>
     * The value of this constant is 17
     * </p>
     */
    NODE_TYPE_BPM_PATH(17),
    /**
     * <p>
     * BPM Model Folder type.
     * </p>
     * <p>
     * The value of this constant is 18
     * </p>
     */
    NODE_TYPE_BPM_FOLDER(18),
    /**
     * <p>
     * BPM Model type.
     * </p>
     * <p>
     * The value of this constant is 19
     * </p>
     */
    NODE_TYPE_BPM_MODEL(19),
    /**
     * <p>
     * BPM Model Element type.
     * </p>
     * <p>
     * The value of this constant is 20
     * </p>
     */
    NODE_TYPE_BPM_ELEMENT(20),
    /**
     * <p>
     * Test folder type.
     * </p>
     * <p>
     * The value of this constant is 23
     * </p>
     */
    NODE_TYPE_TEST_FOLDER(23),
    /**
     * <p>
     * Test set folder type.
     * </p>
     * <p>
     * The value of this constant is 24
     * </p>
     */
    NODE_TYPE_TEST_SET_FOLDER(24), ;
    
    private final int value;
    
    TDAPI_NODE_TYPE(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
