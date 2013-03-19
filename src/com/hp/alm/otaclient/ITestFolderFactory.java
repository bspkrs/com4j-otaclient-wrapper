package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services to manage test folders.
 */
@IID("{E34F464E-ABBA-487A-8054-31CEE30D1AC1}")
public interface ITestFolderFactory extends com.hp.alm.otaclient.IBaseFactoryEx
{
    // Methods:
    /**
     * <p>
     * Returns the root test folder labeled 'Subject'.
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
     * Removes test folders and moves the tests they contain to the Unattached folder.
     * </p>
     * 
     * @param itemKey Mandatory java.lang.Object parameter.
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(18)
    void removeItemAndMoveTestsToUnattached(
            @MarshalAs(NativeType.VARIANT) java.lang.Object itemKey);
    
    // Properties:
}
