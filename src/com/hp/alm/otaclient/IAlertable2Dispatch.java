package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing auto-alerts.
 */
@IID("{F23D00D8-67CA-4B0E-B555-53CD2F226227}")
public interface IAlertable2Dispatch extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Removes an alert or alerts associated with the current object from the database.
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
     * Removes all current object alerts from the database.
     * </p>
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    void cleanAllAlerts();
    
    /**
     * <p>
     * Gets the alert specified by the alert ID.
     * </p>
     * 
     * @param id Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject getAlert(
            int id);
    
    /**
     * <p>
     * Gets a list of all alerts associated with the object.
     * </p>
     * 
     * @param needRefresh Optional parameter. Default value is false
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    com.hp.alm.otaclient.IList getAlertList(
            @Optional @DefaultValue("0") boolean needRefresh);
    
    /**
     * <p>
     * Checks if any alerts are associated with the object.
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    boolean hasAlerts();
    
    /**
     * <p>
     * New, unread alerts are associated with the object.
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(12)
    boolean hasNewAlerts();
    
    /**
     * <p>
     * Adds a new alert to the specified entity.
     * </p>
     * 
     * @param changedEntityType Mandatory java.lang.String parameter.
     * @param changedEntityID Mandatory int parameter.
     * @param alertSubject Mandatory java.lang.String parameter.
     * @param alertDescription Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(13)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addAlert(
            java.lang.String changedEntityType,
            int changedEntityID,
            java.lang.String alertSubject,
            java.lang.String alertDescription);
    
    // Properties:
}
