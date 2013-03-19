package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services to manage user permissions for actions.
 */
@IID("{76BE00C2-81C9-4AB2-8619-53278E54CAF0}")
public interface IActionPermission2 extends com.hp.alm.otaclient.IActionPermission
{
    // Methods:
    /**
     * <p>
     * Returns the the user's permissions on an action (full permission, by owner permission, view-only permission).
     * </p>
     * <p>
     * Getter method for the COM property "ActionPermissionType"
     * </p>
     * 
     * @param actionName Mandatory java.lang.String parameter.
     * @param userName Mandatory java.lang.String parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    int actionPermissionType(
            java.lang.String actionName,
            java.lang.String userName);
    
    // Properties:
}
