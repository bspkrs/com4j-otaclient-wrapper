package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a test run.
 */
@IID("{16EF2BF4-8509-475E-B34E-3BF99C221221}")
public interface IRun2 extends com.hp.alm.otaclient.IRun
{
    // Methods:
    /**
     * <p>
     * The BPStepParamFactory for the current run.
     * </p>
     * <p>
     * Getter method for the COM property "BPStepParamFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(27)
    //= 0x1b. The runtime will prefer the VTID if present
    @VTID(38)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject bpStepParamFactory();
    
    /**
     * <p>
     * The ID of the test instance for the current run.
     * </p>
     * <p>
     * Getter method for the COM property "TestInstanceID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(28)
    //= 0x1c. The runtime will prefer the VTID if present
    @VTID(39)
    int testInstanceID();
    
    // Properties:
}
