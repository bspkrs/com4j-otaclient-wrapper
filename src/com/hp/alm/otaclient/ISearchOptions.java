package com.hp.alm.otaclient;

import com4j.*;

/**
 * Options for controlling searches.
 */
@IID("{2444C43F-5371-4B4A-B6B6-34D205644C35}")
public interface ISearchOptions extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The search configuration flag.
     * </p>
     * <p>
     * Getter method for the COM property "Property"
     * </p>
     * 
     * @param prop Mandatory int parameter.
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object property(
            int prop);
    
    /**
     * <p>
     * The search configuration flag.
     * </p>
     * <p>
     * Setter method for the COM property "Property"
     * </p>
     * 
     * @param prop Mandatory int parameter.
     * @param pVal Mandatory java.lang.Object parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(8)
    void property(
            int prop,
            @MarshalAs(NativeType.VARIANT) java.lang.Object pVal);
    
    /**
     * <p>
     * The TDFilter object that controls this search.
     * </p>
     * <p>
     * Getter method for the COM property "Filter"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject filter();
    
    /**
     * <p>
     * The TDFilter object that controls this search.
     * </p>
     * <p>
     * Setter method for the COM property "Filter"
     * </p>
     * 
     * @param pFilter Mandatory com4j.Com4jObject parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(10)
    void filter(
            @MarshalAs(NativeType.Dispatch) com4j.Com4jObject pFilter);
    
    /**
     * <p>
     * For HP use.
     * </p>
     * <p>
     * Getter method for the COM property "Text"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(11)
    java.lang.String text();
    
    // Properties:
}
