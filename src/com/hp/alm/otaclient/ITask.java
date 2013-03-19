package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. An asynchronous action.
 */
@IID("{A646046A-2FCC-4489-9586-A49B9A59FAEA}")
public interface ITask extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * The current status of the task.
     * </p>
     * <p>
     * Getter method for the COM property "State"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(20)
    java.lang.String state();
    
    /**
     * <p>
     * The current status of the task.
     * </p>
     * <p>
     * Setter method for the COM property "State"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(21)
    void state(
            java.lang.String pVal);
    
    /**
     * <p>
     * The ITaskLogFactory used to log messages about this task.
     * </p>
     * <p>
     * Getter method for the COM property "TaskLogFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(22)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject taskLogFactory();
    
    // Properties:
}
