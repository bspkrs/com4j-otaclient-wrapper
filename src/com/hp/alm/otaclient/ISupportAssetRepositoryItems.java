package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing asset repository items.
 */
@IID("{13370E69-A5AB-450C-9BB4-750F7C8574D7}")
public interface ISupportAssetRepositoryItems extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The asset's AssetRepositoryItemFactory object.
     * </p>
     * <p>
     * Getter method for the COM property "AssetRepositoryItemFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject assetRepositoryItemFactory();
    
    // Properties:
}
