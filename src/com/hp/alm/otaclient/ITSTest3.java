package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents an instance of a Test in a test set.
 */
@IID("{B6B04317-CD2C-4002-BE07-6F421EA4CF1B}")
public interface ITSTest3 extends com.hp.alm.otaclient.ITSTest2
{
    // Methods:
    /**
     * <p>
     * Generates an XML description of the test instance.
     * </p>
     * 
     * @param showDesignSteps Mandatory boolean parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(30)
    //= 0x1e. The runtime will prefer the VTID if present
    @VTID(42)
    java.lang.String generateXMLDescription(
            boolean showDesignSteps);
    
    /**
     * <p>
     * The test configuration used by this test instance for the run.
     * </p>
     * <p>
     * Getter method for the COM property "TestConfiguration"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(31)
    //= 0x1f. The runtime will prefer the VTID if present
    @VTID(43)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject testConfiguration();
    
    /**
     * <p>
     * Generates a new Configuration based on this test instance. Connects the instance to the new created configuration, and returns its
     * ID.
     * </p>
     * 
     * @param testConfigurationName Mandatory java.lang.String parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(32)
    //= 0x20. The runtime will prefer the VTID if present
    @VTID(44)
    int generateTestConfiguration(
            java.lang.String testConfigurationName);
    
    // Properties:
}
