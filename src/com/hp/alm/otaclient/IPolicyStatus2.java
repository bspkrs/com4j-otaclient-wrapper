package com.hp.alm.otaclient;

import com4j.*;

/**
 * The Policy Enforcement Status information of the connected project.
 */
@IID("{CEFEEB83-F4EF-4AEE-9E35-A461C40761C1}")
public interface IPolicyStatus2 extends com.hp.alm.otaclient.IPolicyStatus
{
    // Methods:
    /**
     * <p>
     * Refreshes policy status data.
     * </p>
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(22)
    void refresh();
    
    // Properties:
}
