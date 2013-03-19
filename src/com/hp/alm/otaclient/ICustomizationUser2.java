package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a user for purposes of adding and removing the user to and from user groups.
 */
@IID("{195372F0-563B-4826-9886-2F8D621700C0}")
public interface ICustomizationUser2 extends com.hp.alm.otaclient.ICustomizationUser
{
    // Methods:
    /**
     * <p>
     * Indicates whether the user is active or not.
     * </p>
     * <p>
     * Getter method for the COM property "IsActive"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(30)
    boolean isActive();
    
    /**
     * <p>
     * Gets the user expiration date.
     * </p>
     * <p>
     * Getter method for the COM property "ExpirationDate"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(31)
    java.lang.String expirationDate();
    
    // Properties:
}
