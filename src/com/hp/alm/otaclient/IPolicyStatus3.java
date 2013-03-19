package com.hp.alm.otaclient;

import com4j.*;

/**
 * The Policy Enforcement Status information of the connected project.
 */
@IID("{10F27392-4C31-43FC-B10F-CECD4398085B}")
public interface IPolicyStatus3 extends com.hp.alm.otaclient.IPolicyStatus2
{
    // Methods:
    /**
     * <p>
     * Indicates whether the project represented by this policy status is active or not.
     * </p>
     * <p>
     * Getter method for the COM property "IsActive"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(23)
    boolean isActive();
    
    // Properties:
}
