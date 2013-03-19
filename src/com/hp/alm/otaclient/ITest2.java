package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a planning test.
 */
@IID("{1D6FAE65-37C8-4535-A8ED-9B4489A6AFDB}")
public interface ITest2 extends com.hp.alm.otaclient.ITest
{
    // Methods:
    /**
     * <p>
     * The test criterion factory for the test.
     * </p>
     * <p>
     * Getter method for the COM property "TestCriterionFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(35)
    //= 0x23. The runtime will prefer the VTID if present
    @VTID(48)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject testCriterionFactory();
    
    /**
     * <p>
     * The test configuration factory for the test.
     * </p>
     * <p>
     * Getter method for the COM property "TestConfigFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(36)
    //= 0x24. The runtime will prefer the VTID if present
    @VTID(49)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject testConfigFactory();
    
    /**
     * <p>
     * Number of configurations the Test has.
     * </p>
     * <p>
     * Getter method for the COM property "NumOfConfigurations"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(37)
    //= 0x25. The runtime will prefer the VTID if present
    @VTID(50)
    int numOfConfigurations();
    
    /**
     * <p>
     * Checks whether the test has criteria.
     * </p>
     * <p>
     * Getter method for the COM property "HasCriteria"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(38)
    //= 0x26. The runtime will prefer the VTID if present
    @VTID(51)
    boolean hasCriteria();
    
    /**
     * <p>
     * For HP use. Get Business Process Interface of Test.
     * </p>
     * <p>
     * Getter method for the COM property "QueryBusinessProcessInterface"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(39)
    //= 0x27. The runtime will prefer the VTID if present
    @VTID(52)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject queryBusinessProcessInterface();
    
    // Properties:
}
