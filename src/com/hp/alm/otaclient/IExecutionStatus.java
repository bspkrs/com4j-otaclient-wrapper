package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents the execution status of the scheduler. The user can scan through each test in the scheduler.
 */
@IID("{D367F107-1BCE-4AAB-8E6B-BF6399BD64FC}")
public interface IExecutionStatus extends Com4jObject, Iterable<Com4jObject>
{
    // Methods:
    /**
     * <p>
     * The number of status elements in the object.
     * </p>
     * <p>
     * Getter method for the COM property "Count"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    int count();
    
    /**
     * <p>
     * Refreshes the execution status from the execution controller.
     * </p>
     * 
     * @param testData Mandatory java.lang.Object parameter.
     * @param force Mandatory boolean parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    void refreshExecStatusInfo(
            @MarshalAs(NativeType.VARIANT) java.lang.Object testData,
            boolean force);
    
    /**
     * <p>
     * Checks if execution is finished or still in progress.
     * </p>
     * <p>
     * Getter method for the COM property "Finished"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    boolean finished();
    
    /**
     * <p>
     * Gets the list of the execution events.
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    com.hp.alm.otaclient.IList eventsList();
    
    @VTID(10)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object eventsList(
            int index);
    
    /**
     * <p>
     * Gets a TestExecStatus object by index (1-based).
     * </p>
     * <p>
     * Getter method for the COM property "Item"
     * </p>
     * 
     * @param index Mandatory int parameter.
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(0)
    //= 0x0. The runtime will prefer the VTID if present
    @VTID(11)
    @DefaultMethod
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object item(
            int index);
    
    /**
     * <p>
     * Gets an ATL.IEnumOnSTLImpl enumerator for the TestExecStatus objects. For information on the ATL Class and IEnumOnSTLImpl, see
     * Microsoft documentation.
     * </p>
     * <p>
     * Getter method for the COM property "_NewEnum"
     * </p>
     */
    
    @DISPID(-4)
    //= 0xfffffffc. The runtime will prefer the VTID if present
    @VTID(12)
    java.util.Iterator<Com4jObject> iterator();
    
    // Properties:
}
