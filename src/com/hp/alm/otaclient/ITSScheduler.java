package com.hp.alm.otaclient;

import com4j.*;

/**
 * Responsible for executing selected automated tests.
 */
@IID("{E99AC0C8-46AB-42C3-9CB2-9C9AEC35A861}")
public interface ITSScheduler extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Starts execution the test set or of the specified tests.
     * </p>
     * 
     * @param testData Optional parameter. Default value is com4j.Variant.getMissing()
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    void run(
            @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object testData);
    
    /**
     * <p>
     * Stops execution of the test set or the specified tests.
     * </p>
     * 
     * @param testData Optional parameter. Default value is com4j.Variant.getMissing()
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    void stop(
            @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object testData);
    
    /**
     * <p>
     * Indicates if logging is enabled.
     * </p>
     * <p>
     * Getter method for the COM property "LogEnabled"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    boolean logEnabled();
    
    /**
     * <p>
     * Indicates if logging is enabled.
     * </p>
     * <p>
     * Setter method for the COM property "LogEnabled"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(10)
    void logEnabled(
            boolean pVal);
    
    /**
     * <p>
     * The host on which to run all tests in the current scheduler execution.
     * </p>
     * <p>
     * Getter method for the COM property "TdHostName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(11)
    java.lang.String tdHostName();
    
    /**
     * <p>
     * The host on which to run all tests in the current scheduler execution.
     * </p>
     * <p>
     * Setter method for the COM property "TdHostName"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(12)
    void tdHostName(
            java.lang.String pVal);
    
    /**
     * <p>
     * The time to wait for response before either sending test to another host in group or failing.
     * </p>
     * <p>
     * Getter method for the COM property "HostTimeOut"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(13)
    int hostTimeOut();
    
    /**
     * <p>
     * The time to wait for response before either sending test to another host in group or failing.
     * </p>
     * <p>
     * Setter method for the COM property "HostTimeOut"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(14)
    void hostTimeOut(
            int pVal);
    
    /**
     * <p>
     * Indicates if all tests are to be run on the local host.
     * </p>
     * <p>
     * Getter method for the COM property "RunAllLocally"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(15)
    boolean runAllLocally();
    
    /**
     * <p>
     * Indicates if all tests are to be run on the local host.
     * </p>
     * <p>
     * Setter method for the COM property "RunAllLocally"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(16)
    void runAllLocally(
            boolean pVal);
    
    /**
     * <p>
     * The execution status object for the scheduler execution.
     * </p>
     * <p>
     * Getter method for the COM property "ExecutionStatus"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(17)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject executionStatus();
    
    /**
     * <p>
     * The execution error or log message sent by the remote agent.
     * </p>
     * <p>
     * Getter method for the COM property "ExecutionLog"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(18)
    java.lang.String executionLog();
    
    /**
     * <p>
     * The host on which to execute the test instance.
     * </p>
     * <p>
     * Getter method for the COM property "RunOnHost"
     * </p>
     * 
     * @param tsTestId Mandatory java.lang.Object parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(19)
    java.lang.String runOnHost(
            @MarshalAs(NativeType.VARIANT) java.lang.Object tsTestId);
    
    /**
     * <p>
     * The host on which to execute the test instance.
     * </p>
     * <p>
     * Setter method for the COM property "RunOnHost"
     * </p>
     * 
     * @param tsTestId Mandatory java.lang.Object parameter.
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(20)
    void runOnHost(
            @MarshalAs(NativeType.VARIANT) java.lang.Object tsTestId,
            java.lang.String pVal);
    
    /**
     * <p>
     * Obsolete. Do not invoke.
     * </p>
     * <p>
     * Getter method for the COM property "VM_Config"
     * </p>
     * 
     * @param tsTestId Mandatory java.lang.Object parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(21)
    java.lang.String vM_Config(
            @MarshalAs(NativeType.VARIANT) java.lang.Object tsTestId);
    
    /**
     * <p>
     * Obsolete. Do not invoke.
     * </p>
     * <p>
     * Setter method for the COM property "VM_Config"
     * </p>
     * 
     * @param tsTestId Mandatory java.lang.Object parameter.
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(22)
    void vM_Config(
            @MarshalAs(NativeType.VARIANT) java.lang.Object tsTestId,
            java.lang.String pVal);
    
    // Properties:
}
