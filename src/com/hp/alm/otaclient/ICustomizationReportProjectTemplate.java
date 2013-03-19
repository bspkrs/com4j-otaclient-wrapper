package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. ICustomizationReportProjectTemplate Interface.
 */
@IID("{359C8988-4CF5-440C-81A4-2C8D27631918}")
public interface ICustomizationReportProjectTemplate extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The ID of this template
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
     * The name of this template
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
     * The name of this template
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
     * The category to which this template is assigned
     * </p>
     * <p>
     * Getter method for the COM property "TemplateCategory"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(10)
    java.lang.String templateCategory();
    
    /**
     * <p>
     * The name of the template file
     * </p>
     * <p>
     * Getter method for the COM property "FileName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(11)
    java.lang.String fileName();
    
    /**
     * <p>
     * The name of the template file
     * </p>
     * <p>
     * Setter method for the COM property "FileName"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(12)
    void fileName(
            java.lang.String pVal);
    
    /**
     * <p>
     * The name of the user who last modified this template
     * </p>
     * <p>
     * Getter method for the COM property "ModifiedBy"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(5)
    //= 0x5. The runtime will prefer the VTID if present
    @VTID(13)
    java.lang.String modifiedBy();
    
    /**
     * <p>
     * Indicates whether this template serves as a default template for the entity it is assigned to
     * </p>
     * <p>
     * Getter method for the COM property "IsDefault"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(14)
    boolean isDefault();
    
    /**
     * <p>
     * Indicates whether this template serves as a default template for the entity it is assigned to
     * </p>
     * <p>
     * Setter method for the COM property "IsDefault"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(6)
    //= 0x6. The runtime will prefer the VTID if present
    @VTID(15)
    void isDefault(
            boolean pVal);
    
    /**
     * <p>
     * A list of fields used by this template
     * </p>
     * <p>
     * Getter method for the COM property "Fields"
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(16)
    com.hp.alm.otaclient.IList fields();
    
    @VTID(16)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object fields(
            int index);
    
    /**
     * <p>
     * A list of fields used by this template
     * </p>
     * <p>
     * Setter method for the COM property "Fields"
     * </p>
     * 
     * @param pVal Mandatory com.hp.alm.otaclient.IList parameter.
     */
    
    @DISPID(7)
    //= 0x7. The runtime will prefer the VTID if present
    @VTID(17)
    void fields(
            com.hp.alm.otaclient.IList pVal);
    
    /**
     * <p>
     * The date this template's file has last been modified
     * </p>
     * <p>
     * Getter method for the COM property "LastModified"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(18)
    java.lang.String lastModified();
    
    /**
     * <p>
     * The date this template's file has last been modified
     * </p>
     * <p>
     * Setter method for the COM property "LastModified"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(8)
    //= 0x8. The runtime will prefer the VTID if present
    @VTID(19)
    void lastModified(
            java.lang.String pVal);
    
    /**
     * <p>
     * The type of this template (example: Tabular)
     * </p>
     * <p>
     * Getter method for the COM property "TemplateType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(20)
    java.lang.String templateType();
    
    /**
     * <p>
     * The type of this template (example: Tabular)
     * </p>
     * <p>
     * Setter method for the COM property "TemplateType"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(9)
    //= 0x9. The runtime will prefer the VTID if present
    @VTID(21)
    void templateType(
            java.lang.String pVal);
    
    /**
     * <p>
     * Checks if a Report Project Template is linked to template.
     * </p>
     * <p>
     * Getter method for the COM property "IsTemplate"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(10)
    //= 0xa. The runtime will prefer the VTID if present
    @VTID(22)
    boolean isTemplate();
    
    /**
     * <p>
     * Checks if this Report Project Template is removable.
     * </p>
     * <p>
     * Getter method for the COM property "IsRemovable"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(11)
    //= 0xb. The runtime will prefer the VTID if present
    @VTID(23)
    boolean isRemovable();
    
    // Properties:
}
