package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use only. Allows controlling whether TDFilter should force refresh.
 */
@IID("{A0B24B8B-86AC-45F0-9B24-1111FFA49EBD}")
public interface _ISupportForceRefresh extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * For HP use only. Should Refresh be Forced.
     * </p>
     * <p>
     * Getter method for the COM property "ForceRefresh"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @VTID(3)
    boolean forceRefresh();
    
    /**
     * <p>
     * For HP use only. Should Refresh be Forced.
     * </p>
     * <p>
     * Setter method for the COM property "ForceRefresh"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @VTID(4)
    void forceRefresh(
            boolean pVal);
    
    // Properties:
}
