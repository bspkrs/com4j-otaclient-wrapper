package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Services for managing Library Part.
 */
@IID("{D7813508-1AF3-44EC-ACE2-FAE4BEF1E8BF}")
public interface ILibraryPartFactory extends com.hp.alm.otaclient.IBaseFactoryEx
{
    // Methods:
    /**
     * <p>
     * whether this part library permits modifications in parts.
     * </p>
     * <p>
     * Getter method for the COM property "CanModifyParts"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(17)
    boolean canModifyParts();
    
    // Properties:
}
