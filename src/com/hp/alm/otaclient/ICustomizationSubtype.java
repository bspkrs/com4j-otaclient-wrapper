package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents the Customization subtype of an entity.
 */
@IID("{24A5ACEA-3967-4360-A105-AD8D69AEB25D}")
public interface ICustomizationSubtype extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The CustomizationSubtype ID.
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
     * The CustomizationSubtype name.
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
     * The list of CustomizationTypedField objects for this type.
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
     * Gets the CustomizationTypedField specified by FieldName.
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
     * Get an instance of IEntitySubtype wrapping this customization type.
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(11)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject getEntitySubtype();
    
    /**
     * <p>
     * Get the value of a subtype attribute by the entity attribute's id.
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
     * Get the value of an subtype attribute by its name.
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
