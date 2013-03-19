package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services to perform customization tasks, such as adding users to user groups, defining user-defined fields, and defining user access
 * privileges.
 */
@IID("{01A21FB9-74F1-4934-81F0-8C473F7A6E50}")
public interface ICustomization2 extends com.hp.alm.otaclient.ICustomization
{
    // Methods:
    /**
     * <p>
     * Checks if there has been at least one change to a property or child object that has not been saved.
     * </p>
     * <p>
     * Getter method for the COM property "IsChanged"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(21)
    boolean isChanged();
    
    /**
     * <p>
     * Discards unsaved changes to properties and child objects.
     * </p>
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(22)
    void rollback();
    
    // Properties:
}
