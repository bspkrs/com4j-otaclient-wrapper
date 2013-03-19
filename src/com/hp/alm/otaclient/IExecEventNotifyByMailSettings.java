package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents the notification to be sent by e-mail after a test has completed its run.
 */
@IID("{615FBF36-3E96-4C0F-9827-12FA20D13C58}")
public interface IExecEventNotifyByMailSettings extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The recipients' e-mail addresses.
     * </p>
     * <p>
     * Getter method for the COM property "EMailTo"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String eMailTo();
    
    /**
     * <p>
     * The recipients' e-mail addresses.
     * </p>
     * <p>
     * Setter method for the COM property "EMailTo"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(8)
    void eMailTo(
            java.lang.String pVal);
    
    /**
     * <p>
     * The message body of the e-mail.
     * </p>
     * <p>
     * Getter method for the COM property "UserMessage"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    java.lang.String userMessage();
    
    /**
     * <p>
     * The message body of the e-mail.
     * </p>
     * <p>
     * Setter method for the COM property "UserMessage"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(10)
    void userMessage(
            java.lang.String pVal);
    
    /**
     * <p>
     * Indicates if mail is enabled for the specified event type.
     * </p>
     * <p>
     * Getter method for the COM property "Enabled"
     * </p>
     * 
     * @param eventType Mandatory int parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(11)
    boolean enabled(
            int eventType);
    
    /**
     * <p>
     * Indicates if mail is enabled for the specified event type.
     * </p>
     * <p>
     * Setter method for the COM property "Enabled"
     * </p>
     * 
     * @param eventType Mandatory int parameter.
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(12)
    void enabled(
            int eventType,
            boolean pVal);
    
    /**
     * <p>
     * Uploads the notification settings to the server.
     * </p>
     * 
     * @param autoPost Optional parameter. Default value is false
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(13)
    void save(
            @Optional @DefaultValue("-1") boolean autoPost);
    
    // Properties:
}
