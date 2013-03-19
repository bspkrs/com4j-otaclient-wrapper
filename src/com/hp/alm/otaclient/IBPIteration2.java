package com.hp.alm.otaclient;

import com4j.*;

/**
 * The design-time definition of a business component iteration.
 */
@IID("{A6366405-A4BD-4FD9-9335-3EEEBFA053FB}")
public interface IBPIteration2 extends com.hp.alm.otaclient.IBPIteration
{
    // Methods:
    /**
     * <p>
     * The BPIterationParamFactory for this Business Process Iteration.
     * </p>
     * <p>
     * Getter method for the COM property "BPIterationParamFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(27)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bpIterationParamFactory();
    
    // Properties:
}
