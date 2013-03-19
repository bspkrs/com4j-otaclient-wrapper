package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing releases.
 */
@IID("{A11A2CBD-C066-4E20-9F2B-73F88AB32198}")
public interface IReleaseFactory extends com.hp.alm.otaclient.IBaseFactoryEx
{
    // Methods:
    /**
     * <p>
     * Builds release coverage graph.
     * </p>
     * 
     * @param releaseID Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1610874880)
    //= 0x60040000. The runtime will prefer the VTID if present
    @VTID(17)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject buildCoverageGraph(
            int releaseID);
    
    // Properties:
}
