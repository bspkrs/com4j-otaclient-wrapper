package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a requirement that is covered by another entity.
 */
@IID("{508A2893-CFD1-44DE-A639-997EF05D7B56}")
public interface ICoverableReq2 extends com.hp.alm.otaclient.ICoverableReq
{
    // Methods:
    /**
     * <p>
     * Adds a list of test criteria to the coverage.
     * </p>
     * 
     * @param testCriterionIDs Mandatory java.lang.Object parameter.
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(12)
    void addCriteriaToCoverage(
            @MarshalAs(NativeType.VARIANT) java.lang.Object testCriterionIDs);
    
    /**
     * <p>
     * Adds a list of test configurations to the coverage.
     * </p>
     * 
     * @param configurationIDs Mandatory java.lang.Object parameter.
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(13)
    void addConfigurationsToCoverage(
            @MarshalAs(NativeType.VARIANT) java.lang.Object configurationIDs);
    
    // Properties:
}
