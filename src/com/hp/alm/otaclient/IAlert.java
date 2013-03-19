package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a notification sent to the user.
 */
@IID("{A1314B45-32F6-4841-9EB6-922EC4A76CB2}")
public interface IAlert extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The description of the alert.
     * </p>
     * <p>
     * Getter method for the COM property "Description"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String description();
    
    /**
     * <p>
     * The date that the alert was generated, based on the database server clock.
     * </p>
     * <p>
     * Getter method for the COM property "AlertDate"
     * </p>
     * 
     * @return Returns a value of type java.util.Date
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    java.util.Date alertDate();
    
    /**
     * <p>
     * The alert or follow-up ID.
     * </p>
     * <p>
     * Getter method for the COM property "ID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    int id();
    
    /**
     * <p>
     * The type of alert generated: Alert or Follow-up.
     * </p>
     * <p>
     * Getter method for the COM property "AlertType"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    int alertType();
    
    /**
     * <p>
     * If true, the alert or follow-up has not yet been read.
     * </p>
     * <p>
     * Getter method for the COM property "Unread"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    boolean unread();
    
    /**
     * <p>
     * If true, the alert or follow-up has not yet been read.
     * </p>
     * <p>
     * Setter method for the COM property "Unread"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(12)
    void unread(
            boolean pVal);
    
    /**
     * <p>
     * A short summary appropriate to be used as subject line of the Alert e-mail.
     * </p>
     * <p>
     * Getter method for the COM property "Subject"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(13)
    java.lang.String subject();
    
    /**
     * <p>
     * For HP use. The location of the parent object to which the alert or follow-up is related.
     * </p>
     * <p>
     * Getter method for the COM property "ParentEntityURL"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(14)
    java.lang.String parentEntityURL();
    
    // Properties:
}
