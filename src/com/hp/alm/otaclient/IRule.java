package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a rule for generating an alert.
 */
@IID("{5186B0F4-DAC2-4ABD-B248-8ED6E852C40D}")
public interface IRule extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The rule ID.
     * </p>
     * <p>
     * Getter method for the COM property "ID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    int id();
    
    /**
     * <p>
     * Indicates if the rule is active.
     * </p>
     * <p>
     * Getter method for the COM property "IsActive"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    boolean isActive();
    
    /**
     * <p>
     * Indicates if the rule is active.
     * </p>
     * <p>
     * Setter method for the COM property "IsActive"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    void isActive(
            boolean pVal);
    
    /**
     * <p>
     * Indicates if the alert is to be sent by e-mail.
     * </p>
     * <p>
     * Getter method for the COM property "ToMail"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(10)
    boolean toMail();
    
    /**
     * <p>
     * Indicates if the alert is to be sent by e-mail.
     * </p>
     * <p>
     * Setter method for the COM property "ToMail"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(11)
    void toMail(
            boolean pVal);
    
    /**
     * <p>
     * The rule description.
     * </p>
     * <p>
     * Getter method for the COM property "Description"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(12)
    java.lang.String description();
    
    /**
     * <p>
     * Saves the changes to the Rules object to the server.
     * </p>
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(13)
    void post();
    
    // Properties:
}
