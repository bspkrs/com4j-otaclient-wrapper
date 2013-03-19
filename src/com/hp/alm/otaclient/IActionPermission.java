package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services to manage user permissions for actions.
 */
@IID("{1EE78B77-A68F-49D8-9707-9A7C8CEA10D2}")
public interface IActionPermission extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Checks if the user has rights to perform the specified action.
     * </p>
     * <p>
     * Getter method for the COM property "ActionEnabled"
     * </p>
     * 
     * @param actionIdentity Mandatory java.lang.Object parameter.
     * @param actionTarget Optional parameter. Default value is com4j.Variant.getMissing()
     * @return Returns a value of type boolean
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    boolean actionEnabled(
            @MarshalAs(NativeType.VARIANT) java.lang.Object actionIdentity,
            @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object actionTarget);
    
    // Properties:
}
