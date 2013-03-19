package com.hp.alm.otaclient;

import com4j.*;

/**
 * Support for hash generation.
 */
@IID("{5073A186-2A46-4C93-A3F5-F8C0AA66694F}")
public interface IAmarillusHash extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Gets a Hash generated from the input value.
     * </p>
     * 
     * @param value Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String generateHash(
            java.lang.String value);
    
    // Properties:
}
