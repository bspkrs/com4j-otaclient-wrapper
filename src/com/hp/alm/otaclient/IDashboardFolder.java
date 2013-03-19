package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents a Dashboard folder.
 */
@IID("{584A90A3-490D-4661-B781-9845B2D57C92}")
public interface IDashboardFolder extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * The Dashboard folder's name.
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
     * The Dashboard folder's name.
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
     * The ID of the folder that contains this folder.
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
     * The ID of the folder that contains this folder.
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
     * Indicates whether this is a public Dashboard folder.
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
     * Indicates whether this is a public Dashboard folder.
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
     * The DashboardFolderFactory object for Dashboard folders that are direct children of this folder.
     * </p>
     * <p>
     * Getter method for the COM property "DashboardFolderFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(26)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject dashboardFolderFactory();
    
    /**
     * <p>
     * The DashboardPageFactory object for managing the child pages entities.
     * </p>
     * <p>
     * Getter method for the COM property "DashboardPageFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(27)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject dashboardPageFactory();
    
    /**
     * <p>
     * The Dashboard folder's description.
     * </p>
     * <p>
     * Getter method for the COM property "Description"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(28)
    java.lang.String description();
    
    /**
     * <p>
     * The Dashboard folder's description.
     * </p>
     * <p>
     * Setter method for the COM property "Description"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(29)
    void description(
            java.lang.String pVal);
    
    /**
     * <p>
     * The user name of the dashboard folder's owner.
     * </p>
     * <p>
     * Getter method for the COM property "OwnerUser"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(30)
    java.lang.String ownerUser();
    
    // Properties:
}
