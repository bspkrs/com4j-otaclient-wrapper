package com.hp.alm.otaclient;

import com4j.*;

/**
 * <p>
 * Options for pasting design steps linked to tests where the linked tests already exist in the target project.
 * </p>
 */
public enum TDAPI_COPY_PASTE_MODES implements ComEnum
{
    /**
     * <p>
     * Do not copy the linked tests.
     * </p>
     * <p>
     * The value of this constant is 0
     * </p>
     */
    COPY_PASTE_NO_LINKED_TEST_MODE(0),
    /**
     * <p>
     * Link the design steps to the existing tests.
     * </p>
     * <p>
     * The value of this constant is 1
     * </p>
     */
    COPY_PASTE_USE_LINKED_TEST_MODE(1),
    /**
     * <p>
     * Create new copies of the linked tests.
     * </p>
     * <p>
     * The value of this constant is 2
     * </p>
     */
    COPY_PASTE_CREATE_LINKED_TEST_MODE(2),
    /**
     * <p>
     * Do not copy the related entities.
     * </p>
     * <p>
     * The value of this constant is 4
     * </p>
     */
    COPY_PASTE_NO_RELATED_ENTITIES_MODE(4),
    /**
     * <p>
     * Link the entity to the existing found entities.
     * </p>
     * <p>
     * The value of this constant is 8
     * </p>
     */
    COPY_PASTE_USE_RELATED_ENTITIES_MODE(8),
    /**
     * <p>
     * Create new copies of the related entities.
     * </p>
     * <p>
     * The value of this constant is 16
     * </p>
     */
    COPY_PASTE_CREATE_RELATED_ENTITIES_MODE(16), ;
    
    private final int value;
    
    TDAPI_COPY_PASTE_MODES(int value)
    {
        this.value = value;
    }
    
    public int comEnumValue()
    {
        return value;
    }
}
