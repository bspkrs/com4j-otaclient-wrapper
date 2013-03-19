package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Services for managing library folders.
 */
@IID("{22638C3C-1998-4187-9426-805A7849F103}")
public interface ILibraryFolderFactory extends com.hp.alm.otaclient.IBaseFactoryEx
{
    // Methods:
    /**
     * <p>
     * Gets the root library folder labeled 'Libraries'.
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
