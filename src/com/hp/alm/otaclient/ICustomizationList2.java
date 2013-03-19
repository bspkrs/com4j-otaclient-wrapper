package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a user-defined list associated with a field.
 */
@IID("{508349C0-3B3B-408D-887F-2AD85FCAF3F7}")
public interface ICustomizationList2 extends com.hp.alm.otaclient.ICustomizationList
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
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(12)
    boolean isTemplate();
    
    /**
     * <p>
     * The type of the list.
     * </p>
     * <p>
     * Getter method for the COM property "Type"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(13)
    java.lang.String type();
    
    // Properties:
}
