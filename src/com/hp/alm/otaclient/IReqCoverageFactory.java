package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing requirement coverage.
 */
@IID("{3F004630-2A1E-4E7A-9133-6A0EA826C48F}")
public interface IReqCoverageFactory extends com.hp.alm.otaclient.ICoverageFactory
{
    // Methods:
    /**
     * <p>
     * Indicates if the actions of the factory are applied recursively to requirement's children.
     * </p>
     * <p>
     * Getter method for the COM property "FullCoverage"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(16)
    boolean fullCoverage();
    
    /**
     * <p>
     * Indicates if the actions of the factory are applied recursively to requirement's children.
     * </p>
     * <p>
     * Setter method for the COM property "FullCoverage"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(17)
    void fullCoverage(
            boolean pVal);
    
    // Properties:
}
