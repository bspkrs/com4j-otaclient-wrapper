package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing release cycles.
 */
@IID("{B5C61825-C184-4FBC-89FA-A7CC04EF815D}")
public interface ICycleFactory extends com.hp.alm.otaclient.IBaseFactoryEx
{
    // Methods:
    /**
     * <p>
     * Builds release cycle coverage graph.
     * </p>
     * 
     * @param cycleID Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1610874880)
    //= 0x60040000. The runtime will prefer the VTID if present
    @VTID(17)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject buildCoverageGraph(
            int cycleID);
    
    // Properties:
}
