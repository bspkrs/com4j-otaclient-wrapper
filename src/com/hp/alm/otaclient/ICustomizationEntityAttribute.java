package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents an entity property.
 */
@IID("{C59BBC23-0BE7-4B97-B985-05CD051CAE79}")
public interface ICustomizationEntityAttribute extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Id of the attribute.
     * </p>
     * <p>
     * Getter method for the COM property "ID"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    java.lang.String id();
    
    /**
     * <p>
     * Name of the attribute.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    java.lang.String name();
    
    /**
     * <p>
     * Default value of the attribute.
     * </p>
     * <p>
     * Getter method for the COM property "DefaultValue"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    java.lang.String defaultValue();
    
    // Properties:
}
