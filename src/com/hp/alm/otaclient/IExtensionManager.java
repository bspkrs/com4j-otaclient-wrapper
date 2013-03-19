package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Provides services for extensions manager. Used for UNIT TESTS ONLY!
 */
@IID("{34AC6EC7-3E2D-4A15-90A0-DF789E91A966}")
public interface IExtensionManager extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Returns the loaded extensions in a comma-delimited string.
     * </p>
     * <p>
     * Getter method for the COM property "LoadedExtensions"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String loadedExtensions();
    
    // Properties:
}
