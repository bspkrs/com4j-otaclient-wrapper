package com.hp.alm.otaclient;

import com4j.*;

/**
 * Configuration information used to build a graph.
 */
@IID("{AF2CF201-C24C-4420-88E9-188CA12B5B46}")
public interface IGraphDefinition2 extends com.hp.alm.otaclient.IGraphDefinition
{
    // Methods:
    /**
     * <p>
     * Get the value of the specified property by property name.
     * </p>
     * 
     * @param prop Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.Object
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(14)
    @ReturnValue(type = NativeType.VARIANT)
    java.lang.Object getPropertyByName(
            java.lang.String prop);
    
    /**
     * <p>
     * Set the value of the specified property,by property name and property value.
     * </p>
     * 
     * @param prop Mandatory java.lang.String parameter.
     * @param newVal Mandatory java.lang.Object parameter.
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(15)
    void setPropertyByName(
            java.lang.String prop,
            @MarshalAs(NativeType.VARIANT) java.lang.Object newVal);
    
    // Properties:
}
