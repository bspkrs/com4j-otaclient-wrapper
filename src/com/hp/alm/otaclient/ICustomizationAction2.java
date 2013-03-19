package com.hp.alm.otaclient;

import com4j.*;

/**
 * Additional properties of the customization action.
 */
@IID("{8592C4BF-439B-45CB-A0E8-B7FE9E6E4FB5}")
public interface ICustomizationAction2 extends com.hp.alm.otaclient.ICustomizationAction
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
    @VTID(20)
    boolean isTemplate();
    
    // Properties:
}
