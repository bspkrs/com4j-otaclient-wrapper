package com.hp.alm.otaclient;

import com4j.*;

/**
 * Support execution report settings.
 */
@IID("{21A270B7-770F-497F-91B3-0562C62A3A8E}")
public interface ITestSet2 extends com.hp.alm.otaclient.ITestSet
{
    // Methods:
    /**
     * <p>
     * Gets the execution report settings for the current test set.
     * </p>
     * <p>
     * Getter method for the COM property "ExecutionReportSettings"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(31)
    //= 0x1f. The runtime will prefer the VTID if present
    @VTID(43)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject executionReportSettings();
    
    // Properties:
}
