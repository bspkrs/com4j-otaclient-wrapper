package com.hp.alm.otaclient;

import com4j.*;

/**
 * BP Models factory.
 */
@IID("{EAB0B318-2A2F-4297-AD60-4DDE858DCBE4}")
public interface IBPModelFactory2 extends com.hp.alm.otaclient.IBPModelFactory
{
    // Methods:
    /**
     * <p>
     * For HP use.
     * </p>
     * 
     * @param valToCheck Mandatory java.lang.String parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(18)
    boolean isNotationSupported(
            java.lang.String valToCheck);
    
    /**
     * <p>
     * For HP use.
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(19)
    boolean addEPCTypesSupport();
    
    // Properties:
}
