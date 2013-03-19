package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing relations of contained assets.
 */
@IID("{E916A243-2644-4531-AD0F-09E46FE849D9}")
public interface IContainsSupportAssetRelations extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Returns true if this folder contains entities that are used by other entities.
     * </p>
     * <p>
     * Getter method for the COM property "ContainsUsedBy"
     * </p>
     * 
     * @param itemKey Mandatory java.lang.Object parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    boolean containsUsedBy(
            @MarshalAs(NativeType.VARIANT) java.lang.Object itemKey);
    
    // Properties:
}
