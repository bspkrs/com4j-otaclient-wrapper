package com.hp.alm.otaclient;

import com4j.*;

/**
 * For HP use. Represents a Library Folder.
 */
@IID("{ACA08EA6-0781-4D21-95F9-4438BED9E0DA}")
public interface ILibraryFolder extends com.hp.alm.otaclient.IBaseFieldExMail
{
    // Methods:
    /**
     * <p>
     * The library folder's name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(24)
    java.lang.String name();
    
    /**
     * <p>
     * The library folder's name.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(25)
    void name(
            java.lang.String pVal);
    
    /**
     * <p>
     * The LibraryFactory object for direct children imported libraries.
     * </p>
     * <p>
     * Getter method for the COM property "LibraryFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(26)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject libraryFactory();
    
    /**
     * <p>
     * The LibraryFolderFactory object for direct children libraries.
     * </p>
     * <p>
     * Getter method for the COM property "LibraryFolderFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(27)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject libraryFolderFactory();
    
    /**
     * <p>
     * The library folder's parent library folder, or null if this folder is the root.
     * </p>
     * <p>
     * Getter method for the COM property "Parent"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(18)
    //= 0x12. The runtime will prefer the VTID if present
    @VTID(28)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject parent();
    
    // Properties:
}
