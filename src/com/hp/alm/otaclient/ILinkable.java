package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing links.
 */
@IID("{9B1CCF47-8DC6-4B9D-AC24-35DD3361A175}")
public interface ILinkable extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The bug link factory that manages the links of the current object to its associated defects.
     * </p>
     * <p>
     * Getter method for the COM property "BugLinkFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bugLinkFactory();
    
    /**
     * <p>
     * The link factory of the current defect object that enables viewing the links. Defined only for Bug objects.
     * </p>
     * <p>
     * Getter method for the COM property "LinkFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject linkFactory();
    
    /**
     * <p>
     * Checks if the current object has at least one associated Bug.
     * </p>
     * <p>
     * Getter method for the COM property "HasLinkage"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    boolean hasLinkage();
    
    /**
     * <p>
     * Checks if the current Bug object has at least one associated object that is not another Bug object. Defined only for Bug objects.
     * </p>
     * <p>
     * Getter method for the COM property "HasOthersLinkage"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    boolean hasOthersLinkage();
    
    // Properties:
}
