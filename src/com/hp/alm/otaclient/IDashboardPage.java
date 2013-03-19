package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents a Dashboard Page.
 */
@IID("{5A33646F-DC23-45A7-9C4C-E20037C64461}")
public interface IDashboardPage extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * The page name.
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
     * The page name.
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
     * The ID of the folder that contains this page.
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
     * The ID of the folder that contains this page.
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
     * Indicates if this is a public page.
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
     * Indicates if this is a public page.
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
     * The page's description.
     * </p>
     * <p>
     * Getter method for the COM property "Description"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(26)
    java.lang.String description();
    
    /**
     * <p>
     * The page's description.
     * </p>
     * <p>
     * Setter method for the COM property "Description"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(27)
    void description(
            java.lang.String pVal);
    
    /**
     * <p>
     * The page title.
     * </p>
     * <p>
     * Getter method for the COM property "Title"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(28)
    java.lang.String title();
    
    /**
     * <p>
     * The page title.
     * </p>
     * <p>
     * Setter method for the COM property "Title"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(29)
    void title(
            java.lang.String pVal);
    
    /**
     * <p>
     * The server time when the item was last modified.
     * </p>
     * <p>
     * Getter method for the COM property "LastModified"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(30)
    java.lang.String lastModified();
    
    /**
     * <p>
     * The user name who last modified the item.
     * </p>
     * <p>
     * Getter method for the COM property "ModifiedBy"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(31)
    java.lang.String modifiedBy();
    
    /**
     * <p>
     * The user name of the page owner.
     * </p>
     * <p>
     * Getter method for the COM property "OwnerUser"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(32)
    java.lang.String ownerUser();
    
    /**
     * <p>
     * For HP use. The DashboardPageItemFactory object for managing the items on this page.
     * </p>
     * <p>
     * Getter method for the COM property "DashboardPageItemFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(33)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject dashboardPageItemFactory();
    
    // Properties:
}
