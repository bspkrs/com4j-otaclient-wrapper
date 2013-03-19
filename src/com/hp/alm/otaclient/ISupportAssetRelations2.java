package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing relations between Quality Center entities.
 */
@IID("{C24D50FF-DBEB-4FFC-9DFD-8C5196076E67}")
public interface ISupportAssetRelations2 extends com.hp.alm.otaclient.ISupportAssetRelations
{
    // Methods:
    /**
     * <p>
     * Returns true if the object is linked to an asset but the asset does not exist.
     * </p>
     * <p>
     * Getter method for the COM property "ContainsBrokenRelation"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    boolean containsBrokenRelation();
    
    /**
     * <p>
     * Returns asset relation dependencies status.
     * </p>
     * 
     * @param needRefresh Mandatory boolean parameter.
     * @return Returns a value of type com.hp.alm.otaclient.DEPENDENCIES_TYPE
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(12)
    com.hp.alm.otaclient.DEPENDENCIES_TYPE hasDependencies(
            boolean needRefresh);
    
    // Properties:
}
