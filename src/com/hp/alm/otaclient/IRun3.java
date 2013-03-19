package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a test run.
 */
@IID("{5DAAA2AE-3B2F-43F2-A43C-8AE9E2C35D41}")
public interface IRun3 extends com.hp.alm.otaclient.IRun2
{
    // Methods:
    /**
     * <p>
     * The run criterion factory for the current run.
     * </p>
     * <p>
     * Getter method for the COM property "RunCriterionFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(29)
    //= 0x1d. The runtime will prefer the VTID if present
    @VTID(40)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject runCriterionFactory();
    
    /**
     * <p>
     * The run iterations factory for the current run.
     * </p>
     * <p>
     * Getter method for the COM property "RunIterationFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(30)
    //= 0x1e. The runtime will prefer the VTID if present
    @VTID(41)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject runIterationFactory();
    
    /**
     * <p>
     * The run iterations parameters values.
     * </p>
     * <p>
     * Setter method for the COM property "RunIterationsParamsValues"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(31)
    //= 0x1f. The runtime will prefer the VTID if present
    @VTID(42)
    void runIterationsParamsValues(
            java.lang.String pVal);
    
    /**
     * <p>
     * The run iterations parameters values.
     * </p>
     * <p>
     * Getter method for the COM property "RunIterationsParamsValues"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(31)
    //= 0x1f. The runtime will prefer the VTID if present
    @VTID(43)
    java.lang.String runIterationsParamsValues();
    
    // Properties:
}
