package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing the collection of all CustomizationUser objects.
 */
@IID("{A23C23B0-5705-409C-8FC3-842D5CFFBF5E}")
public interface ICustomizationUsers2 extends com.hp.alm.otaclient.ICustomizationUsers
{
    // Methods:
    /**
     * <p>
     * Checks whether the specified site user exists.
     * </p>
     * 
     * @param userName Mandatory java.lang.String parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(15)
    boolean userExistsInSite(
            java.lang.String userName);
    
    // Properties:
}
