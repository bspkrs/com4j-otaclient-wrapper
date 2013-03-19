package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing test runs.
 */
@IID("{682F76CF-D479-4A34-AD8F-108F6B6C23DB}")
public interface IRunFactory extends com.hp.alm.otaclient.IBaseFactory
{
    // Methods:
    /**
     * <p>
     * Gets the run name. The name is unique in the current test and test set.
     * </p>
     * <p>
     * Getter method for the COM property "UniqueRunName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(16)
    java.lang.String uniqueRunName();
    
    /**
     * <p>
     * Removes duplicate runs for the current test set. Removal is immediate without Post.
     * </p>
     * 
     * @param runName Mandatory java.lang.String parameter.
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(17)
    void deleteDuplicateRuns(
            java.lang.String runName);
    
    // Properties:
}
