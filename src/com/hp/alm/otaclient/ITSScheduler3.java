package com.hp.alm.otaclient;

import com4j.*;

/**
 * Responsible for executing selected automated tests.
 */
@IID("{D35B05A3-C4CF-433F-9D9B-0B1E33F8825D}")
public interface ITSScheduler3 extends com.hp.alm.otaclient.ITSScheduler2
{
    // Methods:
    /**
     * <p>
     * Indicates whether to execute the test in offline mode.
     * </p>
     * <p>
     * Getter method for the COM property "OfflineExecution"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(27)
    boolean offlineExecution();
    
    /**
     * <p>
     * Indicates whether to execute the test in offline mode.
     * </p>
     * <p>
     * Setter method for the COM property "OfflineExecution"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(13)
    //= 0xd. The runtime will prefer the VTID if present
    @VTID(28)
    void offlineExecution(
            boolean pVal);
    
    // Properties:
}
