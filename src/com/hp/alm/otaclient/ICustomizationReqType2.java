package com.hp.alm.otaclient;

import com4j.*;

/**
 * Additional properties of the customization field.
 */
@IID("{8AC0C8C0-1106-4915-A7BE-04D3E54434C6}")
public interface ICustomizationReqType2 extends com.hp.alm.otaclient.ICustomizationReqType
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
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(24)
    boolean isTemplate();
    
    // Properties:
}
