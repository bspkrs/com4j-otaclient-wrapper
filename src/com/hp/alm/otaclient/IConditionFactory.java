package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing conditions for executing test instances in an test set.
 */
@IID("{8C63633A-6537-41B5-93A3-982823DE8689}")
public interface IConditionFactory extends com.hp.alm.otaclient.IBaseFactory
{
    // Methods:
    /**
     * <p>
     * Saves all conditions.
     * </p>
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(16)
    void save();
    
    // Properties:
}
