package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing coverage by test configurations.
 */
@IID("{13C5BCEB-E381-447B-8262-89FAA0A6DB99}")
public interface IConfigurationCoverageFactory extends com.hp.alm.otaclient.IBaseFactoryEx
{
    // Methods:
    /**
     * <p>
     * Sets cycle context to be used in NewList.
     * </p>
     * 
     * @param coverageByCycles Mandatory com.hp.alm.otaclient.IList parameter.
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(17)
    void setCyclesContext(
            com.hp.alm.otaclient.IList coverageByCycles);
    
    /**
     * <p>
     * Resets cycle context.
     * </p>
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(18)
    void resetCyclesContext();
    
    // Properties:
}
