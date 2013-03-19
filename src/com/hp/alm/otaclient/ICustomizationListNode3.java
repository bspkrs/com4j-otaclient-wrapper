package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a node in a list.
 */
@IID("{22E156BB-1FC7-493F-95A5-80792EBA6130}")
public interface ICustomizationListNode3 extends com.hp.alm.otaclient.ICustomizationListNode2
{
    // Methods:
    /**
     * <p>
     * For HP use. Checks if this is hidden in the customization UI.
     * </p>
     * <p>
     * Getter method for the COM property "IsHideInCust"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(29)
    boolean isHideInCust();
    
    // Properties:
}
