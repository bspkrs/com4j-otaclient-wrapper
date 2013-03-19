package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents several values stored in a single field.
 */
@IID("{EB180CC0-6FDE-4A1E-A68E-F106EEED5E15}")
public interface IMultiValue extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Text representation of values list. Items are separated with a semicolon.
     * </p>
     * <p>
     * Getter method for the COM property "Text"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String text();
    
    /**
     * <p>
     * Text representation of values list. Items are separated with a semicolon.
     * </p>
     * <p>
     * Setter method for the COM property "Text"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(8)
    void text(
            java.lang.String pVal);
    
    /**
     * <p>
     * List of values. Each item is the string representation of a single value.
     * </p>
     * <p>
     * Getter method for the COM property "List"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    com.hp.alm.otaclient.IList list();
    
    @VTID(9)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object list(
            int index);
    
    /**
     * <p>
     * List of values. Each item is the string representation of a single value.
     * </p>
     * <p>
     * Setter method for the COM property "List"
     * </p>
     * 
     * @param pVal Mandatory com.hp.alm.otaclient.IList parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(10)
    void list(
            com.hp.alm.otaclient.IList pVal);
    
    // Properties:
}
