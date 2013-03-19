package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing coverage by criteria.
 */
@IID("{3ECD417C-877F-4AE4-A500-93182CE8D5F1}")
public interface ICriterionCoverageFactory extends com.hp.alm.otaclient.IBaseFactoryEx
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
