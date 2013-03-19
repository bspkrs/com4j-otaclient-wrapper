package com.hp.alm.otaclient;

import com4j.*;

/**
 * Additional properties of the customization field.
 */
@IID("{FAEE2FBA-6A3D-4255-B022-FDB4827435AC}")
public interface ICustomizationField3 extends com.hp.alm.otaclient.ICustomizationField2
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
    
    @DISPID(50)
    //= 0x32. The runtime will prefer the VTID if present
    @VTID(96)
    boolean isTemplate();
    
    // Properties:
}
