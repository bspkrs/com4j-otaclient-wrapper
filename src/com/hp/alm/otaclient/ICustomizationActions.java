package com.hp.alm.otaclient;

import com4j.*;

/**
 * The collection of all CustomizationAction objects.
 */
@IID("{E746670E-69C7-4DC1-93BC-9B4662B6015D}")
public interface ICustomizationActions extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The list of CustomizationAction objects.
     * </p>
     * <p>
     * Getter method for the COM property "Actions"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    com.hp.alm.otaclient.IList actions();
    
    @VTID(7)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object actions(
            int index);
    
    /**
     * <p>
     * The CustomizationAction object representing the specified action.
     * </p>
     * <p>
     * Getter method for the COM property "Action"
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject action(
            java.lang.String name);
    
    // Properties:
}
