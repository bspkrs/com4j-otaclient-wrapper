package com.hp.alm.otaclient;

import com4j.*;

/**
 * Additional properties of the customization field.
 */
@IID("{F5752A38-5288-4C4D-BA15-9F63E21EC44A}")
public interface ICustomizationUsersGroup2 extends com.hp.alm.otaclient.ICustomizationUsersGroup
{
    // Methods:
    /**
     * <p>
     * Checks whether the customization item originated from the project template.
     * </p>
     * <p>
     * Getter method for the COM property "IsTemplate"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(21)
    boolean isTemplate();
    
    // Properties:
}
