package com.hp.alm.otaclient;

import com4j.*;

/**
 * The association between a requirement and a test that covers it.
 */
@IID("{1EB54D60-8266-4FE4-8752-2F99BF34ED13}")
public interface ITestCoverage extends com.hp.alm.otaclient.ICoverageEntity
{
    // Methods:
    /**
     * <p>
     * The ICriterionCoverageFactory for the test coverage entity.
     * </p>
     * <p>
     * Getter method for the COM property "CriterionCoverageFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(25)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject criterionCoverageFactory();
    
    /**
     * <p>
     * The IConfigurationCoverageFactory for the test coverage entity.
     * </p>
     * <p>
     * Getter method for the COM property "ConfigurationCoverageFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(26)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject configurationCoverageFactory();
    
    // Properties:
}
