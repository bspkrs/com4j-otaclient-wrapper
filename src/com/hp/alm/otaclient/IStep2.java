package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a test step in a test run.
 */
@IID("{5FF530DD-245E-4F97-A59F-3DE69FFCC55E}")
public interface IStep2 extends com.hp.alm.otaclient.IStep
{
    // Methods:
    /**
     * <p>
     * The BPStepParamFactory for the current step.
     * </p>
     * <p>
     * Getter method for the COM property "BPStepParamFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(30)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bpStepParamFactory();
    
    /**
     * <p>
     * Gets the Run object handling this step.
     * </p>
     * <p>
     * Getter method for the COM property "Run"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(31)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject run();
    
    // Properties:
}
