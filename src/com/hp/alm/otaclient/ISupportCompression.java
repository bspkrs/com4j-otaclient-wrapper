package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents a property for Results API.
 */
@IID("{A8C86EE1-0A2D-4590-A51B-086DDB5F21D2}")
public interface ISupportCompression extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * property Enabled
     * </p>
     * <p>
     * Getter method for the COM property "Enabled"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    boolean enabled();
    
    /**
     * <p>
     * property Enabled
     * </p>
     * <p>
     * Setter method for the COM property "Enabled"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(8)
    void enabled(
            boolean pVal);
    
    // Properties:
}
