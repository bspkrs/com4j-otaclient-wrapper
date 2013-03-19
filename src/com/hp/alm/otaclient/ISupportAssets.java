package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing user assets.
 */
@IID("{99E2DCA6-B097-4359-8D54-8E3AC6BD1716}")
public interface ISupportAssets extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The asset's UserAssetFactory object.
     * </p>
     * <p>
     * Getter method for the COM property "UserAssetFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject userAssetFactory();
    
    // Properties:
}
