package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. An entry in the log of an asynchronous action.
 */
@IID("{E489B9B0-FBC5-42D6-9042-EAE139E2A093}")
public interface ITaskLog extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * The severity levels for the task log entries.
     * </p>
     * <p>
     * Getter method for the COM property "TaskLogType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(20)
    java.lang.String taskLogType();
    
    /**
     * <p>
     * The severity levels for the task log entries.
     * </p>
     * <p>
     * Setter method for the COM property "TaskLogType"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(21)
    void taskLogType(
            java.lang.String pVal);
    
    // Properties:
}
