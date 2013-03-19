package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. ITDUtils Interface.
 */
@IID("{BB603787-CBD0-48CD-AA8A-B4532DC714D1}")
public interface ITDUtils extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * method Encrypt.
     * </p>
     * 
     * @param strToEncrypt Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String encrypt(
            java.lang.String strToEncrypt);
    
    /**
     * <p>
     * property CurrentTimeStamp.
     * </p>
     * <p>
     * Getter method for the COM property "CurrentTimeStamp"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String currentTimeStamp();
    
    // Properties:
}
