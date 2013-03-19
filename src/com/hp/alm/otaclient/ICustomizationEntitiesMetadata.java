package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents an entities metadata model.
 */
@IID("{7BB2B0DC-2043-4523-8BFA-FEF2972A32C4}")
public interface ICustomizationEntitiesMetadata extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Entities relation model.
     * </p>
     * <p>
     * Getter method for the COM property "EntitiesMetadataXml"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String entitiesMetadataXml();
    
    // Properties:
}
