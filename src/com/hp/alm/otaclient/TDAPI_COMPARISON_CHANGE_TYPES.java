package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Comparison Change Types.
 * </p>
 */
public enum TDAPI_COMPARISON_CHANGE_TYPES implements ComEnum
{
    /**
     * <p>
     * No Change.
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    COMPARISON_CHANGE_TYPE_NO_CHANGE(0),
    /**
     * <p>
     * Added.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    COMPARISON_CHANGE_TYPE_ADDED(1),
    /**
     * <p>
     * Modified.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    COMPARISON_CHANGE_TYPE_MODIFIED(2),
    /**
     * <p>
     * Moved.
     * </p>
     * <p>
     * The value of this constant is 4
     * </p>
     */
    COMPARISON_CHANGE_TYPE_MOVED(4),
    /**
     * <p>
     * Deleted.
     * </p>
     * <p>
     * The value of this constant is 8
     * </p>
     */
    COMPARISON_CHANGE_TYPE_DELETED(8),
    /**
     * <p>
     * ActuallyMoved. This type used only in the server and DB. OTA client (UI) cannot receive this type while asking to get comparison
     * change type of entity.
     * </p>
     * <p>
     * The value of this constant is 20
     * </p>
     */
    COMPARISON_CHANGE_TYPE_ACTUALLY_MOVED(20),
    /**
     * <p>
     * MovedAndModified. This type used to indicate entities that were moved and modified.
     * </p>
     * <p>
     * The value of this constant is 6
     * </p>
     */
    COMPARISON_CHANGE_TYPE_MOVED_AND_MODIFIED(6), ;
    
    private final int value;
    
    TDAPI_COMPARISON_CHANGE_TYPES(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
