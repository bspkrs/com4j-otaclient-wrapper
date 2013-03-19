package com.hp.alm.otaclient;

import com4j.*;

/**
 * HP internal.
 */
@IID("{10D7694C-447A-4809-89ED-74C2E82EB1CB}")
public interface ITDConnection_TestFolders extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * For HP use.
     * </p>
     * <p>
     * Getter method for the COM property "TestFolderFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1610678272)
    //= 0x60010000. The runtime will prefer the VTID if present
    @VTID(3)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject testFolderFactory();
    
    /**
     * <p>
     * For HP use.
     * </p>
     * <p>
     * Getter method for the COM property "TestLabFolderFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1610678273)
    //= 0x60010001. The runtime will prefer the VTID if present
    @VTID(4)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject testLabFolderFactory();
    
    // Properties:
}
