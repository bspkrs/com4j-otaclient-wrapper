package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing the collection of all CustomizationUsersGroup objects.
 */
@IID("{F95746E3-3F15-4FDF-A856-101A27E06399}")
public interface ICustomizationUsersGroups3 extends com.hp.alm.otaclient.ICustomizationUsersGroups2
{
    // Methods:
    /**
     * <p>
     * Adds a new CustomizationUsersGroup to the collection as a copy of an existing group.
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     * @param sourceGroupName Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(12)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addGroupAsGroup(
            java.lang.String name,
            java.lang.String sourceGroupName);
    
    // Properties:
}
