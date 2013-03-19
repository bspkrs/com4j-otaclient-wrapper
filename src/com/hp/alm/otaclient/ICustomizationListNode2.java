package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a node in a list.
 */
@IID("{320F94F3-9268-4B87-B096-3C703B7FFE62}")
public interface ICustomizationListNode2 extends com.hp.alm.otaclient.ICustomizationListNode
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
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(27)
    boolean isTemplate();
    
    /**
     * <p>
     * The type of the list node.
     * </p>
     * <p>
     * Getter method for the COM property "Type"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(28)
    java.lang.String type();
    
    // Properties:
}
