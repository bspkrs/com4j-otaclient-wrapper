package com.hp.alm.otaclient;

import com4j.*;

/**
 * A requirement coverage by a test criterion.
 */
@IID("{6A8D33B4-96CE-4FC4-9B26-F687F46DCB34}")
public interface ICriterionCoverage extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * The status of the criterion coverage.
     * </p>
     * <p>
     * Getter method for the COM property "Status"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(20)
    java.lang.String status();
    
    /**
     * <p>
     * The criterion covering the requirement.
     * </p>
     * <p>
     * Getter method for the COM property "Criterion"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(12)
    //= 0xc. The runtime will prefer the VTID if present
    @VTID(21)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject criterion();
    
    // Properties:
}
