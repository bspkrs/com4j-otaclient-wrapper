package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services to manage test set folders.
 */
@IID("{898F4056-713A-4B33-ACFE-578DDD3C492F}")
public interface ITestLabFolderFactory extends com.hp.alm.otaclient.IBaseFactoryEx
{
    // Methods:
    /**
     * <p>
     * Returns the root test set folder.
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
    
    /**
     * <p>
     * Removes test set folders and moves the test sets they contain to the Unattached folder.
     * </p>
     * 
     * @param itemKey Mandatory java.lang.Object parameter.
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(18)
    void removeItemAndMoveTestSetsToUnattached(
            @MarshalAs(NativeType.VARIANT) java.lang.Object itemKey);
    
    // Properties:
}
