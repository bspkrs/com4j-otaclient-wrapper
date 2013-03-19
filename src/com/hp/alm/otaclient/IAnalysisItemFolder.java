package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents an Analysis Item Folder.
 */
@IID("{0D6A3C6E-D8D9-4F10-BF51-FB7FBD3666A7}")
public interface IAnalysisItemFolder extends com.hp.alm.otaclient.IBaseField
{
    // Methods:
    /**
     * <p>
     * The folder's name.
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
     * The folder's name.
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
     * Indicates whether this is a public folder.
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
     * Indicates whether this is a public folder.
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
     * The AnalysisItemFolderFactory object for direct children analysis item folders.
     * </p>
     * <p>
     * Getter method for the COM property "AnalysisItemFolderFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(26)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject analysisItemFolderFactory();
    
    /**
     * <p>
     * The AnalysisItemFactory object for managing AnalysisItems in this folder.
     * </p>
     * <p>
     * Getter method for the COM property "AnalysisItemFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(27)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject analysisItemFactory();
    
    /**
     * <p>
     * The folder's description.
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
     * The folder's description.
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
    
    // Properties:
}
