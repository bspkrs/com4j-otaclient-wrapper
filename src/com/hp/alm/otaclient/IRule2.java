package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a rule for generating an alert.
 */
@IID("{2B4FDFEF-7FD6-4152-944D-11E5D938ACB6}")
public interface IRule2 extends com.hp.alm.otaclient.IRule
{
    // Methods:
    /**
     * <p>
     * Returns the user name of the recipient of the alert email.
     * </p>
     * <p>
     * Getter method for the COM property "Recipient"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(14)
    java.lang.String recipient();
    
    // Properties:
}
