package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents a graph or report.
 */
@IID("{FAEFC40D-CFBC-498F-AC63-BE17ED80D76D}")
public interface IAnalysisItem extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * The name of the report or graph.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(20)
    java.lang.String name();
    
    /**
     * <p>
     * The name of the report or graph.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(21)
    void name(
            java.lang.String pVal);
    
    /**
     * <p>
     * The ID of the parent folder.
     * </p>
     * <p>
     * Getter method for the COM property "ParentId"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(22)
    int parentId();
    
    /**
     * <p>
     * The ID of the parent folder.
     * </p>
     * <p>
     * Setter method for the COM property "ParentId"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(23)
    void parentId(
            int pVal);
    
    /**
     * <p>
     * Indicates whether the item is public.
     * </p>
     * <p>
     * Getter method for the COM property "Public"
     * </p>
     * 
     * @return Returns a value of type boolean
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(24)
    boolean _public();
    
    /**
     * <p>
     * Indicates whether the item is public.
     * </p>
     * <p>
     * Setter method for the COM property "Public"
     * </p>
     * 
     * @param pVal Mandatory boolean parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(25)
    void _public(
            boolean pVal);
    
    /**
     * <p>
     * The Quality Center module that is the source of the data.
     * </p>
     * <p>
     * Getter method for the COM property "Module"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(26)
    java.lang.String module();
    
    /**
     * <p>
     * The Quality Center module that is the source of the data.
     * </p>
     * <p>
     * Setter method for the COM property "Module"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(27)
    void module(
            java.lang.String pVal);
    
    /**
     * <p>
     * The type of output.
     * </p>
     * <p>
     * Getter method for the COM property "Type"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(28)
    java.lang.String type();
    
    /**
     * <p>
     * The type of output.
     * </p>
     * <p>
     * Setter method for the COM property "Type"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(29)
    void type(
            java.lang.String pVal);
    
    /**
     * <p>
     * The definition of the data to be included in the analysis item.
     * </p>
     * <p>
     * Getter method for the COM property "FilterData"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(30)
    java.lang.String filterData();
    
    /**
     * <p>
     * The definition of the data to be included in the analysis item.
     * </p>
     * <p>
     * Setter method for the COM property "FilterData"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(31)
    void filterData(
            java.lang.String pVal);
    
    /**
     * <p>
     * The definition of the presentation of the analysis item.
     * </p>
     * <p>
     * Getter method for the COM property "LayoutData"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(32)
    java.lang.String layoutData();
    
    /**
     * <p>
     * The definition of the presentation of the analysis item.
     * </p>
     * <p>
     * Setter method for the COM property "LayoutData"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(33)
    void layoutData(
            java.lang.String pVal);
    
    /**
     * <p>
     * The time on the server when the analysis item was last modified.
     * </p>
     * <p>
     * Getter method for the COM property "LastModified"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(34)
    java.lang.String lastModified();
    
    /**
     * <p>
     * The user name of the user who last modified the analysis item.
     * </p>
     * <p>
     * Getter method for the COM property "ModifiedBy"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(35)
    java.lang.String modifiedBy();
    
    /**
     * <p>
     * The analysis item's sub type.
     * </p>
     * <p>
     * Getter method for the COM property "SubType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(36)
    java.lang.String subType();
    
    /**
     * <p>
     * The analysis item's sub type.
     * </p>
     * <p>
     * Setter method for the COM property "SubType"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(23)
    //= 0x17. The runtime will prefer the VTID if present
    @VTID(37)
    void subType(
            java.lang.String pVal);
    
    /**
     * <p>
     * The analysis item's description.
     * </p>
     * <p>
     * Getter method for the COM property "Description"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(38)
    java.lang.String description();
    
    /**
     * <p>
     * The analysis item's description.
     * </p>
     * <p>
     * Setter method for the COM property "Description"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(24)
    //= 0x18. The runtime will prefer the VTID if present
    @VTID(39)
    void description(
            java.lang.String pVal);
    
    /**
     * <p>
     * The Analysis Item Public Entity Key Factory
     * </p>
     * <p>
     * Getter method for the COM property "PublicEntityKeyFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(25)
    //= 0x19. The runtime will prefer the VTID if present
    @VTID(40)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject publicEntityKeyFactory();
    
    // Properties:
}
