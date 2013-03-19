package com.hp.alm.otaclient;

import com4j.*;

/**
 * Exposes the Win32 IErrorInfo interface to Quality Center applications.
 */
@IID("{DEBC6003-2ABE-4C93-A769-646F300A7986}")
public interface ITDErrorInfo extends com.hp.alm.otaclient.IErrorInfo
{
    // Methods:
    /**
     * <p>
     * Gets Error Details.
     * </p>
     * <p>
     * Getter method for the COM property "Details"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @VTID(8)
    java.lang.String details();
    
    // Properties:
}
