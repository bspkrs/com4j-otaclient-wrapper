package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing release folders.
 */
@IID("{372A0E68-0D49-401A-97E2-C29595E8A562}")
public interface IReleaseFolderFactory extends com.hp.alm.otaclient.IBaseFactoryEx
{
    // Methods:
    /**
     * <p>
     * Gets the root release folder labled 'Releases'.
     * </p>
     * <p>
     * Getter method for the COM property "Root"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(17)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject root();
    
    // Properties:
}
