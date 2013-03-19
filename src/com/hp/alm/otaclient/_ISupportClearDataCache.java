package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use only. Allows clearing the cache of a specific entity type.
 */
@IID("{AD3E2B2A-FAD1-4356-9347-28E6299284C1}")
public interface _ISupportClearDataCache extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * For HP use only. Clear a specific Data Type.
     * </p>
     * 
     * @param cbTableName Mandatory java.lang.String parameter.
     */
    
    @VTID(3)
    void clearDataCache(
            java.lang.String cbTableName);
    
    // Properties:
}
