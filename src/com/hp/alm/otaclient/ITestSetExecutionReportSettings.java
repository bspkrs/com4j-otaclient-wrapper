package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents the notification to be sent by e-mail after a test set has completed its run.
 */
@IID("{47D3C83A-457B-4E4F-9BF8-4EDDB6524051}")
public interface ITestSetExecutionReportSettings extends Com4jObject
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
     * The Run Fields included in report.
     * </p>
     * <p>
     * Getter method for the COM property "RunFields"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    java.lang.String runFields();
    
    /**
     * <p>
     * The Run Fields included in report.
     * </p>
     * <p>
     * Setter method for the COM property "RunFields"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(10)
    void runFields(
            java.lang.String pVal);
    
    /**
     * <p>
     * Indicates if mail notification is enabled.
     * </p>
     * <p>
     * Getter method for the COM property "Enabled"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(11)
    boolean enabled();
    
    /**
     * <p>
     * Indicates if mail notification is enabled.
     * </p>
     * <p>
     * Setter method for the COM property "Enabled"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(12)
    void enabled(
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
