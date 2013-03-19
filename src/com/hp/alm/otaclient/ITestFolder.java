package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a test folder.
 */
@IID("{321E4551-E62F-400E-B64A-9326D7AF3685}")
public interface ITestFolder extends com.hp.alm.otaclient.IBaseFieldExMail
{
    // Methods:
    /**
     * <p>
     * The TestFolderFactory for direct child test folders.
     * </p>
     * <p>
     * Getter method for the COM property "TestFolderFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(24)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject testFolderFactory();
    
    /**
     * <p>
     * The TestFactory object for direct child tests.
     * </p>
     * <p>
     * Getter method for the COM property "TestFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(25)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject testFactory();
    
    // Properties:
}
