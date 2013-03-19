package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Levels of descendents for tree nodes.
 * </p>
 */
public enum TDAPI_TREETYPE
{
    /**
     * <p>
     * The folder is a tree leaf, and has no sub-folders.
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    TDOLE_LEAF_TYPE, // 0
    /**
     * <p>
     * The folder has only one level of sub-folders.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    TDOLE_LIST_TYPE, // 1
    /**
     * <p>
     * The folder has more than one level of sub-folders.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    TDOLE_TREE_TYPE, // 2
}
