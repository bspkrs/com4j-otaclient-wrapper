package com.hp.alm.otaclient;

import com4j.*;

/**
 * The configuration of a custom automatic mail notification.
 */
@IID("{509C8491-47BF-454B-B899-852A55A17F46}")
public interface ICustomizationMailCondition extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The name of the mail recipient or the field containing the name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String name();
    
    /**
     * <p>
     * The filter to determine when the notification is sent.
     * </p>
     * <p>
     * Getter method for the COM property "ConditionText"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String conditionText();
    
    /**
     * <p>
     * The filter to determine when the notification is sent.
     * </p>
     * <p>
     * Setter method for the COM property "ConditionText"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    void conditionText(
            java.lang.String pVal);
    
    /**
     * <p>
     * Indicates if the condition object has changed locally since last synchronized with the server.
     * </p>
     * <p>
     * Getter method for the COM property "Updated"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(10)
    boolean updated();
    
    /**
     * <p>
     * Indicates if the condition object has changed locally since last synchronized with the server.
     * </p>
     * <p>
     * Setter method for the COM property "Updated"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(11)
    void updated(
            boolean pVal);
    
    /**
     * <p>
     * Indicates if the condition has been removed, but the deletion has not been posted to the server.
     * </p>
     * <p>
     * Getter method for the COM property "Deleted"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(12)
    boolean deleted();
    
    /**
     * <p>
     * Indicates if the condition has been removed, but the deletion has not been posted to the server.
     * </p>
     * <p>
     * Setter method for the COM property "Deleted"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(13)
    void deleted(
            boolean pVal);
    
    /**
     * <p>
     * The type of condition.
     * </p>
     * <p>
     * Getter method for the COM property "ConditionType"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(14)
    int conditionType();
    
    // Properties:
}
