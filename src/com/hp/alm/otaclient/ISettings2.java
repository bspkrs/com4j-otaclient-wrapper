package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents users' settings in various user-defined categories.
 */
@IID("{B761098B-AC59-4C3D-A427-D09231A402B8}")
public interface ISettings2 extends com.hp.alm.otaclient.ISettings
{
    // Methods:
    /**
     * <p>
     * Checks if the specified setting is built-in and read-only.
     * </p>
     * <p>
     * Getter method for the COM property "IsSystem"
     * </p>
     * 
     * @param name Mandatory java.lang.String parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(16)
    boolean isSystem(
            java.lang.String name);
    
    // Properties:
}
