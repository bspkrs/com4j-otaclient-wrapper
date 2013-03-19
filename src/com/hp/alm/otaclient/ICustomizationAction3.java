package com.hp.alm.otaclient;

import com4j.*;

/**
 * Additional properties of the customization action.
 */
@IID("{9F69B635-7345-48B2-9DCB-A5C94F4CA568}")
public interface ICustomizationAction3 extends com.hp.alm.otaclient.ICustomizationAction2
{
    // Methods:
    /**
     * <p>
     * Returns the permission type according to the group mask.
     * </p>
     * <p>
     * Getter method for the COM property "ActionPermissionType"
     * </p>
     * 
     * @param userMask Mandatory java.lang.String parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(21)
    int actionPermissionType(
            java.lang.String userMask);
    
    // Properties:
}
