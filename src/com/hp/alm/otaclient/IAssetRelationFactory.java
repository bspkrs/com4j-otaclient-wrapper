package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing relations between assets.
 */
@IID("{51A589CA-B213-4D57-B7DA-BFA8C7F4CC81}")
public interface IAssetRelationFactory extends com.hp.alm.otaclient.IBaseFactoryEx
{
    // Methods:
    /**
     * <p>
     * Removes an asset's relations.
     * </p>
     * 
     * @param deleteAll Mandatory boolean parameter.
     * @param assetID Optional parameter. Default value is -1
     * @param assetType Optional parameter. Default value is ""
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(17)
    void removeRelations(
            boolean deleteAll,
            @Optional @DefaultValue("-1") int assetID,
            @Optional @DefaultValue("") java.lang.String assetType);
    
    // Properties:
}
