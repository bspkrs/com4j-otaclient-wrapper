package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents an instance of a Test in a test set.
 */
@IID("{FFE8FF09-7522-448E-933E-724B6A149887}")
public interface ITSTest extends com.hp.alm.otaclient.IBaseFieldEx
{
    // Methods:
    /**
     * <p>
     * The test instance's execution status.
     * </p>
     * <p>
     * Getter method for the COM property "Status"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(23)
    java.lang.String status();
    
    /**
     * <p>
     * The test instance's execution status.
     * </p>
     * <p>
     * Setter method for the COM property "Status"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(24)
    void status(
            java.lang.String pVal);
    
    /**
     * <p>
     * The Run Factory for this test instance.
     * </p>
     * <p>
     * Getter method for the COM property "RunFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(25)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject runFactory();
    
    /**
     * <p>
     * The planning test of which this is an instance.
     * </p>
     * <p>
     * Getter method for the COM property "Test"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(26)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject test();
    
    /**
     * <p>
     * The name of the host planned to run this test instance.
     * </p>
     * <p>
     * Getter method for the COM property "HostName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(27)
    java.lang.String hostName();
    
    /**
     * <p>
     * The name of the host planned to run this test instance.
     * </p>
     * <p>
     * Setter method for the COM property "HostName"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(28)
    void hostName(
            java.lang.String pVal);
    
    /**
     * <p>
     * The name of this test instance. By convention, this is the test instance number and the test name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(29)
    java.lang.String name();
    
    /**
     * <p>
     * The test type.
     * </p>
     * <p>
     * Getter method for the COM property "Type"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(30)
    java.lang.String type();
    
    /**
     * <p>
     * Checks if the planning test specified by the Test property has design steps.
     * </p>
     * <p>
     * Getter method for the COM property "HasSteps"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(31)
    boolean hasSteps();
    
    /**
     * <p>
     * The execution parameters for this test instance.
     * </p>
     * <p>
     * Getter method for the COM property "ExecutionParams"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(32)
    java.lang.String executionParams();
    
    /**
     * <p>
     * The execution parameters for this test instance.
     * </p>
     * <p>
     * Setter method for the COM property "ExecutionParams"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(33)
    void executionParams(
            java.lang.String pVal);
    
    /**
     * <p>
     * The Run object of the last run.
     * </p>
     * <p>
     * Getter method for the COM property "LastRun"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(34)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject lastRun();
    
    /**
     * <p>
     * Deprecated. Use ParameterValueFactory of ISupportParameterValues. The step parameters for this execution test.
     * </p>
     * <p>
     * Getter method for the COM property "Params"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(35)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject params();
    
    /**
     * <p>
     * The execution settings for this test instance.
     * </p>
     * <p>
     * Getter method for the COM property "ExecutionSettings"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(36)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject executionSettings();
    
    /**
     * <p>
     * The ID of the planning test of which this is an instance.
     * </p>
     * <p>
     * Getter method for the COM property "TestId"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(25)
    //= 0x19. The runtime will prefer the VTID if present
    @VTID(37)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object testId();
    
    /**
     * <p>
     * The instance number of this test instance in the test set, within the other instances of the same test.
     * </p>
     * <p>
     * Getter method for the COM property "Instance"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(26)
    //= 0x1a. The runtime will prefer the VTID if present
    @VTID(38)
    int instance();
    
    /**
     * <p>
     * The name of the planning test of which this is an instance.
     * </p>
     * <p>
     * Getter method for the COM property "TestName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(27)
    //= 0x1b. The runtime will prefer the VTID if present
    @VTID(39)
    java.lang.String testName();
    
    /**
     * <p>
     * The test set to which the test instance belongs.
     * </p>
     * <p>
     * Getter method for the COM property "TestSet"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(28)
    //= 0x1c. The runtime will prefer the VTID if present
    @VTID(40)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject testSet();
    
    // Properties:
}
