package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Provides an interface for a library that is imported.
 */
@IID("{23942689-4708-4AC4-8757-4E370C6A5CD8}")
public interface IImportedLibrary extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Return a LibraryInfo reference to the library this library was created from.
     * </p>
     * <p>
     * Getter method for the COM property "CreatedFromInfo"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject createdFromInfo();
    
    /**
     * <p>
     * Imports the content of the connected library to this library.
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    int beginImport();
    
    // Properties:
}
