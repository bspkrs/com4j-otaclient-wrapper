package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a directed relation between two assets.
 */
@IID("{0821DF0A-E0C8-4114-9F94-688716809847}")
public interface IAssetRelation2 extends com.hp.alm.otaclient.IAssetRelation
{
    // Methods:
    /**
     * <p>
     * Returns true if either object in the relation does not exist.
     * </p>
     * <p>
     * Getter method for the COM property "IsBroken"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(20)
    boolean isBroken();
    
    /**
     * <p>
     * A reference to this AssetRelation's DeletedAssetInfo object.
     * </p>
     * <p>
     * Getter method for the COM property "DeletedAssetInfo"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(21)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject deletedAssetInfo();
    
    // Properties:
}
