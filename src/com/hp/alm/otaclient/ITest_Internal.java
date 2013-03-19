package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use.
 */
@IID("{51915689-A5DF-4B6C-B68C-BB7CFB619E64}")
public interface ITest_Internal extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The test folder ID.
     * </p>
     * <p>
     * Getter method for the COM property "FolderId"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(1610678272)
    //= 0x60010000. The runtime will prefer the VTID if present
    @VTID(3)
    int folderId();
    
    // Properties:
}
