package com.hp.alm.otaclient;

import com4j.*;

/**
 * IFieldProperty4 Interface.
 */
@IID("{9C5C5CEF-82D1-48E2-AA3E-44EE0EBB3D03}")
public interface IFieldProperty4 extends com.hp.alm.otaclient.IFieldProperty3
{
    // Methods:
    /**
     * <p>
     * Checks whether the field originated from the project template.
     * </p>
     * <p>
     * Getter method for the COM property "IsTemplate"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(32)
    //= 0x20. The runtime will prefer the VTID if present
    @VTID(39)
    boolean isTemplate();
    
    // Properties:
}
