package com.hp.alm.otaclient;

import com4j.*;

/**
 * Deprecated. Use ICustomizationSubtype. Represents the Customization type of an entity.
 */
@IID("{EB345576-4831-4653-816F-791478BFE555}")
public interface ICustomizationType extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The CustomizationType ID.
     * </p>
     * <p>
     * Getter method for the COM property "ID"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(7)
    int id();
    
    /**
     * <p>
     * The CustomizationType name.
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
     * The CustomizationType name.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    void name(
            java.lang.String pVal);
    
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
    @VTID(10)
    com.hp.alm.otaclient.IList fields();
    
    @VTID(10)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object fields(
            int index);
    
    /**
     * <p>
     * Gets the CustomizationTypedField specified by FieldName.
     * </p>
     * <p>
     * Getter method for the COM property "Field"
     * </p>
     * 
     * @param fieldName Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(11)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject field(
            java.lang.String fieldName);
    
    /**
     * <p>
     * Adds a new CustomizationTypedField.
     * </p>
     * 
     * @param newFieldName Mandatory java.lang.String parameter.
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(12)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject addField(
            java.lang.String newFieldName);
    
    /**
     * <p>
     * Removes the CustomizationTypedField specified by FieldName from this type.
     * </p>
     * 
     * @param fieldName Mandatory java.lang.String parameter.
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(13)
    void removeField(
            java.lang.String fieldName);
    
    /**
     * <p>
     * The bitmap stream for type icon.
     * </p>
     * <p>
     * Getter method for the COM property "Icon"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IStream
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(14)
    com.hp.alm.otaclient.IStream icon();
    
    /**
     * <p>
     * The bitmap stream for type icon.
     * </p>
     * <p>
     * Setter method for the COM property "Icon"
     * </p>
     * 
     * @param pBitMap Mandatory com.hp.alm.otaclient.IStream parameter.
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(15)
    void icon(
            com.hp.alm.otaclient.IStream pBitMap);
    
    /**
     * <p>
     * The editing control CLSID for COM or the fully qualified assembly name for .NET.
     * </p>
     * <p>
     * Getter method for the COM property "EditingControl"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(16)
    java.lang.String editingControl();
    
    /**
     * <p>
     * The editing control CLSID for COM or the fully qualified assembly name for .NET.
     * </p>
     * <p>
     * Setter method for the COM property "EditingControl"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(17)
    void editingControl(
            java.lang.String pVal);
    
    /**
     * <p>
     * For HP use. The recommended prefix for entities of this type.
     * </p>
     * <p>
     * Getter method for the COM property "Prefix"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(18)
    java.lang.String prefix();
    
    /**
     * <p>
     * For HP use. The recommended prefix for entities of this type.
     * </p>
     * <p>
     * Setter method for the COM property "Prefix"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(19)
    void prefix(
            java.lang.String pVal);
    
    // Properties:
}
