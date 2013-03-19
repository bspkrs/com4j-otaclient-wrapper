package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services to support locking objects for editing. This interface is not used for version control.
 */
@IID("{260EDCFF-BF72-4146-BC41-5B2280652ED0}")
public interface IObjectLockingSupport extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Checks if object is locked for editing.
     * </p>
     * <p>
     * Getter method for the COM property "IsLocked"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    boolean isLocked();
    
    /**
     * <p>
     * Locks the object. Returns True if the object has been changed on the server.
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    boolean lockObject();
    
    /**
     * <p>
     * Unlocks the object.
     * </p>
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    void unLockObject();
    
    // Properties:
}
