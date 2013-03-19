package com.hp.alm.otaclient;

import com4j.*;

/**
 * The execution information of the scheduler. This object handles the actual, not the planned, information.
 */
@IID("{5377347E-3F8D-4B54-B962-18527B652EDD}")
public interface IExecEventInfo extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The type of Execution Event.
     * </p>
     * <p>
     * Getter method for the COM property "EventType"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    int eventType();
    
    /**
     * <p>
     * The Execution Event Time.
     * </p>
     * <p>
     * Getter method for the COM property "EventTime"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String eventTime();
    
    /**
     * <p>
     * The Execution Event Date.
     * </p>
     * <p>
     * Getter method for the COM property "EventDate"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    java.lang.String eventDate();
    
    /**
     * <p>
     * For HP use. Gets the specified Execution Event Parameter.
     * </p>
     * <p>
     * Getter method for the COM property "EventParam"
     * </p>
     * 
     * @param paramName Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    java.lang.String eventParam(
            java.lang.String paramName);
    
    // Properties:
}
