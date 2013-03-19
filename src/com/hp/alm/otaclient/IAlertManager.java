package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing alerts.
 */
@IID("{7A0B3B0B-60C4-4B84-8A35-1E9337AD055E}")
public interface IAlertManager extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Removes an alert or alerts related to the current object from the database.
     * </p>
     * 
     * @param iDs Mandatory java.lang.Object parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    void deleteAlert(
            @MarshalAs(NativeType.VARIANT) java.lang.Object iDs);
    
    /**
     * <p>
     * Removes all current alerts from the database.
     * </p>
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    void cleanAllAlerts();
    
    /**
     * <p>
     * Gets the Alert object for the alert with the specified ID.
     * </p>
     * <p>
     * Getter method for the COM property "Alert"
     * </p>
     * 
     * @param id Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject alert(
            int id);
    
    /**
     * <p>
     * The list of user alerts.
     * </p>
     * <p>
     * Getter method for the COM property "AlertList"
     * </p>
     * 
     * @param entityType Mandatory java.lang.String parameter.
     * @param needRefresh Optional parameter. Default value is false
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    com.hp.alm.otaclient.IList alertList(
            java.lang.String entityType,
            @Optional @DefaultValue("0") boolean needRefresh);
    
    // Properties:
}
