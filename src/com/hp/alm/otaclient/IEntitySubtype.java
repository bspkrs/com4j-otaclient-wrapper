package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents an Entity Subtype.
 */
@IID("{38B97DC3-1B39-4A53-9337-2F469309BF2A}")
public interface IEntitySubtype extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The Subtype ID.
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
     * The Subtype name.
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
     * The list of TDField objects for this type.
     * </p>
     * <p>
     * Getter method for the COM property "Fields"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(9)
    com.hp.alm.otaclient.IList fields();
    
    @VTID(9)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object fields(
            int index);
    
    /**
     * <p>
     * Gets the TDField specified by FieldName.
     * </p>
     * 
     * @param fieldName Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(10)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject getField(
            java.lang.String fieldName);
    
    /**
     * <p>
     * Checks If Field (By Name) Is Relevant to this Subtype.
     * </p>
     * 
     * @param fieldName Mandatory java.lang.String parameter.
     * @return Returns a value of type boolean
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    boolean isFieldRelevantToSubtype(
            java.lang.String fieldName);
    
    /**
     * <p>
     * Get the value of an entity attribute by its id.
     * </p>
     * 
     * @param entityAttrId Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(12)
    java.lang.String getAttributeValue(
            java.lang.String entityAttrId);
    
    /**
     * <p>
     * Get the value of an entity attribute by its name.
     * </p>
     * 
     * @param entityAttrName Mandatory java.lang.String parameter.
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(13)
    java.lang.String getAttributeValueByName(
            java.lang.String entityAttrName);
    
    // Properties:
}
