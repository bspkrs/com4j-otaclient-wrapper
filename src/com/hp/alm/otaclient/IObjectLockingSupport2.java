package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Services to support locking objects.
 */
@IID("{C4DFB67A-1AA4-11DD-B154-13D455D89593}")
public interface IObjectLockingSupport2 extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * For HP use. Gets the user name and machine name of the locked object.
     * </p>
     * 
     * @param pUsername Mandatory Holder<java.lang.String> parameter.
     * @param pClientMachineName Mandatory Holder<java.lang.String> parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    void getLockParams(
            Holder<java.lang.String> pUsername,
            Holder<java.lang.String> pClientMachineName);
    
    // Properties:
}
