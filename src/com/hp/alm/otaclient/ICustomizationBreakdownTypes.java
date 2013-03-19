package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. The collection of QPM Breakdown Types.
 */
@IID("{083BD8AE-B85A-4800-B9C3-D882CB12201A}")
public interface ICustomizationBreakdownTypes extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Creates a new CustomizationBreakdownType.
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addBreakdownType(
            java.lang.String name);
    
    /**
     * <p>
     * Deletes the specified CustomizationKPIType.
     * </p>
     * 
     * @param id Mandatory int parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    void removeBreakdownType(
            int id);
    
    /**
     * <p>
     * Gets the list of ICustomizationBreakdownType objects.
     * </p>
     * <p>
     * Getter method for the COM property "BreakdownTypes"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    com.hp.alm.otaclient.IList breakdownTypes();
    
    @VTID(9)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object breakdownTypes(
            int index);
    
    // Properties:
}
