package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a release or cycle.
 */
@IID("{F14FB85C-6419-442F-B1DF-5CC4969695D9}")
public interface IReleaseManagementInfo extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Returns the duration of the cycle or release.
     * </p>
     * <p>
     * Getter method for the COM property "Duration"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    int duration();
    
    /**
     * <p>
     * Returns the number of days remaining in the cycle or release.
     * </p>
     * <p>
     * Getter method for the COM property "DaysLeft"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    int daysLeft();
    
    /**
     * <p>
     * Returns the total number of test instances in this cycle or release.
     * </p>
     * <p>
     * Getter method for the COM property "TotalTestInstances"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    int totalTestInstances();
    
    /**
     * <p>
     * Returns the number of unexecuted test instances in this cycle or release.
     * </p>
     * <p>
     * Getter method for the COM property "UnexecutedTestInstances"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    int unexecutedTestInstances();
    
    /**
     * <p>
     * Checks if the cycle or release has begun.
     * </p>
     * <p>
     * Getter method for the COM property "Started"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    boolean started();
    
    // Properties:
}
