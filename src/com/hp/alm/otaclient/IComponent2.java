package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a single Business Process Component.
 */
@IID("{9C73D97C-604D-4216-BA26-9008C685C108}")
public interface IComponent2 extends com.hp.alm.otaclient.IComponent
{
    // Methods:
    /**
     * <p>
     * For HP use. Checks whether a SAP component is change detectable.
     * </p>
     * <p>
     * Getter method for the COM property "IsChangeDetectable"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(31)
    //= 0x1f. The runtime will prefer the VTID if present
    @VTID(42)
    boolean isChangeDetectable();
    
    /**
     * <p>
     * For HP use. Checks whether this component has at least one dynamic date parameter value.
     * </p>
     * <p>
     * Getter method for the COM property "HasDynamicDateParameterValue"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(32)
    //= 0x20. The runtime will prefer the VTID if present
    @VTID(43)
    boolean hasDynamicDateParameterValue();
    
    // Properties:
}
