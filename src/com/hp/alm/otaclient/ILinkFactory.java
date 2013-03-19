package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services to manage Link objects.
 */
@IID("{49B715FA-458E-46EA-A171-0E0BFB38B3AF}")
public interface ILinkFactory extends com.hp.alm.otaclient.IBaseFactory
{
    // Methods:
    /**
     * <p>
     * For HP use. Gets the factory owner object.
     * </p>
     * <p>
     * Getter method for the COM property "Owner"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(16)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject owner();
    
    /**
     * <p>
     * Indicates that NewList returns child objects in addition to the current object.
     * </p>
     * <p>
     * Getter method for the COM property "FullLinkage"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(17)
    boolean fullLinkage();
    
    /**
     * <p>
     * Indicates that NewList returns child objects in addition to the current object.
     * </p>
     * <p>
     * Setter method for the COM property "FullLinkage"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(18)
    void fullLinkage(
            boolean pVal);
    
    // Properties:
}
