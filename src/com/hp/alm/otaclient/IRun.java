package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a test run.
 */
@IID("{34023178-4154-4B16-80A4-6C610096648A}")
public interface IRun extends com.hp.alm.otaclient.IBaseFieldEx
{
    // Methods:
    /**
     * <p>
     * The run result location, a UNC path.
     * </p>
     * <p>
     * Getter method for the COM property "ResultLocation"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(23)
    java.lang.String resultLocation();
    
    /**
     * <p>
     * The run name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(24)
    java.lang.String name();
    
    /**
     * <p>
     * The run name.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(25)
    void name(
            java.lang.String pVal);
    
    /**
     * <p>
     * The run status.
     * </p>
     * <p>
     * Getter method for the COM property "Status"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(26)
    java.lang.String status();
    
    /**
     * <p>
     * The run status.
     * </p>
     * <p>
     * Setter method for the COM property "Status"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(27)
    void status(
            java.lang.String pVal);
    
    /**
     * <p>
     * The Step Factory for the current run.
     * </p>
     * <p>
     * Getter method for the COM property "StepFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(28)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject stepFactory();
    
    /**
     * <p>
     * The test ID of the test that has been run.
     * </p>
     * <p>
     * Getter method for the COM property "TestId"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(29)
    int testId();
    
    /**
     * <p>
     * The ExtendedStorage object for the current run.
     * </p>
     * <p>
     * Getter method for the COM property "ExtendedStorage"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(30)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject extendedStorage();
    
    /**
     * <p>
     * Copies design steps into the test run of an executed test.
     * </p>
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(31)
    void copyDesignSteps();
    
    /**
     * <p>
     * Copies all run execution steps, including new added steps, into the design steps of the corresponding planning test.
     * </p>
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(32)
    void copyStepsToTest();
    
    /**
     * <p>
     * The ID of the test set to which the run belongs.
     * </p>
     * <p>
     * Getter method for the COM property "TestSetID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(33)
    int testSetID();
    
    /**
     * <p>
     * Deprecated. Use ParameterValueFactory of ISupportParameterValues. The step parameters of this run.
     * </p>
     * <p>
     * Getter method for the COM property "Params"
     * </p>
     * 
     * @param sourceMode Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(34)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject params(
            int sourceMode);
    
    /**
     * <p>
     * Updates the texts of the run's steps by resolving the parameter values at run time.
     * </p>
     * 
     * @param updateLocalCache Optional parameter. Default value is false
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(35)
    void resolveStepsParameters(
            @Optional @DefaultValue("-1") boolean updateLocalCache);
    
    /**
     * <p>
     * The number of this instance of the design test in the test set.
     * </p>
     * <p>
     * Getter method for the COM property "TestInstance"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(25)
    //= 0x19. The runtime will prefer the VTID if present
    @VTID(36)
    int testInstance();
    
    /**
     * <p>
     * Cancels the run.
     * </p>
     */
    
    @DISPID(26)
    //= 0x1a. The runtime will prefer the VTID if present
    @VTID(37)
    void cancelRun();
    
    // Properties:
}
