package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents an entity with support for subtypes.
 */
@IID("{E97BE701-A61A-414B-BF0E-7A781EAB59D7}")
public interface ISubtypedEntity extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The current subtype of the entity.
     * </p>
     * <p>
     * Getter method for the COM property "EntitySubtype"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject entitySubtype();
    
    // Properties:
}
