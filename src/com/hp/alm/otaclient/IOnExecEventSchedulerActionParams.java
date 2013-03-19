package com.hp.alm.otaclient;

import com4j.*;

/**
 * Handles the action parameter list.
 */
@IID("{CBD80CD0-1961-4191-A318-ABC50AB2ACD9}")
public interface IOnExecEventSchedulerActionParams extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The action to be taken.
     * </p>
     * <p>
     * Getter method for the COM property "OnExecEventSchedulerAction"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    int onExecEventSchedulerAction();
    
    /**
     * <p>
     * For HP use. Gets or set the value of the specified action parameter.
     * </p>
     * <p>
     * Setter method for the COM property "Parameter"
     * </p>
     * 
     * @param index Mandatory int parameter.
     * @param vVal Mandatory java.lang.Object parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    void parameter(
            int index,
            @MarshalAs(NativeType.VARIANT) java.lang.Object vVal);
    
    /**
     * <p>
     * For HP use. Gets or set the value of the specified action parameter.
     * </p>
     * <p>
     * Getter method for the COM property "Parameter"
     * </p>
     * 
     * @param index Mandatory int parameter.
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object parameter(
            int index);
    
    // Properties:
}
