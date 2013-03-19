package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a file or folder stored in the Quality Center repository.
 */
@IID("{BBE9102D-1929-469C-BCB0-B13C7CF51716}")
public interface IQCResource extends com.hp.alm.otaclient.IBaseFieldExMail
{
    // Methods:
    /**
     * <p>
     * The folder or file name of the resource.
     * </p>
     * <p>
     * Getter method for the COM property "FileName"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(24)
    java.lang.String fileName();
    
    /**
     * <p>
     * The folder or file name of the resource.
     * </p>
     * <p>
     * Setter method for the COM property "FileName"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(25)
    void fileName(
            java.lang.String pVal);
    
    /**
     * <p>
     * The ID of the resource's parent folder.
     * </p>
     * <p>
     * Getter method for the COM property "ParentId"
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(26)
    int parentId();
    
    /**
     * <p>
     * The ID of the resource's parent folder.
     * </p>
     * <p>
     * Setter method for the COM property "ParentId"
     * </p>
     * 
     * @param pVal Mandatory int parameter.
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(27)
    void parentId(
            int pVal);
    
    /**
     * <p>
     * The description of the resource.
     * </p>
     * <p>
     * Getter method for the COM property "Description"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(28)
    java.lang.String description();
    
    /**
     * <p>
     * The description of the resource.
     * </p>
     * <p>
     * Setter method for the COM property "Description"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(29)
    void description(
            java.lang.String pVal);
    
    /**
     * <p>
     * The user name of the creator of the resource.
     * </p>
     * <p>
     * Getter method for the COM property "Creator"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(30)
    java.lang.String creator();
    
    /**
     * <p>
     * The user name of the creator of the resource.
     * </p>
     * <p>
     * Setter method for the COM property "Creator"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(31)
    void creator(
            java.lang.String pVal);
    
    /**
     * <p>
     * For HP future use: Progress information.
     * </p>
     */
    
    @DISPID(19)
    //= 0x13. The runtime will prefer the VTID if present
    @VTID(32)
    void progress();
    
    /**
     * <p>
     * For HP future use. Returns the location of the resource.
     * </p>
     * <p>
     * Getter method for the COM property "Location"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(20)
    //= 0x14. The runtime will prefer the VTID if present
    @VTID(33)
    java.lang.String location();
    
    /**
     * <p>
     * The type of the resource.
     * </p>
     * <p>
     * Getter method for the COM property "ResourceType"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(34)
    java.lang.String resourceType();
    
    /**
     * <p>
     * The type of the resource.
     * </p>
     * <p>
     * Setter method for the COM property "ResourceType"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(21)
    //= 0x15. The runtime will prefer the VTID if present
    @VTID(35)
    void resourceType(
            java.lang.String pVal);
    
    /**
     * <p>
     * The name of the resource as displayed in the user interface.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(36)
    java.lang.String name();
    
    /**
     * <p>
     * The name of the resource as displayed in the user interface.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(22)
    //= 0x16. The runtime will prefer the VTID if present
    @VTID(37)
    void name(
            java.lang.String pVal);
    
    // Properties:
}
