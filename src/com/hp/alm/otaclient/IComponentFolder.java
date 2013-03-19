package com.hp.alm.otaclient;

import com4j.*;

/**
 * Represents a business component folder.
 */
@IID("{7A6F279C-7729-4394-B5BB-BC3E8902DA56}")
public interface IComponentFolder extends com.hp.alm.otaclient.IBaseFieldEx
{
    // Methods:
    /**
     * <p>
     * The component's folder name.
     * </p>
     * <p>
     * Getter method for the COM property "Name"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(23)
    java.lang.String name();
    
    /**
     * <p>
     * The component's folder name.
     * </p>
     * <p>
     * Setter method for the COM property "Name"
     * </p>
     * 
     * @param pVal Mandatory java.lang.String parameter.
     */
    
    @DISPID(14)
    //= 0xe. The runtime will prefer the VTID if present
    @VTID(24)
    void name(
            java.lang.String pVal);
    
    /**
     * <p>
     * The ComponentFactory object.
     * </p>
     * <p>
     * Getter method for the COM property "ComponentFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(15)
    //= 0xf. The runtime will prefer the VTID if present
    @VTID(25)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject componentFactory();
    
    /**
     * <p>
     * The component's ComponentFolderFactory.
     * </p>
     * <p>
     * Getter method for the COM property "ComponentFolderFactory"
     * </p>
     * 
     * @return Returns a value of type com4j.Com4jObject
     */
    
    @DISPID(16)
    //= 0x10. The runtime will prefer the VTID if present
    @VTID(26)
    @ReturnValue(type = NativeType.Dispatch)
    com4j.Com4jObject componentFolderFactory();
    
    /**
     * <p>
     * The component folder's path.
     * </p>
     * <p>
     * Getter method for the COM property "Path"
     * </p>
     * 
     * @return Returns a value of type java.lang.String
     */
    
    @DISPID(17)
    //= 0x11. The runtime will prefer the VTID if present
    @VTID(27)
    java.lang.String path();
    
    // Properties:
}
