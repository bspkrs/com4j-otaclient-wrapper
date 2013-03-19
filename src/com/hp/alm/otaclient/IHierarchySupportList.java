package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services to create and maintain lists of items and their parent objects.
 */
@IID("{DDE517F0-AF73-4327-A1BD-403E6A047B0A}")
public interface IHierarchySupportList extends com.hp.alm.otaclient.IFactoryList
{
    // Methods:
    /**
     * <p>
     * Checks if the item matches the filter criteria of the list to which it belongs.
     * </p>
     * <p>
     * Getter method for the COM property "IsInFilter"
     * </p>
     * 
     * @param index Mandatory int parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(19)
    boolean isInFilter(
            int index);
    
    // Properties:
}
