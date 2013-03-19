package com.hp.alm.otaclient;

import com4j.*;

/**
 * Services for managing auto-alerts.
 */
@IID("{101CD251-91FB-4FB0-A440-DE755D905584}")
public interface IAlertable extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Removes an alert or alerts associated with the current object from the database.
     * </p>
     * 
     * @param iDs Mandatory java.lang.Object parameter.
     */
    
    @DISPID(1610678272)
    //= 0x60010000. The runtime will prefer the VTID if present
    @VTID(3)
    void deleteAlert(
            @MarshalAs(NativeType.VARIANT) java.lang.Object iDs);
    
    /**
     * <p>
     * Removes all current object alerts from the database.
     * </p>
     */
    
    @DISPID(1610678273)
    //= 0x60010001. The runtime will prefer the VTID if present
    @VTID(4)
    void cleanAllAlerts();
    
    /**
     * <p>
     * Gets the alert specified by the alert ID.
     * </p>
     * 
     * @param id Mandatory int parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1610678274)
    //= 0x60010002. The runtime will prefer the VTID if present
    @VTID(5)
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
    
    @DISPID(1610678275)
    //= 0x60010003. The runtime will prefer the VTID if present
    @VTID(6)
    com.hp.alm.otaclient.IList getAlertList(
            @Optional @DefaultValue("0") boolean needRefresh);
    
    /**
     * <p>
     * Checks if any alerts are associated with the object.
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(1610678276)
    //= 0x60010004. The runtime will prefer the VTID if present
    @VTID(7)
    boolean hasAlerts();
    
    /**
     * <p>
     * New, unread alerts are associated with the object.
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(1610678277)
    //= 0x60010005. The runtime will prefer the VTID if present
    @VTID(8)
    boolean hasNewAlerts();
    
    // Properties:
}
