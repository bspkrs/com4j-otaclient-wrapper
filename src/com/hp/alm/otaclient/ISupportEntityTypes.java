package com.hp.alm.otaclient;

import com4j.*;

/**
 * Provides services for entities that support entity types.
 */
@IID("{CAFABBC2-CE43-48CD-A6AC-2DBDA404C076}")
public interface ISupportEntityTypes extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The list of fields for the given type.
     * </p>
     * 
     * @param typeId Mandatory java.lang.String parameter.
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    com.hp.alm.otaclient.IList getTypedFields(
            java.lang.String typeId);
    
    /**
     * <p>
     * Indicates whether the field is used in this type.
     * </p>
     * 
     * @param field Mandatory java.lang.String parameter.
     * @param typeId Mandatory java.lang.String parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(8)
    boolean isFieldRelevantToType(
            java.lang.String field,
            java.lang.String typeId);
    
    /**
     * <p>
     * Indicates whether the field is required in this type.
     * </p>
     * 
     * @param field Mandatory java.lang.String parameter.
     * @param typeId Mandatory java.lang.String parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    boolean isFieldRequiredInType(
            java.lang.String field,
            java.lang.String typeId);
    
    // Properties:
}
