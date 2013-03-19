package com.hp.alm.otaclient;

import com4j.*;

/**
 * Information about a folder or file.
 */
@IID("{3A2C3A43-4D96-4682-91CC-9E091B64C1FE}")
public interface IFileData extends Com4jObject
{
    // Methods:
    /**
     * <p>
     * The file or folder name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(0)
    //= 0x0. The runtime will prefer the VTID if present
    @VTID(7)
    @DefaultMethod
    java.lang.String name();
    
    /**
     * <p>
     * The type of object for which data is stored.
     * </p>
     * 
     * @return Returns a value of type short
     */
    
    @DISPID(1)
    //= 0x1. The runtime will prefer the VTID if present
    @VTID(8)
    short type();
    
    /**
     * <p>
     * The file size in Kbytes.
     * </p>
     * 
     * @return Returns a value of type int
     */
    
    @DISPID(2)
    //= 0x2. The runtime will prefer the VTID if present
    @VTID(9)
    int size();
    
    /**
     * <p>
     * The file's modify date.
     * </p>
     * 
     * @return Returns a value of type java.util.Date
     */
    
    @DISPID(3)
    //= 0x3. The runtime will prefer the VTID if present
    @VTID(10)
    java.util.Date modifyDate();
    
    /**
     * <p>
     * The folder's child items.
     * </p>
     * 
     * @return Returns a value of type com.hp.alm.otaclient.IList
     */
    
    @DISPID(4)
    //= 0x4. The runtime will prefer the VTID if present
    @VTID(11)
    com.hp.alm.otaclient.IList items();
    
    @VTID(11)
    @ReturnValue(type = NativeType.VARIANT, defaultPropertyThrough = { com.hp.alm.otaclient.IList.class })
    java.lang.Object items(
            int index);
    
    // Properties:
}
