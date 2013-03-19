package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a Release Folder.
 */
@IID("{1D7BC0E7-454B-4F73-B693-F6B38763F8E2}")
public interface IReleaseFolder extends com.hp.alm.otaclient.IBaseFieldExMail
{
    // Methods:
    /**
     * <p>
     * The release folder's name.
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
     * The release folder's name.
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
     * The ReleaseFactory object for direct children releases.
     * </p>
     * <p>
     * Getter method for the COM property "ReleaseFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(26)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject releaseFactory();
    
    /**
     * <p>
     * The ReleaseFolderFactory object for direct children release folders.
     * </p>
     * <p>
     * Getter method for the COM property "ReleaseFolderFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(27)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject releaseFolderFactory();
    
    /**
     * <p>
     * The release folder's parent release folder, or null if this folder is the root.
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
