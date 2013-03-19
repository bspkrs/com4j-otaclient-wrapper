package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents an entity attribute.
 */
@IID("{1F32CB1E-3A39-41FF-93D0-ED827995DC98}")
public interface ICustomizationEntityAttributes extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * Gets the list of all ICustomizationEntityAttribute for the specified entity.
     * </p>
     * 
     * @param entityType Mandatory java.lang.String parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    com.hp.alm.otaclient.IList getEntityAttributes(
            java.lang.String entityType);
    
    // Properties:
}
