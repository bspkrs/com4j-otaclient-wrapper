package com.hp.alm.otaclient;

import com4j.*;

/**
 * Information on the execution of a test set.
 */
@IID("{41120F91-BBBE-4913-975D-5346234765A6}")
public interface IExecutionSettings extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The planned test execution time.
     * </p>
     * <p>
     * Setter method for the COM property "PlannedExecutionTime"
     * </p>
     * 
     * @param vVal Mandatory java.lang.Object parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    void plannedExecutionTime(
            @MarshalAs(NativeType.VARIANT) java.lang.Object vVal);
    
    /**
     * <p>
     * The planned test execution time.
     * </p>
     * <p>
     * Getter method for the COM property "PlannedExecutionTime"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(8)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object plannedExecutionTime();
    
    /**
     * <p>
     * The planned test execution date.
     * </p>
     * <p>
     * Setter method for the COM property "PlannedExecutionDate"
     * </p>
     * 
     * @param vVal Mandatory java.lang.Object parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    void plannedExecutionDate(
            @MarshalAs(NativeType.VARIANT) java.lang.Object vVal);
    
    /**
     * <p>
     * The planned test execution date.
     * </p>
     * <p>
     * Getter method for the COM property "PlannedExecutionDate"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(10)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object plannedExecutionDate();
    
    /**
     * <p>
     * The planned test run duration.
     * </p>
     * <p>
     * Setter method for the COM property "PlannedRunDuration"
     * </p>
     * 
     * @param vVal Mandatory java.lang.Object parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(11)
    void plannedRunDuration(
            @MarshalAs(NativeType.VARIANT) java.lang.Object vVal);
    
    /**
     * <p>
     * The planned test run duration.
     * </p>
     * <p>
     * Getter method for the COM property "PlannedRunDuration"
     * </p>
     * 
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(12)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object plannedRunDuration();
    
    /**
     * <p>
     * The action type of the execution event.
     * </p>
     * <p>
     * Getter method for the COM property "OnExecEventSchedulerActionType"
     * </p>
     * 
     * @param eventType Mandatory int parameter.
     * @return Returns a value of type int
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(13)
    int onExecEventSchedulerActionType(
            int eventType);
    
    /**
     * <p>
     * The action type of the execution event.
     * </p>
     * <p>
     * Setter method for the COM property "OnExecEventSchedulerActionType"
     * </p>
     * 
     * @param eventType Mandatory int parameter.
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(14)
    void onExecEventSchedulerActionType(
            int eventType,
            int pVal);
    
    /**
     * <p>
     * The restart action parameters.
     * </p>
     * <p>
     * Getter method for the COM property "OnExecEventSchedulerActionParams"
     * </p>
     * 
     * @param eventType Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(15)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject onExecEventSchedulerActionParams(
            int eventType);
    
    // Properties:
}
