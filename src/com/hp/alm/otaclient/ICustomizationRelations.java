package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents an entities relations model.
 */
@IID("{9180ACCF-C34F-4A49-B2EC-6BDEF33E26D3}")
public interface ICustomizationRelations extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Entities relation model.
     * </p>
     * <p>
     * Getter method for the COM property "RelationsModel"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String relationsModel();
    
    // Properties:
}
